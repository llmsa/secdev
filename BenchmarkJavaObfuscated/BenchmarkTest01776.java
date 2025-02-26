

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-03/CleverAlpha930")
public class CleverAlpha930 extends HttpServlet {

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
        String param = scr.getTheValue("CleverAlpha930");

        String bar = new Test().doSomething(request, param);

        response.setHeader("X-XSS-Protection", "0");
        int length = 1;
        if (bar != null) {
            length = bar.length();
            response.getWriter().write(bar, 0, length);
        }
    } // end doPost

    private class Test {

        public String doSomething(HttpServletRequest request, String param)
                throws ServletException, IOException {

            String bar = "safe!";
            java.util.HashMap<String, Object> map3531 = new java.util.HashMap<String, Object>();
            map3531.put("keyA-3531", "a_Value"); // put some stuff in the collection
            map3531.put("keyB-3531", param); // put it in a collection
            map3531.put("keyC", "another_Value"); // put some stuff in the collection
            bar = (String) map3531.get("keyB-3531"); // get it back out
            bar = (String) map3531.get("keyA-3531"); // get safe value back out

            return bar;
        }
    } // end innerclass Test
} // end DataflowThruInnerClass
