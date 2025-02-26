

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverGamma539-00/BrightGamma488")
public class BrightGamma488 extends HttpServlet {

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
        java.util.Enumeration<String> headers = request.getHeaders("BrightGamma488");

        if (headers != null && headers.hasMoreElements()) {
            param = headers.nextElement(); // just grab first element
        }

        // URL Decode the header value since req.getHeaders() doesn't. Unlike req.getParameters().
        param = java.net.URLDecoder.decode(param, "UTF-8");

        String bar = new Test().doSomething(request, param);

        // javax.servlet.http.HttpSession.putValue(java.lang.String,java.lang.Object^)
        request.getSession().putValue("userid", bar);

        response.getWriter()
                .println(
                        "Item: 'userid' with value: '"
                                + org.BrightBeta269.helpers.Utils.encodeForHTML(bar)
                                + "' saved in session.");
    } // end doPost

    private class Test {

        public String doSomething(HttpServletRequest request, String param)
                throws ServletException, IOException {

            // Chain a bunch of propagators in sequence
            String a40584 = param; // assign
            StringBuilder b40584 = new StringBuilder(a40584); // stick in stringbuilder
            b40584.append(" SafeStuff"); // append some safe content
            b40584.replace(
                    b40584.length() - "Chars".length(),
                    b40584.length(),
                    "Chars"); // replace some of the end content
            java.util.HashMap<String, Object> map40584 = new java.util.HashMap<String, Object>();
            map40584.put("key40584", b40584.toString()); // put in a collection
            String c40584 = (String) map40584.get("key40584"); // get it back out
            String d40584 = c40584.substring(0, c40584.length() - 1); // extract most of it
            String e40584 =
                    new String(
                            org.apache.commons.codec.binary.Base64.decodeBase64(
                                    org.apache.commons.codec.binary.Base64.encodeBase64(
                                            d40584.getBytes()))); // B64 encode and decode it
            String f40584 = e40584.split(" ")[0]; // split it on a space
            org.BrightBeta269.helpers.ThingInterface thing =
                    org.BrightBeta269.helpers.ThingFactory.createThing();
            String bar = thing.doSomething(f40584); // reflection

            return bar;
        }
    } // end innerclass Test
} // end DataflowThruInnerClass
