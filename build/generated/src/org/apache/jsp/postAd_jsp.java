package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class postAd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Post a New Ad</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
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
 

                    String username = (String)session.getAttribute("username");
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
      out.write("        <form method=\"post\" action=\"PostAdServlet\">\n");
      out.write("            <div id=\"mystyle\" class=\"myform\">\n");
      out.write("<!--                <form id=\"form\" name=\"form\" action=\"AddNewEmployee\" method=\"post\">-->\n");
      out.write("                    <h1>Ad</h1>\n");
      out.write("                    <p>To Post new Ad enter following information</p>\n");
      out.write("                    <label>Ad ID<span class=\"small\">Enter Ad ID</span></label>\n");
      out.write("                    <input type=\"text\" name=\"id\" id=\"id\" />\n");
      out.write("                    \n");
      out.write("                    <label>Title<span class=\"small\">Enter title</span></label>\n");
      out.write("                    <input type=\"text\" name=\"title\" id=\"title\" />\n");
      out.write("                    <label>User_ID<span class=\"small\">Enter user_id</span></label>\n");
      out.write("                    <input type=\"text\" name=\"user_id\" id=\"user_id\" />\n");
      out.write("                    <label>Description<span class=\"small\">Enter Description</span></label>\n");
      out.write("                    <input type=\"text\" name=\"description\" id=\"description\" />\n");
      out.write("                    <label>Price<span class=\"small\">Enter Price</span></label>\n");
      out.write("                    <input type=\"text\" name=\"price\" id=\"price\" />\n");
      out.write("                    <label>Activeness<span class=\"small\">Enter 1 if it'll be Active</span></label>\n");
      out.write("                    <input type=\"text\" name=\"active\" id=\"active\" />                            \n");
      out.write("                    <label>cat_id<span class=\"small\">Enter Category_ID</span></label>\n");
      out.write("                    <input type=\"text\" name=\"cat_id\" id=\"cat_id\" />                            \n");
      out.write("                    <button type=\"submit\">Post This Ad</button>\n");
      out.write("                    <div class=\"spacer\"></div>\n");
      out.write("                <!--</form>-->\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
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
