package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>Admin Login</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("  <style>\n");
      out.write("    body {\n");
      out.write("      background-color: #f8f9fa;\n");
      out.write("    }\n");
      out.write("    .login-container {\n");
      out.write("      margin-top: 100px;\n");
      out.write("    }\n");
      out.write("    .card {\n");
      out.write("      border: none;\n");
      out.write("      border-radius: 10px;\n");
      out.write("      box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);\n");
      out.write("    }\n");
      out.write("    .card-header {\n");
      out.write("      background-color: #007bff;\n");
      out.write("      color: #ffffff;\n");
      out.write("      text-align: center;\n");
      out.write("      font-weight: bold;\n");
      out.write("      border-radius: 10px 10px 0 0;\n");
      out.write("    }\n");
      out.write("    .card-body {\n");
      out.write("      padding: 30px;\n");
      out.write("    }\n");
      out.write("    .form-group {\n");
      out.write("      margin-bottom: 20px;\n");
      out.write("    }\n");
      out.write("    .btn-login {\n");
      out.write("      background-color: #007bff;\n");
      out.write("      color: #ffffff;\n");
      out.write("      border: none;\n");
      out.write("      border-radius: 5px;\n");
      out.write("      padding: 10px 20px;\n");
      out.write("      font-weight: bold;\n");
      out.write("    }\n");
      out.write("    .btn-login:hover {\n");
      out.write("      background-color: #0056b3;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container login-container\">\n");
      out.write("  <div class=\"row justify-content-center\">\n");
      out.write("    <div class=\"col-md-6\">\n");
      out.write("      <div class=\"card\">\n");
      out.write("        <div class=\"card-header\">\n");
      out.write("          Admin Login\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("          <form action=\"AdminCheck.jsp\" method=\"POST\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"username\">Username:</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"username\" name=\"username\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"password\">Password:</label>\n");
      out.write("              <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" required>\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-login btn-block\">Login</button>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
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
