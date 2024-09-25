<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    </head>
    <body>
        
        <%
           String mobile=request.getParameter("mobile");
           String dob= request.getParameter("dob");
           
           // for to update the password at the perticualar mobile number
           session.setAttribute("mobileforgot",mobile);
           try {
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull","root","root");
                   String q="select * from users";
                   Statement s=con.createStatement();
                   ResultSet r=s.executeQuery(q);
                   int f=0;
                   while(r.next())
                   {
                       if(r.getString(2).equals(mobile) && r.getString(6).equals(dob))
                       {
                           f=1;
                           break;
                       }                                           
                   }
                   if(f==1)
                       {
                           response.sendRedirect("updatepass.html");
                           
                       }
                       else
                       {
                           //displaying the dialog box                        
                          %>
                          <script> 
                            Swal.fire("user not found !!");  
                          </script>
                          <%
                          RequestDispatcher rd = request.getRequestDispatcher("forgotpass.jsp");
                          rd.include(request, response);
                       }
                   
               } catch (Exception e) {
                   out.print(e);
               }  
            
         %>
       
    </body>
</html>
						