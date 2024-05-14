import datetime
import json
import os
from pathlib import Path

import pytest
from dotenv import load_dotenv
from utils.setup_logging import setup_logging
from vulnerability_infer.llm.llm_runner import LLMRunner
from vulnerability_infer.llm.prompt_formatter import PromptFormatter
from vulnerability_infer.llm.response_formatter import ReponseFormatter
from vulnerability_infer.utils import (
    calculate_classification_metrics,
    calculate_classification_metrics_binary,
    parse_xml,
    remove_comments,
)
from vulnerability_infer.utils.data_utils import stratified_sample_list_of_dicts

logger = setup_logging("main")


# Initialize global variables and environment
def init_environment():
    ENV_FILE = Path(__file__).parent.parent / ".env"
    load_dotenv(ENV_FILE)
    REPO_ROOT = Path(__file__).parent.parent.parent
    os.makedirs(REPO_ROOT / ".data", exist_ok=True)
    return REPO_ROOT


REPO_ROOT = init_environment()

config = {
    "run_id": "Stratified_fixed_1",
    "ollama_url": os.getenv("OLLAMA_URL"),
    "openai_key": os.getenv("OPENAI_API_KEY"),
    "classification_prompt": "init_vulnerability_detection_prompt_2",
    "request_timeout": 60,
    "BenchmarkJavaPath": str(
        REPO_ROOT / "BenchmarkJava/src/main/java/org/owasp/benchmark/testcode"
    ),
    "stratify_keys": ["cwe_number", "category"],
    "stratify_test_size": 0.1,
    "stratify_random_state": 42,
    "stratify_dataset": True,
    "real_world_dataset": str(
        REPO_ROOT / "dataset/realworld_data/real_world_dataset.json"
    ),
}


def test_get_vulnerability():
    assert ReponseFormatter.get_vulnerability("22") == 22
    assert ReponseFormatter.get_vulnerability("22,23") == 22
    assert ReponseFormatter.get_vulnerability("CWE-22") == 22
    assert ReponseFormatter.get_vulnerability("CWE-22,CWE-23") == 22
    assert ReponseFormatter.get_vulnerability("CWE-22 CWE-23") == 22
    assert ReponseFormatter.get_vulnerability("asas") == -1
    assert ReponseFormatter.get_vulnerability("") == -1


def test_parse_xml():
    xml_file_path = Path("../tests/data/BenchmarkTest1.xml")
    test_case_info = parse_xml(xml_file_path)
    assert test_case_info["cwe_number"] == "25"
    assert test_case_info["category"] == "test"
    assert test_case_info["test_number"] == "0001"
    assert test_case_info["vulnerability"] == "true"


def test_stratified_sample_list_of_dicts():
    data = [
        {
            "info": {
                "cwe_number": "79",
                "category": "XSS",
                "test_number": "001",
                "vulnerability": "true",
            }
        },
        {
            "info": {
                "cwe_number": "79",
                "category": "XSS",
                "test_number": "002",
                "vulnerability": "true",
            }
        },
        {
            "info": {
                "cwe_number": "89",
                "category": "SQLI",
                "test_number": "003",
                "vulnerability": "false",
            }
        },
        {
            "info": {
                "cwe_number": "89",
                "category": "SQLI",
                "test_number": "004",
                "vulnerability": "false",
            }
        },
        {
            "info": {
                "cwe_number": "120",
                "category": "BO",
                "test_number": "005",
                "vulnerability": "true",
            }
        },
        {
            "info": {
                "cwe_number": "120",
                "category": "BO",
                "test_number": "006",
                "vulnerability": "true",
            }
        },
    ]

    sampled_data = stratified_sample_list_of_dicts(
        data, ["cwe_number", "vulnerability"], test_size=0.5, random_state=42
    )

    assert len(sampled_data) == 3
    assert sampled_data[0]["info"]["cwe_number"] == "79"
    assert sampled_data[1]["info"]["cwe_number"] == "89"
    assert sampled_data[2]["info"]["cwe_number"] == "120"
    assert sampled_data[0]["info"]["vulnerability"] == "true"
    assert sampled_data[1]["info"]["vulnerability"] == "false"
    assert sampled_data[2]["info"]["vulnerability"] == "true"


def test_binary_vulnerability_prompt():
    model = "gpt-3.5-turbo"
    prompt_id = "binary_vulnerability_detection_prompt"

    llmRunner = LLMRunner(
        model=model,
        openai_key=config["openai_key"],
        ollama_url=config["ollama_url"],
    )

    test_case = Path("../tests/data/BenchmarkTestTrue.java")
    with open(test_case, "r") as file:
        code = remove_comments(file.read())

    prompt_formatter = PromptFormatter()
    prompt = prompt_formatter.process_generic_prompt(prompt_id, code)

    response = llmRunner.process_prompt(prompt)

    parsed_response = ReponseFormatter.get_binary_vulnerability(response)

    # assert if "true" or "false" is returned
    assert parsed_response in ["true", "false"]


def test_simple_chat_vulnerability_prompt():
    model = "gpt-3.5-turbo"
    system_prompt_id = "simple_binary_system_prompt"
    prompt_id = "simple_binary_user_prompt"

    llmRunner = LLMRunner(
        model=model,
        openai_key=config["openai_key"],
        ollama_url=config["ollama_url"],
    )

    test_case = Path("../tests/data/BenchmarkTestTrue.java")
    with open(test_case, "r") as file:
        code = remove_comments(file.read())

    prompt_formatter = PromptFormatter()
    prompt = prompt_formatter.process_system_chat_prompt(
        system_prompt_id, prompt_id, code
    )

    response = llmRunner.process_prompt(prompt)

    parsed_response = ReponseFormatter.get_binary_vulnerability(response)

    # assert if "true" or "false" is returned
    assert parsed_response in ["true", "false"]


def test_calculate_classification_metrics():
    csv_path = Path("../tests/data/output.csv")
    metrics = calculate_classification_metrics(csv_path)

    assert isinstance(metrics, dict)


def test_calculate_classification_metrics_binary():
    csv_path = Path("../tests/data/output.csv")
    metrics = calculate_classification_metrics_binary(csv_path)

    assert isinstance(metrics, dict)


def test_simple_chat_vulnerability_prompt():
    model = "gpt-3.5-turbo"
    system_prompt_id = "vul_system_v2_prompt"
    prompt_id = "vul_user_prompt"

    with open(config["real_world_dataset"], "r") as file:
        test_cases = json.load(file)

    prompt_formatter = PromptFormatter(show_token_count=True)
    for index, test_case in enumerate(test_cases, start=1):
        code = test_case["full_code"]
        prompt = prompt_formatter.process_system_chat_prompt(
            system_prompt_id, prompt_id, code
        )
