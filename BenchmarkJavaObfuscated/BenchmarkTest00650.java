

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-01/QuickBeta602")
public class QuickBeta602 extends HttpServlet {

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
        String param = scr.getTheParameter("QuickBeta602");
        if (param == null) param = "";

        // Chain a bunch of propagators in sequence
        String a17321 = param; // assign
        StringBuilder b17321 = new StringBuilder(a17321); // stick in stringbuilder
        b17321.append(" SafeStuff"); // append some safe content
        b17321.replace(
                b17321.length() - "Chars".length(),
                b17321.length(),
                "Chars"); // replace some of the end content
        java.util.HashMap<String, Object> map17321 = new java.util.HashMap<String, Object>();
        map17321.put("key17321", b17321.toString()); // put in a collection
        String c17321 = (String) map17321.get("key17321"); // get it back out
        String d17321 = c17321.substring(0, c17321.length() - 1); // extract most of it
        String e17321 =
                new String(
                        org.apache.commons.codec.binary.Base64.decodeBase64(
                                org.apache.commons.codec.binary.Base64.encodeBase64(
                                        d17321.getBytes()))); // B64 encode and decode it
        String f17321 = e17321.split(" ")[0]; // split it on a space
        org.BrightBeta269.helpers.ThingInterface thing =
                org.BrightBeta269.helpers.ThingFactory.createThing();
        String g17321 = "barbarians_at_the_gate"; // This is static so this whole flow is 'safe'
        String bar = thing.doSomething(g17321); // reflection

        response.setHeader("X-XSS-Protection", "0");
        response.getWriter().write(bar.toCharArray());
    }
}
