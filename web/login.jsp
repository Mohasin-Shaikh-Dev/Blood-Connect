<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>  
<%@page import="java.io.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Login Page</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <link rel="stylesheet" href="login.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
  <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
  <script src="alertbox.js"></script> 
  <style>   
  </style>
</head>
<body>
  <div class="card">
    <h2 class="text-center">Login</h2>
    <form action="logincheck.jsp" onsubmit="return loginvalidate()">
      <div class="form-group">
        <label for="mobileNumber">Mobile Number</label>
        <div class="input-group">
          <div class="input-group-prepend">
            <span class="input-group-text"><i class="fas fa-mobile-alt"></i></span>
          </div>
            <input type="tel" class="form-control" id="mobileNumber" placeholder="Enter Mobile Number"  name="mobilenumber" required maxlength="10">
        </div>
        <span id="mobilevalid" class="error" style="color: red; font-weight: lighter; font-style: oblique;"></span>
      </div>
      <div class="form-group">
        <label for="password">Password</label>
        <div class="input-group">
          <div class="input-group-prepend">
            <span class="input-group-text"><i class="fas fa-lock"></i></span>
          </div>
            <input type="password" class="form-control" id="password" placeholder="Enter Password" name="password" required>            
        </div>
      </div>
      <button type="submit" class="btn btn-primary btn-block">Login</button>
    </form>
    <div class="mt-3 text-center">
      <a href="forgotpass.jsp" class="text-secondary">Forgot Password?</a>
    </div>
    <div class="mt-3 text-center">
      <p>Don't have an account? <a href="signup.html" class="text-primary">Sign Up</a></p>
    </div>
  </div>
    
    
    <!-- validation-->   
    <script>
		function loginvalidate()
		{
			var mobilenumber=document.getElementById('mobileNumber').value;
			
			var returnvalue=true;
			var mobileregx=/^[7-9][0-9]{9}$/;
           if(!(mobileregx.test(mobilenumber)))
           {
             document.getElementById('mobilevalid').innerHTML="invalid mobile number";
             returnvalue=false;
           }
                 
           return returnvalue;
		}
		
		 document.getElementById("mobileNumber").addEventListener("click", function () {
         document.getElementById('mobilevalid').innerHTML = "";
         });
 
	</script>
</body>

</html>