

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-03/SilentAlpha206")
public class SilentAlpha206 extends HttpServlet {

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
        String param = scr.getTheParameter("SilentAlpha206");
        if (param == null) param = "";

        String bar = new Test().doSomething(request, param);

        response.setHeader("X-XSS-Protection", "0");
        response.getWriter().write(bar);
    } // end doPost

    private class Test {

        public String doSomething(HttpServletRequest request, String param)
                throws ServletException, IOException {

            String bar = "safe!";
            java.util.HashMap<String, Object> map56316 = new java.util.HashMap<String, Object>();
            map56316.put("keyA-56316", "a_Value"); // put some stuff in the collection
            map56316.put("keyB-56316", param); // put it in a collection
            map56316.put("keyC", "another_Value"); // put some stuff in the collection
            bar = (String) map56316.get("keyB-56316"); // get it back out
            bar = (String) map56316.get("keyA-56316"); // get safe value back out

            return bar;
        }
    } // end innerclass Test
} // end DataflowThruInnerClass
