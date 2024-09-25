package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Bank_005fAppoinment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Blood Bank Appointment</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            background: linear-gradient(45deg, #6C3483, #00BCD4);\r\n");
      out.write("        }\r\n");
      out.write("        .form-control-label {\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("        .container {\r\n");
      out.write("            margin-top: 30px;\r\n");
      out.write("            background-color: #f8f9fa;\r\n");
      out.write("            padding: 30px;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("        }\r\n");
      out.write("        h1 {\r\n");
      out.write("            color: #dc3545;\r\n");
      out.write("        }\r\n");
      out.write("        .btn-primary {\r\n");
      out.write("            background-color: #dc3545;\r\n");
      out.write("            border-color: #dc3545;\r\n");
      out.write("        }\r\n");
      out.write("        .btn-primary:hover {\r\n");
      out.write("            background-color: #c82333;\r\n");
      out.write("            border-color: #bd2130;\r\n");
      out.write("        }\r\n");
      out.write("        .error-message {\r\n");
      out.write("            color: red;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h1 class=\"my-4 text-center\">Blood Bank Appointment</h1>\r\n");
      out.write("        <form action=\"AddBloodBankAppointment\" method=\"post\" onsubmit=\"return validateForm()\">\r\n");
      out.write("            <div class=\"form-row\">\r\n");
      out.write("                <div class=\"form-group col-md-12\">\r\n");
      out.write("                    <label for=\"bloodBank\" class=\"form-control-label\">Blood Bank Name</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"bloodBank\" name=\"bloodBank\" value=\"");
      out.print(request.getParameter("bankname"));
      out.write("\" readonly>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-row\">\r\n");
      out.write("                <div class=\"form-group col-md-6\">\r\n");
      out.write("                    <label for=\"name\" class=\"form-control-label\">Name</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"name\" name=\"name\" placeholder=\"Enter your name\" required>\r\n");
      out.write("                    <span id=\"nameError\" class=\"error-message\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group col-md-6\">\r\n");
      out.write("                    <label for=\"phone\" class=\"form-control-label\">Phone</label>\r\n");
      out.write("                    <input type=\"tel\" class=\"form-control\" id=\"phone\" name=\"phone\" placeholder=\"Enter your phone number\"  maxlength=\"10\" required>\r\n");
      out.write("                    <span id=\"phoneError\" class=\"error-message\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-row\">\r\n");
      out.write("                <div class=\"form-group col-md-6\">\r\n");
      out.write("                    <label for=\"bloodType\" class=\"form-control-label\">Blood Type</label>\r\n");
      out.write("                    <select class=\"form-control\" id=\"bloodType\" name=\"bloodType\" required>\r\n");
      out.write("                        <option value=\"\">Select Blood Type</option>\r\n");
      out.write("                        <option value=\"A+\">A+</option>\r\n");
      out.write("                        <option value=\"A-\">A-</option>\r\n");
      out.write("                        <option value=\"B+\">B+</option>\r\n");
      out.write("                        <option value=\"B-\">B-</option>\r\n");
      out.write("                        <option value=\"AB+\">AB+</option>\r\n");
      out.write("                        <option value=\"AB-\">AB-</option>\r\n");
      out.write("                        <option value=\"O+\">O+</option>\r\n");
      out.write("                        <option value=\"O-\">O-</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group col-md-6\">\r\n");
      out.write("                    <label for=\"units\" class=\"form-control-label\">Number of Units</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"units\" name=\"units\" maxlength=\"1\" placeholder=\"Enter Number of Units from 1-5\" required>\r\n");
      out.write("                    <span id=\"unitError\" class=\"error-message\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-row\">\r\n");
      out.write("                <div class=\"form-group col-md-6\">\r\n");
      out.write("                    <label for=\"date\" class=\"form-control-label\">Appointment Date</label>\r\n");
      out.write("                    <input type=\"date\" class=\"form-control\" id=\"date\" name=\"date\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group col-md-6\">\r\n");
      out.write("                    <label for=\"time\" class=\"form-control-label\">Appointment Time</label>\r\n");
      out.write("                    <select class=\"form-control\" id=\"time\" name=\"time\" required>\r\n");
      out.write("                        <option value=\"\">Select Appointment Time</option>\r\n");
      out.write("                        <option value=\"9:00\">9:00 AM</option>\r\n");
      out.write("                        <option value=\"9:30\">9:30 AM</option>\r\n");
      out.write("                        <option value=\"10:00\">10:00 AM</option>\r\n");
      out.write("                        <option value=\"4:00\">4:00 PM</option>\r\n");
      out.write("                        <option value=\"5:00\">5:00 PM</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script>\r\n");
      out.write("        function AppointmentValidate() {\r\n");
      out.write("            var name = document.getElementById(\"name\").value;\r\n");
      out.write("            var phone = document.getElementById(\"phone\").value;\r\n");
      out.write("            var units = document.getElementById(\"units\").value;\r\n");
      out.write("            var nameRegex = /^[a-zA-Z\\s]+$/;\r\n");
      out.write("            var phoneRegex = /^[6-9][0-9]{9}$/;\r\n");
      out.write("            var unitRegx=/^[1-5]{1}$/;\r\n");
      out.write("\r\n");
      out.write("            var isValid = true;\r\n");
      out.write("\r\n");
      out.write("            if (!nameRegex.test(name)) {\r\n");
      out.write("                document.getElementById(\"nameError\").innerHTML = \"Please enter a valid name.\";\r\n");
      out.write("                isValid = false;\r\n");
      out.write("            } \r\n");
      out.write("\r\n");
      out.write("            if (!phoneRegex.test(phone)) {\r\n");
      out.write("                document.getElementById(\"phoneError\").innerHTML = \"Please enter a valid 10-digit phone number.\";\r\n");
      out.write("               isValid = false;\r\n");
      out.write("            } \r\n");
      out.write("            \r\n");
      out.write("            if (!unitRegx.test(units)) {\r\n");
      out.write("                document.getElementById(\"unitError\").innerHTML = \"Enter the Units in Number 1-5\";\r\n");
      out.write("                isValid = false;\r\n");
      out.write("            } \r\n");
      out.write("            \r\n");
      out.write("             document.getElementById(\"units\").addEventListener(\"click\", function () {\r\n");
      out.write("            document.getElementById('unitError').innerHTML = \"\"});\r\n");
      out.write("            \r\n");
      out.write("             document.getElementById(\"phone\").addEventListener(\"click\", function () {\r\n");
      out.write("            document.getElementById('phoneError').innerHTML = \"\"});\r\n");
      out.write("            \r\n");
      out.write("             document.getElementById(\"name\").addEventListener(\"click\", function () {\r\n");
      out.write("         document.getElementById('nameError').innerHTML = \"\"});\r\n");
      out.write("            return isValid;\r\n");
      out.write("        }\r\n");
      out.write("        function validateForm() {\r\n");
      out.write("            var result=AppointmentValidate();                     \r\n");
      out.write("            return result;\r\n");
      out.write("        }\r\n");
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
