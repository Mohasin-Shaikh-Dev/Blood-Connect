package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title></title>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\r\n");
      out.write("    <!-- Font Awesome CSS for icons -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">    \r\n");
      out.write("    <style>\r\n");
      out.write("    \t\t.navbars {\r\n");
      out.write("              background-color: rgb(14, 134, 128);\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: space-between;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar-brands img {\r\n");
      out.write("            max-height: 50px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar-navs {\r\n");
      out.write("            list-style-type: none;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .nav-items {\r\n");
      out.write("            margin-left: 15px;\r\n");
      out.write("          \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .nav-links {          \r\n");
      out.write("            color: rgb(255, 255, 255);\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .nav-links:hover {\r\n");
      out.write("            text-decoration: underline;\r\n");
      out.write("            color:rgb(151, 9, 9);\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("       .nav-items .btn{\r\n");
      out.write("         background-color: red;\r\n");
      out.write("         color:white;\r\n");
      out.write("       }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <div class=\"con\">\r\n");
      out.write("         <nav class=\"navbars\">\r\n");
      out.write("        <!-- Logo -->\r\n");
      out.write("        <a class=\"navbar-brands\" href=\"#\">\r\n");
      out.write("            <img src=\"image/logo1.jpg\" alt=\"BloodConnect\">\r\n");
      out.write("        </a>\r\n");
      out.write("      \r\n");
      out.write("        <!-- Navbar links -->\r\n");
      out.write("        <ul class=\"navbar-navs\">\r\n");
      out.write("            <li class=\"nav-items\">\r\n");
      out.write("                <a class=\"nav-links\" href=\"homepage.jsp\">Home</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-items\">\r\n");
      out.write("                <a class=\"nav-links\" href=\"aboutus.html\">About Us</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-items\">\r\n");
      out.write("                <a class=\"nav-links\" href=\"services.jsp\">Services</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-items\">\r\n");
      out.write("                <a class=\"nav-links\" href=\"contactus.html\">Contact Us</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-items\">\r\n");
      out.write("               <button  class=\"btn\" onclick=\"logout_Alert()\">LogOut</button>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("   </div>   \r\n");
      out.write("   <script>\r\n");
      out.write("      function logout_Alert()\r\n");
      out.write("      {\r\n");
      out.write("    \t  Swal.fire({\r\n");
      out.write("    \t\t  title: \"Are you sure?\",\r\n");
      out.write("    \t\t  text: \"You won't be able to revert this!\",\r\n");
      out.write("    \t\t  icon: \"warning\",\r\n");
      out.write("    \t\t  showCancelButton: true,\r\n");
      out.write("    \t\t  confirmButtonColor: \"#3085d6\",\r\n");
      out.write("    \t\t  cancelButtonColor: \"#d33\",\r\n");
      out.write("    \t\t  confirmButtonText: \"Yes, delete it!\"\r\n");
      out.write("    \t\t}).then((result) => {\r\n");
      out.write("    \t\t  if (result.isConfirmed) {\r\n");
      out.write("    \t\t\t  window.location.href = \"logout.jsp\";\r\n");
      out.write("    \t\t  }\r\n");
      out.write("    \t\t});\r\n");
      out.write("      }\r\n");
      out.write("   </script>\r\n");
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
