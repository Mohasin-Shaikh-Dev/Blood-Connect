package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddBloodBank_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>Blood Bank Registration</title>\n");
      out.write("  <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\">\n");
      out.write("  <style>\n");
      out.write("    body {\n");
      out.write("      background: linear-gradient(45deg, #6C3483, #00BCD4);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .form-container {\n");
      out.write("      background-color: #fff;\n");
      out.write("      padding: 20px;\n");
      out.write("      border-radius: 10px;\n");
      out.write("      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .form-control-feedback {\n");
      out.write("      position: absolute;\n");
      out.write("      top: 5px;\n");
      out.write("      right: 10px;\n");
      out.write("      color: #28a745;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .invalid-feedback {\n");
      out.write("      display: block;\n");
      out.write("      color: #dc3545;\n");
      out.write("    }\n");
      out.write("    h2 {\n");
      out.write("        color:#660000;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"container mt-5\">\n");
      out.write("    <div class=\"row justify-content-center\">\n");
      out.write("      <div class=\"col-md-6\">\n");
      out.write("        <div class=\"form-container\">\n");
      out.write("          <h2 class=\"text-center mb-4\">Blood Bank Registration <i class=\"fas fa-university\"></i></h2>\n");
      out.write("          <form id=\"registrationForm\" method=\"post\" action=\"AddBloodBankServlet\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"blood_bank_name\" placeholder=\"Enter Blood Bank Name\" required>\n");
      out.write("              <div class=\"invalid-feedback\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"contact\" placeholder=\"Enter Contact Number\" required>\n");
      out.write("              <div class=\"invalid-feedback\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"city\" placeholder=\"Enter City\" required>\n");
      out.write("              <div class=\"invalid-feedback\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"state\" placeholder=\"Enter State\" required>\n");
      out.write("              <div class=\"invalid-feedback\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"area\" placeholder=\"Enter Area\" required>\n");
      out.write("              <div class=\"invalid-feedback\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <textarea class=\"form-control\" name=\"locationCode\" placeholder=\"Enter Location Code\" rows=\"5\" required></textarea>\n");
      out.write("              <div class=\"invalid-feedback\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <button type=\"submit\" class=\"btn btn-primary btn-block\">Register</button>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/js/all.min.js\"></script>\n");
      out.write("  <script>\n");
      out.write("    document.getElementById('registrationForm').addEventListener('submit', function(event) {\n");
      out.write("      var form = this;\n");
      out.write("      var blood_bank_name = form.querySelector('[name=\"blood_bank_name\"]').value.trim();\n");
      out.write("      var contact = form.querySelector('[name=\"contact\"]').value.trim();\n");
      out.write("      var city = form.querySelector('[name=\"city\"]').value.trim();\n");
      out.write("      var state = form.querySelector('[name=\"state\"]').value.trim();\n");
      out.write("      var area = form.querySelector('[name=\"area\"]').value.trim();\n");
      out.write("      var locationCode = form.querySelector('[name=\"locationCode\"]').value.trim();\n");
      out.write("\n");
      out.write("      var nameRegex = /^[a-zA-Z\\s]+$/;\n");
      out.write("      var contactRegex = /^[789]\\d{9}$/;\n");
      out.write("      var cityRegex = /^[a-zA-Z]+$/;\n");
      out.write("      var addressRegex = /^[a-zA-Z0-9, ]+$/;\n");
      out.write("\n");
      out.write("      var isValid = true;\n");
      out.write("\n");
      out.write("      if (!nameRegex.test(blood_bank_name)) {\n");
      out.write("        form.querySelector('[name=\"blood_bank_name\"]').classList.add('is-invalid');\n");
      out.write("        form.querySelector('[name=\"blood_bank_name\"]').nextElementSibling.innerHTML = \"Please enter a valid blood bank name.\";\n");
      out.write("        isValid = false;\n");
      out.write("      } else {\n");
      out.write("        form.querySelector('[name=\"blood_bank_name\"]').classList.remove('is-invalid');\n");
      out.write("        form.querySelector('[name=\"blood_bank_name\"]').nextElementSibling.innerHTML = \"\";\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      if (!contactRegex.test(contact)) {\n");
      out.write("        form.querySelector('[name=\"contact\"]').classList.add('is-invalid');\n");
      out.write("        form.querySelector('[name=\"contact\"]').nextElementSibling.innerHTML = \"Please enter a valid contact number starting with 7, 8, or 9 and of 10 digits.\";\n");
      out.write("        isValid = false;\n");
      out.write("      } else {\n");
      out.write("        form.querySelector('[name=\"contact\"]').classList.remove('is-invalid');\n");
      out.write("        form.querySelector('[name=\"contact\"]').nextElementSibling.innerHTML = \"\";\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      if (!cityRegex.test(city)) {\n");
      out.write("        form.querySelector('[name=\"city\"]').classList.add('is-invalid');\n");
      out.write("        form.querySelector('[name=\"city\"]').nextElementSibling.innerHTML = \"Please enter a valid city name.\";\n");
      out.write("        isValid = false;\n");
      out.write("      } else {\n");
      out.write("        form.querySelector('[name=\"city\"]').classList.remove('is-invalid');\n");
      out.write("        form.querySelector('[name=\"city\"]').nextElementSibling.innerHTML = \"\";\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      if (state === '') {\n");
      out.write("        form.querySelector('[name=\"state\"]').classList.add('is-invalid');\n");
      out.write("        form.querySelector('[name=\"state\"]').nextElementSibling.innerHTML = \"Please enter a valid state name.\";\n");
      out.write("        isValid = false;\n");
      out.write("      } else {\n");
      out.write("        form.querySelector('[name=\"state\"]').classList.remove('is-invalid');\n");
      out.write("        form.querySelector('[name=\"state\"]').nextElementSibling.innerHTML = \"\";\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      if (area === '') {\n");
      out.write("        form.querySelector('[name=\"area\"]').classList.add('is-invalid');\n");
      out.write("        form.querySelector('[name=\"area\"]').nextElementSibling.innerHTML = \"Please enter a valid area name.\";\n");
      out.write("        isValid = false;\n");
      out.write("      } else {\n");
      out.write("        form.querySelector('[name=\"area\"]').classList.remove('is-invalid');\n");
      out.write("        form.querySelector('[name=\"area\"]').nextElementSibling.innerHTML = \"\";\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      if (locationCode === '') {\n");
      out.write("        form.querySelector('[name=\"locationCode\"]').classList.add('is-invalid');\n");
      out.write("        form.querySelector('[name=\"locationCode\"]').nextElementSibling.innerHTML = \"Please enter a valid location code.\";\n");
      out.write("        isValid = false;\n");
      out.write("      } else {\n");
      out.write("        form.querySelector('[name=\"locationCode\"]').classList.remove('is-invalid');\n");
      out.write("        form.querySelector('[name=\"locationCode\"]').nextElementSibling.innerHTML = \"\";\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      if (!isValid) {\n");
      out.write("        event.preventDefault();\n");
      out.write("        event.stopPropagation();\n");
      out.write("        form.classList.add('was-validated');\n");
      out.write("      }\n");
      out.write("    });\n");
      out.write("  </script>\n");
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
