

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/BraveEpsilon229-02/CleverAlpha571")
public class CleverAlpha571 extends HttpServlet {

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

        String param = request.getParameter("CleverAlpha571");
        if (param == null) param = "";

        String bar = doSomething(request, param);

        String cmd =
                org.BrightBeta269.helpers.Utils.getInsecureOSCommandString(
                        this.getClass().getClassLoader());
        String[] args = {cmd};
        String[] argsEnv = {bar};

        Runtime r = Runtime.getRuntime();

        try {
            Process p = r.exec(args, argsEnv, new java.io.File(System.getProperty("user.dir")));
            org.BrightBeta269.helpers.Utils.printOSCommandResults(p, response);
        } catch (IOException e) {
            System.out.println("Problem executing cmdi - TestCase");
            response.getWriter()
                    .println(org.owasp.esapi.ESAPI.encoder().encodeForHTML(e.getMessage()));
            return;
        }
    } // end doPost

    private static String doSomething(HttpServletRequest request, String param)
            throws ServletException, IOException {

        // Chain a bunch of propagators in sequence
        String a82592 = param; // assign
        StringBuilder b82592 = new StringBuilder(a82592); // stick in stringbuilder
        b82592.append(" SafeStuff"); // append some safe content
        b82592.replace(
                b82592.length() - "Chars".length(),
                b82592.length(),
                "Chars"); // replace some of the end content
        java.util.HashMap<String, Object> map82592 = new java.util.HashMap<String, Object>();
        map82592.put("key82592", b82592.toString()); // put in a collection
        String c82592 = (String) map82592.get("key82592"); // get it back out
        String d82592 = c82592.substring(0, c82592.length() - 1); // extract most of it
        String e82592 =
                new String(
                        org.apache.commons.codec.binary.Base64.decodeBase64(
                                org.apache.commons.codec.binary.Base64.encodeBase64(
                                        d82592.getBytes()))); // B64 encode and decode it
        String f82592 = e82592.split(" ")[0]; // split it on a space
        org.BrightBeta269.helpers.ThingInterface thing =
                org.BrightBeta269.helpers.ThingFactory.createThing();
        String g82592 = "barbarians_at_the_gate"; // This is static so this whole flow is 'safe'
        String bar = thing.doSomething(g82592); // reflection

        return bar;
    }
}
