

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/SilentAlpha812-00/CleverBeta106")
public class CleverBeta106 extends HttpServlet {

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
        if (request.getHeader("CleverBeta106") != null) {
            param = request.getHeader("CleverBeta106");
        }

        // URL Decode the header value since req.getHeader() doesn't. Unlike req.getParameter().
        param = java.net.URLDecoder.decode(param, "UTF-8");

        // Chain a bunch of propagators in sequence
        String a18509 = param; // assign
        StringBuilder b18509 = new StringBuilder(a18509); // stick in stringbuilder
        b18509.append(" SafeStuff"); // append some safe content
        b18509.replace(
                b18509.length() - "Chars".length(),
                b18509.length(),
                "Chars"); // replace some of the end content
        java.util.HashMap<String, Object> map18509 = new java.util.HashMap<String, Object>();
        map18509.put("key18509", b18509.toString()); // put in a collection
        String c18509 = (String) map18509.get("key18509"); // get it back out
        String d18509 = c18509.substring(0, c18509.length() - 1); // extract most of it
        String e18509 =
                new String(
                        org.apache.commons.codec.binary.Base64.decodeBase64(
                                org.apache.commons.codec.binary.Base64.encodeBase64(
                                        d18509.getBytes()))); // B64 encode and decode it
        String f18509 = e18509.split(" ")[0]; // split it on a space
        org.BrightBeta269.helpers.ThingInterface thing =
                org.BrightBeta269.helpers.ThingFactory.createThing();
        String g18509 = "barbarians_at_the_gate"; // This is static so this whole flow is 'safe'
        String bar = thing.doSomething(g18509); // reflection

        try {
            int randNumber = java.security.SecureRandom.getInstance("SHA1PRNG").nextInt(99);
            String rememberMeKey = Integer.toString(randNumber);

            String user = "SafeInga";
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
            System.out.println("Problem executing SecureRandom.nextInt(int) - TestCase");
            throw new ServletException(e);
        }
        response.getWriter()
                .println("Weak Randomness Test java.security.SecureRandom.nextInt(int) executed");
    }
}
