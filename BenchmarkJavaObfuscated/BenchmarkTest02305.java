

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/BrightGamma269-00/BraveGamma207")
public class BraveGamma207 extends HttpServlet {

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
                    if (value.equals("BraveGamma207")) {
                        param = name;
                        flag = false;
                    }
                }
            }
        }

        String bar = doSomething(request, param);

        org.BrightBeta269.helpers.LDAPManager ads = new org.BrightBeta269.helpers.LDAPManager();
        try {
            response.setContentType("text/html;charset=UTF-8");
            String base = "ou=users,ou=system";
            javax.naming.directory.SearchControls sc = new javax.naming.directory.SearchControls();
            sc.setSearchScope(javax.naming.directory.SearchControls.SUBTREE_SCOPE);
            String filter = "(&(objectclass=person))(|(uid=" + bar + ")(street={0}))";
            Object[] filters = new Object[] {"The streetz 4 Ms bar"};

            javax.naming.directory.DirContext ctx = ads.getDirContext();
            javax.naming.directory.InitialDirContext idc =
                    (javax.naming.directory.InitialDirContext) ctx;
            boolean found = false;
            javax.naming.NamingEnumeration<javax.naming.directory.SearchResult> results =
                    idc.search(base, filter, filters, sc);
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

    private static String doSomething(HttpServletRequest request, String param)
            throws ServletException, IOException {

        String bar = "";
        if (param != null) {
            java.util.List<String> valuesList = new java.util.ArrayList<String>();
            valuesList.add("safe");
            valuesList.add(param);
            valuesList.add("moresafe");

            valuesList.remove(0); // remove the 1st safe value

            bar = valuesList.get(0); // get the param value
        }

        return bar;
    }
}
