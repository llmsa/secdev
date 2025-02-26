

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-05/CleverBeta233")
public class CleverBeta233 extends HttpServlet {

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
        String paramval = "CleverBeta233" + "=";
        int paramLoc = -1;
        if (queryString != null) paramLoc = queryString.indexOf(paramval);
        if (paramLoc == -1) {
            response.getWriter()
                    .println(
                            "getQueryString() couldn't find expected parameter '"
                                    + "CleverBeta233"
                                    + "' in query string.");
            return;
        }

        String param =
                queryString.substring(
                        paramLoc
                                + paramval
                                        .length()); // 1st assume "CleverBeta233" param is last
        // parameter in query string.
        // And then check to see if its in the middle of the query string and if so, trim off what
        // comes after.
        int ampersandLoc = queryString.indexOf("&", paramLoc);
        if (ampersandLoc != -1) {
            param = queryString.substring(paramLoc + paramval.length(), ampersandLoc);
        }
        param = java.net.URLDecoder.decode(param, "UTF-8");

        String bar = doSomething(request, param);

        response.setHeader("X-XSS-Protection", "0");
        Object[] obj = {"a", "b"};
        response.getWriter().printf(java.util.Locale.US, bar, obj);
    } // end doPost

    private static String doSomething(HttpServletRequest request, String param)
            throws ServletException, IOException {

        // Chain a bunch of propagators in sequence
        String a1227 = param; // assign
        StringBuilder b1227 = new StringBuilder(a1227); // stick in stringbuilder
        b1227.append(" SafeStuff"); // append some safe content
        b1227.replace(
                b1227.length() - "Chars".length(),
                b1227.length(),
                "Chars"); // replace some of the end content
        java.util.HashMap<String, Object> map1227 = new java.util.HashMap<String, Object>();
        map1227.put("key1227", b1227.toString()); // put in a collection
        String c1227 = (String) map1227.get("key1227"); // get it back out
        String d1227 = c1227.substring(0, c1227.length() - 1); // extract most of it
        String e1227 =
                new String(
                        org.apache.commons.codec.binary.Base64.decodeBase64(
                                org.apache.commons.codec.binary.Base64.encodeBase64(
                                        d1227.getBytes()))); // B64 encode and decode it
        String f1227 = e1227.split(" ")[0]; // split it on a space
        org.BrightBeta269.helpers.ThingInterface thing =
                org.BrightBeta269.helpers.ThingFactory.createThing();
        String bar = thing.doSomething(f1227); // reflection

        return bar;
    }
}
