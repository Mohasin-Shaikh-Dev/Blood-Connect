<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Blood Bank Appointments</title>
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
    .action-column {
      width: 120px;
    }
    .table thead th {
      background-color:#740b0b ;
      color: #ffffff;
    }
    .table-striped tbody tr:nth-of-type(odd) {
      background-color: #f8f9fa;
    }
    .table-striped tbody tr:hover {
      background-color: #e9ecef;
    }
    .btn-cancel {
      background-color: #dc3545;
      color: #ffffff;
      border: none;
    }
    .btn-cancel:hover {
      background-color: #c82333;
    }
  </style>
</head>
<body>

<div class="container-fluid mt-5">
  <div class="row">
    <div class="col-md-12">
      <h2 class="table-title">𝗕𝗹𝗼𝗼𝗱 𝗕𝗮𝗻𝗸 𝗔𝗽𝗽𝗼𝗶𝗻𝘁𝗺𝗲𝗻𝘁𝘀 🩸</h2>
      <div class="table-responsive">
        <table class="table table-striped table-bordered">
          <thead>
            <tr>
              <th>Appointment ID</th>
              <th>Blood Bank Name</th>
              <th>Donor Name</th>
              <th>Phone</th>
              <th>Blood Type</th>
              <th>Units</th>
              <th class="date-column">Appointment Date</th>
              <th>Appointment Time</th>
              <th class="action-column">Action</th>
            </tr>
          </thead>
          <tbody>
            <% 
            try {
              Class.forName("com.mysql.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull","root","root");
              Statement stmt=con.createStatement();
              ResultSet rs=stmt.executeQuery("SELECT * FROM BloodBankAppointments");
              while(rs.next()) {
            %>
            <tr>
              <td><%= rs.getInt("appointmentId") %></td>
              <td><%= rs.getString("bloodBankName") %></td>
              <td><%= rs.getString("Donor_Name") %></td>
              <td><%= rs.getString("phone") %></td>
              <td><%= rs.getString("bloodType") %></td>
              <td><%= rs.getInt("units") %></td>
              <td><%= rs.getString("appointmentDate") %></td>
              <td><%= rs.getString("appointmentTime") %></td>
              <td>
                <form method="post" action="cancelAppointment.jsp">
                  <input type="hidden" name="appointmentId" value="<%= rs.getInt("appointmentId") %>">
                  <button type="submit" class="btn btn-cancel">Cancel</button>
                </form>
              </td>
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
