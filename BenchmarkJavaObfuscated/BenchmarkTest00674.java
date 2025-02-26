

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta858-01/BrightEpsilon411")
public class BrightEpsilon411 extends HttpServlet {

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
        String param = scr.getTheParameter("BrightEpsilon411");
        if (param == null) param = "";

        // Chain a bunch of propagators in sequence
        String a55926 = param; // assign
        StringBuilder b55926 = new StringBuilder(a55926); // stick in stringbuilder
        b55926.append(" SafeStuff"); // append some safe content
        b55926.replace(
                b55926.length() - "Chars".length(),
                b55926.length(),
                "Chars"); // replace some of the end content
        java.util.HashMap<String, Object> map55926 = new java.util.HashMap<String, Object>();
        map55926.put("key55926", b55926.toString()); // put in a collection
        String c55926 = (String) map55926.get("key55926"); // get it back out
        String d55926 = c55926.substring(0, c55926.length() - 1); // extract most of it
        String e55926 =
                new String(
                        org.apache.commons.codec.binary.Base64.decodeBase64(
                                org.apache.commons.codec.binary.Base64.encodeBase64(
                                        d55926.getBytes()))); // B64 encode and decode it
        String f55926 = e55926.split(" ")[0]; // split it on a space
        org.BrightBeta269.helpers.ThingInterface thing =
                org.BrightBeta269.helpers.ThingFactory.createThing();
        String g55926 = "barbarians_at_the_gate"; // This is static so this whole flow is 'safe'
        String bar = thing.doSomething(g55926); // reflection

        String sql = "SELECT * from USERS where USERNAME=? and PASSWORD='" + bar + "'";

        try {
            java.sql.Connection connection =
                    org.BrightBeta269.helpers.DatabaseHelper.getSqlConnection();
            java.sql.PreparedStatement statement =
                    connection.prepareStatement(
                            sql,
                            java.sql.ResultSet.TYPE_FORWARD_ONLY,
                            java.sql.ResultSet.CONCUR_READ_ONLY);
            statement.setString(1, "foo");
            statement.execute();
            org.BrightBeta269.helpers.DatabaseHelper.printResults(statement, sql, response);
        } catch (java.sql.SQLException e) {
            if (org.BrightBeta269.helpers.DatabaseHelper.hideSQLErrors) {
                response.getWriter().println("Error processing request.");
                return;
            } else throw new ServletException(e);
        }
    }
}
