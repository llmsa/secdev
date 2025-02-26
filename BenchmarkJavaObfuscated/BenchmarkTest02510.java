

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/BraveEpsilon229-02/QuickAlpha885")
public class QuickAlpha885 extends HttpServlet {

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

        String[] values = request.getParameterValues("QuickAlpha885");
        String param;
        if (values != null && values.length > 0) param = values[0];
        else param = "";

        String bar = doSomething(request, param);

        String cmd =
                org.BrightBeta269.helpers.Utils.getInsecureOSCommandString(
                        this.getClass().getClassLoader());
        String[] args = {cmd};
        String[] argsEnv = {bar};

        Runtime r = Runtime.getRuntime();

        try {
            Process p = r.exec(args, argsEnv);
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
        String a11776 = param; // assign
        StringBuilder b11776 = new StringBuilder(a11776); // stick in stringbuilder
        b11776.append(" SafeStuff"); // append some safe content
        b11776.replace(
                b11776.length() - "Chars".length(),
                b11776.length(),
                "Chars"); // replace some of the end content
        java.util.HashMap<String, Object> map11776 = new java.util.HashMap<String, Object>();
        map11776.put("key11776", b11776.toString()); // put in a collection
        String c11776 = (String) map11776.get("key11776"); // get it back out
        String d11776 = c11776.substring(0, c11776.length() - 1); // extract most of it
        String e11776 =
                new String(
                        org.apache.commons.codec.binary.Base64.decodeBase64(
                                org.apache.commons.codec.binary.Base64.encodeBase64(
                                        d11776.getBytes()))); // B64 encode and decode it
        String f11776 = e11776.split(" ")[0]; // split it on a space
        org.BrightBeta269.helpers.ThingInterface thing =
                org.BrightBeta269.helpers.ThingFactory.createThing();
        String g11776 = "barbarians_at_the_gate"; // This is static so this whole flow is 'safe'
        String bar = thing.doSomething(g11776); // reflection

        return bar;
    }
}
