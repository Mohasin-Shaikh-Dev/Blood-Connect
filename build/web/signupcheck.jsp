<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
</head>
<body>
<%
    String username = request.getParameter("username");
    String mobile = request.getParameter("mobilenumber");
    String gender = request.getParameter("gender");
    String password = request.getParameter("password");
    String bloodgroup = request.getParameter("bloodGroup");
    String dob = request.getParameter("dob");
    
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull", "root", "root");
        String q = "INSERT INTO users(Username, Mobilenumber, BloodGroup, gender, password, Date_Of_Birth) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement p = con.prepareStatement(q);
        p.setString(1, username);
        p.setString(2, mobile);
        p.setString(3, bloodgroup);
        p.setString(4, gender);
        p.setString(5, password);
        p.setString(6, dob);
        p.executeUpdate();
        con.close();
        response.sendRedirect("login.jsp");
    } catch (Exception e) {
        out.print("Error: " + e.getMessage());
    }
%>      
</body>
</html>
