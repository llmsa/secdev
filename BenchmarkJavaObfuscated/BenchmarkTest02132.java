

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-04/SilentBeta725")
public class SilentBeta725 extends HttpServlet {

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

        String param = request.getParameter("SilentBeta725");
        if (param == null) param = "";

        String bar = doSomething(request, param);

        response.setHeader("X-XSS-Protection", "0");
        response.getWriter().println(bar);
    } // end doPost

    private static String doSomething(HttpServletRequest request, String param)
            throws ServletException, IOException {

        // Chain a bunch of propagators in sequence
        String a76744 = param; // assign
        StringBuilder b76744 = new StringBuilder(a76744); // stick in stringbuilder
        b76744.append(" SafeStuff"); // append some safe content
        b76744.replace(
                b76744.length() - "Chars".length(),
                b76744.length(),
                "Chars"); // replace some of the end content
        java.util.HashMap<String, Object> map76744 = new java.util.HashMap<String, Object>();
        map76744.put("key76744", b76744.toString()); // put in a collection
        String c76744 = (String) map76744.get("key76744"); // get it back out
        String d76744 = c76744.substring(0, c76744.length() - 1); // extract most of it
        String e76744 =
                new String(
                        org.apache.commons.codec.binary.Base64.decodeBase64(
                                org.apache.commons.codec.binary.Base64.encodeBase64(
                                        d76744.getBytes()))); // B64 encode and decode it
        String f76744 = e76744.split(" ")[0]; // split it on a space
        org.BrightBeta269.helpers.ThingInterface thing =
                org.BrightBeta269.helpers.ThingFactory.createThing();
        String bar = thing.doSomething(f76744); // reflection

        return bar;
    }
}
