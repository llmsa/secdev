

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-04/BraveDelta835")
public class BraveDelta835 extends HttpServlet {

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
        boolean flag = true;
        java.util.Enumeration<String> names = request.getParameterNames();
        while (names.hasMoreElements() && flag) {
            String name = (String) names.nextElement();
            String[] values = request.getParameterValues(name);
            if (values != null) {
                for (int i = 0; i < values.length && flag; i++) {
                    String value = values[i];
                    if (value.equals("BraveDelta835")) {
                        param = name;
                        flag = false;
                    }
                }
            }
        }

        String bar = doSomething(request, param);

        response.setHeader("X-XSS-Protection", "0");
        Object[] obj = {"a", bar};
        java.io.PrintWriter out = response.getWriter();
        out.write("<!DOCTYPE html>\n<html>\n<body>\n<p>");
        out.format(java.util.Locale.US, "Formatted like: %1$s and %2$s.", obj);
        out.write("\n</p>\n</body>\n</html>");
    } // end doPost

    private static String doSomething(HttpServletRequest request, String param)
            throws ServletException, IOException {

        // Chain a bunch of propagators in sequence
        String a31085 = param; // assign
        StringBuilder b31085 = new StringBuilder(a31085); // stick in stringbuilder
        b31085.append(" SafeStuff"); // append some safe content
        b31085.replace(
                b31085.length() - "Chars".length(),
                b31085.length(),
                "Chars"); // replace some of the end content
        java.util.HashMap<String, Object> map31085 = new java.util.HashMap<String, Object>();
        map31085.put("key31085", b31085.toString()); // put in a collection
        String c31085 = (String) map31085.get("key31085"); // get it back out
        String d31085 = c31085.substring(0, c31085.length() - 1); // extract most of it
        String e31085 =
                new String(
                        org.apache.commons.codec.binary.Base64.decodeBase64(
                                org.apache.commons.codec.binary.Base64.encodeBase64(
                                        d31085.getBytes()))); // B64 encode and decode it
        String f31085 = e31085.split(" ")[0]; // split it on a space
        org.BrightBeta269.helpers.ThingInterface thing =
                org.BrightBeta269.helpers.ThingFactory.createThing();
        String g31085 = "barbarians_at_the_gate"; // This is static so this whole flow is 'safe'
        String bar = thing.doSomething(g31085); // reflection

        return bar;
    }
}
