

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-04/SilentBeta881")
public class SilentBeta881 extends HttpServlet {

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

        java.util.Map<String, String[]> map = request.getParameterMap();
        String param = "";
        if (!map.isEmpty()) {
            String[] values = map.get("SilentBeta881");
            if (values != null) param = values[0];
        }

        String bar = doSomething(request, param);

        response.setHeader("X-XSS-Protection", "0");
        Object[] obj = {bar, "b"};
        response.getWriter().printf("Formatted like: %1$s and %2$s.", obj);
    } // end doPost

    private static String doSomething(HttpServletRequest request, String param)
            throws ServletException, IOException {

        // Chain a bunch of propagators in sequence
        String a60610 = param; // assign
        StringBuilder b60610 = new StringBuilder(a60610); // stick in stringbuilder
        b60610.append(" SafeStuff"); // append some safe content
        b60610.replace(
                b60610.length() - "Chars".length(),
                b60610.length(),
                "Chars"); // replace some of the end content
        java.util.HashMap<String, Object> map60610 = new java.util.HashMap<String, Object>();
        map60610.put("key60610", b60610.toString()); // put in a collection
        String c60610 = (String) map60610.get("key60610"); // get it back out
        String d60610 = c60610.substring(0, c60610.length() - 1); // extract most of it
        String e60610 =
                new String(
                        org.apache.commons.codec.binary.Base64.decodeBase64(
                                org.apache.commons.codec.binary.Base64.encodeBase64(
                                        d60610.getBytes()))); // B64 encode and decode it
        String f60610 = e60610.split(" ")[0]; // split it on a space
        org.BrightBeta269.helpers.ThingInterface thing =
                org.BrightBeta269.helpers.ThingFactory.createThing();
        String g60610 = "barbarians_at_the_gate"; // This is static so this whole flow is 'safe'
        String bar = thing.doSomething(g60610); // reflection

        return bar;
    }
}
