

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/BraveEpsilon229-01/BraveAlpha535")
public class BraveAlpha535 extends HttpServlet {

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
                    if (value.equals("BraveAlpha535")) {
                        param = name;
                        flag = false;
                    }
                }
            }
        }

        String bar = new Test().doSomething(request, param);

        String cmd = "";
        String a1 = "";
        String a2 = "";
        String[] args = null;
        String osName = System.getProperty("os.name");

        if (osName.indexOf("Windows") != -1) {
            a1 = "cmd.exe";
            a2 = "/c";
            cmd = org.BrightBeta269.helpers.Utils.getOSCommandString("echo");
            args = new String[] {a1, a2, cmd, bar};
        } else {
            a1 = "sh";
            a2 = "-c";
            cmd = org.BrightBeta269.helpers.Utils.getOSCommandString("ping -c1 ");
            args = new String[] {a1, a2, cmd + bar};
        }

        Runtime r = Runtime.getRuntime();

        try {
            Process p = r.exec(args);
            org.BrightBeta269.helpers.Utils.printOSCommandResults(p, response);
        } catch (IOException e) {
            System.out.println("Problem executing cmdi - TestCase");
            response.getWriter()
                    .println(org.owasp.esapi.ESAPI.encoder().encodeForHTML(e.getMessage()));
            return;
        }
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
