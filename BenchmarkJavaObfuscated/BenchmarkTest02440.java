

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/SilentAlpha812-05/BraveEpsilon307")
public class BraveEpsilon307 extends HttpServlet {

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
        String param = scr.getTheParameter("BraveEpsilon307");
        if (param == null) param = "";

        String bar = doSomething(request, param);

        try {
            double stuff = java.security.SecureRandom.getInstance("SHA1PRNG").nextGaussian();
            String rememberMeKey =
                    Double.toString(stuff).substring(2); // Trim off the 0. at the front.

            String user = "SafeGayle";
            String fullClassName = this.getClass().getName();
            String testCaseNumber =
                    fullClassName.substring(
                            fullClassName.lastIndexOf('.') + 1 + "BenchmarkTest".length());
            user += testCaseNumber;

            String cookieName = "rememberMe" + testCaseNumber;

            boolean foundUser = false;
            javax.servlet.http.Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (int i = 0; !foundUser && i < cookies.length; i++) {
                    javax.servlet.http.Cookie cookie = cookies[i];
                    if (cookieName.equals(cookie.getName())) {
                        if (cookie.getValue()
                                .equals(request.getSession().getAttribute(cookieName))) {
                            foundUser = true;
                        }
                    }
                }
            }

            if (foundUser) {
                response.getWriter().println("Welcome back: " + user + "<br/>");
            } else {
                javax.servlet.http.Cookie rememberMe =
                        new javax.servlet.http.Cookie(cookieName, rememberMeKey);
                rememberMe.setSecure(true);
                rememberMe.setHttpOnly(true);
                rememberMe.setPath(request.getRequestURI()); // i.e., set path to JUST this servlet
                // e.g., /benchmark/sql-01/CleverDelta916
                request.getSession().setAttribute(cookieName, rememberMeKey);
                response.addCookie(rememberMe);
                response.getWriter()
                        .println(
                                user
                                        + " has been remembered with cookie: "
                                        + rememberMe.getName()
                                        + " whose value is: "
                                        + rememberMe.getValue()
                                        + "<br/>");
            }
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println("Problem executing SecureRandom.nextGaussian() - TestCase");
            throw new ServletException(e);
        }
        response.getWriter()
                .println("Weak Randomness Test java.security.SecureRandom.nextGaussian() executed");
    } // end doPost

    private static String doSomething(HttpServletRequest request, String param)
            throws ServletException, IOException {

        String bar = "safe!";
        java.util.HashMap<String, Object> map85251 = new java.util.HashMap<String, Object>();
        map85251.put("keyA-85251", "a_Value"); // put some stuff in the collection
        map85251.put("keyB-85251", param); // put it in a collection
        map85251.put("keyC", "another_Value"); // put some stuff in the collection
        bar = (String) map85251.get("keyB-85251"); // get it back out
        bar = (String) map85251.get("keyA-85251"); // get safe value back out

        return bar;
    }
}
