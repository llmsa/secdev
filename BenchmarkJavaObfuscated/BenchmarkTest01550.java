

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverGamma539-00/CleverBeta162")
public class CleverBeta162 extends HttpServlet {

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
        String param = scr.getTheParameter("CleverBeta162");
        if (param == null) param = "";

        String bar = new Test().doSomething(request, param);

        // javax.servlet.http.HttpSession.setAttribute(java.lang.String,java.lang.Object^)
        request.getSession().setAttribute("userid", bar);

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
            String a86153 = param; // assign
            StringBuilder b86153 = new StringBuilder(a86153); // stick in stringbuilder
            b86153.append(" SafeStuff"); // append some safe content
            b86153.replace(
                    b86153.length() - "Chars".length(),
                    b86153.length(),
                    "Chars"); // replace some of the end content
            java.util.HashMap<String, Object> map86153 = new java.util.HashMap<String, Object>();
            map86153.put("key86153", b86153.toString()); // put in a collection
            String c86153 = (String) map86153.get("key86153"); // get it back out
            String d86153 = c86153.substring(0, c86153.length() - 1); // extract most of it
            String e86153 =
                    new String(
                            org.apache.commons.codec.binary.Base64.decodeBase64(
                                    org.apache.commons.codec.binary.Base64.encodeBase64(
                                            d86153.getBytes()))); // B64 encode and decode it
            String f86153 = e86153.split(" ")[0]; // split it on a space
            org.BrightBeta269.helpers.ThingInterface thing =
                    org.BrightBeta269.helpers.ThingFactory.createThing();
            String bar = thing.doSomething(f86153); // reflection

            return bar;
        }
    } // end innerclass Test
} // end DataflowThruInnerClass
