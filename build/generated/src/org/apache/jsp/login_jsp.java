package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <div id=\"mystyle\" style=\"border: none;\">\n");
      out.write("            <h1>Classified Ads Beta</h1>\n");
      out.write("            <p>\n");
      out.write("                <b>testing of ad, edit and delete functionality of ads</b><br/>\n");
      out.write("                ");
      out.print(new Date());
      out.write("</br>  </br>\n");
      out.write("            \n");
      out.write("                <a href=\"postAd.jsp\">Post a New Ad</a> &NegativeThickSpace; |\n");
      out.write("                <a href=\"browseAd.jsp\">Browse Ads</a>\n");
      out.write("                \n");
      out.write("                &nbsp; &nbsp; &nbsp; \n");
      out.write("                ");
 
                    String username = request.getParameter("usrname");
                    if(username == null) {
                
      out.write("\n");
      out.write("                \n");
      out.write("                <a href=\"login.jsp\">Login</a>  &NegativeThickSpace; |\n");
      out.write("                <a href=\"registration.jsp\" >Sign Up</a>\n");
      out.write("                \n");
      out.write("                ");

                    } else {
                
      out.write("\n");
      out.write("                <a href=\"account.jsp\" >");
      out.print(username);
      out.write("</a> &NegativeThickSpace; |\n");
      out.write("                <a href=\"registration.jsp\" >Sign Up</a>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <form method=\"post\" action=\"LoginServlet\">\n");
      out.write("            <center>\n");
      out.write("            <table border=\"1\" width=\"30%\" cellpadding=\"3\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th colspan=\"2\">Login Here</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Email</td>\n");
      out.write("                        <td><input type=\"text\" name=\"email\" id=\"email\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Password</td>\n");
      out.write("                        <td><input type=\"password\" name=\"password\" id=\"password\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" value=\"Login\" /></td>\n");
      out.write("                        <td><input type=\"reset\" value=\"Reset\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\">Yet Not Registered!! <a href=\"reg.jsp\">Register Here</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            </center>\n");
      out.write("\n");
      out.write("        </form> \n");
      out.write("    </form> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
