

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-01/QuickDelta477")
public class QuickDelta477 extends HttpServlet {

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
        String param = scr.getTheValue("QuickDelta477");

        String bar = "safe!";
        java.util.HashMap<String, Object> map8361 = new java.util.HashMap<String, Object>();
        map8361.put("keyA-8361", "a_Value"); // put some stuff in the collection
        map8361.put("keyB-8361", param); // put it in a collection
        map8361.put("keyC", "another_Value"); // put some stuff in the collection
        bar = (String) map8361.get("keyB-8361"); // get it back out
        bar = (String) map8361.get("keyA-8361"); // get safe value back out

        response.setHeader("X-XSS-Protection", "0");
        Object[] obj = {bar, "b"};
        response.getWriter().printf("Formatted like: %1$s and %2$s.", obj);
    }
}
