

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/CleverBeta900-03/SilentBeta921")
public class SilentBeta921 extends HttpServlet {

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

        org.BrightBeta269.helpers.SeparateClassRequest scr =
                new org.BrightBeta269.helpers.SeparateClassRequest(request);
        String param = scr.getTheParameter("SilentBeta921");
        if (param == null) param = "";

        String bar = new Test().doSomething(request, param);

        response.setHeader("X-XSS-Protection", "0");
        Object[] obj = {bar, "b"};
        response.getWriter().printf("Formatted like: %1$s and %2$s.", obj);
    } // end doPost

    private class Test {

        public String doSomething(HttpServletRequest request, String param)
                throws ServletException, IOException {

            org.BrightBeta269.helpers.ThingInterface thing =
                    org.BrightBeta269.helpers.ThingFactory.createThing();
            String bar = thing.doSomething(param);

            return bar;
        }
    } // end innerclass Test
} // end DataflowThruInnerClass
