<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<script src="validation.js"></script>
  <meta charset="UTF-8">
  <title>Blood Donor Search</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <link rel="stylesheet" href="searchdonor.css">
  <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
</head>
<body>
<div class="container">
  <h1>Blood Donor Search</h1>
  <form action="displaydonors.jsp" onsubmit="return searchdonorvalidate()" >
    <div class="form-group">
      <label for="bloodGroup">Blood Group</label>
      <select class="form-control" id="bloodGroup" name="bloodGroup" required>
          <option value="">Select Blood group</option>
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
      <label for="city">City</label>
      <input type="text" class="form-control" id="city" name="city" required>
      <span id="cityvalid" style="color: red; font-weight: lighter; font-style: oblique;"></span>
    </div>
    <div class="form-group">
      <label for="pincode">Pincode</label>
      <input type="text" class="form-control" id="pincode" name="pincode" required>
      <span id="pincodevalid" style="color: red; font-weight: lighter; font-style: oblique;"></span>
    </div>
    <button type="submit" class="btn btn-primary">Search</button>
  </form>
</div>
</body>
</html>
