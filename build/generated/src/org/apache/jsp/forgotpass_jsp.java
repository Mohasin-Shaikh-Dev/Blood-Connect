package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class forgotpass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <title>Forgot Password</title>\r\n");
      out.write("  <!-- Bootstrap CSS -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("  <!-- Custom CSS -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"login.css\">\r\n");
      out.write("  <!-- Font Awesome for icons -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\r\n");
      out.write(" \r\n");
      out.write("   <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"card\">\r\n");
      out.write("    <h2 class=\"text-center\">Forgot Password</h2>\r\n");
      out.write("    <form action=\"forgotpasscheck.jsp\" onsubmit=\"return forgotvalidate()\">\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <label for=\"mobileNumber\">Mobile Number</label>\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("          <div class=\"input-group-prepend\">\r\n");
      out.write("            <span class=\"input-group-text\"><i class=\"fas fa-mobile-alt\"></i></span>\r\n");
      out.write("          </div>\r\n");
      out.write("            <input type=\"tel\" class=\"form-control\" id=\"mobileNumber\" placeholder=\"Enter Mobile Number\" name=\"mobile\"  maxlength=\"10\" required><br> <br>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        <span id=\"mobilevalid\" class=\"error\" style=\"color: red; font-weight: lighter; font-style: oblique;\"></span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <label for=\"dob\">Date of Birth</label>\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("          <div class=\"input-group-prepend\">\r\n");
      out.write("            <span class=\"input-group-text\"><i class=\"fas fa-calendar-alt\"></i></span>\r\n");
      out.write("          </div>\r\n");
      out.write("          <input type=\"date\" class=\"form-control\" id=\"dob\" name=\"dob\"required>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <button type=\"submit\" class=\"btn btn-primary btn-block\">Submit</button>\r\n");
      out.write("    </form>\r\n");
      out.write("    <div class=\"mt-3 text-center\">\r\n");
      out.write("      <p>Remembered your password? <a href=\"login.jsp\" class=\"text-primary\">Login</a></p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Bootstrap JS and Font Awesome JS -->\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/js/all.min.js\"></script>\r\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("  <!-- validation -->\r\n");
      out.write("  <script>\r\n");
      out.write("    function forgotvalidate() {\r\n");
      out.write("      var mobilenumber = document.getElementById('mobileNumber').value;\r\n");
      out.write("      var returnvalue = true;\r\n");
      out.write("      var mobileregx = /^[7-9][0-9]{9}$/;\r\n");
      out.write("      if (!(mobileregx.test(mobilenumber))) {\r\n");
      out.write("        document.getElementById('mobilevalid').innerHTML = \"invalid mobile number\";\r\n");
      out.write("        returnvalue = false;\r\n");
      out.write("      }\r\n");
      out.write("      return returnvalue;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    document.getElementById(\"mobileNumber\").addEventListener(\"click\", function () {\r\n");
      out.write("      document.getElementById('mobilevalid').innerHTML = \"\";\r\n");
      out.write("    });\r\n");
      out.write("  </script>\r\n");
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
