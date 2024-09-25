<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Users with Flag Value 0</title>
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
    .date-column {
      width: 120px;
    }
    .table thead th {
      background-color: #6C3483;
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
        <h2 class="table-title" style="font-weight: bold">LOGOUT USER</h2>
      <div class="table-responsive">
        <table class="table table-striped table-bordered">
          <thead>
            <tr>
              <th>Username</th>
              <th>Mobile Number</th>
              <th>Blood Group</th>
              <th>Gender</th>
              <th>Date of Birth</th>
            </tr>
          </thead>
          <tbody>
            <% 
            try {
              Class.forName("com.mysql.jdbc.Driver");
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull","root","root");
              Statement stmt = con.createStatement();
              ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE flag = 0");
              while(rs.next()) {
            %>
            <tr>
              <td><%= rs.getString("Username") %></td>
              <td><%= rs.getString("Mobilenumber") %></td>
              <td><%= rs.getString("BloodGroup") %></td>
              <td><%= rs.getString("gender") %></td>
              <td><%= rs.getString("Date_Of_Birth") %></td>
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
