

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-04/QuickEpsilon779")
public class QuickEpsilon779 extends HttpServlet {

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

        String[] values = request.getParameterValues("QuickEpsilon779");
        String param;
        if (values != null && values.length > 0) param = values[0];
        else param = "";

        String bar = doSomething(request, param);

        response.setHeader("X-XSS-Protection", "0");
        response.getWriter().print(bar);
    } // end doPost

    private static String doSomething(HttpServletRequest request, String param)
            throws ServletException, IOException {

        String bar = "safe!";
        java.util.HashMap<String, Object> map12535 = new java.util.HashMap<String, Object>();
        map12535.put("keyA-12535", "a_Value"); // put some stuff in the collection
        map12535.put("keyB-12535", param); // put it in a collection
        map12535.put("keyC", "another_Value"); // put some stuff in the collection
        bar = (String) map12535.get("keyB-12535"); // get it back out
        bar = (String) map12535.get("keyA-12535"); // get safe value back out

        return bar;
    }
}
