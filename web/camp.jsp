<%@page import="com.mysql.cj.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="java.sql.*" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>City and Camp Details</title>
    <!-- Bootstrap CSS CDN link -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="camp.css">
</head>
<jsp:include page="navbar.jsp"></jsp:include>
<body>
    <div class="container">
        <h2>City and Camp Details</h2>
        <!-- Form for City -->
        <form id="cityForm" onsubmit="return checkCity()">
            <div class="form-group">
                <input type="text" class="form-control" id="city" name="city" placeholder="Enter City">
                <button type="submit" class="btn btn-primary ml-2">Check City</button>
                <span id="cityError" class="error-message" style="text-align: center; font-weight: bold;"></span>
            </div>
        </form>

        <!-- Table to Display Camp Details -->
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th>Camp Name</th>
                    <th>Contact</th> <!-- Changed from "Mobile Number" -->
                    <th>Address</th>
                    <th> city </th>
                    <th>Date</th>
                    <th>Time</th>
                    <th colspan="3">Action</th>
                </tr>
            </thead>
            <tbody id="campTableBody">
                <% 
                    String city = request.getParameter("city");
                    try {
                    	Class.forName("com.mysql.jdbc.Driver");
             		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull","root","root");
                        String q = "SELECT * FROM campdetails WHERE city=?";
                        PreparedStatement p = con.prepareStatement(q);
                        p.setString(1,city);
                        ResultSet rs = p.executeQuery();
                        while (rs.next()) {
                %>
                <tr>
                    <td><%= rs.getString(2) %></td>
                    <td><%= rs.getString(3) %></td>  
                    <td><%= rs.getString(4) %></td> 
                     <td><%= rs.getString(5) %></td> 
                    <td><%= rs.getDate(6) %></td> 
                    <td><%=rs.getString(7) %></td>                   
                    <td>
                        <form action="campregister.jsp" method="post">
                            <input type="hidden" name="campName" value="<%= rs.getString(2) %>">
                            <button type="submit" class="btn btn-primary">Register</button>
                        </form>
                    </td>                                                 
                   <td>
                   	<form action="volunteer_register.jsp" method="post">
                            <input type="hidden" name="volcampName" value="<%= rs.getString(2) %>">
                            <button type="submit" class="btn btn-primary">Volunteer</button>
                        </form>
                   </td>
                   <td>
                        <form action="location.jsp" method="post">
                            <input type="hidden" name="campId" value="<%= rs.getString(1) %>">
                            <button type="submit" class="btn btn-primary">Location</button>
                        </form>
                    </td>  
                </tr>
                <% 
                        }
                    } catch(Exception e) {
                        e.printStackTrace();
                    }   
                %>
            </tbody>
        </table>
    </div>
    <!-- Bootstrap JS CDN link -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    <script>
        function checkCity() {
            var cityInput = document.getElementById('city').value.trim();
            var cityError = document.getElementById('cityError');
            var cityRegex = /^[a-zA-Z\s]+$/;            
            if (!cityInput.match(cityRegex)) {
                cityError.textContent = 'Please enter a valid city Name';
                return false; // prevent form submission
            }
          
            cityError.textContent = '';
            return true; 
        }      
    </script>
</body>
</html>
