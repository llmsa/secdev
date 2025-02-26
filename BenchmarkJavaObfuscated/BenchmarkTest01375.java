

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverGamma539-00/QuickBeta316")
public class QuickBeta316 extends HttpServlet {

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

        java.util.Map<String, String[]> map = request.getParameterMap();
        String param = "";
        if (!map.isEmpty()) {
            String[] values = map.get("QuickBeta316");
            if (values != null) param = values[0];
        }

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
            String a33070 = param; // assign
            StringBuilder b33070 = new StringBuilder(a33070); // stick in stringbuilder
            b33070.append(" SafeStuff"); // append some safe content
            b33070.replace(
                    b33070.length() - "Chars".length(),
                    b33070.length(),
                    "Chars"); // replace some of the end content
            java.util.HashMap<String, Object> map33070 = new java.util.HashMap<String, Object>();
            map33070.put("key33070", b33070.toString()); // put in a collection
            String c33070 = (String) map33070.get("key33070"); // get it back out
            String d33070 = c33070.substring(0, c33070.length() - 1); // extract most of it
            String e33070 =
                    new String(
                            org.apache.commons.codec.binary.Base64.decodeBase64(
                                    org.apache.commons.codec.binary.Base64.encodeBase64(
                                            d33070.getBytes()))); // B64 encode and decode it
            String f33070 = e33070.split(" ")[0]; // split it on a space
            org.BrightBeta269.helpers.ThingInterface thing =
                    org.BrightBeta269.helpers.ThingFactory.createThing();
            String bar = thing.doSomething(f33070); // reflection

            return bar;
        }
    } // end innerclass Test
} // end DataflowThruInnerClass
