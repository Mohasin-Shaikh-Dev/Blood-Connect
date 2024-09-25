<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
int appointmentId = Integer.parseInt(request.getParameter("appointmentId"));

try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull","root","root");
    
    String query = "DELETE FROM BloodBankAppointments WHERE appointmentId = ?";
    PreparedStatement pstmt = con.prepareStatement(query);
    pstmt.setInt(1, appointmentId);
    
    pstmt.executeUpdate();
    
    con.close();
    
    response.sendRedirect("AdminAppointment.jsp");
} catch(Exception e) {
    out.println(e);
}
%>
