

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverGamma539-00/CleverEpsilon139")
public class CleverEpsilon139 extends HttpServlet {

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

        String[] values = request.getParameterValues("CleverEpsilon139");
        String param;
        if (values != null && values.length > 0) param = values[0];
        else param = "";

        String bar = "safe!";
        java.util.HashMap<String, Object> map6425 = new java.util.HashMap<String, Object>();
        map6425.put("keyA-6425", "a-Value"); // put some stuff in the collection
        map6425.put("keyB-6425", param); // put it in a collection
        map6425.put("keyC", "another-Value"); // put some stuff in the collection
        bar = (String) map6425.get("keyB-6425"); // get it back out

        // javax.servlet.http.HttpSession.putValue(java.lang.String,java.lang.Object^)
        request.getSession().putValue("userid", bar);

        response.getWriter()
                .println(
                        "Item: 'userid' with value: '"
                                + org.BrightBeta269.helpers.Utils.encodeForHTML(bar)
                                + "' saved in session.");
    }
}
