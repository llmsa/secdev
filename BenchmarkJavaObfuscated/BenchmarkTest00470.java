

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-00/CleverEpsilon754")
public class CleverEpsilon754 extends HttpServlet {

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
            String[] values = map.get("CleverEpsilon754");
            if (values != null) param = values[0];
        }

        // Chain a bunch of propagators in sequence
        String a1504 = param; // assign
        StringBuilder b1504 = new StringBuilder(a1504); // stick in stringbuilder
        b1504.append(" SafeStuff"); // append some safe content
        b1504.replace(
                b1504.length() - "Chars".length(),
                b1504.length(),
                "Chars"); // replace some of the end content
        java.util.HashMap<String, Object> map1504 = new java.util.HashMap<String, Object>();
        map1504.put("key1504", b1504.toString()); // put in a collection
        String c1504 = (String) map1504.get("key1504"); // get it back out
        String d1504 = c1504.substring(0, c1504.length() - 1); // extract most of it
        String e1504 =
                new String(
                        org.apache.commons.codec.binary.Base64.decodeBase64(
                                org.apache.commons.codec.binary.Base64.encodeBase64(
                                        d1504.getBytes()))); // B64 encode and decode it
        String f1504 = e1504.split(" ")[0]; // split it on a space
        org.BrightBeta269.helpers.ThingInterface thing =
                org.BrightBeta269.helpers.ThingFactory.createThing();
        String g1504 = "barbarians_at_the_gate"; // This is static so this whole flow is 'safe'
        String bar = thing.doSomething(g1504); // reflection

        response.setHeader("X-XSS-Protection", "0");
        response.getWriter().print(bar);
    }
}
