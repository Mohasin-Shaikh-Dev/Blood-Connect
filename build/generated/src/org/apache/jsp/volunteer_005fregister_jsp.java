package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class volunteer_005fregister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Blood Donation Camp Volunteer Registration</title>\r\n");
      out.write("    <script src=\"validation.js\"></script>\r\n");
      out.write("     <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("    \r\n");
      out.write("       \r\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            background-color: #f4f4f4;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        form {\r\n");
      out.write("            max-width: 600px;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        label {\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-group {\r\n");
      out.write("            margin-bottom: 15px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input[type=\"text\"],\r\n");
      out.write("        textarea {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 8px;\r\n");
      out.write("            border: 1px solid #ccc;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        textarea {\r\n");
      out.write("            height: 100px; /* Adjust as needed */\r\n");
      out.write("            resize: none; /* Prevent user from resizing textarea */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input[type=\"submit\"] {\r\n");
      out.write("            background-color: #4CAF50;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            transition: background-color 0.3s;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input[type=\"submit\"]:hover {\r\n");
      out.write("            background-color: #45a049;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .errormessage {\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("            color: red;\r\n");
      out.write("        }\r\n");
      out.write("        h3{\r\n");
      out.write("           text-decoration: underline;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("      .form-group select {\r\n");
      out.write("         width: 100%;\r\n");
      out.write("    \tpadding: 8px;\r\n");
      out.write("   \t\t border: 1px solid #ccc;\r\n");
      out.write("    \tborder-radius: 5px;\r\n");
      out.write("   \t\tbox-sizing: border-box;\r\n");
      out.write("   \t\t}\r\n");
      out.write("        \r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" ");
 
    String campname=request.getParameter("volcampName");
 	session.setAttribute("volcamp", campname);
 
      out.write("\r\n");
      out.write(" \r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write(" <br>\r\n");
      out.write("    <form action=\"AddVolunteer\" method=\"post\" onsubmit=\"return validate()\">\r\n");
      out.write("        <h2 style=\"color: red; text-align: center\">Volunteer Registration</h2>\r\n");
      out.write("        <h3 style=\"text-align: center;\"> ");
      out.print(request.getParameter("volcampName") );
      out.write("</h3>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("            <label for=\"firstName\">First Name:</label><br>\r\n");
      out.write("            <input type=\"text\" id=\"firstName\" name=\"firstName\" required>\r\n");
      out.write("            <span id=\"firstNameError\" class=\"errormessage\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("            <label for=\"lastName\">Last Name:</label><br>\r\n");
      out.write("            <input type=\"text\" id=\"lastName\" name=\"lastName\" required>\r\n");
      out.write("            <span id=\"lastNameError\" class=\"errormessage\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("         \r\n");
      out.write("         <div class=\"form-group\">\r\n");
      out.write("             <label for=\"gender\">Gender:</label>\r\n");
      out.write("             <select class=\"form-control\" id=\"gender\" name=\"gender\" required>\r\n");
      out.write("              <option value=\"\">Select Gender</option>\r\n");
      out.write("               <option value=\"male\">Male</option>\r\n");
      out.write("                <option value=\"female\">Female</option>\r\n");
      out.write("               <option value=\"other\">Other</option>\r\n");
      out.write("            </select>\r\n");
      out.write("        </div>      \r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("            <label for=\"contact\">Contact:</label><br>\r\n");
      out.write("            <input type=\"text\" id=\"contact\" name=\"contact\" required>\r\n");
      out.write("            <span id=\"contactError\" class=\"errormessage\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("            <label for=\"city\">City:</label><br>\r\n");
      out.write("            <input type=\"text\" id=\"city\" name=\"city\" required>\r\n");
      out.write("            <span id=\"cityError\" class=\"errormessage\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("            <label for=\"reason\">Reason for Joining:</label><br>\r\n");
      out.write("            <textarea id=\"reason\" name=\"reason\" rows=\"5\" cols=\"50\" required></textarea>\r\n");
      out.write("            <span id=\"reasonError\" class=\"errormessage\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <input type=\"submit\" value=\"Submit\">\r\n");
      out.write("    </form>\r\n");
      out.write("    \r\n");
      out.write("    <!-- validation -->\r\n");
      out.write("    <script>\r\n");
      out.write("        function validate() {\r\n");
      out.write("            var result = volunteer_validate();\r\n");
      out.write("            if (result == true) {\r\n");
      out.write("                Swal.fire({\r\n");
      out.write("                    position: \"top-end\",\r\n");
      out.write("                    icon: \"success\",\r\n");
      out.write("                    title: \"Successfully registered\",\r\n");
      out.write("                    showConfirmButton: false,\r\n");
      out.write("                    timer: 5500\r\n");
      out.write("                }).then(function() {\r\n");
      out.write("                    // Redirect to another page\r\n");
      out.write("                    window.location.href = \"volunteer_insert.jsp\"; // Change the URL to your desired page\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("            return result;\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
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
