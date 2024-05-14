

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-01/BrightAlpha907")
public class BrightAlpha907 extends HttpServlet {

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

        String[] values = request.getParameterValues("BrightAlpha907");
        String param;
        if (values != null && values.length > 0) param = values[0];
        else param = "";

        String bar = "";
        if (param != null) bar = param.split(" ")[0];

        response.setHeader("X-XSS-Protection", "0");
        response.getWriter().print(bar);
    }
}
