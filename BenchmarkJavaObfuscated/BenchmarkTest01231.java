

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/BrightGamma873-01/BrightEpsilon897")
public class BrightEpsilon897 extends HttpServlet {

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

        String param = request.getParameter("BrightEpsilon897");
        if (param == null) param = "";

        String bar = new Test().doSomething(request, param);

        java.io.File fileTarget =
                new java.io.File(
                        new java.io.File(org.BrightBeta269.helpers.Utils.TESTFILES_DIR), bar);
        response.getWriter()
                .println(
                        "Access to file: '"
                                + org.owasp
                                        .esapi
                                        .ESAPI
                                        .encoder()
                                        .encodeForHTML(fileTarget.toString())
                                + "' created.");
        if (fileTarget.exists()) {
            response.getWriter().println(" And file already exists.");
        } else {
            response.getWriter().println(" But file doesn't exist yet.");
        }
    } // end doPost

    private class Test {

        public String doSomething(HttpServletRequest request, String param)
                throws ServletException, IOException {

            String bar = "safe!";
            java.util.HashMap<String, Object> map35717 = new java.util.HashMap<String, Object>();
            map35717.put("keyA-35717", "a-Value"); // put some stuff in the collection
            map35717.put("keyB-35717", param); // put it in a collection
            map35717.put("keyC", "another-Value"); // put some stuff in the collection
            bar = (String) map35717.get("keyB-35717"); // get it back out

            return bar;
        }
    } // end innerclass Test
} // end DataflowThruInnerClass
