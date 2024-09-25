package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class AdminDonors_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>Donors Table</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("  <style>\n");
      out.write("    .table-title {\n");
      out.write("      margin-bottom: 20px;\n");
      out.write("      text-align: center;\n");
      out.write("    }\n");
      out.write("    .table-responsive {\n");
      out.write("      overflow-x: auto;\n");
      out.write("    }\n");
      out.write("    th, td {\n");
      out.write("      text-align: center;\n");
      out.write("      vertical-align: middle;\n");
      out.write("    }\n");
      out.write("    td{\n");
      out.write("        font-weight: 500;\n");
      out.write("    }\n");
      out.write("    .dob-column {\n");
      out.write("      width: 150px;\n");
      out.write("    }\n");
      out.write("    .table thead th {\n");
      out.write("      background-color: #007bff;\n");
      out.write("      color: #ffffff;\n");
      out.write("    }\n");
      out.write("    .table-striped tbody tr:nth-of-type(odd) {\n");
      out.write("      background-color: #f8f9fa;\n");
      out.write("    }\n");
      out.write("    .table-striped tbody tr:hover {\n");
      out.write("      background-color: #e9ecef;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container-fluid mt-5\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-md-12\">\n");
      out.write("      <h2 class=\"table-title\">𝕯𝖔𝖓𝖔𝖗𝖘 𝕯𝖊𝖙𝖆𝖎𝖑𝖘</h2>\n");
      out.write("      <div class=\"table-responsive\">\n");
      out.write("        <table class=\"table table-striped table-bordered\">\n");
      out.write("          <thead>\n");
      out.write("            <tr>\n");
      out.write("              <th>Donor ID</th>\n");
      out.write("              <th>First Name</th>\n");
      out.write("              <th>Last Name</th>\n");
      out.write("              <th>Mobile Number</th>\n");
      out.write("              <th>Email ID</th>\n");
      out.write("              <th>Blood Group</th>\n");
      out.write("              <th>Gender</th>\n");
      out.write("              <th class=\"dob-column\">Date of Birth</th>\n");
      out.write("              <th>City</th>\n");
      out.write("              <th>Pin Code</th>\n");
      out.write("              <th>Area</th>\n");
      out.write("            </tr>\n");
      out.write("          </thead>\n");
      out.write("          <tbody>\n");
      out.write("            ");
 
            try {
              Class.forName("com.mysql.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull","root","root");
              Statement stmt=con.createStatement();
              ResultSet rs=stmt.executeQuery("SELECT * FROM donors");
              while(rs.next()) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("              <td>");
      out.print( rs.getInt("DonorID") );
      out.write("</td>\n");
      out.write("              <td>");
      out.print( rs.getString("firstName") );
      out.write("</td>\n");
      out.write("              <td>");
      out.print( rs.getString("lastName") );
      out.write("</td>\n");
      out.write("              <td>");
      out.print( rs.getString("mobileNumber") );
      out.write("</td>\n");
      out.write("              <td>");
      out.print( rs.getString("email_Id") );
      out.write("</td>\n");
      out.write("              <td>");
      out.print( rs.getString("bloodGroup") );
      out.write("</td>\n");
      out.write("              <td>");
      out.print( rs.getString("gender") );
      out.write("</td>\n");
      out.write("              <td>");
      out.print( rs.getString("Date_Of_Birth"));
      out.write("</td>\n");
      out.write("              <td>");
      out.print( rs.getString("city") );
      out.write("</td>\n");
      out.write("              <td>");
      out.print( rs.getInt("PinCode") );
      out.write("</td>\n");
      out.write("              <td>");
      out.print( rs.getString("Area") );
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 
              }
              con.close();
            } catch(Exception e) {
              out.println(e);
            }
            
      out.write("\n");
      out.write("          </tbody>\n");
      out.write("        </table>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
