

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-00/BraveEpsilon183")
public class BraveEpsilon183 extends HttpServlet {

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
            String[] values = map.get("BraveEpsilon183");
            if (values != null) param = values[0];
        }

        StringBuilder sbxyz54686 = new StringBuilder(param);
        String bar = sbxyz54686.append("_SafeStuff").toString();

        response.setHeader("X-XSS-Protection", "0");
        response.getWriter().println(bar);
    }
}
