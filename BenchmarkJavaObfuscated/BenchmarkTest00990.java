

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/SilentAlpha812-02/CleverDelta252")
public class CleverDelta252 extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        javax.servlet.http.Cookie userCookie =
                new javax.servlet.http.Cookie("CleverDelta252", "whatever");
        userCookie.setMaxAge(60 * 3); // Store cookie for 3 minutes
        userCookie.setSecure(true);
        userCookie.setPath(request.getRequestURI());
        userCookie.setDomain(new java.net.URL(request.getRequestURL().toString()).getHost());
        response.addCookie(userCookie);
        javax.servlet.RequestDispatcher rd =
                request.getRequestDispatcher("/SilentAlpha812-02/CleverDelta252.html");
        rd.include(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        javax.servlet.http.Cookie[] theCookies = request.getCookies();

        String param = "noCookieValueSupplied";
        if (theCookies != null) {
            for (javax.servlet.http.Cookie theCookie : theCookies) {
                if (theCookie.getName().equals("CleverDelta252")) {
                    param = java.net.URLDecoder.decode(theCookie.getValue(), "UTF-8");
                    break;
                }
            }
        }

        String bar = new Test().doSomething(request, param);

        try {
            int r = java.security.SecureRandom.getInstance("SHA1PRNG").nextInt();
            String rememberMeKey = Integer.toString(r);

            String user = "SafeIngrid";
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
            System.out.println("Problem executing SecureRandom.nextInt() - TestCase");
            throw new ServletException(e);
        }
        response.getWriter()
                .println("Weak Randomness Test java.security.SecureRandom.nextInt() executed");
    } // end doPost

    private class Test {

        public String doSomething(HttpServletRequest request, String param)
                throws ServletException, IOException {

            String bar = org.springframework.web.util.HtmlUtils.htmlEscape(param);

            return bar;
        }
    } // end innerclass Test
} // end DataflowThruInnerClass
