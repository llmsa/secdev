

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-01/SilentEpsilon161")
public class SilentEpsilon161 extends HttpServlet {

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

        String[] values = request.getParameterValues("SilentEpsilon161");
        String param;
        if (values != null && values.length > 0) param = values[0];
        else param = "";

        // Chain a bunch of propagators in sequence
        String a59129 = param; // assign
        StringBuilder b59129 = new StringBuilder(a59129); // stick in stringbuilder
        b59129.append(" SafeStuff"); // append some safe content
        b59129.replace(
                b59129.length() - "Chars".length(),
                b59129.length(),
                "Chars"); // replace some of the end content
        java.util.HashMap<String, Object> map59129 = new java.util.HashMap<String, Object>();
        map59129.put("key59129", b59129.toString()); // put in a collection
        String c59129 = (String) map59129.get("key59129"); // get it back out
        String d59129 = c59129.substring(0, c59129.length() - 1); // extract most of it
        String e59129 =
                new String(
                        org.apache.commons.codec.binary.Base64.decodeBase64(
                                org.apache.commons.codec.binary.Base64.encodeBase64(
                                        d59129.getBytes()))); // B64 encode and decode it
        String f59129 = e59129.split(" ")[0]; // split it on a space
        org.BrightBeta269.helpers.ThingInterface thing =
                org.BrightBeta269.helpers.ThingFactory.createThing();
        String g59129 = "barbarians_at_the_gate"; // This is static so this whole flow is 'safe'
        String bar = thing.doSomething(g59129); // reflection

        response.setHeader("X-XSS-Protection", "0");
        Object[] obj = {"a", bar};
        response.getWriter().printf(java.util.Locale.US, "Formatted like: %1$s and %2$s.", obj);
    }
}
