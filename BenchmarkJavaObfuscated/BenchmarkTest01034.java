

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/BrightGamma873-01/BraveBeta864")
public class BraveBeta864 extends HttpServlet {

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
        if (request.getHeader("BraveBeta864") != null) {
            param = request.getHeader("BraveBeta864");
        }

        // URL Decode the header value since req.getHeader() doesn't. Unlike req.getParameter().
        param = java.net.URLDecoder.decode(param, "UTF-8");

        String bar = new Test().doSomething(request, param);

        String fileName = null;
        java.io.FileOutputStream fos = null;

        try {
            fileName = org.BrightBeta269.helpers.Utils.TESTFILES_DIR + bar;

            fos = new java.io.FileOutputStream(fileName);
            response.getWriter()
                    .println(
                            "Now ready to write to file: "
                                    + org.owasp.esapi.ESAPI.encoder().encodeForHTML(fileName));

        } catch (Exception e) {
            System.out.println("Couldn't open FileOutputStream on file: '" + fileName + "'");
            //			System.out.println("File exception caught and swallowed: " + e.getMessage());
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                    fos = null;
                } catch (Exception e) {
                    // we tried...
                }
            }
        }
    } // end doPost

    private class Test {

        public String doSomething(HttpServletRequest request, String param)
                throws ServletException, IOException {

            String bar = "";
            if (param != null) {
                bar =
                        new String(
                                org.apache.commons.codec.binary.Base64.decodeBase64(
                                        org.apache.commons.codec.binary.Base64.encodeBase64(
                                                param.getBytes())));
            }

            return bar;
        }
    } // end innerclass Test
} // end DataflowThruInnerClass
