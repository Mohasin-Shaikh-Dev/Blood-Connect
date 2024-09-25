<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <title>Forgot Password</title>
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <!-- Custom CSS -->
  <link rel="stylesheet" href="login.css">
  <!-- Font Awesome for icons -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
 
   <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
</head>

<body>
  <div class="card">
    <h2 class="text-center">Forgot Password</h2>
    <form action="forgotpasscheck.jsp" onsubmit="return forgotvalidate()">
      <div class="form-group">
        <label for="mobileNumber">Mobile Number</label>
        <div class="input-group">
          <div class="input-group-prepend">
            <span class="input-group-text"><i class="fas fa-mobile-alt"></i></span>
          </div>
            <input type="tel" class="form-control" id="mobileNumber" placeholder="Enter Mobile Number" name="mobile"  maxlength="10" required><br> <br>
            
        </div>
        <span id="mobilevalid" class="error" style="color: red; font-weight: lighter; font-style: oblique;"></span>
      </div>
      <div class="form-group">
        <label for="dob">Date of Birth</label>
        <div class="input-group">
          <div class="input-group-prepend">
            <span class="input-group-text"><i class="fas fa-calendar-alt"></i></span>
          </div>
          <input type="date" class="form-control" id="dob" name="dob"required>
        </div>
      </div>
      <button type="submit" class="btn btn-primary btn-block">Submit</button>
    </form>
    <div class="mt-3 text-center">
      <p>Remembered your password? <a href="login.jsp" class="text-primary">Login</a></p>
    </div>
  </div>

  <!-- Bootstrap JS and Font Awesome JS -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/js/all.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  
  <!-- validation -->
  <script>
    function forgotvalidate() {
      var mobilenumber = document.getElementById('mobileNumber').value;
      var returnvalue = true;
      var mobileregx = /^[7-9][0-9]{9}$/;
      if (!(mobileregx.test(mobilenumber))) {
        document.getElementById('mobilevalid').innerHTML = "invalid mobile number";
        returnvalue = false;
      }
      return returnvalue;
    }

    document.getElementById("mobileNumber").addEventListener("click", function () {
      document.getElementById('mobilevalid').innerHTML = "";
    });
  </script>
</body>
</html>
