package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>Admin Dashboard</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"admin.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\"/>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("  <style>\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\" style=\"height: 70px;\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">Admin Dashboard</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("      <ul class=\"navbar-nav ml-auto\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"AdminLogin.jsp\"><i class=\"fas fa-sign-out-alt\"></i> Leave</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("  <!-- Main Content -->\n");
      out.write("<div class=\"container mt-5\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-md-4\">\n");
      out.write("      <h2><i class=\"fas fa-hand-holding-medical\"></i> Donors</h2>\n");
      out.write("      <p><a href=\"AdminDonors.jsp\">View Donors</a></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-4\">\n");
      out.write("      <h2><i class=\"fas fa-users\"></i> Recipients</h2>\n");
      out.write("      <p><a href=\"AdminRicipient.jsp\">View Recipients</a></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-4\">\n");
      out.write("      <h2><i class=\"fas fa-hospital\"></i> Blood Donation Camp</h2>\n");
      out.write("      <p><a href=\"AdminCamp.jsp\">View Donation Camps</a></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-4\">\n");
      out.write("      <h2><i class=\"fas fa-plus-square\"></i> Add Camp</h2>\n");
      out.write("      <p><a href=\"addcamp.jsp\">Add New Camp</a></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-4\">\n");
      out.write("      <h2><i class=\"fas fa-tint\"></i> Blood Bank</h2>\n");
      out.write("      <p><a href=\"AdminBank.jsp\">View Blood Bank</a></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-4\">\n");
      out.write("      <h2><i class=\"fas fa-hospital-user\"></i> Add Blood Bank</h2>\n");
      out.write("      <p><a href=\"AddBloodBank.jsp\">Add New Blood Bank</a></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-4\">\n");
      out.write("      <h2><i class=\"fas fa-user-lock\"></i> Users (Sign In)</h2>\n");
      out.write("      <p><a href=\"AdminUserSignIn.jsp\">View users</a></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-4\">\n");
      out.write("      <h2><i class=\"fas fa-user-lock\"></i> Users (Log Out)</h2>\n");
      out.write("      <p><a href=\"AdminuserLogOut.jsp\">View users</a></p>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"col-md-4\">\n");
      out.write("          <h2><i class=\"fas fa-calendar-alt\"></i> Appointment</h2>\n");
      out.write("      <p><a href=\"AdminAppointment.jsp\">View Appointment</a></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- Bootstrap JS and dependencies -->\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
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
