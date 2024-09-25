package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class searchdonor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<script src=\"validation.js\"></script>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <title>Blood Donor Search</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"searchdonor.css\">\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <h1>Blood Donor Search</h1>\r\n");
      out.write("  <form action=\"displaydonors.jsp\" onsubmit=\"return searchdonorvalidate()\" >\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label for=\"bloodGroup\">Blood Group</label>\r\n");
      out.write("      <select class=\"form-control\" id=\"bloodGroup\" name=\"bloodGroup\" required>\r\n");
      out.write("          <option value=\"\">Select Blood group</option>\r\n");
      out.write("        <option value=\"A+\">A+</option>\r\n");
      out.write("        <option value=\"A-\">A-</option>\r\n");
      out.write("        <option value=\"B+\">B+</option>\r\n");
      out.write("        <option value=\"B-\">B-</option>\r\n");
      out.write("        <option value=\"AB+\">AB+</option>\r\n");
      out.write("        <option value=\"AB-\">AB-</option>\r\n");
      out.write("        <option value=\"O+\">O+</option>\r\n");
      out.write("        <option value=\"O-\">O-</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label for=\"city\">City</label>\r\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"city\" name=\"city\" required>\r\n");
      out.write("      <span id=\"cityvalid\" style=\"color: red; font-weight: lighter; font-style: oblique;\"></span>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label for=\"pincode\">Pincode</label>\r\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"pincode\" name=\"pincode\" required>\r\n");
      out.write("      <span id=\"pincodevalid\" style=\"color: red; font-weight: lighter; font-style: oblique;\"></span>\r\n");
      out.write("    </div>\r\n");
      out.write("    <button type=\"submit\" class=\"btn btn-primary\">Search</button>\r\n");
      out.write("  </form>\r\n");
      out.write("</div>\r\n");
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
