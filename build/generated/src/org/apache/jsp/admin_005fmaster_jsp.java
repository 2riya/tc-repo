package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class admin_005fmaster_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <title>Home</title>\n");
      out.write("        \n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" >\n");
      out.write("        \n");
      out.write("        <!-- jQuery library -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        \n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>        \n");
      out.write("        \n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Monoton&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("    <div class=\"navbar navbar-inverse navbar-fixed-top\"> \n");
      out.write("        <div class=\"container\"> \n");
      out.write("            <div class=\"navbar-header\"> \n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                    <span class=\"icon-bar\"></span> \n");
      out.write("                    <span class=\"icon-bar\"></span> \n");
      out.write("                    <span class=\"icon-bar\"></span> \n");
      out.write("                    <span class=\"icon-bar\"></span> \n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"myNavbar\"> \n");
      out.write("               <a class=\"navbar-brand\" href=\"#\" style=\"color: #fff; font-size:22px; text-shadow: 2px 2px 5px #05c0e1;\">Dynamic Data Sharing using Cryptanalysis</a>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"adminhome.html\">Admin Home</a>\n");
      out.write("                    </li> \n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"admin_filecluster.jsp\">File Cluster</a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                          Admin <i class=\"material-icons\" style=\"font-size:15px\">arrow_drop_down</i>\n");
      out.write("                        </a>\n");
      out.write("                        \n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                          <a class=\"dropdown-item\" href=\"admin_master.html\">Master</a>\n");
      out.write("                          <div class=\"dropdown-divider\"></div>\n");
      out.write("                          <a class=\"dropdown-item\" href=\"admin_worker.html\">Worker</a>\n");
      out.write("                          </div>\n");
      out.write("                      </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Logout</a>   \n");
      out.write("                    </li>\n");
      out.write("                </ul> \n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("    </div>\n");
      out.write("        <div class=\"container\" style=\"margin-top: 75px;\">\n");
      out.write("       <center>\n");
      out.write("       <span class=\"page-headers\">FILE&nbsp;&nbsp;WITH&nbsp;&nbsp;KEY&nbsp;&nbsp;INDEX</span>\n");
      out.write("        </center>\n");
      out.write("    </div>\n");
      out.write("    ");
 
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/diplo","root","");
            Statement st = con.createStatement();
            ResultSet rt = st.executeQuery("select * from cluster");
        
      out.write("\n");
      out.write("        <div style=\"padding-top: 2%; padding-right: 8%; padding-left: 8%; \">\n");
      out.write("            <form action=\"\" method=\"get\">\n");
      out.write("            <table class=\"table table-striped\" style=\"background-color: #D8BFD8;\" >\n");
      out.write("                <thead>\n");
      out.write("                        <tr>\n");
      out.write("                          <th>Key Index</th>\n");
      out.write("                          <th>File Name</th>\n");
      out.write("                          <th>Cluster File</th>\n");
      out.write("                        </tr>\n");
      out.write("                        </thead>\n");
      out.write("                ");

                    while(rt.next()){
                        String ki = rt.getString("clusterid");
                        String fname = rt.getString("filename");
                
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( ki);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(fname );
      out.write("</td>\n");
      out.write("                        <td><a href=\"#\">Insert File to Worker</a></td>                               \n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("                ");
 }} catch (Exception e){
            out.println(e);
        } 
      out.write("\n");
      out.write("            </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
