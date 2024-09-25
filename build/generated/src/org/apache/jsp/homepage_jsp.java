package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.security.PublicKey;
import java.sql.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

   
	 public static String username()
	 {
	    String username="guest";
	   try
	   {		  
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","root","root@123");
		   String q="select Username from users where Mobilenumber=?";
		   PreparedStatement p=con.prepareStatement(q);
		   p.setString(1,"8766767796");
		   ResultSet r=p.executeQuery();
		   while(r.next())
		   {
			 
			 username=r.getString(1);
		   }    		   
		   
	   }catch(Exception e)
	   {
		  return e.getMessage();
	   }
	  return username;
	 }

   
   
   public static int countdonors()
	 {
	   int  donorscount=0;
	    try
	    {
	    	Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull","root","root");
          String q="select count(*) from donors";
          PreparedStatement p=con.prepareStatement(q);
          ResultSet r=p.executeQuery();
          while(r.next())
          {
          	donorscount=r.getInt(1);
          }
          
	    }catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    return donorscount;
	 }
   
   public static int countricipient()
	 {
	   int  ricipient=0;
	    try
	    {
	    	Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull","root","root");
        String q="select count(distinct Mobilenumber) from recipient";
        PreparedStatement p=con.prepareStatement(q);
        ResultSet r=p.executeQuery();
        while(r.next())
        {
        	ricipient=r.getInt(1);
        }
        
	    }catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    return ricipient;
	 }
   
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
      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"> \r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Honk&family=Oswald:wght@200&family=Pacifico&display=swap\" rel=\"stylesheet\">   \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"homepage.css\">\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\r\n");
      out.write("<body>    \r\n");
      out.write("\t <!--slider -->     \r\n");
      out.write("       <div id=\"carouselExampleControls\" class=\"carousel slide\" data-bs-ride=\"carousel\">\r\n");
      out.write("        <div class=\"carousel-inner\">\r\n");
      out.write("        <div class=\"carousel-item active\">\r\n");
      out.write("            <img src=\"backgoround.jpg\" class=\"d-block w-100\" alt=\"...\" style=\"height: 400px;\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"carousel-item\">\r\n");
      out.write("            <img src=\"march.jpg\" class=\"d-block w-100\" alt=\"...\" style=\"height: 400px;\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"carousel-item\">\r\n");
      out.write("            <img src=\"hand.jpg\" class=\"d-block w-100\" alt=\"...\" style=\"height: 400px;\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Controls -->\r\n");
      out.write("    <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleControls\" data-bs-slide=\"prev\">\r\n");
      out.write("        <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("        <span class=\"visually-hidden\">Previous</span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleControls\" data-bs-slide=\"next\">\r\n");
      out.write("        <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("        <span class=\"visually-hidden\">Next</span>\r\n");
      out.write("    </button>\r\n");
      out.write("</div>          \r\n");
      out.write("<!--Boxes -->\r\n");
      out.write("      <div class=\"boxes\">\r\n");
      out.write("        <div class=\"countingbox\">\r\n");
      out.write("          <div class=\"flex-container\">\r\n");
      out.write("              <div class=\"flex-box\" style=\"background-color: rgb(3, 16, 61);\">      \r\n");
      out.write("                  <p>23000</p>\r\n");
      out.write("                  <p>Approved Camps</p>\r\n");
      out.write("              </div>\r\n");
      out.write("       \r\n");
      out.write("              <div class=\"flex-box\" style=\"background-color: rgb(1, 31, 1);\">\r\n");
      out.write("                <p>40322</p>\r\n");
      out.write("                  <p>Blood Units Collected</p>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("            \r\n");
      out.write("          <div class=\"flex-container\">\r\n");
      out.write("              <div class=\"flex-box\" style=\"background-color: rgb(31, 1, 28);\">\r\n");
      out.write("                 <p>");
      out.print(countdonors());
      out.write("</p>\r\n");
      out.write("                  <p>Total Donors</p>\r\n");
      out.write("              </div>\r\n");
      out.write("       \r\n");
      out.write("              <div class=\"flex-box\" style=\"background-color: rgb(61, 4, 58);\">\r\n");
      out.write("                  <p>");
      out.print(countricipient() );
      out.write("</p>\r\n");
      out.write("                  <p>Total recipient</p>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("     \r\n");
      out.write("      <div class=\"linkboxes\">\r\n");
      out.write("        <div class=\"flex-container\">\r\n");
      out.write("          <div class=\"flex-box1\" style=\"background-color: rgb(158, 12, 12);\">                      \r\n");
      out.write("              <p> <a href=\"registerdonor.jsp\">  <i class=\"fa fa-user-circle-o\" aria-hidden=\"true\"></i>  <br> Donor <br>Register</a> </p>\r\n");
      out.write("          </div>\r\n");
      out.write("   \r\n");
      out.write("          <div class=\"flex-box1\" style=\"background-color: rgb(216, 33, 9);\">\r\n");
      out.write("            <p> <a href=\"searchdonor.jsp\"> <i class=\"fa fa-tint\"> </i> <br>Blood Availability Search</a> </p>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"flex-box1\" style=\"background-color: rgb(2, 30, 43);\">      \r\n");
      out.write("            <p> <a href=\"camp.jsp\">  <i class=\"fa fa-clock-o\" aria-hidden=\"true\"></i> <br>Blood Donation Camps</a> </p>\r\n");
      out.write("        </div>\r\n");
      out.write(" \r\n");
      out.write("        <div class=\"flex-box1\" style=\"background-color: rgb(2, 37, 26);\">       \r\n");
      out.write("          <p> <a href=\"bank.jsp\">  <i class=\"fa fa-university\" aria-hidden=\"true\"></i> <br>Blood <br>Bank</a> </p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>   \r\n");
      out.write("   </div>  \r\n");
      out.write("    <!-- blood group information-->\r\n");
      out.write("    <div class=\"info\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <h2 style=\"text-align: center; color: rgb(194, 11, 11); ;\">BLOOD GROUP INFORMATION</h2>\r\n");
      out.write("        <table class=\"table table-striped\">\r\n");
      out.write("          <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <th>Blood Group</th>\r\n");
      out.write("              <th>Can Donate To</th>\r\n");
      out.write("              <th>Can Receive From</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </thead>\r\n");
      out.write("          <tbody>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td id=\"bg\">A+</td>\r\n");
      out.write("              <td>A+, AB+</td>\r\n");
      out.write("              <td>A+, A-, O+, O-</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td id=\"bg\">A-</td>\r\n");
      out.write("              <td>A+, A-, AB+, AB-</td>\r\n");
      out.write("              <td>A-, O-</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td id=\"bg\">B+</td>\r\n");
      out.write("              <td>B+, AB+</td>\r\n");
      out.write("              <td>B+, B-, O+, O-</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td id=\"bg\">B-</td>\r\n");
      out.write("              <td>B+, B-, AB+, AB-</td>\r\n");
      out.write("              <td>B-, O-</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td id=\"bg\">AB+</td>\r\n");
      out.write("              <td>AB+</td>\r\n");
      out.write("              <td>All Blood Groups</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td id=\"bg\">AB-</td>\r\n");
      out.write("              <td>AB+, AB-</td>\r\n");
      out.write("              <td>A-, B-, AB-, O-</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td id=\"bg\">O+</td>\r\n");
      out.write("              <td>All Blood Groups</td>\r\n");
      out.write("              <td>O+, O-</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td id=\"bg\">O-</td>\r\n");
      out.write("              <td>All Blood Groups</td>\r\n");
      out.write("              <td>O-</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("   <!--team members--> \r\n");
      out.write("   <div class=\"teammember\">\r\n");
      out.write("    <h1 style=\"text-align: center;\">Team Members</h1>\r\n");
      out.write("    <div class=\"member\">\r\n");
      out.write("      <div class=\"card\">\r\n");
      out.write("        <img src=\"member1.jpg\" alt=\"Profile Picture 1\" class=\"card-img-top\">\r\n");
      out.write("        <div class=\"card-body\">\r\n");
      out.write("            <h5 class=\"card-title\">Suban Sayyad</h5>\r\n");
      out.write("            <p class=\"card-text\">Post: Blood Drive Coordinator</p>\r\n");
      out.write("            <p class=\"card-post-info\">Responsible for organizing and overseeing blood donation drives and events.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"card\">\r\n");
      out.write("        <img src=\"member2.jpg\" alt=\"Profile Picture 2\" class=\"card-img-top\">\r\n");
      out.write("        <div class=\"card-body\">\r\n");
      out.write("            <h5 class=\"card-title\">Dipali Shah</h5>\r\n");
      out.write("            <p class=\"card-text\">Post: Volunteer Coordinator</p>\r\n");
      out.write("            <p class=\"card-post-info\">Manages volunteers, assigns tasks, and ensures smooth operation during blood donation events.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"card\">\r\n");
      out.write("        <img src=\"member3.jpg\" alt=\"Profile Picture 3\" class=\"card-img-top\">\r\n");
      out.write("        <div class=\"card-body\">\r\n");
      out.write("            <h5 class=\"card-title\">Pavan Badole</h5>\r\n");
      out.write("            <p class=\"card-text\">Post: Community Relations Manager</p>\r\n");
      out.write("            <p class=\"card-post-info\">Builds relationships with community partners, organizes community events, and fosters collaboration.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("   </div> \r\n");
      out.write("   \r\n");
      out.write("          \r\n");
      out.write("    <!-- jsp code -->  \r\n");
      out.write("   ");
      out.write("       \r\n");
      out.write("</body>\r\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write(" \r\n");
      out.write("</html>");
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
