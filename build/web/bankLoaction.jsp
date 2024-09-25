<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Display Camp Location</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>  
    <% 
        String jdbcURL = "jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull";
        String dbUser = "root";
        String dbPassword = "root";
        int id=Integer.parseInt(request.getParameter("bankId"));
        String loc="";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(jdbcURL,dbUser,dbPassword);
            String q="select * from Blood_Banks where blood_bank_id=?";
            PreparedStatement p=con.prepareStatement(q);
            p.setInt(1,id);
            ResultSet rs=p.executeQuery();
            while(rs.next())
            {
                 loc=rs.getString(7);
            }
        }catch(Exception e)
                {
                    
                }
        %>
        <P> <%=loc%> </p>
        <%
    %>
</body>
</html>


