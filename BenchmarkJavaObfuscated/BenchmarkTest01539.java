

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/SilentAlpha812-03/SilentEpsilon890")
public class SilentEpsilon890 extends HttpServlet {

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
        String param = scr.getTheParameter("SilentEpsilon890");
        if (param == null) param = "";

        String bar = new Test().doSomething(request, param);

        try {
            java.security.SecureRandom secureRandomGenerator =
                    java.security.SecureRandom.getInstance("SHA1PRNG");

            // Get 40 random bytes
            byte[] randomBytes = new byte[40];
            secureRandomGenerator.nextBytes(randomBytes);

            String rememberMeKey =
                    org.owasp.esapi.ESAPI.encoder().encodeForBase64(randomBytes, true);

            String user = "SafeByron";
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
            System.out.println("Problem executing SecureRandom.nextBytes() - TestCase");
            throw new ServletException(e);
        } finally {
            response.getWriter()
                    .println(
                            "Randomness Test java.security.SecureRandom.nextBytes(byte[]) executed");
        }
    } // end doPost

    private class Test {

        public String doSomething(HttpServletRequest request, String param)
                throws ServletException, IOException {

            String bar;
            String guess = "ABC";
            char switchTarget = guess.charAt(1); // condition 'B', which is safe

            // Simple case statement that assigns param to bar on conditions 'A', 'C', or 'D'
            switch (switchTarget) {
                case 'A':
                    bar = param;
                    break;
                case 'B':
                    bar = "bob";
                    break;
                case 'C':
                case 'D':
                    bar = param;
                    break;
                default:
                    bar = "bob's your uncle";
                    break;
            }

            return bar;
        }
    } // end innerclass Test
} // end DataflowThruInnerClass
