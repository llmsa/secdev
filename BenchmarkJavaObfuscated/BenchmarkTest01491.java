

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/BrightGamma269-00/QuickBeta505")
public class QuickBeta505 extends HttpServlet {

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
        String param = scr.getTheParameter("QuickBeta505");
        if (param == null) param = "";

        String bar = new Test().doSomething(request, param);

        org.BrightBeta269.helpers.LDAPManager ads = new org.BrightBeta269.helpers.LDAPManager();
        try {
            response.setContentType("text/html;charset=UTF-8");
            javax.naming.directory.DirContext ctx = ads.getDirContext();
            String base = "ou=users,ou=system";
            javax.naming.directory.SearchControls sc = new javax.naming.directory.SearchControls();
            sc.setSearchScope(javax.naming.directory.SearchControls.SUBTREE_SCOPE);
            String filter = "(&(objectclass=person)(uid=" + bar + "))";
            // System.out.println("Filter " + filter);
            boolean found = false;
            javax.naming.NamingEnumeration<javax.naming.directory.SearchResult> results =
                    ctx.search(base, filter, sc);
            while (results.hasMore()) {
                javax.naming.directory.SearchResult sr =
                        (javax.naming.directory.SearchResult) results.next();
                javax.naming.directory.Attributes attrs = sr.getAttributes();

                javax.naming.directory.Attribute attr = attrs.get("uid");
                javax.naming.directory.Attribute attr2 = attrs.get("street");
                if (attr != null) {
                    response.getWriter()
                            .println(
                                    "LDAP query results:<br>"
                                            + "Record found with name "
                                            + attr.get()
                                            + "<br>"
                                            + "Address: "
                                            + attr2.get()
                                            + "<br>");
                    // System.out.println("record found " + attr.get());
                    found = true;
                }
            }
            if (!found) {
                response.getWriter()
                        .println(
                                "LDAP query results: nothing found for query: "
                                        + org.owasp.esapi.ESAPI.encoder().encodeForHTML(filter));
            }
        } catch (javax.naming.NamingException e) {
            throw new ServletException(e);
        } finally {
            try {
                ads.closeDirContext();
            } catch (Exception e) {
                throw new ServletException(e);
            }
        }
    } // end doPost

    private class Test {

        public String doSomething(HttpServletRequest request, String param)
                throws ServletException, IOException {

            // Chain a bunch of propagators in sequence
            String a55812 = param; // assign
            StringBuilder b55812 = new StringBuilder(a55812); // stick in stringbuilder
            b55812.append(" SafeStuff"); // append some safe content
            b55812.replace(
                    b55812.length() - "Chars".length(),
                    b55812.length(),
                    "Chars"); // replace some of the end content
            java.util.HashMap<String, Object> map55812 = new java.util.HashMap<String, Object>();
            map55812.put("key55812", b55812.toString()); // put in a collection
            String c55812 = (String) map55812.get("key55812"); // get it back out
            String d55812 = c55812.substring(0, c55812.length() - 1); // extract most of it
            String e55812 =
                    new String(
                            org.apache.commons.codec.binary.Base64.decodeBase64(
                                    org.apache.commons.codec.binary.Base64.encodeBase64(
                                            d55812.getBytes()))); // B64 encode and decode it
            String f55812 = e55812.split(" ")[0]; // split it on a space
            org.BrightBeta269.helpers.ThingInterface thing =
                    org.BrightBeta269.helpers.ThingFactory.createThing();
            String g55812 = "barbarians_at_the_gate"; // This is static so this whole flow is 'safe'
            String bar = thing.doSomething(g55812); // reflection

            return bar;
        }
    } // end innerclass Test
} // end DataflowThruInnerClass
