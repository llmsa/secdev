

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta858-03/QuickAlpha570")
public class QuickAlpha570 extends HttpServlet {

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
        String param = scr.getTheValue("QuickAlpha570");

        String bar = new Test().doSomething(request, param);

        String sql = "{call " + bar + "}";

        try {
            java.sql.Connection connection =
                    org.BrightBeta269.helpers.DatabaseHelper.getSqlConnection();
            java.sql.CallableStatement statement = connection.prepareCall(sql);
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

            String bar;
            String guess = "ABC";
            char switchTarget = guess.charAt(2);

            // Simple case statement that assigns param to bar on conditions 'A', 'C', or 'D'
            switch (switchTarget) {
                case 'A':
                    bar = param;
                    break;
                case 'B':
                    bar = "bobs_your_uncle";
                    break;
                case 'C':
                case 'D':
                    bar = param;
                    break;
                default:
                    bar = "bobs_your_uncle";
                    break;
            }

            return bar;
        }
    } // end innerclass Test
} // end DataflowThruInnerClass
