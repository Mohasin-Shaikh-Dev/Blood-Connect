<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Blood Bank Appointment</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <style>
        body {
            background: linear-gradient(45deg, #6C3483, #00BCD4);
        }
        .form-control-label {
            font-weight: bold;
        }
        .container {
            margin-top: 30px;
            background-color: #f8f9fa;
            padding: 30px;
            border-radius: 10px;
        }
        h1 {
            color: #dc3545;
        }
        .btn-primary {
            background-color: #dc3545;
            border-color: #dc3545;
        }
        .btn-primary:hover {
            background-color: #c82333;
            border-color: #bd2130;
        }
        .error-message {
            color: red;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1 class="my-4 text-center">Blood Bank Appointment</h1>
        <form action="AddBloodBankAppointment" method="post" onsubmit="return validateForm()">
            <div class="form-row">
                <div class="form-group col-md-12">
                    <label for="bloodBank" class="form-control-label">Blood Bank Name</label>
                    <input type="text" class="form-control" id="bloodBank" name="bloodBank" value="<%=request.getParameter("bankname")%>" readonly>
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="name" class="form-control-label">Name</label>
                    <input type="text" class="form-control" id="name" name="name" placeholder="Enter your name" required>
                    <span id="nameError" class="error-message"></span>
                </div>
                <div class="form-group col-md-6">
                    <label for="phone" class="form-control-label">Phone</label>
                    <input type="tel" class="form-control" id="phone" name="phone" placeholder="Enter your phone number"  maxlength="10" required>
                    <span id="phoneError" class="error-message"></span>
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="bloodType" class="form-control-label">Blood Type</label>
                    <select class="form-control" id="bloodType" name="bloodType" required>
                        <option value="">Select Blood Type</option>
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
                <div class="form-group col-md-6">
                    <label for="units" class="form-control-label">Number of Units</label>
                    <input type="text" class="form-control" id="units" name="units" maxlength="1" placeholder="Enter Number of Units from 1-5" required>
                    <span id="unitError" class="error-message"></span>
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="date" class="form-control-label">Appointment Date</label>
                    <input type="date" class="form-control" id="date" name="date" required>
                </div>
                <div class="form-group col-md-6">
                    <label for="time" class="form-control-label">Appointment Time</label>
                    <select class="form-control" id="time" name="time" required>
                        <option value="">Select Appointment Time</option>
                        <option value="9:00">9:00 AM</option>
                        <option value="9:30">9:30 AM</option>
                        <option value="10:00">10:00 AM</option>
                        <option value="4:00">4:00 PM</option>
                        <option value="5:00">5:00 PM</option>
                    </select>
                </div>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
    <script>
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
        function validateForm() {
            var result=AppointmentValidate();                     
            return result;
        }
    </script>
</body>
</html>
