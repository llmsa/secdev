

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta858-02/BraveBeta427")
public class BraveBeta427 extends HttpServlet {

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
        java.util.Enumeration<String> headers = request.getHeaders("BraveBeta427");

        if (headers != null && headers.hasMoreElements()) {
            param = headers.nextElement(); // just grab first element
        }

        // URL Decode the header value since req.getHeaders() doesn't. Unlike req.getParameters().
        param = java.net.URLDecoder.decode(param, "UTF-8");

        String bar = new Test().doSomething(request, param);

        String sql = "SELECT * from USERS where USERNAME='foo' and PASSWORD='" + bar + "'";

        try {
            java.sql.Statement statement =
                    org.BrightBeta269.helpers.DatabaseHelper.getSqlStatement();
            statement.addBatch(sql);
            int[] counts = statement.executeBatch();
            org.BrightBeta269.helpers.DatabaseHelper.printResults(sql, counts, response);
        } catch (java.sql.SQLException e) {
            if (org.BrightBeta269.helpers.DatabaseHelper.hideSQLErrors) {
                response.getWriter().println("Error processing request.");
                return;
            } else throw new ServletException(e);
        }
    } // end doPost

    private class Test {

        public String doSomething(HttpServletRequest request, String param)
                throws ServletException, IOException {

            // Chain a bunch of propagators in sequence
            String a89502 = param; // assign
            StringBuilder b89502 = new StringBuilder(a89502); // stick in stringbuilder
            b89502.append(" SafeStuff"); // append some safe content
            b89502.replace(
                    b89502.length() - "Chars".length(),
                    b89502.length(),
                    "Chars"); // replace some of the end content
            java.util.HashMap<String, Object> map89502 = new java.util.HashMap<String, Object>();
            map89502.put("key89502", b89502.toString()); // put in a collection
            String c89502 = (String) map89502.get("key89502"); // get it back out
            String d89502 = c89502.substring(0, c89502.length() - 1); // extract most of it
            String e89502 =
                    new String(
                            org.apache.commons.codec.binary.Base64.decodeBase64(
                                    org.apache.commons.codec.binary.Base64.encodeBase64(
                                            d89502.getBytes()))); // B64 encode and decode it
            String f89502 = e89502.split(" ")[0]; // split it on a space
            org.BrightBeta269.helpers.ThingInterface thing =
                    org.BrightBeta269.helpers.ThingFactory.createThing();
            String g89502 = "barbarians_at_the_gate"; // This is static so this whole flow is 'safe'
            String bar = thing.doSomething(g89502); // reflection

            return bar;
        }
    } // end innerclass Test
} // end DataflowThruInnerClass
