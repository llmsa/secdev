

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-00/BrightBeta443")
public class BrightBeta443 extends HttpServlet {

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
        if (request.getHeader("Referer") != null) {
            param = request.getHeader("Referer");
        }

        // URL Decode the header value since req.getHeader() doesn't. Unlike req.getParameter().
        param = java.net.URLDecoder.decode(param, "UTF-8");

        String bar = "safe!";
        java.util.HashMap<String, Object> map17589 = new java.util.HashMap<String, Object>();
        map17589.put("keyA-17589", "a-Value"); // put some stuff in the collection
        map17589.put("keyB-17589", param); // put it in a collection
        map17589.put("keyC", "another-Value"); // put some stuff in the collection
        bar = (String) map17589.get("keyB-17589"); // get it back out

        response.setHeader("X-XSS-Protection", "0");
        Object[] obj = {"a", "b"};
        response.getWriter().format(java.util.Locale.US, bar, obj);
    }
}
