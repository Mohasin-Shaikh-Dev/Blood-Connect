<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="java.sql.*"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    
    </head>
    <body>
        <%
            String pass=request.getParameter("pass");
            String mobile=(String)session.getAttribute("mobileforgot");
            try {
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull","root","root");
                   String q="update users set password=? where mobileNumber=?";
                   PreparedStatement p=con.prepareStatement(q);
                   p.setString(1,pass);
                   p.setString(2,mobile);
                   p.executeUpdate();
                   %>
                   		<script>
                   		Swal.fire({
                   	        icon: "success",
                   	        title: "Password Updated!",
                   	        text: "Your password has been successfully updated.",
                   	    }).then((result) => {
                   	        if (result.isConfirmed) {
                   	            window.location.href = "login.jsp"; // Redirect to login page
                   	        }
                   	    });
                   		</script>
                   <%                
                } catch (Exception e) {
                    out.print(e);
                }                                 
         %>
    </body>
</html>