<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Recipients Table</title>
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
      background-color: #28a745;
      color: #ffffff;
    }
    .table-striped tbody tr:nth-of-type(odd) {
      background-color: #e9ecef;
    }
    .table-striped tbody tr:hover {
      background-color: #c8ced3;
    }
  </style>
</head>
<body>

<div class="container-fluid mt-5">
  <div class="row">
    <div class="col-md-12">
      <h2 class="table-title">█▓▒▒░░░ʀᴇᴄɪᴘɪᴇɴᴛꜱ ᴅᴇᴛᴀɪʟꜱ░░░▒▒▓█</h2>
      <div class="table-responsive">
        <table class="table table-striped table-bordered">
          <thead>
            <tr>
              <th>Recipient ID</th>
              <th>Username</th>
              <th>Mobile Number</th>
              <th>Date of Birth</th>
              <th>Search Blood Group</th>
              <th>Search Pincode</th>
            </tr>
          </thead>
          <tbody>
            <% 
            try {
              Class.forName("com.mysql.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull","root","root");
              Statement stmt=con.createStatement();
              ResultSet rs=stmt.executeQuery("SELECT * FROM recipient");
              while(rs.next()) {
            %>
            <tr>
              <td><%= rs.getInt("recipient_id") %></td>
              <td><%= rs.getString("username") %></td>
              <td><%= rs.getString("Mobilenumber") %></td>
              <td><%= rs.getString("Date_of_birth") %></td>
              <td><%= rs.getString("Search_blood_group") %></td>
              <td><%= rs.getString("search_pinocde") %></td>
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
