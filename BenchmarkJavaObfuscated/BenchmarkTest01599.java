

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-03/BraveGamma101")
public class BraveGamma101 extends HttpServlet {

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

        String[] values = request.getParameterValues("BraveGamma101");
        String param;
        if (values != null && values.length > 0) param = values[0];
        else param = "";

        String bar = new Test().doSomething(request, param);

        response.setHeader("X-XSS-Protection", "0");
        response.getWriter().write(bar);
    } // end doPost

    private class Test {

        public String doSomething(HttpServletRequest request, String param)
                throws ServletException, IOException {

            String bar = "safe!";
            java.util.HashMap<String, Object> map20521 = new java.util.HashMap<String, Object>();
            map20521.put("keyA-20521", "a_Value"); // put some stuff in the collection
            map20521.put("keyB-20521", param); // put it in a collection
            map20521.put("keyC", "another_Value"); // put some stuff in the collection
            bar = (String) map20521.get("keyB-20521"); // get it back out
            bar = (String) map20521.get("keyA-20521"); // get safe value back out

            return bar;
        }
    } // end innerclass Test
} // end DataflowThruInnerClass
