

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-01/CleverEpsilon244")
public class CleverEpsilon244 extends HttpServlet {

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

        String queryString = request.getQueryString();
        String paramval = "CleverEpsilon244" + "=";
        int paramLoc = -1;
        if (queryString != null) paramLoc = queryString.indexOf(paramval);
        if (paramLoc == -1) {
            response.getWriter()
                    .println(
                            "getQueryString() couldn't find expected parameter '"
                                    + "CleverEpsilon244"
                                    + "' in query string.");
            return;
        }

        String param =
                queryString.substring(
                        paramLoc
                                + paramval
                                        .length()); // 1st assume "CleverEpsilon244" param is last
        // parameter in query string.
        // And then check to see if its in the middle of the query string and if so, trim off what
        // comes after.
        int ampersandLoc = queryString.indexOf("&", paramLoc);
        if (ampersandLoc != -1) {
            param = queryString.substring(paramLoc + paramval.length(), ampersandLoc);
        }
        param = java.net.URLDecoder.decode(param, "UTF-8");

        // Chain a bunch of propagators in sequence
        String a72616 = param; // assign
        StringBuilder b72616 = new StringBuilder(a72616); // stick in stringbuilder
        b72616.append(" SafeStuff"); // append some safe content
        b72616.replace(
                b72616.length() - "Chars".length(),
                b72616.length(),
                "Chars"); // replace some of the end content
        java.util.HashMap<String, Object> map72616 = new java.util.HashMap<String, Object>();
        map72616.put("key72616", b72616.toString()); // put in a collection
        String c72616 = (String) map72616.get("key72616"); // get it back out
        String d72616 = c72616.substring(0, c72616.length() - 1); // extract most of it
        String e72616 =
                new String(
                        org.apache.commons.codec.binary.Base64.decodeBase64(
                                org.apache.commons.codec.binary.Base64.encodeBase64(
                                        d72616.getBytes()))); // B64 encode and decode it
        String f72616 = e72616.split(" ")[0]; // split it on a space
        org.BrightBeta269.helpers.ThingInterface thing =
                org.BrightBeta269.helpers.ThingFactory.createThing();
        String bar = thing.doSomething(f72616); // reflection

        response.setHeader("X-XSS-Protection", "0");
        response.getWriter().print(bar);
    }
}
