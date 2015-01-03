package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import classifiedAds.service.AdBean;
import classifiedAds.model.Ad;
import java.util.List;
import java.util.Date;

public final class browseAd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Browse Ads</title>\n");
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
      out.write("                <a href=\"postAd.jsp\">Post a New Ad</a> &NegativeThickSpace; |\n");
      out.write("                <a href=\"browseAd.jsp\">Browse Ads</a>\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <table>\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>AD ID</th>\n");
      out.write("                        <th>Title</th>\n");
      out.write("                        <th>user_id</th>\n");
      out.write("                        <th>Description</th>\n");
      out.write("                        <th>Price</th>\n");
      out.write("                        <th>active</th>\n");
      out.write("                        <th>cat_id</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        AdBean eb = new AdBean();
                        List<Ad> list = eb.getAds();
                        
                        for (Ad e : list) {
                    
      out.write("\n");
      out.write(" \n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(String.valueOf(e.getId()));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(e.getTitle());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(String.valueOf(e.getUser_id()));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(e.getDescription());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(String.valueOf(e.getPrice()));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(String.valueOf(e.getActive()));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(String.valueOf(e.getCat_id()));
      out.write("</td>\n");
      out.write("                        <td style=\"border: none;\">\n");
      out.write("                            <div>\n");
      out.write("                                <form method=\"post\" action=\"editAd.jsp\">\n");
      out.write("                                    <input type=\"hidden\" id=\"id\" name=\"id\" value=\"");
      out.print(String.valueOf(e.getId()));
      out.write("\"/> \n");
      out.write("                                    <input type=\"submit\" value=\"Modify...\"/> \n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                        \n");
      out.write("                        <td style=\"border: none;\">\n");
      out.write("                            <div>\n");
      out.write("                                <form method=\"post\" action=\"DeleteAdServlet\">\n");
      out.write("                                    <input type=\"hidden\" id=\"delId\" name=\"delId\" value=\"");
      out.print(String.valueOf(e.getId()));
      out.write("\"/> \n");
      out.write("                                    <input type=\"submit\" value=\"Delete\"/> \n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
