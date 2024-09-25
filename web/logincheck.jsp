<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
  <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<script src="alertbox.js"></script>  
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
           <%
           String mobilenumber=request.getParameter("mobilenumber");
           String pass= request.getParameter("password");
           session.setAttribute("mobile",mobilenumber);
           try {
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull","root","root");
                   String q="select * from users";
                   Statement s=con.createStatement();
                   ResultSet r=s.executeQuery(q);
                   int f=0;
                   while(r.next())
                   {
                       if(r.getString(2).equals(mobilenumber) && r.getString(5).equals(pass))
                       {
                           f=1;
                           break;
                       }                                           
                   }
                   if(f==1)
                       {
                	 String status="update users set flag=? where Mobilenumber=?";
                	  PreparedStatement p=con.prepareStatement(status);
                	  p.setInt(1,1);
                	  p.setString(2,mobilenumber);
                	   p.executeUpdate();
                	   response.sendRedirect("homepage.jsp");
                       }
                       else
                       {
                           %>
                           <script>
       
                Swal.fire({
                    icon: 'error',
                    title: 'Invalid User',
                    text: 'Please check your mobile number or password and try again!',
                    confirmButtonColor: '#3085d6',
                    confirmButtonText: 'OK'
                }).then((result) => {
                    if (result.isConfirmed) {
                        // Redirect back to the login.html page
                        window.location.href = 'login.jsp';
                    }
                });                               
                </script>
                 <%
                 RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                 rd.include(request, response);        
                }
                   
               } catch (Exception e) {
                   out.print(e);
               }
         %>
        

</body>
</html>