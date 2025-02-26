

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverGamma539-00/QuickEpsilon297")
public class QuickEpsilon297 extends HttpServlet {

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
        boolean flag = true;
        java.util.Enumeration<String> names = request.getParameterNames();
        while (names.hasMoreElements() && flag) {
            String name = (String) names.nextElement();
            String[] values = request.getParameterValues(name);
            if (values != null) {
                for (int i = 0; i < values.length && flag; i++) {
                    String value = values[i];
                    if (value.equals("QuickEpsilon297")) {
                        param = name;
                        flag = false;
                    }
                }
            }
        }

        String bar = "safe!";
        java.util.HashMap<String, Object> map58886 = new java.util.HashMap<String, Object>();
        map58886.put("keyA-58886", "a_Value"); // put some stuff in the collection
        map58886.put("keyB-58886", param); // put it in a collection
        map58886.put("keyC", "another_Value"); // put some stuff in the collection
        bar = (String) map58886.get("keyB-58886"); // get it back out
        bar = (String) map58886.get("keyA-58886"); // get safe value back out

        // javax.servlet.http.HttpSession.putValue(java.lang.String^,java.lang.Object)
        request.getSession().putValue(bar, "10340");

        response.getWriter()
                .println(
                        "Item: '"
                                + org.BrightBeta269.helpers.Utils.encodeForHTML(bar)
                                + "' with value: 10340 saved in session.");
    }
}
