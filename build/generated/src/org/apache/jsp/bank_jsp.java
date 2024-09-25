package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class bank_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <title>Search Blood Bank</title>\r\n");
      out.write("  \r\n");
      out.write("  <!-- Bootstrap CSS -->\r\n");
      out.write("  <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <style>\r\n");
      out.write(".container {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        flex-direction: column;\r\n");
      out.write("        align-items: center;\r\n");
      out.write("        background-color: #f2f2f2; /* Set your desired background color */\r\n");
      out.write("        padding: 20px; /* Add padding for better appearance */\r\n");
      out.write("        border-radius: 10px; /* Add border radius for rounded corners */\r\n");
      out.write("    }\r\n");
      out.write("    .form-row {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        align-items: center;\r\n");
      out.write("        justify-content: center;\r\n");
      out.write("        margin-bottom: 20px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .form-group {\r\n");
      out.write("        margin-right: 10px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    input.form-control {\r\n");
      out.write("        width: 350px; /* Adjust as needed */\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    select.form-control {\r\n");
      out.write("        width: 350px; /* Adjust as needed to match the city input field */\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    button.btn-primary {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    h2 {\r\n");
      out.write("        color: red;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"container mt-5\">\r\n");
      out.write("    <h2 class=\"text-center\">Search Blood Bank</h2>\r\n");
      out.write("    <form>\r\n");
      out.write("      <div class=\"form-row\">\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"state\">State</label>\r\n");
      out.write("          <select class=\"form-control\" id=\"state\" name=\"state\">\r\n");
      out.write("              <option value=\"\">Select State</option>\r\n");
      out.write("              <option value=\"Andhra Pradesh\">Andhra Pradesh</option>\r\n");
      out.write("              <option value=\"Arunachal Pradesh\">Arunachal Pradesh</option>\r\n");
      out.write("              <option value=\"Assam\">Assam</option>\r\n");
      out.write("              <option value=\"Bihar\">Bihar</option>\r\n");
      out.write("              <option value=\"Chhattisgarh\">Chhattisgarh</option>\r\n");
      out.write("              <option value=\"Goa\">Goa</option>\r\n");
      out.write("              <option value=\"Gujarat\">Gujarat</option>\r\n");
      out.write("              <option value=\"Haryana\">Haryana</option>\r\n");
      out.write("              <option value=\"Himachal Pradesh\">Himachal Pradesh</option>\r\n");
      out.write("              <option value=\"Jharkhand\">Jharkhand</option>\r\n");
      out.write("              <option value=\"Karnataka\">Karnataka</option>\r\n");
      out.write("              <option value=\"Kerala\">Kerala</option>\r\n");
      out.write("              <option value=\"Madhya Pradesh\">Madhya Pradesh</option>\r\n");
      out.write("              <option value=\"Maharashtra\">Maharashtra</option>\r\n");
      out.write("              <option value=\"Manipur\">Manipur</option>\r\n");
      out.write("              <option value=\"Meghalaya\">Meghalaya</option>\r\n");
      out.write("              <option value=\"Mizoram\">Mizoram</option>\r\n");
      out.write("              <option value=\"Nagaland\">Nagaland</option>\r\n");
      out.write("              <option value=\"Odisha\">Odisha</option>\r\n");
      out.write("              <option value=\"Punjab\">Punjab</option>\r\n");
      out.write("              <option value=\"Rajasthan\">Rajasthan</option>\r\n");
      out.write("              <option value=\"Sikkim\">Sikkim</option>\r\n");
      out.write("              <option value=\"Tamil Nadu\">Tamil Nadu</option>\r\n");
      out.write("              <option value=\"Telangana\">Telangana</option>\r\n");
      out.write("              <option value=\"Tripura\">Tripura</option>\r\n");
      out.write("              <option value=\"Uttar Pradesh\">Uttar Pradesh</option>\r\n");
      out.write("              <option value=\"Uttarakhand\">Uttarakhand</option>\r\n");
      out.write("              <option value=\"West Bengal\">West Bengal</option>\r\n");
      out.write("          </select>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"city\">City</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"city\" name=\"city\" placeholder=\"Enter city\">\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-row\">\r\n");
      out.write("        <div class=\"form-group col-md-12\">\r\n");
      out.write("          <button type=\"submit\" class=\"btn btn-primary\">Search</button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </form>\r\n");
      out.write("    <!-- table create -->    \r\n");
      out.write("   \r\n");
      out.write("    <table class=\"table text-center\">\r\n");
      out.write("            <thead class=\"thead-dark\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th scope=\"col\">Blood Bank Name</th>\r\n");
      out.write("                    <th scope=\"col\">Contact</th>\r\n");
      out.write("                    <th scope=\"col\">Address</th>\r\n");
      out.write("                    <th scope=\"col\" colspan=\"2\">Action</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("              \r\n");
      out.write("              ");

                  String state=request.getParameter("state");
        		  String city=request.getParameter("city");
        		  try{
        	        Class.forName("com.mysql.jdbc.Driver");
            		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull","root","root");
            		  String q="select * from  Blood_Banks where city=? AND state=?";
            		  PreparedStatement p=con.prepareStatement(q);
            		  p.setString(1,city);
            		  p.setString(2,state);
            		  ResultSet r=p.executeQuery();
            		  while(r.next())
            		  {
            			  
      out.write("\r\n");
      out.write("            \t\t\t      <tr>\r\n");
      out.write("                                <td>");
      out.print(r.getString(2));
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(r.getString(3) );
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(r.getString(6));
      out.write("</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <form action=\"Bank_Appoinment.jsp\" method=\"post\">\r\n");
      out.write("                                      <input type=\"hidden\" name=\"bankname\" value=\"");
      out.print( r.getString(2));
      out.write("\">                                       \r\n");
      out.write("                                       <button type=\"submit\" class=\"btn btn-success\">Appointment</button>\r\n");
      out.write("                                     </form>\r\n");
      out.write("                                  </td>\t \r\n");
      out.write("                                   <td>\r\n");
      out.write("                                    <form action=\"bankLoaction.jsp\" method=\"post\">\r\n");
      out.write("                                      <input type=\"hidden\" name=\"bankId\" value=\"");
      out.print( r.getString(1));
      out.write("\">                                       \r\n");
      out.write("                                         <button type=\"submit\" class=\"btn btn-danger btn-sm\">Location</button>\r\n");
      out.write("                                     </form>                                                               \r\n");
      out.write("                                 </td>                                                                                                 \r\n");
      out.write("                             </tr>\r\n");
      out.write("            \t\t\t  ");
 
            		  }
        		  }catch(Exception e){
        			  e.printStackTrace();
        		  }
              
      out.write("                          \r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Bootstrap JS (optional, for certain components) -->\r\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
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
