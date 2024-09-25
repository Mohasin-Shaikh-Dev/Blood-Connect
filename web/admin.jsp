
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Admin Dashboard</title>
  <link rel="stylesheet" href="admin.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"/>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <style>
  </style>
</head>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" style="height: 70px;">
    <a class="navbar-brand" href="#">Admin Dashboard</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav ml-auto">
        <li class="nav-item">
          <a class="nav-link" href="AdminLogin.jsp"><i class="fas fa-sign-out-alt"></i> Leave</a>
        </li>
      </ul>
    </div>
  </nav>
  <!-- Main Content -->
<div class="container mt-5">
  <div class="row">
    <div class="col-md-4">
      <h2><i class="fas fa-hand-holding-medical"></i> Donors</h2>
      <p><a href="AdminDonors.jsp">View Donors</a></p>
    </div>
    <div class="col-md-4">
      <h2><i class="fas fa-users"></i> Recipients</h2>
      <p><a href="AdminRicipient.jsp">View Recipients</a></p>
    </div>
    <div class="col-md-4">
      <h2><i class="fas fa-hospital"></i> Blood Donation Camp</h2>
      <p><a href="AdminCamp.jsp">View Donation Camps</a></p>
    </div>
    <div class="col-md-4">
      <h2><i class="fas fa-plus-square"></i> Add Camp</h2>
      <p><a href="addcamp.jsp">Add New Camp</a></p>
    </div>
    <div class="col-md-4">
      <h2><i class="fas fa-tint"></i> Blood Bank</h2>
      <p><a href="AdminBank.jsp">View Blood Bank</a></p>
    </div>
    <div class="col-md-4">
      <h2><i class="fas fa-hospital-user"></i> Add Blood Bank</h2>
      <p><a href="AddBloodBank.jsp">Add New Blood Bank</a></p>
    </div>
    <div class="col-md-4">
      <h2><i class="fas fa-user-lock"></i> Users (Sign In)</h2>
      <p><a href="AdminUserSignIn.jsp">View users</a></p>
    </div>
    <div class="col-md-4">
      <h2><i class="fas fa-user-lock"></i> Users (Log Out)</h2>
      <p><a href="AdminuserLogOut.jsp">View users</a></p>
    </div>
      <div class="col-md-4">
          <h2><i class="fas fa-calendar-alt"></i> Appointment</h2>
      <p><a href="AdminAppointment.jsp">View Appointment</a></p>
    </div>
  </div>
</div>


  <!-- Bootstrap JS and dependencies -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
