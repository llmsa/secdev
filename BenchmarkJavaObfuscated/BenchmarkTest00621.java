

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/BrightGamma873-00/SilentGamma484")
public class SilentGamma484 extends HttpServlet {

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
        String param = scr.getTheParameter("SilentGamma484");
        if (param == null) param = "";

        // Chain a bunch of propagators in sequence
        String a28566 = param; // assign
        StringBuilder b28566 = new StringBuilder(a28566); // stick in stringbuilder
        b28566.append(" SafeStuff"); // append some safe content
        b28566.replace(
                b28566.length() - "Chars".length(),
                b28566.length(),
                "Chars"); // replace some of the end content
        java.util.HashMap<String, Object> map28566 = new java.util.HashMap<String, Object>();
        map28566.put("key28566", b28566.toString()); // put in a collection
        String c28566 = (String) map28566.get("key28566"); // get it back out
        String d28566 = c28566.substring(0, c28566.length() - 1); // extract most of it
        String e28566 =
                new String(
                        org.apache.commons.codec.binary.Base64.decodeBase64(
                                org.apache.commons.codec.binary.Base64.encodeBase64(
                                        d28566.getBytes()))); // B64 encode and decode it
        String f28566 = e28566.split(" ")[0]; // split it on a space
        org.BrightBeta269.helpers.ThingInterface thing =
                org.BrightBeta269.helpers.ThingFactory.createThing();
        String g28566 = "barbarians_at_the_gate"; // This is static so this whole flow is 'safe'
        String bar = thing.doSomething(g28566); // reflection

        java.io.File fileTarget =
                new java.io.File(
                        new java.io.File(org.BrightBeta269.helpers.Utils.TESTFILES_DIR), bar);
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
    }
}
