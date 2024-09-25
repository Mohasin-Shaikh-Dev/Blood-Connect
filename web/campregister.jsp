<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Blood Donation Camp Registration</title>
  <!-- Bootstrap CSS CDN link -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <link rel="stylesheet" href="registerdonor.css">
  <script src="validation.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
</head>
<style>
	.form-group label {
		font-weight: bold;
	}

	.error-message {
		color: red;
		font-size: 12px;
	}
</style>
<body>
<jsp:include page="navbar.jsp"></jsp:include> <br>
  <div class="container">
    <h2 style="text-align: center; color: white;  background-color:rgb(160, 51, 51)" >Blood Donation Camp Registration</h2>
       <h4 style="text-align: center;">Camp Name: <%= request.getParameter("campName") %></h4>
       <form action="CampRegister" method="post" onsubmit="return validate()">
      <div class="form-group">
        <label for="firstName">First Name:</label>
        <input type="text" class="form-control" id="firstName"   name="firstName" placeholder="Enter First Name" required>
        <span id="firstNameError" class="error-message"></span>
      </div>
      <div class="form-group">
        <label for="lastName">Last Name:</label>
        <input type="text" class="form-control" id="lastName"  name="lastName"   placeholder="Enter Last Name" required>
        <span id="lastNameError" class="error-message"></span>
      </div>
      <div class="form-group">
        <label for="bloodGroup">Blood Group:</label>
        <select class="form-control" id="bloodGroup" name="bloodGroup"  required>
          <option value="">Select Blood Group</option>
          <option value="A+">A+</option>
          <option value="A-">A-</option>
          <option value="B+">B+</option>
          <option value="B-">B-</option>
          <option value="AB+">AB+</option>
          <option value="AB-">AB-</option>
          <option value="O+">O+</option>
          <option value="O-">O-</option>
        </select>
      </div>
        <div class="form-group">
             <label for="gender">Gender:</label>
             <select class="form-control" id="gender" name="gender" required>
              <option value="">Select Gender</option>
               <option value="male">Male</option>
                <option value="female">Female</option>
               <option value="other">Other</option>
            </select>
        </div>
      
      <div class="form-group">
        <label for="contact">Contact:</label>
        <input type="tel" class="form-control" id="contact"  name="contact" maxlength="10" placeholder="Enter Contact" required>
        <span id="contactError" class="error-message"></span>
      </div>
      <div class="form-group">
        <label for="city">City:</label>
        <input type="text" class="form-control" id="address" name="address" placeholder="Enter city" required>
        <span id="addressError" class="error-message"></span>
      </div>
      <div class="form-group">
        <label for="area">Area:</label>
        <input type="text" class="form-control" id="area" name="area" placeholder="Enter area" required>
        <span id="areaError" class="error-message"></span>
      </div>      
      <button type="submit" class="btn btn-primary">Submit</button>
    </form>
  </div>
  
  <!-- create the session for the camp name -->
  <% 
  		  String cmp=request.getParameter("campName");
		  session.setAttribute("campname", cmp);
  %>
  <!-- validation -->
  <script>
       function validate(){
    	   var result=campregister();
           return result; 
       }       
  </script>
</body>
</html>
