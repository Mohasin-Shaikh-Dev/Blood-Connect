<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Admin Dashboard</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/10.16.3/sweetalert2.min.css">
</head>
<body>

<%
String username = request.getParameter("username");
String password = request.getParameter("password");

try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull","root","root");
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM Admins WHERE username = '" + username + "' AND password = '" + password + "'");
    if (rs.next()) {
        response.sendRedirect("admin.jsp");
    } else {
%>
        <script>
            window.onload = function() {
                Swal.fire({
                    title: 'Error',
                    text: 'Invalid username or password',
                    icon: 'error',
                    confirmButtonText: 'OK'
                }).then((result) => {
                    if (result.isConfirmed) {
                        window.location.href = "AdminLogin.jsp";
                    }
                });
            };
        </script>       
<%
    }
    con.close();
} catch(Exception e) {
    out.println(e);
}
%>

<script src="https://cdn.jsdelivr.net/npm/sweetalert2@10"></script>
</body>
</html>
