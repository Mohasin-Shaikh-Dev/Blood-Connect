package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addcamp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Add Blood Donation Camp</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@2\"></script>\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("    <!-- Internal CSS for Gradient Background -->\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background: linear-gradient(135deg, #8e9eab, #eef2f3);\n");
      out.write("            \n");
      out.write("            margin: 0;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            background-color: #ffffff;\n");
      out.write("            padding: 40px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 0 20px rgba(0,0,0,0.1);\n");
      out.write("        }\n");
      out.write("         .title {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-bottom: 30px;\n");
      out.write("            color: #ff0033;\n");
      out.write("        }\n");
      out.write("        .form-group label {\n");
      out.write("            color: black;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .btn-primary {\n");
      out.write("            background-color: #007bff;\n");
      out.write("            border-color: #007bff;\n");
      out.write("        }\n");
      out.write("        .btn-primary:hover {\n");
      out.write("            background-color: #0056b3;\n");
      out.write("            border-color: #0056b3;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2 class=\"title\">Add Blood Donation Camp</h2>\n");
      out.write("        <form action=\"AddCampServlet\" method=\"post\" id=\"campForm\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"campName\">Camp Name:</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"campName\" name=\"campName\" required>\n");
      out.write("                <div id=\"campNameError\" class=\"invalid-feedback\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"contact\">Contact:</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"contact\" name=\"contact\" required>\n");
      out.write("                <div id=\"contactError\" class=\"invalid-feedback\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"address\">Address:</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"address\" name=\"address\" required>\n");
      out.write("                <div id=\"addressError\" class=\"invalid-feedback\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"city\">City:</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"city\" name=\"city\" required>\n");
      out.write("                <div id=\"cityError\" class=\"invalid-feedback\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"campDate\">Camp Date:</label>\n");
      out.write("                <input type=\"date\" class=\"form-control\" id=\"campDate\" name=\"campDate\" required>\n");
      out.write("                <div id=\"campDateError\" class=\"invalid-feedback\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"campTime\">Camp Start Time:</label>\n");
      out.write("                <input type=\"time\" class=\"form-control\" id=\"campStartTime\" name=\"campStartTime\" required>\n");
      out.write("                <div id=\"campStartTimeError\" class=\"invalid-feedback\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"campTime\">Camp End Time:</label>\n");
      out.write("                <input type=\"time\" class=\"form-control\" id=\"campEndTime\" name=\"campEndTime\" required>\n");
      out.write("                <div id=\"campEndTimeError\" class=\"invalid-feedback\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"locationCode\">Location Code:</label><br>\n");
      out.write("                <textarea class=\"form-control\" id=\"locationCode\" name=\"locationCode\" rows=\"4\" required></textarea>\n");
      out.write("                <div id=\"locationCodeError\" class=\"invalid-feedback\"></div>\n");
      out.write("            </div>\n");
      out.write("            <button type=\"button\" class=\"btn btn-primary btn-block\" onclick=\"validateForm()\">Submit</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap JS -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- JavaScript for Form Validation -->\n");
      out.write("    <script>\n");
      out.write("        function validateForm() {\n");
      out.write("            var form = document.getElementById(\"campForm\");\n");
      out.write("            var campName = document.getElementById(\"campName\");\n");
      out.write("            var contact = document.getElementById(\"contact\");\n");
      out.write("            var address = document.getElementById(\"address\");\n");
      out.write("            var city = document.getElementById(\"city\");\n");
      out.write("            var campDate = document.getElementById(\"campDate\");\n");
      out.write("            var campStartTime = document.getElementById(\"campStartTime\");\n");
      out.write("            var campEndTime = document.getElementById(\"campEndTime\");\n");
      out.write("            var locationCode = document.getElementById(\"locationCode\");\n");
      out.write("\n");
      out.write("            var contactRegex = /^[7-9]\\d{9}$/; // Regular expression to validate contact number\n");
      out.write("            var cityRegex = /^[a-zA-Z\\s]+$/; // Regular expression to validate city\n");
      out.write("\n");
      out.write("            if (campName.value.trim() === \"\") {\n");
      out.write("                showError(campName, \"Please enter the camp name.\");\n");
      out.write("                return;\n");
      out.write("            } else {\n");
      out.write("                hideError(campName);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            if (!contact.value.match(contactRegex)) {\n");
      out.write("                showError(contact, \"Please enter a valid contact number starting with 7, 8, or 9 and containing 10 digits.\");\n");
      out.write("                return;\n");
      out.write("            } else {\n");
      out.write("                hideError(contact);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            if (address.value.trim() === \"\") {\n");
      out.write("                showError(address, \"Please enter the address.\");\n");
      out.write("                return;\n");
      out.write("            } else {\n");
      out.write("                hideError(address);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            if (!city.value.match(cityRegex)) {\n");
      out.write("                showError(city, \"Please enter a valid city name containing only alphabets.\");\n");
      out.write("                return;\n");
      out.write("            } else {\n");
      out.write("                hideError(city);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            if (campDate.value === \"\") {\n");
      out.write("                showError(campDate, \"Please select the camp date.\");\n");
      out.write("                return;\n");
      out.write("            } else {\n");
      out.write("                hideError(campDate);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            if (campStartTime.value.trim() === \"\") {\n");
      out.write("                showError(campStartTime, \"Please enter the camp start time.\");\n");
      out.write("                return;\n");
      out.write("            } else {\n");
      out.write("                hideError(campStartTime);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            if (campEndTime.value.trim() === \"\") {\n");
      out.write("                showError(campEndTime, \"Please enter the camp end time.\");\n");
      out.write("                return;\n");
      out.write("            } else {\n");
      out.write("                hideError(campEndTime);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            if (locationCode.value.trim() === \"\") {\n");
      out.write("                showError(locationCode, \"Please enter the location code.\");\n");
      out.write("                return;\n");
      out.write("            } else {\n");
      out.write("                hideError(locationCode);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // If all fields are valid, submit the form\n");
      out.write("            form.submit();\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function showError(input, message) {\n");
      out.write("            input.classList.add(\"is-invalid\");\n");
      out.write("            input.nextElementSibling.textContent = message;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function hideError(input) {\n");
      out.write("            input.classList.remove(\"is-invalid\");\n");
      out.write("            input.nextElementSibling.textContent = \"\";\n");
      out.write("        }\n");
      out.write("    </script>\n");
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
