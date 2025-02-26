

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-00/BraveDelta650")
public class BraveDelta650 extends HttpServlet {

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
            String[] values = map.get("BraveDelta650");
            if (values != null) param = values[0];
        }

        String bar = "safe!";
        java.util.HashMap<String, Object> map8943 = new java.util.HashMap<String, Object>();
        map8943.put("keyA-8943", "a_Value"); // put some stuff in the collection
        map8943.put("keyB-8943", param); // put it in a collection
        map8943.put("keyC", "another_Value"); // put some stuff in the collection
        bar = (String) map8943.get("keyB-8943"); // get it back out
        bar = (String) map8943.get("keyA-8943"); // get safe value back out

        response.setHeader("X-XSS-Protection", "0");
        response.getWriter().write("Parameter value: " + bar);
    }
}
