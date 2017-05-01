package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;;
import java.io.PrintWriter;;

public final class sendNews_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/adminDash.jsp");
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
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Bootstrap Example</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("﻿<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("      <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>Free Bootstrap Admin Template : Binary Admin</title>\n");
      out.write("\t<!-- BOOTSTRAP STYLES-->\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- FONTAWESOME STYLES-->\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- CUSTOM STYLES-->\n");
      out.write("    <link href=\"assets/css/custom.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- GOOGLE FONTS-->\n");
      out.write("   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        <nav class=\"navbar navbar-default navbar-cls-top \" role=\"navigation\" style=\"margin-bottom: 0\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".sidebar-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"userDash.html\">Digital Meter Reader</a> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            ");

                
                String loggeduser = (String)session.getAttribute("loggedUsername");
                String welcomeMsg = "Hello " +loggeduser;                                                    
            
      out.write("\n");
      out.write("            <div style=\"color: white;padding: 15px 50px 5px 50px; float: right;font-size: 16px;\">\n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                    <button class=\"btn btn-primary dropdown-toggle\" data-toggle=\"dropdown\" type=\"button\"><i class=\"fa fa-user\"></i>&nbsp;");
      out.print(welcomeMsg);
      out.write("\n");
      out.write("                        <span class=\"caret\"></span></button>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li><a href=\"#\">Edit Profile</a></li>\n");
      out.write("                        <li><a href=\"index.jsp\">Log out</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </nav>   \n");
      out.write("           <!-- /. NAV TOP  -->\n");
      out.write("                <nav class=\"navbar-default navbar-side\" role=\"navigation\">\n");
      out.write("            <div class=\"sidebar-collapse\">\n");
      out.write("                <ul class=\"nav\" id=\"main-menu\">\n");
      out.write("\t\t\t\t<li class=\"text-center\">\n");
      out.write("                    <img src=\"assets/img/find_user.png\" class=\"user-image img-responsive\"/>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("                    <li>\n");
      out.write("                        <a  href=\"AdminHomePage\"><i class=\"fa fa-dashboard fa-3x\"></i> Home</a>\n");
      out.write("                    </li>\n");
      out.write("                      <li>\n");
      out.write("                        <a  href=\"ui.jsp\"><i class=\"fa fa-desktop fa-3x\"></i> UI Elements</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a  href=\"tab_panel.jsp\"><i class=\"fa fa-qrcode fa-3x\"></i> Tabs & Panels</a>\n");
      out.write("                    </li>\n");
      out.write("\t\t\t\t\t\t   <li  >\n");
      out.write("                        <a  href=\"chart.jsp\"><i class=\"fa fa-bar-chart-o fa-3x\"></i> StatisticSs</a>\n");
      out.write("                    </li>\t\n");
      out.write("                      <li>\n");
      out.write("                        <a  href=\"table.jsp\"><i class=\"fa fa-table fa-3x\"></i> Table Examples</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a  href=\"form.jsp\"><i class=\"fa fa-edit fa-3x\"></i> Forms </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li  >\n");
      out.write("                        <a  href=\"form.jsp\"><i class=\"fa fa-edit fa-3x\"></i>Analytical</a>\n");
      out.write("                    </li>\n");
      out.write("                     <li  >\n");
      out.write("                        <a  href=\"SendSmsPage\"><i class=\"fa fa-edit fa-3x\"></i>send SMS alert</a>\n");
      out.write("                    </li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t                   \n");
      out.write("\n");
      out.write("                  \t\n");
      out.write("                </ul>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </nav>  \n");
      out.write("        <!-- /. NAV SIDE  -->\n");
      out.write("        \n");
      out.write("         <!-- /. PAGE WRAPPER  -->\n");
      out.write("        </div>\n");
      out.write("     <!-- /. WRAPPER  -->\n");
      out.write("    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->\n");
      out.write("    <!-- JQUERY SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/jquery-1.10.2.js\"></script>\n");
      out.write("      <!-- BOOTSTRAP SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- METISMENU SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/jquery.metisMenu.js\"></script>\n");
      out.write("      <!-- CUSTOM SCRIPTS -->\n");
      out.write("<!--    <script src=\"assets/js/custom.js\"></script>-->\n");
      out.write("    \n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    <div style=\"margin-top: 100px;margin-left: 420px\" class=\"container\">\n");
      out.write("  <h3>Send SMS Alert</h3>\n");
      out.write("  <form action=\"NewsHandler\" method=\"post\" >\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"area\">Area office:</label>\n");
      out.write("      <select style=\"width: 156px\" class=\"form-control\" id=\"area_list\">\n");
      out.write("       \n");
      out.write("      \n");
      out.write("          <option>Matara</option>\n");
      out.write("        <option>Colombo</option>\n");
      out.write("        <option>Kandy</option>\n");
      out.write("        <option>Kurunagala</option>\n");
      out.write("      </select>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"transformer\">Transformer Id:</label>\n");
      out.write("      <select style=\"width: 156px\" class=\"form-control\" id=\"transformer_list\">\n");
      out.write("        <option>1</option>\n");
      out.write("        <option>2</option>\n");
      out.write("        <option>3</option>\n");
      out.write("        <option>4</option>\n");
      out.write("      </select>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"form-group\"> \n");
      out.write("      <p>\n");
      out.write("          <label>Message</label>\n");
      out.write("      </p>\n");
      out.write("      <textarea style=\"width: 156px;margin-top: -8px;\"row=\"8\" col=\"10\" name=\"message\" id=\"message\">\n");
      out.write("          \n");
      out.write("      </textarea>\n");
      out.write("      </div>\n");
      out.write("      <button style=\"margin-left: 97px\" type=\"submit\" class=\"btn btn-default\">Send</button>   \n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" ");
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
