package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mysql.cj.Session;
import java.sql.*;

public final class camp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>City and Camp Details</title>\r\n");
      out.write("    <!-- Bootstrap CSS CDN link -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"camp.css\">\r\n");
      out.write("</head>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h2>City and Camp Details</h2>\r\n");
      out.write("        <!-- Form for City -->\r\n");
      out.write("        <form id=\"cityForm\" onsubmit=\"return checkCity()\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"city\" name=\"city\" placeholder=\"Enter City\">\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary ml-2\">Check City</button>\r\n");
      out.write("                <span id=\"cityError\" class=\"error-message\" style=\"text-align: center; font-weight: bold;\"></span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <!-- Table to Display Camp Details -->\r\n");
      out.write("        <table class=\"table\">\r\n");
      out.write("            <thead class=\"thead-dark\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>Camp Name</th>\r\n");
      out.write("                    <th>Contact</th> <!-- Changed from \"Mobile Number\" -->\r\n");
      out.write("                    <th>Address</th>\r\n");
      out.write("                    <th> city </th>\r\n");
      out.write("                    <th>Date</th>\r\n");
      out.write("                    <th>Time</th>\r\n");
      out.write("                    <th colspan=\"3\">Action</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody id=\"campTableBody\">\r\n");
      out.write("                ");
 
                    String city = request.getParameter("city");
                    try {
                    	Class.forName("com.mysql.jdbc.Driver");
             		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull","root","root");
                        String q = "SELECT * FROM campdetails WHERE city=?";
                        PreparedStatement p = con.prepareStatement(q);
                        p.setString(1,city);
                        ResultSet rs = p.executeQuery();
                        while (rs.next()) {
                
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>");
      out.print( rs.getString(2) );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( rs.getString(3) );
      out.write("</td>  \r\n");
      out.write("                    <td>");
      out.print( rs.getString(4) );
      out.write("</td> \r\n");
      out.write("                     <td>");
      out.print( rs.getString(5) );
      out.write("</td> \r\n");
      out.write("                    <td>");
      out.print( rs.getDate(6) );
      out.write("</td> \r\n");
      out.write("                    <td>");
      out.print(rs.getString(7) );
      out.write("</td>                   \r\n");
      out.write("                    <td>\r\n");
      out.write("                        <form action=\"campregister.jsp\" method=\"post\">\r\n");
      out.write("                            <input type=\"hidden\" name=\"campName\" value=\"");
      out.print( rs.getString(2) );
      out.write("\">\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Register</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </td>                                                 \r\n");
      out.write("                   <td>\r\n");
      out.write("                   \t<form action=\"volunteer_register.jsp\" method=\"post\">\r\n");
      out.write("                            <input type=\"hidden\" name=\"volcampName\" value=\"");
      out.print( rs.getString(2) );
      out.write("\">\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Volunteer</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                   </td>\r\n");
      out.write("                   <td>\r\n");
      out.write("                        <form action=\"location.jsp\" method=\"post\">\r\n");
      out.write("                            <input type=\"hidden\" name=\"campId\" value=\"");
      out.print( rs.getString(1) );
      out.write("\">\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Location</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </td>  \r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
 
                        }
                    } catch(Exception e) {
                        e.printStackTrace();
                    }   
                
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Bootstrap JS CDN link -->\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        function checkCity() {\r\n");
      out.write("            var cityInput = document.getElementById('city').value.trim();\r\n");
      out.write("            var cityError = document.getElementById('cityError');\r\n");
      out.write("            var cityRegex = /^[a-zA-Z\\s]+$/;            \r\n");
      out.write("            if (!cityInput.match(cityRegex)) {\r\n");
      out.write("                cityError.textContent = 'Please enter a valid city Name';\r\n");
      out.write("                return false; // prevent form submission\r\n");
      out.write("            }\r\n");
      out.write("          \r\n");
      out.write("            cityError.textContent = '';\r\n");
      out.write("            return true; \r\n");
      out.write("        }      \r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
