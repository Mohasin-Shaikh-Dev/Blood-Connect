<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Camp Details Table</title>
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
      background-color: #666;
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
      <h2 class="table-title">𝕮𝖆𝖒𝖕 𝕯𝖊𝖙𝖆𝖎𝖑𝖘 ✍</h2>
      <div class="table-responsive">
        <table class="table table-striped table-bordered">
          <thead>
            <tr>
              <th>Camp ID</th>
              <th>Camp Name</th>
              <th>Contact</th>
              <th>Address</th>
              <th>City</th>
              <th class="date-column">Camp Date</th>
              <th>Camp Time</th>
            </tr>
          </thead>
          <tbody>
            <% 
            try {
              Class.forName("com.mysql.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull","root","root");
              Statement stmt=con.createStatement();
              ResultSet rs=stmt.executeQuery("SELECT * FROM CampDetails");
              while(rs.next()) {
            %>
            <tr>
              <td><%= rs.getInt("id") %></td>
              <td><%= rs.getString("camp_name") %></td>
              <td><%= rs.getString("contact") %></td>
              <td><%= rs.getString("address") %></td>
              <td><%= rs.getString("city") %></td>
              <td><%= rs.getString("camp_date") %></td>
              <td><%= rs.getString("camp_time") %></td>
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
