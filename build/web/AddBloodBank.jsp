<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Blood Bank Registration</title>
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
  <style>
    body {
      background: linear-gradient(45deg, #6C3483, #00BCD4);
    }

    .form-container {
      background-color: #fff;
      padding: 20px;
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    .form-control-feedback {
      position: absolute;
      top: 5px;
      right: 10px;
      color: #28a745;
    }

    .invalid-feedback {
      display: block;
      color: #dc3545;
    }
    h2 {
        color:#660000;
    }
  </style>
</head>
<body>
  <div class="container mt-5">
    <div class="row justify-content-center">
      <div class="col-md-6">
        <div class="form-container">
          <h2 class="text-center mb-4">Blood Bank Registration <i class="fas fa-university"></i></h2>
          <form id="registrationForm" method="post" action="AddBloodBankServlet">
            <div class="form-group">
              <input type="text" class="form-control" name="blood_bank_name" placeholder="Enter Blood Bank Name" required>
              <div class="invalid-feedback"></div>
            </div>
            <div class="form-group">
              <input type="text" class="form-control" name="contact" placeholder="Enter Contact Number" required>
              <div class="invalid-feedback"></div>
            </div>
            <div class="form-group">
              <input type="text" class="form-control" name="city" placeholder="Enter City" required>
              <div class="invalid-feedback"></div>
            </div>
            <div class="form-group">
              <input type="text" class="form-control" name="state" placeholder="Enter State" required>
              <div class="invalid-feedback"></div>
            </div>
            <div class="form-group">
              <input type="text" class="form-control" name="area" placeholder="Enter Area" required>
              <div class="invalid-feedback"></div>
            </div>
            <div class="form-group">
              <textarea class="form-control" name="locationCode" placeholder="Enter Location Code" rows="5" required></textarea>
              <div class="invalid-feedback"></div>
            </div>
            <div class="form-group">
              <button type="submit" class="btn btn-primary btn-block">Register</button>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/js/all.min.js"></script>
  <script>
    document.getElementById('registrationForm').addEventListener('submit', function(event) {
      var form = this;
      var blood_bank_name = form.querySelector('[name="blood_bank_name"]').value.trim();
      var contact = form.querySelector('[name="contact"]').value.trim();
      var city = form.querySelector('[name="city"]').value.trim();
      var state = form.querySelector('[name="state"]').value.trim();
      var area = form.querySelector('[name="area"]').value.trim();
      var locationCode = form.querySelector('[name="locationCode"]').value.trim();

      var nameRegex = /^[a-zA-Z\s]+$/;
      var contactRegex = /^[789]\d{9}$/;
      var cityRegex = /^[a-zA-Z]+$/;
      var addressRegex = /^[a-zA-Z0-9, ]+$/;

      var isValid = true;

      if (!nameRegex.test(blood_bank_name)) {
        form.querySelector('[name="blood_bank_name"]').classList.add('is-invalid');
        form.querySelector('[name="blood_bank_name"]').nextElementSibling.innerHTML = "Please enter a valid blood bank name.";
        isValid = false;
      } else {
        form.querySelector('[name="blood_bank_name"]').classList.remove('is-invalid');
        form.querySelector('[name="blood_bank_name"]').nextElementSibling.innerHTML = "";
      }

      if (!contactRegex.test(contact)) {
        form.querySelector('[name="contact"]').classList.add('is-invalid');
        form.querySelector('[name="contact"]').nextElementSibling.innerHTML = "Please enter a valid contact number starting with 7, 8, or 9 and of 10 digits.";
        isValid = false;
      } else {
        form.querySelector('[name="contact"]').classList.remove('is-invalid');
        form.querySelector('[name="contact"]').nextElementSibling.innerHTML = "";
      }

      if (!cityRegex.test(city)) {
        form.querySelector('[name="city"]').classList.add('is-invalid');
        form.querySelector('[name="city"]').nextElementSibling.innerHTML = "Please enter a valid city name.";
        isValid = false;
      } else {
        form.querySelector('[name="city"]').classList.remove('is-invalid');
        form.querySelector('[name="city"]').nextElementSibling.innerHTML = "";
      }

      if (state === '') {
        form.querySelector('[name="state"]').classList.add('is-invalid');
        form.querySelector('[name="state"]').nextElementSibling.innerHTML = "Please enter a valid state name.";
        isValid = false;
      } else {
        form.querySelector('[name="state"]').classList.remove('is-invalid');
        form.querySelector('[name="state"]').nextElementSibling.innerHTML = "";
      }

      if (area === '') {
        form.querySelector('[name="area"]').classList.add('is-invalid');
        form.querySelector('[name="area"]').nextElementSibling.innerHTML = "Please enter a valid area name.";
        isValid = false;
      } else {
        form.querySelector('[name="area"]').classList.remove('is-invalid');
        form.querySelector('[name="area"]').nextElementSibling.innerHTML = "";
      }

      if (locationCode === '') {
        form.querySelector('[name="locationCode"]').classList.add('is-invalid');
        form.querySelector('[name="locationCode"]').nextElementSibling.innerHTML = "Please enter a valid location code.";
        isValid = false;
      } else {
        form.querySelector('[name="locationCode"]').classList.remove('is-invalid');
        form.querySelector('[name="locationCode"]').nextElementSibling.innerHTML = "";
      }

      if (!isValid) {
        event.preventDefault();
        event.stopPropagation();
        form.classList.add('was-validated');
      }
    });
  </script>
</body>
</html>
