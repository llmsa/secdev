

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-04/QuickBeta112")
public class QuickBeta112 extends HttpServlet {

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

        org.BrightBeta269.helpers.SeparateClassRequest scr =
                new org.BrightBeta269.helpers.SeparateClassRequest(request);
        String param = scr.getTheParameter("QuickBeta112");
        if (param == null) param = "";

        String bar = doSomething(request, param);

        response.setHeader("X-XSS-Protection", "0");
        response.getWriter().write(bar.toCharArray());
    } // end doPost

    private static String doSomething(HttpServletRequest request, String param)
            throws ServletException, IOException {

        // Chain a bunch of propagators in sequence
        String a67594 = param; // assign
        StringBuilder b67594 = new StringBuilder(a67594); // stick in stringbuilder
        b67594.append(" SafeStuff"); // append some safe content
        b67594.replace(
                b67594.length() - "Chars".length(),
                b67594.length(),
                "Chars"); // replace some of the end content
        java.util.HashMap<String, Object> map67594 = new java.util.HashMap<String, Object>();
        map67594.put("key67594", b67594.toString()); // put in a collection
        String c67594 = (String) map67594.get("key67594"); // get it back out
        String d67594 = c67594.substring(0, c67594.length() - 1); // extract most of it
        String e67594 =
                new String(
                        org.apache.commons.codec.binary.Base64.decodeBase64(
                                org.apache.commons.codec.binary.Base64.encodeBase64(
                                        d67594.getBytes()))); // B64 encode and decode it
        String f67594 = e67594.split(" ")[0]; // split it on a space
        org.BrightBeta269.helpers.ThingInterface thing =
                org.BrightBeta269.helpers.ThingFactory.createThing();
        String g67594 = "barbarians_at_the_gate"; // This is static so this whole flow is 'safe'
        String bar = thing.doSomething(g67594); // reflection

        return bar;
    }
}
