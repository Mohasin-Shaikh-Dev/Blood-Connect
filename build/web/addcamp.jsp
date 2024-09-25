<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Blood Donation Camp</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@2"></script>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <!-- Internal CSS for Gradient Background -->
    <style>
        body {
            background: linear-gradient(135deg, #8e9eab, #eef2f3);
            
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .container {
            background-color: #ffffff;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 0 20px rgba(0,0,0,0.1);
        }
         .title {
            text-align: center;
            margin-bottom: 30px;
            color: #ff0033;
        }
        .form-group label {
            color: black;
            font-weight: bold;
        }
        .btn-primary {
            background-color: #007bff;
            border-color: #007bff;
        }
        .btn-primary:hover {
            background-color: #0056b3;
            border-color: #0056b3;
        }
        
    </style>
</head>
<body>
    <div class="container">
        <h2 class="title">Add Blood Donation Camp</h2>
        <form action="AddCampServlet" method="post" id="campForm">
            <div class="form-group">
                <label for="campName">Camp Name:</label>
                <input type="text" class="form-control" id="campName" name="campName" required>
                <div id="campNameError" class="invalid-feedback"></div>
            </div>
            <div class="form-group">
                <label for="contact">Contact:</label>
                <input type="text" class="form-control" id="contact" name="contact" required>
                <div id="contactError" class="invalid-feedback"></div>
            </div>
            <div class="form-group">
                <label for="address">Address:</label>
                <input type="text" class="form-control" id="address" name="address" required>
                <div id="addressError" class="invalid-feedback"></div>
            </div>
            <div class="form-group">
                <label for="city">City:</label>
                <input type="text" class="form-control" id="city" name="city" required>
                <div id="cityError" class="invalid-feedback"></div>
            </div>
            <div class="form-group">
                <label for="campDate">Camp Date:</label>
                <input type="date" class="form-control" id="campDate" name="campDate" required>
                <div id="campDateError" class="invalid-feedback"></div>
            </div>
            <div class="form-group">
                <label for="campTime">Camp Start Time:</label>
                <input type="time" class="form-control" id="campStartTime" name="campStartTime" required>
                <div id="campStartTimeError" class="invalid-feedback"></div>
            </div>
            <div class="form-group">
                <label for="campTime">Camp End Time:</label>
                <input type="time" class="form-control" id="campEndTime" name="campEndTime" required>
                <div id="campEndTimeError" class="invalid-feedback"></div>
            </div>
            <div class="form-group">
                <label for="locationCode">Location Code:</label><br>
                <textarea class="form-control" id="locationCode" name="locationCode" rows="4" required></textarea>
                <div id="locationCodeError" class="invalid-feedback"></div>
            </div>
            <button type="button" class="btn btn-primary btn-block" onclick="validateForm()">Submit</button>
        </form>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <!-- JavaScript for Form Validation -->
    <script>
        function validateForm() {
            var form = document.getElementById("campForm");
            var campName = document.getElementById("campName");
            var contact = document.getElementById("contact");
            var address = document.getElementById("address");
            var city = document.getElementById("city");
            var campDate = document.getElementById("campDate");
            var campStartTime = document.getElementById("campStartTime");
            var campEndTime = document.getElementById("campEndTime");
            var locationCode = document.getElementById("locationCode");

            var contactRegex = /^[7-9]\d{9}$/; // Regular expression to validate contact number
            var cityRegex = /^[a-zA-Z\s]+$/; // Regular expression to validate city

            if (campName.value.trim() === "") {
                showError(campName, "Please enter the camp name.");
                return;
            } else {
                hideError(campName);
            }

            if (!contact.value.match(contactRegex)) {
                showError(contact, "Please enter a valid contact number starting with 7, 8, or 9 and containing 10 digits.");
                return;
            } else {
                hideError(contact);
            }

            if (address.value.trim() === "") {
                showError(address, "Please enter the address.");
                return;
            } else {
                hideError(address);
            }

            if (!city.value.match(cityRegex)) {
                showError(city, "Please enter a valid city name containing only alphabets.");
                return;
            } else {
                hideError(city);
            }

            if (campDate.value === "") {
                showError(campDate, "Please select the camp date.");
                return;
            } else {
                hideError(campDate);
            }

            if (campStartTime.value.trim() === "") {
                showError(campStartTime, "Please enter the camp start time.");
                return;
            } else {
                hideError(campStartTime);
            }

            if (campEndTime.value.trim() === "") {
                showError(campEndTime, "Please enter the camp end time.");
                return;
            } else {
                hideError(campEndTime);
            }

            if (locationCode.value.trim() === "") {
                showError(locationCode, "Please enter the location code.");
                return;
            } else {
                hideError(locationCode);
            }

            // If all fields are valid, submit the form
            form.submit();
        }

        function showError(input, message) {
            input.classList.add("is-invalid");
            input.nextElementSibling.textContent = message;
        }

        function hideError(input) {
            input.classList.remove("is-invalid");
            input.nextElementSibling.textContent = "";
        }
    </script>
</body>
</html>
