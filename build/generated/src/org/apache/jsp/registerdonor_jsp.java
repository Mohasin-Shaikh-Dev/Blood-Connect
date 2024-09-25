package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registerdonor_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <title>Donor Registration</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"registerdonor.css\">\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@2\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"container mt-4\">   \r\n");
      out.write("    <h1 class=\"form-title\">Donor Registration</h1>\r\n");
      out.write("    <form action=\"InsertRegisters\" onsubmit=\"return registervalidate()\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("      <div class=\"form-row\">\r\n");
      out.write("        <div class=\"col-md-6 mb-3\">\r\n");
      out.write("          <label for=\"firstName\"><i class=\"fas fa-user\"></i> First Name</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"firstName\" name=\"firstname\" required>\r\n");
      out.write("          <span id=\"firstnamevalid\" style=\"color: red; font-weight: lighter; font-style: oblique;\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-6 mb-3\">\r\n");
      out.write("          <label for=\"lastName\"><i class=\"fas fa-user\"></i> Last Name</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"lastName\" name=\"lastname\" required>\r\n");
      out.write("          <span id=\"lastnamevalid\" style=\"color: red; font-weight: lighter; font-style: oblique;\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-row\">\r\n");
      out.write("        <div class=\"col-md-6 mb-3\">\r\n");
      out.write("          <label for=\"mobileNumber\"><i class=\"fas fa-mobile-alt\"></i> Mobile Number</label>\r\n");
      out.write("          <input type=\"tel\" class=\"form-control\" id=\"mobileNumber\" name=\"mobilenumber\" maxlength=\"10\" required>\r\n");
      out.write("          <span id=\"mobilenumbervalid\" style=\"color: red; font-weight: lighter; font-style: oblique;\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-6 mb-3\">\r\n");
      out.write("          <label for=\"email\"><i class=\"fas fa-envelope\"></i> Email</label>\r\n");
      out.write("          <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" required>\r\n");
      out.write("          <span id=\"emailvalid\" style=\"color: red; font-weight: lighter; font-style: oblique;\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-row\">\r\n");
      out.write("        <div class=\"col-md-6 mb-3\">\r\n");
      out.write("          <label for=\"bloodGroup\"><i class=\"fas fa-tint\"></i> Blood Group</label>\r\n");
      out.write("          <select class=\"form-control\" id=\"bloodGroup\" name=\"bloodgroup\" required>\r\n");
      out.write("            <option value=\"\">Select Blood Group</option>\r\n");
      out.write("            <option value=\"A+\">A+</option>\r\n");
      out.write("            <option value=\"A-\">A-</option>\r\n");
      out.write("            <option value=\"B+\">B+</option>\r\n");
      out.write("            <option value=\"B-\">B-</option>\r\n");
      out.write("            <option value=\"AB+\">AB+</option>\r\n");
      out.write("            <option value=\"AB-\">AB-</option>\r\n");
      out.write("            <option value=\"O+\">O+</option>\r\n");
      out.write("            <option value=\"O-\">O-</option>\r\n");
      out.write("          </select>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-6 mb-3\">\r\n");
      out.write("          <label for=\"gender\"><i class=\"fas fa-venus-mars\"></i> Gender</label>\r\n");
      out.write("          <select class=\"form-control\" id=\"gender\" name=\"gender\" required>\r\n");
      out.write("            <option value=\"\">Select Gender</option>\r\n");
      out.write("            <option value=\"male\">Male</option>\r\n");
      out.write("            <option value=\"female\">Female</option>\r\n");
      out.write("          </select>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-row\">\r\n");
      out.write("        <div class=\"col-md-6 mb-3\">\r\n");
      out.write("          <label for=\"dob\"><i class=\"fas fa-calendar-alt\"></i> Date of Birth</label>\r\n");
      out.write("          <input type=\"date\" class=\"form-control\" id=\"dob\" name=\"dob\" max=\"2006-12-31\" min=\"1880-12-31\" required>\r\n");
      out.write("          <span id=\"dobvalid\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-6 mb-3\">\r\n");
      out.write("          <label for=\"city\"><i class=\"fas fa-city\"></i> City</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"city\" required name=\"city\">\r\n");
      out.write("          <span id=\"cityvalid\" style=\"color: red; font-weight: lighter; font-style: oblique;\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-row\">\r\n");
      out.write("        <div class=\"col-md-6 mb-3\">\r\n");
      out.write("          <label for=\"area\"><i class=\"fas fa-map-marked-alt\"></i> Area</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"area\" name=\"area\" required=\"required\">\r\n");
      out.write("          <span id=\"areavalid\" style=\"color: red; font-weight: lighter; font-style: oblique;\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-6 mb-3\">\r\n");
      out.write("          <label for=\"pincode\"><i class=\"fas fa-map-pin\"></i> Pincode</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"pincode\" name=\"pincode\" required=\"required\">\r\n");
      out.write("          <span id=\"pincodevalid\" style=\"color: red; font-weight: lighter; font-style: oblique;\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-row\">\r\n");
      out.write("        <div class=\"col-md-12 mb-3\">\r\n");
      out.write("          <label for=\"imageUpload\"><i class=\"fas fa-image\"></i> Upload Image</label>\r\n");
      out.write("          <div class=\"input-group\">\r\n");
      out.write("            <div class=\"custom-file\">\r\n");
      out.write("              <input type=\"file\" class=\"custom-file-input\" id=\"imageUpload\" accept=\"image/*\" onchange=\"displayImageName()\" name=\"image\">\r\n");
      out.write("              <label class=\"custom-file-label\" for=\"imageUpload\">Choose file</label>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\" style=\"width: 100%\">Submit</button>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <script type=\"text/javascript\"> \r\n");
      out.write("    function displayImageName() {\r\n");
      out.write("      const input = document.getElementById('imageUpload');\r\n");
      out.write("      const imageNameLabel = document.querySelector('.custom-file-label');\r\n");
      out.write("      if (input.files.length > 0) {\r\n");
      out.write("        imageNameLabel.textContent = input.files[0].name;\r\n");
      out.write("      } else {\r\n");
      out.write("        imageNameLabel.textContent = 'Choose file';\r\n");
      out.write("      }\r\n");
      out.write("    }  \r\n");
      out.write("    \r\n");
      out.write("    function registervalidate()\r\n");
      out.write("    {\r\n");
      out.write("    \tvar firstname=document.getElementById(\"firstName\").value;\r\n");
      out.write("    \tvar lastname=document.getElementById(\"lastName\").value;\r\n");
      out.write("    \tvar mobilenumber=document.getElementById(\"mobileNumber\").value;\r\n");
      out.write("    \tvar city=document.getElementById(\"city\").value;\r\n");
      out.write("    \tvar pincode=document.getElementById(\"pincode\").value;\r\n");
      out.write("    \tvar area=document.getElementById(\"area\").value;\r\n");
      out.write("    \tvar mainregx =/^[a-zA-Z\\s]{3,30}$/;\r\n");
      out.write("    \tvar status1=true;\r\n");
      out.write("    \tif(!(mainregx.test(firstname))){\r\n");
      out.write("    \t\tdocument.getElementById(\"firstnamevalid\").innerHTML=\"Invalid Name\";\r\n");
      out.write("    \t\tstatus1=false;\r\n");
      out.write("    \t}\r\n");
      out.write("    \t\r\n");
      out.write("    \tif(!(mainregx.test(lastname))){\r\n");
      out.write("    \t\tdocument.getElementById(\"lastnamevalid\").innerHTML=\"Invalid Last Name\";\r\n");
      out.write("    \t\tstatus1=false;\r\n");
      out.write("    \t}\r\n");
      out.write("    \t\r\n");
      out.write("    \tif(!(mainregx.test(city))){\r\n");
      out.write("    \t\tdocument.getElementById(\"cityvalid\").innerHTML=\"Invalid City Name\";\r\n");
      out.write("    \t\tstatus1=false;\r\n");
      out.write("    \t}\r\n");
      out.write("    \t\r\n");
      out.write("    \tif(!(mainregx.test(area))){\r\n");
      out.write("    \t\tdocument.getElementById(\"areavalid\").innerHTML=\"Invalid Area Name\";\r\n");
      out.write("    \t\tstatus1=false;\r\n");
      out.write("    \t}\r\n");
      out.write("    \t\r\n");
      out.write("    \tvar pincoderegx=/^[1-9][0-9]{5}$/;\r\n");
      out.write("    \tif(!(pincoderegx.test(pincode)))\r\n");
      out.write("    \t{\r\n");
      out.write("    \t\tdocument.getElementById(\"pincodevalid\").innerHTML=\"Invalid pincode\";\r\n");
      out.write("    \t\tstatus1=false;\r\n");
      out.write("    \t}\r\n");
      out.write("    \t\r\n");
      out.write("    \tvar mobileregx=/^[7-9][0-9]{9}$/;\r\n");
      out.write("          if(!(mobileregx.test(mobilenumber)))\r\n");
      out.write("          {\r\n");
      out.write("              document.getElementById('mobilenumbervalid').innerHTML=\"Invalid mobile number\";\r\n");
      out.write("              status1=false;\r\n");
      out.write("          }\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t  document.getElementById(\"city\").addEventListener(\"click\", function () {\r\n");
      out.write("          document.getElementById('cityvalid').innerHTML = \"\";\r\n");
      out.write("         });\r\n");
      out.write("         \r\n");
      out.write("         document.getElementById(\"pincode\").addEventListener(\"click\", function () {\r\n");
      out.write("          document.getElementById('pincodevalid').innerHTML = \"\";\r\n");
      out.write("         });\r\n");
      out.write("         \r\n");
      out.write("         document.getElementById(\"firstName\").addEventListener(\"click\", function () {\r\n");
      out.write("          document.getElementById('firstnamevalid').innerHTML = \"\";\r\n");
      out.write("         });\r\n");
      out.write("         \r\n");
      out.write("         document.getElementById(\"lastName\").addEventListener(\"click\", function () {\r\n");
      out.write("          document.getElementById('lastnamevalid').innerHTML = \"\";\r\n");
      out.write("         });\r\n");
      out.write("         \r\n");
      out.write("         document.getElementById(\"mobileNumber\").addEventListener(\"click\", function () {\r\n");
      out.write("          document.getElementById('mobilenumbervalid').innerHTML = \"\";\r\n");
      out.write("         });\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("         document.getElementById(\"area\").addEventListener(\"click\", function () {\r\n");
      out.write("          document.getElementById('areavalid').innerHTML = \"\";\r\n");
      out.write("         });\r\n");
      out.write("             \t\t\r\n");
      out.write("    \treturn status1; \t\r\n");
      out.write("    }\r\n");
      out.write("  </script>  \r\n");
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
