

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-04/BraveEpsilon953")
public class BraveEpsilon953 extends HttpServlet {

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
            String[] values = map.get("BraveEpsilon953");
            if (values != null) param = values[0];
        }

        String bar = doSomething(request, param);

        response.setHeader("X-XSS-Protection", "0");
        response.getWriter().println(bar);
    } // end doPost

    private static String doSomething(HttpServletRequest request, String param)
            throws ServletException, IOException {

        // Chain a bunch of propagators in sequence
        String a16227 = param; // assign
        StringBuilder b16227 = new StringBuilder(a16227); // stick in stringbuilder
        b16227.append(" SafeStuff"); // append some safe content
        b16227.replace(
                b16227.length() - "Chars".length(),
                b16227.length(),
                "Chars"); // replace some of the end content
        java.util.HashMap<String, Object> map16227 = new java.util.HashMap<String, Object>();
        map16227.put("key16227", b16227.toString()); // put in a collection
        String c16227 = (String) map16227.get("key16227"); // get it back out
        String d16227 = c16227.substring(0, c16227.length() - 1); // extract most of it
        String e16227 =
                new String(
                        org.apache.commons.codec.binary.Base64.decodeBase64(
                                org.apache.commons.codec.binary.Base64.encodeBase64(
                                        d16227.getBytes()))); // B64 encode and decode it
        String f16227 = e16227.split(" ")[0]; // split it on a space
        org.BrightBeta269.helpers.ThingInterface thing =
                org.BrightBeta269.helpers.ThingFactory.createThing();
        String g16227 = "barbarians_at_the_gate"; // This is static so this whole flow is 'safe'
        String bar = thing.doSomething(g16227); // reflection

        return bar;
    }
}
