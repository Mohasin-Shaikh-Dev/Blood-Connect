<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Donor Registration</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
  <link rel="stylesheet" href="registerdonor.css">
  <script src="https://cdn.jsdelivr.net/npm/sweetalert2@2"></script>
</head>
<body>
  <div class="container mt-4">   
    <h1 class="form-title">Donor Registration</h1>
    <form action="InsertRegisters" onsubmit="return registervalidate()" method="post" enctype="multipart/form-data">
      <div class="form-row">
        <div class="col-md-6 mb-3">
          <label for="firstName"><i class="fas fa-user"></i> First Name</label>
          <input type="text" class="form-control" id="firstName" name="firstname" required>
          <span id="firstnamevalid" style="color: red; font-weight: lighter; font-style: oblique;"></span>
        </div>
        <div class="col-md-6 mb-3">
          <label for="lastName"><i class="fas fa-user"></i> Last Name</label>
          <input type="text" class="form-control" id="lastName" name="lastname" required>
          <span id="lastnamevalid" style="color: red; font-weight: lighter; font-style: oblique;"></span>
        </div>
      </div>
      <div class="form-row">
        <div class="col-md-6 mb-3">
          <label for="mobileNumber"><i class="fas fa-mobile-alt"></i> Mobile Number</label>
          <input type="tel" class="form-control" id="mobileNumber" name="mobilenumber" maxlength="10" required>
          <span id="mobilenumbervalid" style="color: red; font-weight: lighter; font-style: oblique;"></span>
        </div>
        <div class="col-md-6 mb-3">
          <label for="email"><i class="fas fa-envelope"></i> Email</label>
          <input type="email" class="form-control" id="email" name="email" required>
          <span id="emailvalid" style="color: red; font-weight: lighter; font-style: oblique;"></span>
        </div>
      </div>
      <div class="form-row">
        <div class="col-md-6 mb-3">
          <label for="bloodGroup"><i class="fas fa-tint"></i> Blood Group</label>
          <select class="form-control" id="bloodGroup" name="bloodgroup" required>
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
        <div class="col-md-6 mb-3">
          <label for="gender"><i class="fas fa-venus-mars"></i> Gender</label>
          <select class="form-control" id="gender" name="gender" required>
            <option value="">Select Gender</option>
            <option value="male">Male</option>
            <option value="female">Female</option>
          </select>
        </div>
      </div>
      <div class="form-row">
        <div class="col-md-6 mb-3">
          <label for="dob"><i class="fas fa-calendar-alt"></i> Date of Birth</label>
          <input type="date" class="form-control" id="dob" name="dob" max="2006-12-31" min="1880-12-31" required>
          <span id="dobvalid"></span>
        </div>
        <div class="col-md-6 mb-3">
          <label for="city"><i class="fas fa-city"></i> City</label>
          <input type="text" class="form-control" id="city" required name="city">
          <span id="cityvalid" style="color: red; font-weight: lighter; font-style: oblique;"></span>
        </div>
      </div>
      <div class="form-row">
        <div class="col-md-6 mb-3">
          <label for="area"><i class="fas fa-map-marked-alt"></i> Area</label>
          <input type="text" class="form-control" id="area" name="area" required="required">
          <span id="areavalid" style="color: red; font-weight: lighter; font-style: oblique;"></span>
        </div>
        <div class="col-md-6 mb-3">
          <label for="pincode"><i class="fas fa-map-pin"></i> Pincode</label>
          <input type="text" class="form-control" id="pincode" name="pincode" required="required">
          <span id="pincodevalid" style="color: red; font-weight: lighter; font-style: oblique;"></span>
        </div>
      </div>
      <div class="form-row">
        <div class="col-md-12 mb-3">
          <label for="imageUpload"><i class="fas fa-image"></i> Upload Image</label>
          <div class="input-group">
            <div class="custom-file">
              <input type="file" class="custom-file-input" id="imageUpload" accept="image/*" onchange="displayImageName()" name="image">
              <label class="custom-file-label" for="imageUpload">Choose file</label>
            </div>
          </div>
        </div>
      </div>
        <button type="submit" class="btn btn-primary" style="width: 100%">Submit</button>
    </form>
  </div>
  
  <script type="text/javascript"> 
    function displayImageName() {
      const input = document.getElementById('imageUpload');
      const imageNameLabel = document.querySelector('.custom-file-label');
      if (input.files.length > 0) {
        imageNameLabel.textContent = input.files[0].name;
      } else {
        imageNameLabel.textContent = 'Choose file';
      }
    }  
    
    function registervalidate()
    {
    	var firstname=document.getElementById("firstName").value;
    	var lastname=document.getElementById("lastName").value;
    	var mobilenumber=document.getElementById("mobileNumber").value;
    	var city=document.getElementById("city").value;
    	var pincode=document.getElementById("pincode").value;
    	var area=document.getElementById("area").value;
    	var mainregx =/^[a-zA-Z\s]{3,30}$/;
    	var status1=true;
    	if(!(mainregx.test(firstname))){
    		document.getElementById("firstnamevalid").innerHTML="Invalid Name";
    		status1=false;
    	}
    	
    	if(!(mainregx.test(lastname))){
    		document.getElementById("lastnamevalid").innerHTML="Invalid Last Name";
    		status1=false;
    	}
    	
    	if(!(mainregx.test(city))){
    		document.getElementById("cityvalid").innerHTML="Invalid City Name";
    		status1=false;
    	}
    	
    	if(!(mainregx.test(area))){
    		document.getElementById("areavalid").innerHTML="Invalid Area Name";
    		status1=false;
    	}
    	
    	var pincoderegx=/^[1-9][0-9]{5}$/;
    	if(!(pincoderegx.test(pincode)))
    	{
    		document.getElementById("pincodevalid").innerHTML="Invalid pincode";
    		status1=false;
    	}
    	
    	var mobileregx=/^[7-9][0-9]{9}$/;
          if(!(mobileregx.test(mobilenumber)))
          {
              document.getElementById('mobilenumbervalid').innerHTML="Invalid mobile number";
              status1=false;
          }
    		
    	  document.getElementById("city").addEventListener("click", function () {
          document.getElementById('cityvalid').innerHTML = "";
         });
         
         document.getElementById("pincode").addEventListener("click", function () {
          document.getElementById('pincodevalid').innerHTML = "";
         });
         
         document.getElementById("firstName").addEventListener("click", function () {
          document.getElementById('firstnamevalid').innerHTML = "";
         });
         
         document.getElementById("lastName").addEventListener("click", function () {
          document.getElementById('lastnamevalid').innerHTML = "";
         });
         
         document.getElementById("mobileNumber").addEventListener("click", function () {
          document.getElementById('mobilenumbervalid').innerHTML = "";
         });
         
         
         document.getElementById("area").addEventListener("click", function () {
          document.getElementById('areavalid').innerHTML = "";
         });
             		
    	return status1; 	
    }
  </script>  
</body>
</html>
