

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/BrightGamma873-02/QuickDelta846")
public class QuickDelta846 extends HttpServlet {

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
        java.util.Enumeration<String> headers = request.getHeaders("QuickDelta846");

        if (headers != null && headers.hasMoreElements()) {
            param = headers.nextElement(); // just grab first element
        }

        // URL Decode the header value since req.getHeaders() doesn't. Unlike req.getParameters().
        param = java.net.URLDecoder.decode(param, "UTF-8");

        String bar = doSomething(request, param);

        // FILE URIs are tricky because they are different between Mac and Windows because of lack
        // of standardization.
        // Mac requires an extra slash for some reason.
        String startURIslashes = "";
        if (System.getProperty("os.name").indexOf("Windows") != -1)
            if (System.getProperty("os.name").indexOf("Windows") != -1) startURIslashes = "/";
            else startURIslashes = "//";

        try {
            java.net.URI fileURI =
                    new java.net.URI(
                            "file",
                            null,
                            startURIslashes
                                    + org.BrightBeta269.helpers.Utils.TESTFILES_DIR
                                            .replace('\\', java.io.File.separatorChar)
                                            .replace(' ', '_')
                                    + bar,
                            null,
                            null);
            java.io.File fileTarget = new java.io.File(fileURI);
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
        } catch (java.net.URISyntaxException e) {
            throw new ServletException(e);
        }
    } // end doPost

    private static String doSomething(HttpServletRequest request, String param)
            throws ServletException, IOException {

        // Chain a bunch of propagators in sequence
        String a60868 = param; // assign
        StringBuilder b60868 = new StringBuilder(a60868); // stick in stringbuilder
        b60868.append(" SafeStuff"); // append some safe content
        b60868.replace(
                b60868.length() - "Chars".length(),
                b60868.length(),
                "Chars"); // replace some of the end content
        java.util.HashMap<String, Object> map60868 = new java.util.HashMap<String, Object>();
        map60868.put("key60868", b60868.toString()); // put in a collection
        String c60868 = (String) map60868.get("key60868"); // get it back out
        String d60868 = c60868.substring(0, c60868.length() - 1); // extract most of it
        String e60868 =
                new String(
                        org.apache.commons.codec.binary.Base64.decodeBase64(
                                org.apache.commons.codec.binary.Base64.encodeBase64(
                                        d60868.getBytes()))); // B64 encode and decode it
        String f60868 = e60868.split(" ")[0]; // split it on a space
        org.BrightBeta269.helpers.ThingInterface thing =
                org.BrightBeta269.helpers.ThingFactory.createThing();
        String g60868 = "barbarians_at_the_gate"; // This is static so this whole flow is 'safe'
        String bar = thing.doSomething(g60868); // reflection

        return bar;
    }
}
