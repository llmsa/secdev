

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/BraveEpsilon229-02/QuickAlpha478")
public class QuickAlpha478 extends HttpServlet {

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
        if (request.getHeader("QuickAlpha478") != null) {
            param = request.getHeader("QuickAlpha478");
        }

        // URL Decode the header value since req.getHeader() doesn't. Unlike req.getParameter().
        param = java.net.URLDecoder.decode(param, "UTF-8");

        String bar = doSomething(request, param);

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
    } // end doPost

    private static String doSomething(HttpServletRequest request, String param)
            throws ServletException, IOException {

        // Chain a bunch of propagators in sequence
        String a20426 = param; // assign
        StringBuilder b20426 = new StringBuilder(a20426); // stick in stringbuilder
        b20426.append(" SafeStuff"); // append some safe content
        b20426.replace(
                b20426.length() - "Chars".length(),
                b20426.length(),
                "Chars"); // replace some of the end content
        java.util.HashMap<String, Object> map20426 = new java.util.HashMap<String, Object>();
        map20426.put("key20426", b20426.toString()); // put in a collection
        String c20426 = (String) map20426.get("key20426"); // get it back out
        String d20426 = c20426.substring(0, c20426.length() - 1); // extract most of it
        String e20426 =
                new String(
                        org.apache.commons.codec.binary.Base64.decodeBase64(
                                org.apache.commons.codec.binary.Base64.encodeBase64(
                                        d20426.getBytes()))); // B64 encode and decode it
        String f20426 = e20426.split(" ")[0]; // split it on a space
        org.BrightBeta269.helpers.ThingInterface thing =
                org.BrightBeta269.helpers.ThingFactory.createThing();
        String g20426 = "barbarians_at_the_gate"; // This is static so this whole flow is 'safe'
        String bar = thing.doSomething(g20426); // reflection

        return bar;
    }
}
