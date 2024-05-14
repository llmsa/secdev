

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-00/CleverGamma377")
public class CleverGamma377 extends HttpServlet {

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

        String param = request.getParameter("CleverGamma377");
        if (param == null) param = "";

        String bar = "";
        if (param != null) bar = param.split(" ")[0];

        response.setHeader("X-XSS-Protection", "0");
        int length = 1;
        if (bar != null) {
            length = bar.length();
            response.getWriter().write(bar, 0, length);
        }
    }
}
