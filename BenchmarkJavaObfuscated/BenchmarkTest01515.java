

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-03/BrightEpsilon810")
public class BrightEpsilon810 extends HttpServlet {

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
        String param = scr.getTheParameter("BrightEpsilon810");
        if (param == null) param = "";

        String bar = new Test().doSomething(request, param);

        response.setHeader("X-XSS-Protection", "0");
        response.getWriter().write(bar);
    } // end doPost

    private class Test {

        public String doSomething(HttpServletRequest request, String param)
                throws ServletException, IOException {

            // Chain a bunch of propagators in sequence
            String a84124 = param; // assign
            StringBuilder b84124 = new StringBuilder(a84124); // stick in stringbuilder
            b84124.append(" SafeStuff"); // append some safe content
            b84124.replace(
                    b84124.length() - "Chars".length(),
                    b84124.length(),
                    "Chars"); // replace some of the end content
            java.util.HashMap<String, Object> map84124 = new java.util.HashMap<String, Object>();
            map84124.put("key84124", b84124.toString()); // put in a collection
            String c84124 = (String) map84124.get("key84124"); // get it back out
            String d84124 = c84124.substring(0, c84124.length() - 1); // extract most of it
            String e84124 =
                    new String(
                            org.apache.commons.codec.binary.Base64.decodeBase64(
                                    org.apache.commons.codec.binary.Base64.encodeBase64(
                                            d84124.getBytes()))); // B64 encode and decode it
            String f84124 = e84124.split(" ")[0]; // split it on a space
            org.BrightBeta269.helpers.ThingInterface thing =
                    org.BrightBeta269.helpers.ThingFactory.createThing();
            String g84124 = "barbarians_at_the_gate"; // This is static so this whole flow is 'safe'
            String bar = thing.doSomething(g84124); // reflection

            return bar;
        }
    } // end innerclass Test
} // end DataflowThruInnerClass
