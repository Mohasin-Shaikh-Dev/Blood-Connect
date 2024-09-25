<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Blood Donation Camp Volunteer Registration</title>
    <script src="validation.js"></script>
     <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <style>
    
       
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            padding: 20px;
        }

        form {
            max-width: 600px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1);
        }

        label {
            font-weight: bold;
        }

        .form-group {
            margin-bottom: 15px;
        }

        input[type="text"],
        textarea {
            width: 100%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        textarea {
            height: 100px; /* Adjust as needed */
            resize: none; /* Prevent user from resizing textarea */
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        .errormessage {
            font-size: 15px;
            color: red;
        }
        h3{
           text-decoration: underline;
        }
        
       
      .form-group select {
         width: 100%;
    	padding: 8px;
   		 border: 1px solid #ccc;
    	border-radius: 5px;
   		box-sizing: border-box;
   		}
        
    </style>
</head>
<body>
 <% 
    String campname=request.getParameter("volcampName");
 	session.setAttribute("volcamp", campname);
 %>
 
<jsp:include page="navbar.jsp"></jsp:include> <br>
    <form action="AddVolunteer" method="post" onsubmit="return validate()">
        <h2 style="color: red; text-align: center">Volunteer Registration</h2>
        <h3 style="text-align: center;"> <%=request.getParameter("volcampName") %></h3>
        <div class="form-group">
            <label for="firstName">First Name:</label><br>
            <input type="text" id="firstName" name="firstName" required>
            <span id="firstNameError" class="errormessage"></span>
        </div>

        <div class="form-group">
            <label for="lastName">Last Name:</label><br>
            <input type="text" id="lastName" name="lastName" required>
            <span id="lastNameError" class="errormessage"></span>
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
            <label for="contact">Contact:</label><br>
            <input type="text" id="contact" name="contact" required>
            <span id="contactError" class="errormessage"></span>
        </div>

        <div class="form-group">
            <label for="city">City:</label><br>
            <input type="text" id="city" name="city" required>
            <span id="cityError" class="errormessage"></span>
        </div>

        <div class="form-group">
            <label for="reason">Reason for Joining:</label><br>
            <textarea id="reason" name="reason" rows="5" cols="50" required></textarea>
            <span id="reasonError" class="errormessage"></span>
        </div>

        <input type="submit" value="Submit">
    </form>
    
    <!-- validation -->
    <script>
        function validate() {
            var result = volunteer_validate();
            if (result == true) {
            return result;
        }
    </script>
    
</body>
</html>
