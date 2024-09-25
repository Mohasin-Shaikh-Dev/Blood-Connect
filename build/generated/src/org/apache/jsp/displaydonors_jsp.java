package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.Base64;

public final class displaydonors_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"ISO-8859-1\">\r\n");
      out.write("    <title>Display Donors</title>\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"displaydonor.css\"> \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");

// Retrieving parameters from the request
String bloodgroup = request.getParameter("bloodGroup");
String city = request.getParameter("city");
int pincode = Integer.parseInt(request.getParameter("pincode"));

// Database connectivity
try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank", "root", "root");

    // SQL query to retrieve donors matching the criteria
    String q = "SELECT * FROM donors WHERE bloodGroup=? AND city=? AND PinCode=?";
    PreparedStatement p = con.prepareStatement(q);
    p.setString(1, bloodgroup);
    p.setString(2, city);
    p.setInt(3, pincode);
    ResultSet rs = p.executeQuery();

    
    while (rs.next()) {
        
        Blob imageblob = rs.getBlob("image");
        if (imageblob != null) {
           
            InputStream is = imageblob.getBinaryStream();
            ByteArrayOutputStream ouputStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[4096];
            int bytesRead = -1;
            while ((bytesRead = is.read(buffer)) != -1) {
                ouputStream.write(buffer, 0, bytesRead);
            }
            byte[] imagebyte = ouputStream.toByteArray();
            String base64image = Base64.getEncoder().encodeToString(imagebyte);
            String imagedata = "data:image/*;base64," + base64image;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container mt-4\">\r\n");
      out.write("    <div class=\"card\">\r\n");
      out.write("        <div class=\"card-body\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-4 text-center\">\r\n");
      out.write("                    <!-- Displaying donor image -->\r\n");
      out.write("                    <img src=\"");
      out.print(imagedata );
      out.write("\" class=\"img-fluid rounded-circle mb-3\" alt=\"Profile Picture\">\r\n");
      out.write("                    <!-- Displaying donor name -->\r\n");
      out.write("                    <h4>");
      out.print(rs.getString(2)+" "+rs.getString(3) );
      out.write("</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-8\">\r\n");
      out.write("                    <!-- Displaying other donor details -->\r\n");
      out.write("                    <ul class=\"list-group list-group-flush\">\r\n");
      out.write("                        <li class=\"list-group-item\">Blood Group: ");
      out.print(rs.getString(6) );
      out.write("</li>\r\n");
      out.write("                        <li class=\"list-group-item\">Mobile: ");
      out.print(rs.getString(4));
      out.write("</li>\r\n");
      out.write("                        <li class=\"list-group-item\">Email: ");
      out.print(rs.getString(5));
      out.write("</li>\r\n");
      out.write("                        <li class=\"list-group-item\">Date of Birth: ");
      out.print(rs.getString(7) );
      out.write("</li>\r\n");
      out.write("                        <li class=\"list-group-item\">Address: ");
      out.print(rs.getString(9)+","+rs.getString(11)+","+rs.getInt(10) );
      out.write("</li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <!-- Button to send email -->\r\n");
      out.write("                    <form action=\"sendemail.jsp\" method=\"post\">\r\n");
      out.write("                        <input type=\"hidden\" name=\"email\" value=\"");
      out.print(rs.getString(5));
      out.write("\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Need Help</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");

        }
    }
    con.close();
} catch (Exception e) {
    // Error handling
    out.print(e);
}

      out.write("\r\n");
      out.write("\r\n");
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
