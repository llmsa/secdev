

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/BraveEpsilon229-00/QuickEpsilon414")
public class QuickEpsilon414 extends HttpServlet {

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

        String param = request.getParameter("QuickEpsilon414");
        if (param == null) param = "";

        // Chain a bunch of propagators in sequence
        String a18204 = param; // assign
        StringBuilder b18204 = new StringBuilder(a18204); // stick in stringbuilder
        b18204.append(" SafeStuff"); // append some safe content
        b18204.replace(
                b18204.length() - "Chars".length(),
                b18204.length(),
                "Chars"); // replace some of the end content
        java.util.HashMap<String, Object> map18204 = new java.util.HashMap<String, Object>();
        map18204.put("key18204", b18204.toString()); // put in a collection
        String c18204 = (String) map18204.get("key18204"); // get it back out
        String d18204 = c18204.substring(0, c18204.length() - 1); // extract most of it
        String e18204 =
                new String(
                        org.apache.commons.codec.binary.Base64.decodeBase64(
                                org.apache.commons.codec.binary.Base64.encodeBase64(
                                        d18204.getBytes()))); // B64 encode and decode it
        String f18204 = e18204.split(" ")[0]; // split it on a space
        org.BrightBeta269.helpers.ThingInterface thing =
                org.BrightBeta269.helpers.ThingFactory.createThing();
        String g18204 = "barbarians_at_the_gate"; // This is static so this whole flow is 'safe'
        String bar = thing.doSomething(g18204); // reflection

        String cmd =
                org.BrightBeta269.helpers.Utils.getInsecureOSCommandString(
                        this.getClass().getClassLoader());

        String[] argsEnv = {bar};
        Runtime r = Runtime.getRuntime();

        try {
            Process p = r.exec(cmd, argsEnv);
            org.BrightBeta269.helpers.Utils.printOSCommandResults(p, response);
        } catch (IOException e) {
            System.out.println("Problem executing cmdi - TestCase");
            response.getWriter()
                    .println(org.owasp.esapi.ESAPI.encoder().encodeForHTML(e.getMessage()));
            return;
        }
    }
}
