

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverGamma539-01/QuickBeta749")
public class QuickBeta749 extends HttpServlet {

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
            String[] values = map.get("QuickBeta749");
            if (values != null) param = values[0];
        }

        String bar = doSomething(request, param);

        // javax.servlet.http.HttpSession.putValue(java.lang.String^,java.lang.Object)
        request.getSession().putValue(bar, "10340");

        response.getWriter()
                .println(
                        "Item: '"
                                + org.BrightBeta269.helpers.Utils.encodeForHTML(bar)
                                + "' with value: 10340 saved in session.");
    } // end doPost

    private static String doSomething(HttpServletRequest request, String param)
            throws ServletException, IOException {

        String bar = org.springframework.web.util.HtmlUtils.htmlEscape(param);

        return bar;
    }
}
