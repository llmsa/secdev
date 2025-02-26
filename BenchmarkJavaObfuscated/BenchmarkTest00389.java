

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-00/BrightEpsilon886")
public class BrightEpsilon886 extends HttpServlet {

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

        String param = request.getParameter("BrightEpsilon886");
        if (param == null) param = "";

        String bar = org.apache.commons.lang.StringEscapeUtils.escapeHtml(param);

        response.setHeader("X-XSS-Protection", "0");
        response.getWriter().println(bar);
    }
}
