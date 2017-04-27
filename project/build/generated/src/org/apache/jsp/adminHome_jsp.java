package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!--Responsive meta tag-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("        <!--link to bootstrap css--> \n");
      out.write("        <link rel=\"stylesheet\" href=\"public/bootstrap/css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("        <!--Responsive CSS file-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"public/css/responsive.css\">\n");
      out.write("        <title>Home page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
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
      out.write("                        <a  href=\"sendNews.jsp\"><i class=\"fa fa-edit fa-3x\"></i>sendNews</a>\n");
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
      out.write("        \n");
      out.write("        <!--Page content start from here-->\n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("            <div id=\"page-inner\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!--Messages box--> \n");
      out.write("                    <div class=\"col-md-3 col-sm-6 col-xs-6\">           \n");
      out.write("\t\t\t<div class=\"panel panel-back noti-box\">\n");
      out.write("                            <span class=\"icon-box bg-color-red set-icon\">\n");
      out.write("                                <i class=\"fa fa-envelope-o\"></i>\n");
      out.write("                            </span>\n");
      out.write("                            <div class=\"text-box\" >\n");
      out.write("                                <p class=\"main-text\">120 New</p>\n");
      out.write("                                <p class=\"text-muted\">Messages</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\t\t    </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <!--Remaining tasks-->\n");
      out.write("                <div class=\"col-md-3 col-sm-6 col-xs-6\">           \n");
      out.write("                    <div class=\"panel panel-back noti-box\">\n");
      out.write("                        <span class=\"icon-box bg-color-green set-icon\">\n");
      out.write("                            <i class=\"fa fa-bars\"></i>\n");
      out.write("                        </span>\n");
      out.write("                        <div class=\"text-box\" >\n");
      out.write("                            <p class=\"main-text\">30 Tasks</p>\n");
      out.write("                            <p class=\"text-muted\">Remaining</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                   </div>\n");
      out.write("                <!--Notifications box-->\n");
      out.write("                    <div class=\"col-md-3 col-sm-6 col-xs-6\">           \n");
      out.write("\t\t\t<div class=\"panel panel-back noti-box\">\n");
      out.write("                            <span class=\"icon-box bg-color-blue set-icon\">\n");
      out.write("                                <i class=\"fa fa-bell-o\"></i>\n");
      out.write("                            </span>\n");
      out.write("                            <div class=\"text-box\" >\n");
      out.write("                                <p class=\"main-text\">240 New</p>\n");
      out.write("                                <p class=\"text-muted\">Notifications</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                    <div class=\"col-md-3 col-sm-6 col-xs-6\">           \n");
      out.write("\t\t\t<div class=\"panel panel-back noti-box\">\n");
      out.write("                            <span class=\"icon-box bg-color-brown set-icon\">\n");
      out.write("                                <i class=\"fa fa-rocket\"></i>\n");
      out.write("                            </span>\n");
      out.write("                            <div class=\"text-box\" >\n");
      out.write("                                <p class=\"main-text\">3 Orders</p>\n");
      out.write("                                <p class=\"text-muted\">Pending</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\t\t    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
