

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-04/BraveEpsilon944")
public class BraveEpsilon944 extends HttpServlet {

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
        String param = scr.getTheParameter("BraveEpsilon944");
        if (param == null) param = "";

        String bar = doSomething(request, param);

        response.setHeader("X-XSS-Protection", "0");
        Object[] obj = {"a", "b"};
        response.getWriter().printf(java.util.Locale.US, bar, obj);
    } // end doPost

    private static String doSomething(HttpServletRequest request, String param)
            throws ServletException, IOException {

        // Chain a bunch of propagators in sequence
        String a34270 = param; // assign
        StringBuilder b34270 = new StringBuilder(a34270); // stick in stringbuilder
        b34270.append(" SafeStuff"); // append some safe content
        b34270.replace(
                b34270.length() - "Chars".length(),
                b34270.length(),
                "Chars"); // replace some of the end content
        java.util.HashMap<String, Object> map34270 = new java.util.HashMap<String, Object>();
        map34270.put("key34270", b34270.toString()); // put in a collection
        String c34270 = (String) map34270.get("key34270"); // get it back out
        String d34270 = c34270.substring(0, c34270.length() - 1); // extract most of it
        String e34270 =
                new String(
                        org.apache.commons.codec.binary.Base64.decodeBase64(
                                org.apache.commons.codec.binary.Base64.encodeBase64(
                                        d34270.getBytes()))); // B64 encode and decode it
        String f34270 = e34270.split(" ")[0]; // split it on a space
        org.BrightBeta269.helpers.ThingInterface thing =
                org.BrightBeta269.helpers.ThingFactory.createThing();
        String bar = thing.doSomething(f34270); // reflection

        return bar;
    }
}
