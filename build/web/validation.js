function searchdonorvalidate()
{
	var city=document.getElementById("city").value;
	var pincode=document.getElementById("pincode").value;
	var status=true;
	var cityregx=/^[a-zA-Z]{3,20}$/
	if(!(cityregx.test(city)))
	{
		document.getElementById("cityvalid").innerHTML="invalid city name";
		status=false;
	}
	var pincoderegx=/^[1-9][0-9]{5}$/;
	if(!(pincoderegx.test(pincode)))
	{
		document.getElementById("pincodevalid").innerHTML="invalid pincode";
		status=false;
	}
	
	 document.getElementById("city").addEventListener("click", function () {
      document.getElementById('cityvalid').innerHTML = "";
     });
     
     document.getElementById("pincode").addEventListener("click", function () {
      document.getElementById('pincodevalid').innerHTML = "";
     });
     
	return status;
	
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

function campregister()
{
	var firstName = document.getElementById("firstName").value;
    var lastName = document.getElementById("lastName").value;
    var contact = document.getElementById("contact").value;
    var address = document.getElementById("address").value;
    var area = document.getElementById("area").value;
    
    var namePattern = /^[a-zA-Z\s]+$/;
    var contactPattern = /^[7-9][0-9]{9}$/;

    var isValid = true;

    if (!namePattern.test(firstName)) {
        document.getElementById("firstNameError").innerText = "Please enter a valid first name";
        isValid = false;
    }

    if (!namePattern.test(lastName)) {
        document.getElementById("lastNameError").innerText = "Please enter a valid last name";
        isValid = false;
    }

    if (!contactPattern.test(contact)) {
        document.getElementById("contactError").innerText = "Please enter a valid 10-digit mobile number starting with 7-9";
        isValid = false;
    }

    if (!namePattern.test(address)) {
        document.getElementById("addressError").innerText = "Please enter a valid city";
        isValid = false;
    }

    if (!namePattern.test(area)) {
        document.getElementById("areaError").innerText = "Please enter a valid address";
        isValid = false;
    }
  
   document.getElementById("firstName").addEventListener("click", function () {
      document.getElementById('firstNameError').innerHTML = "";
     });
     
      document.getElementById("lastName").addEventListener("click", function () {
      document.getElementById('lastNameError').innerHTML = "";
     });
     
      document.getElementById("contact").addEventListener("click", function () {
      document.getElementById('contactError').innerHTML = "";
     });
     
      document.getElementById("address").addEventListener("click", function () {
      document.getElementById('addressError').innerHTML = "";
     });
     
      document.getElementById("area").addEventListener("click", function () {
      document.getElementById('areaError').innerHTML = "";
     });
    return isValid;   
}

// volunteer validate
function volunteer_validate()
{
	var firstName = document.getElementById("firstName").value;
        var lastName = document.getElementById("lastName").value;
        var contact = document.getElementById("contact").value;
        var city = document.getElementById("city").value;
        var reason = document.getElementById("reason").value;
        var result=true;
        var nameRegex = /^[a-zA-Z ]+$/; // Allows alphabets and spaces
        var contactRegex = /^[7-9][0-9]{9}$/; // Starts with 7, 8, or 9 and contains 10 digits
       

        if (!nameRegex.test(firstName)) {
            document.getElementById("firstNameError").innerText = "Invalid name";
            result= false;
        }
        

        if (!nameRegex.test(lastName)) {
             document.getElementById("lastNameError").innerText = "Invalid name";
            result= false;
        }

       if (!nameRegex.test(city)) {
            document.getElementById("cityError").innerText = "Invalid City Name";
            result= false;
        }

        if (!contactRegex.test(contact)) {
           document.getElementById("contactError").innerText = "Invalid contact";
            result= false;
        }
         
          document.getElementById("contact").addEventListener("click", function () {
         document.getElementById('contactError').innerHTML = ""});
         
          document.getElementById("city").addEventListener("click", function () {
         document.getElementById('contactError').innerHTML = ""});
         
           document.getElementById("lastName").addEventListener("click", function () {
         document.getElementById('lastNameError').innerHTML = ""});
         
           document.getElementById("firstName").addEventListener("click", function () {
         document.getElementById('firstNameError').innerHTML = ""});       
        return result;
}

//Appointment validate
  function AppointmentValidate() {
            var name = document.getElementById("name").value;
            var phone = document.getElementById("phone").value;
            var units = document.getElementById("units").value;
            var nameRegex = /^[a-zA-Z\s]+$/;
            var phoneRegex = /^[6-9][0-9]{9}$/;
            var unitRegx=/^[1-5]{1}$/;

            var isValid = true;

            if (!nameRegex.test(name)) {
                document.getElementById("nameError").innerHTML = "Please enter a valid name.";
                isValid = false;
            } 

            if (!phoneRegex.test(phone)) {
                document.getElementById("phoneError").innerHTML = "Please enter a valid 10-digit phone number.";
               isValid = false;
            } 
            
            if (!unitRegx.test(units)) {
                document.getElementById("unitError").innerHTML = "Enter the Units in Number 1-5";
                isValid = false;
            } 
            
             document.getElementById("units").addEventListener("click", function () {
            document.getElementById('unitError').innerHTML = ""});
            
             document.getElementById("phone").addEventListener("click", function () {
            document.getElementById('phoneError').innerHTML = ""});
            
             document.getElementById("name").addEventListener("click", function () {
         document.getElementById('nameError').innerHTML = ""});
            return isValid;
        }