<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>
<%@page import="java.io.*"%>
<%@page import="java.util.Base64"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Display Donors</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="displaydonor.css"> 
</head>
<body>

<%
// Retrieving parameters from the request
String bloodgroup = request.getParameter("bloodGroup");
String city = request.getParameter("city");
int pincode = Integer.parseInt(request.getParameter("pincode"));
String mobile=(String)session.getAttribute("mobile");
try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank", "root", "root");
    String q2="select * from users where mobileNumber=?";
              PreparedStatement p2=con.prepareStatement(q2);
              p2.setString(1,mobile);
              ResultSet r2=p2.executeQuery();
              while(r2.next())
              {
            	  String recipientInsert="insert into recipient(username,mobilenumber,Date_of_birth,Search_blood_group,search_pinocde) values(?,?,?,?,?)";
            	  PreparedStatement p3=con.prepareStatement(recipientInsert);
            	  p3.setString(1,r2.getString(1));
            	  p3.setString(2,mobile);
            	  p3.setString(3,r2.getString(4));
            	  p3.setString(4,bloodgroup);
            	  p3.setInt(5,pincode);
            	  p3.executeUpdate();
              }
    String q = "SELECT * FROM donors WHERE bloodGroup=? AND city=? AND PinCode=?";
    PreparedStatement p = con.prepareStatement(q);
    p.setString(1, bloodgroup);
    p.setString(2, city);
    p.setInt(3, pincode);
    ResultSet rs = p.executeQuery();

    
    while (rs.next()) {
        
        Blob imageblob = rs.getBlob("image");
        if (imageblob != null) {
           
            InputStream is = imageblob.getBinaryStream();
            ByteArrayOutputStream ouputStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[4096];
            int bytesRead = -1;
            while ((bytesRead = is.read(buffer)) != -1) {
                ouputStream.write(buffer, 0, bytesRead);
            }
            byte[] imagebyte = ouputStream.toByteArray();
            String base64image = Base64.getEncoder().encodeToString(imagebyte);
            String imagedata = "data:image/*;base64," + base64image;
%>

<div class="container mt-4">
    <div class="card">
        <div class="card-body">
            <div class="row">
                <div class="col-md-4 text-center">
                    <img src="<%=imagedata %>" class="img-fluid rounded-circle mb-3" alt="Profile Picture">
                    <h4><%=rs.getString(2)+" "+rs.getString(3) %></h4>
                </div>
                <div class="col-md-8">
                    <ul class="list-group list-group-flush">
                        <li class="list-group-item">Blood Group: <%=rs.getString(6) %></li>
                        <li class="list-group-item">Mobile: <%=rs.getString(4)%></li>
                        <li class="list-group-item">Email: <%=rs.getString(5)%></li>
                        <li class="list-group-item">Gender: <%=rs.getString(7) %></li>
                        <li class="list-group-item">Address: <%=rs.getString(11)+","+rs.getString(9)+","+rs.getInt(10) %></li>
                    </ul>                   
                </div>
            </div>
        </div>
    </div>
</div>

<%
        }
    }
    con.close();
} catch (Exception e) {
    out.print(e);
}
%>

</body>
</html>
