package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class signupcheck_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t ");

	   String username=request.getParameter("username");
           String mobile=request.getParameter("mobilenumber");
           String gender=request.getParameter("gender");
           String password= request.getParameter("password");
           String dob=request.getParameter("dob");
           try {
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull","root","root");
                   String q="insert into users(Username,Mobilenumber,gender,password,Date_Of_Birth) values(?,?,?,?,?)";
                   PreparedStatement p=con.prepareStatement(q);
                   p.setString(1,username);
                   p.setString(2,mobile);
                   p.setString(3,gender);
                   p.setString(4,password);
                   p.setString(5,dob);
                   p.executeUpdate();
                   con.close();
                   response.sendRedirect("login.jsp");
                             
               } catch (Exception e) {
                   out.print(e);
               }
         
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("</body>\r\n");
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
