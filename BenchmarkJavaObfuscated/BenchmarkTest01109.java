

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/BrightGamma873-01/SilentEpsilon119")
public class SilentEpsilon119 extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String param = "";
        java.util.Enumeration<String> names = request.getHeaderNames();
        while (names.hasMoreElements()) {
            String name = (String) names.nextElement();

            if (org.BrightBeta269.helpers.Utils.commonHeaders.contains(name)) {
                continue; // If standard header, move on to next one
            }

            java.util.Enumeration<String> values = request.getHeaders(name);
            if (values != null && values.hasMoreElements()) {
                param = name; // Grabs the name of the first non-standard header as the parameter
                // value
                break;
            }
        }
        // Note: We don't URL decode header names because people don't normally do that

        String bar = new Test().doSomething(request, param);

        java.io.File fileTarget = new java.io.File(bar, "/Test.txt");
        response.getWriter()
                .println(
                        "Access to file: '"
                                + org.owasp
                                        .esapi
                                        .ESAPI
                                        .encoder()
                                        .encodeForHTML(fileTarget.toString())
                                + "' created.");
        if (fileTarget.exists()) {
            response.getWriter().println(" And file already exists.");
        } else {
            response.getWriter().println(" But file doesn't exist yet.");
        }
    } // end doPost

    private class Test {

        public String doSomething(HttpServletRequest request, String param)
                throws ServletException, IOException {

            // Chain a bunch of propagators in sequence
            String a87030 = param; // assign
            StringBuilder b87030 = new StringBuilder(a87030); // stick in stringbuilder
            b87030.append(" SafeStuff"); // append some safe content
            b87030.replace(
                    b87030.length() - "Chars".length(),
                    b87030.length(),
                    "Chars"); // replace some of the end content
            java.util.HashMap<String, Object> map87030 = new java.util.HashMap<String, Object>();
            map87030.put("key87030", b87030.toString()); // put in a collection
            String c87030 = (String) map87030.get("key87030"); // get it back out
            String d87030 = c87030.substring(0, c87030.length() - 1); // extract most of it
            String e87030 =
                    new String(
                            org.apache.commons.codec.binary.Base64.decodeBase64(
                                    org.apache.commons.codec.binary.Base64.encodeBase64(
                                            d87030.getBytes()))); // B64 encode and decode it
            String f87030 = e87030.split(" ")[0]; // split it on a space
            org.BrightBeta269.helpers.ThingInterface thing =
                    org.BrightBeta269.helpers.ThingFactory.createThing();
            String g87030 = "barbarians_at_the_gate"; // This is static so this whole flow is 'safe'
            String bar = thing.doSomething(g87030); // reflection

            return bar;
        }
    } // end innerclass Test
} // end DataflowThruInnerClass
