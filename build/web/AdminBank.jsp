<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Blood Banks Table</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <style>
    .table-title {
      margin-bottom: 20px;
      text-align: center;
      font-family: Arial, sans-serif;
      font-weight: bold;
      font-size: 24px;
      color: #333;
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
    .date-column {
      width: 120px;
    }
    .table thead th {
      background-color: #dc3545;
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
      <h2 class="table-title">𝗕𝗹𝗼𝗼𝗱 𝗕𝗮𝗻𝗸𝘀 𝗧𝗮𝗯𝗹𝗲 🩸</h2>
      <div class="table-responsive">
        <table class="table table-striped table-bordered">
          <thead>
            <tr>
              <th>Blood Bank ID</th>
              <th>Blood Bank Name</th>
              <th>Contact</th>
              <th>City</th>
              <th>State</th>
              <th>Area</th>
            </tr>
          </thead>
          <tbody>
            <% 
            try {
              Class.forName("com.mysql.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull","root","root");
              Statement stmt=con.createStatement();
              ResultSet rs=stmt.executeQuery("SELECT * FROM Blood_Banks");
              while(rs.next()) {
            %>
            <tr>
              <td><%= rs.getInt("blood_bank_id") %></td>
              <td><%= rs.getString("blood_bank_name") %></td>
              <td><%= rs.getString("contact") %></td>
              <td><%= rs.getString("city") %></td>
              <td><%= rs.getString("state") %></td>
              <td><%= rs.getString("area") %></td>
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
