<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Donors Table</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <style>
    .table-title {
      margin-bottom: 20px;
      text-align: center;
    }
    .table-responsive {
      overflow-x: auto;
    }
    th, td {
      text-align: center;
      vertical-align: middle;
    }
    td{
        font-weight: 500;
    }
    .dob-column {
      width: 150px;
    }
    .table thead th {
      background-color: #007bff;
      color: #ffffff;
    }
    .table-striped tbody tr:nth-of-type(odd) {
      background-color: #f8f9fa;
    }
    .table-striped tbody tr:hover {
      background-color: #e9ecef;
    }
  </style>
</head>
<body>

<div class="container-fluid mt-5">
  <div class="row">
    <div class="col-md-12">
      <h2 class="table-title">𝕯𝖔𝖓𝖔𝖗𝖘 𝕯𝖊𝖙𝖆𝖎𝖑𝖘</h2>
      <div class="table-responsive">
        <table class="table table-striped table-bordered">
          <thead>
            <tr>
              <th>Donor ID</th>
              <th>First Name</th>
              <th>Last Name</th>
              <th>Mobile Number</th>
              <th>Email ID</th>
              <th>Blood Group</th>
              <th>Gender</th>
              <th class="dob-column">Date of Birth</th>
              <th>City</th>
              <th>Pin Code</th>
              <th>Area</th>
            </tr>
          </thead>
          <tbody>
            <% 
            try {
              Class.forName("com.mysql.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull","root","root");
              Statement stmt=con.createStatement();
              ResultSet rs=stmt.executeQuery("SELECT * FROM donors");
              while(rs.next()) {
            %>
            <tr>
              <td><%= rs.getInt("DonorID") %></td>
              <td><%= rs.getString("firstName") %></td>
              <td><%= rs.getString("lastName") %></td>
              <td><%= rs.getString("mobileNumber") %></td>
              <td><%= rs.getString("email_Id") %></td>
              <td><%= rs.getString("bloodGroup") %></td>
              <td><%= rs.getString("gender") %></td>
              <td><%= rs.getString("Date_Of_Birth")%></td>
              <td><%= rs.getString("city") %></td>
              <td><%= rs.getInt("PinCode") %></td>
              <td><%= rs.getString("Area") %></td>
            </tr>
            <% 
              }
              con.close();
            } catch(Exception e) {
              out.println(e);
            }
            %>
          </tbody>
        </table>
      </div>
    </div>
  </div>
</div>
</body>
</html>
