import json
import os
from pathlib import Path
from urllib.parse import unquote, urlparse


def get_basename_from_github_url(raw_url):
    # Parse the URL and unquote to handle URL-encoded characters like %2F
    parsed_url = urlparse(raw_url)
    unquoted_path = unquote(parsed_url.path)

    # Get the base name of the file
    basename = os.path.basename(unquoted_path)
    return basename


output_dir = Path("./.data")
os.makedirs(
    output_dir,
    exist_ok=True,
)

test_cases = []
test_number = 1
# Read jsonl file
with open(
    "real_world_dataset.jsonl",
    "r",
) as file:
    # Iterate over each line in the file
    for line in file:
        # Parse the JSON object
        data = json.loads(line)
        for cwe in data["CWEs"]:
            test_case = {
                "name": f"test-{test_number}",
                "info": {
                    "cwe_number": cwe,
                    "category": "real_world",
                    "test_number": f"test-{test_number}",
                    "vulnerability": "true",
                },
            }
            code_dict = {
                get_basename_from_github_url(x["raw_url"]): x["raw_code"]
                for x in data["details"]
                if x["raw_url"].endswith(".java")
            }

            code = [x for x in data["details"]]

            # make code dict into string with key as header and value inside triple quotes
            code_str = ""
            for k, v in code_dict.items():
                code_str += f"Filename: {k}:\n```{v}```\n\n"

            test_case["full_code"] = code_str
            test_cases.append(test_case)
            test_number += 1

with open("real_world_dataset.json", "w") as file:
    file.write(json.dumps(test_cases))
