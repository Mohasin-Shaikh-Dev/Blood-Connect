package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class location_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Display Camp Location</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h2>Display Camp Location</h2>\n");
      out.write("    \n");
      out.write("    ");
 
        String jdbcURL = "jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull";
        String dbUser = "root";
        String dbPassword = "root";
        int id=Integer.parseInt(request.getParameter("campId"));
        String loc="";
        try
        {
            Class.forName("");
            Connection con=DriverManager.getConnection(jdbcURL,dbUser,dbPassword);
            String q="select * from CampDetails where id=?";
            PreparedStatement p=con.prepareStatement(q);
            p.setInt(1,id);
            ResultSet rs=p.executeQuery();
            while(rs.next())
            {
                 loc=rs.getString(8);
            }
        }catch(Exception e)
                {
                    
                }
        
      out.write("\n");
      out.write("        <P> ");
      out.print(loc);
      out.write(" </p>\n");
      out.write("        ");

    
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d10446.960353786253!2d75.90163567515192!3d17.66021655357278!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bc5da715821adc1%3A0x9eb7e6d96ad484ef!2sSangameshwar%20College!5e0!3m2!1sen!2sin!4v1712951057191!5m2!1sen!2sin\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>");
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
