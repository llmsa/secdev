

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta858-02/CleverDelta402")
public class CleverDelta402 extends HttpServlet {

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
            String[] values = map.get("CleverDelta402");
            if (values != null) param = values[0];
        }

        String bar = new Test().doSomething(request, param);

        String sql = "{call " + bar + "}";

        try {
            java.sql.Connection connection =
                    org.BrightBeta269.helpers.DatabaseHelper.getSqlConnection();
            java.sql.CallableStatement statement =
                    connection.prepareCall(
                            sql,
                            java.sql.ResultSet.TYPE_FORWARD_ONLY,
                            java.sql.ResultSet.CONCUR_READ_ONLY);
            java.sql.ResultSet rs = statement.executeQuery();
            org.BrightBeta269.helpers.DatabaseHelper.printResults(rs, sql, response);
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
            String a50098 = param; // assign
            StringBuilder b50098 = new StringBuilder(a50098); // stick in stringbuilder
            b50098.append(" SafeStuff"); // append some safe content
            b50098.replace(
                    b50098.length() - "Chars".length(),
                    b50098.length(),
                    "Chars"); // replace some of the end content
            java.util.HashMap<String, Object> map50098 = new java.util.HashMap<String, Object>();
            map50098.put("key50098", b50098.toString()); // put in a collection
            String c50098 = (String) map50098.get("key50098"); // get it back out
            String d50098 = c50098.substring(0, c50098.length() - 1); // extract most of it
            String e50098 =
                    new String(
                            org.apache.commons.codec.binary.Base64.decodeBase64(
                                    org.apache.commons.codec.binary.Base64.encodeBase64(
                                            d50098.getBytes()))); // B64 encode and decode it
            String f50098 = e50098.split(" ")[0]; // split it on a space
            org.BrightBeta269.helpers.ThingInterface thing =
                    org.BrightBeta269.helpers.ThingFactory.createThing();
            String g50098 = "barbarians_at_the_gate"; // This is static so this whole flow is 'safe'
            String bar = thing.doSomething(g50098); // reflection

            return bar;
        }
    } // end innerclass Test
} // end DataflowThruInnerClass
