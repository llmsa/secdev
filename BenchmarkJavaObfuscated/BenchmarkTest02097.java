

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta858-04/CleverDelta844")
public class CleverDelta844 extends HttpServlet {

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
        java.util.Enumeration<String> headers = request.getHeaders("CleverDelta844");

        if (headers != null && headers.hasMoreElements()) {
            param = headers.nextElement(); // just grab first element
        }

        // URL Decode the header value since req.getHeaders() doesn't. Unlike req.getParameters().
        param = java.net.URLDecoder.decode(param, "UTF-8");

        String bar = doSomething(request, param);

        String sql = "SELECT * from USERS where USERNAME='foo' and PASSWORD='" + bar + "'";

        try {
            java.sql.Statement statement =
                    org.BrightBeta269.helpers.DatabaseHelper.getSqlStatement();
            java.sql.ResultSet rs = statement.executeQuery(sql);
            org.BrightBeta269.helpers.DatabaseHelper.printResults(rs, sql, response);
        } catch (java.sql.SQLException e) {
            if (org.BrightBeta269.helpers.DatabaseHelper.hideSQLErrors) {
                response.getWriter().println("Error processing request.");
                return;
            } else throw new ServletException(e);
        }
    } // end doPost

    private static String doSomething(HttpServletRequest request, String param)
            throws ServletException, IOException {

        String bar = "safe!";
        java.util.HashMap<String, Object> map94015 = new java.util.HashMap<String, Object>();
        map94015.put("keyA-94015", "a_Value"); // put some stuff in the collection
        map94015.put("keyB-94015", param); // put it in a collection
        map94015.put("keyC", "another_Value"); // put some stuff in the collection
        bar = (String) map94015.get("keyB-94015"); // get it back out
        bar = (String) map94015.get("keyA-94015"); // get safe value back out

        return bar;
    }
}
