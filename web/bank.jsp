<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Search Blood Bank</title>
  
  <!-- Bootstrap CSS -->
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">

  <style>
.container {
        display: flex;
        flex-direction: column;
        align-items: center;
        background-color: #f2f2f2; /* Set your desired background color */
        padding: 20px; /* Add padding for better appearance */
        border-radius: 10px; /* Add border radius for rounded corners */
    }
    .form-row {
        display: flex;
        align-items: center;
        justify-content: center;
        margin-bottom: 20px;
    }

    .form-group {
        margin-right: 10px;
    }

    input.form-control {
        width: 350px; /* Adjust as needed */
    }

    select.form-control {
        width: 350px; /* Adjust as needed to match the city input field */
    }

    button.btn-primary {
        width: 100%;
    }
    
    h2 {
        color: red;
    }
  </style>
  <jsp:include page="navbar.jsp"></jsp:include>
</head>
<body>
  <div class="container mt-5">
    <h2 class="text-center">Search Blood Bank</h2>
    <form>
      <div class="form-row">
        <div class="form-group">
          <label for="state">State</label>
          <select class="form-control" id="state" name="state">
              <option value="">Select State</option>
              <option value="Andhra Pradesh">Andhra Pradesh</option>
              <option value="Arunachal Pradesh">Arunachal Pradesh</option>
              <option value="Assam">Assam</option>
              <option value="Bihar">Bihar</option>
              <option value="Chhattisgarh">Chhattisgarh</option>
              <option value="Goa">Goa</option>
              <option value="Gujarat">Gujarat</option>
              <option value="Haryana">Haryana</option>
              <option value="Himachal Pradesh">Himachal Pradesh</option>
              <option value="Jharkhand">Jharkhand</option>
              <option value="Karnataka">Karnataka</option>
              <option value="Kerala">Kerala</option>
              <option value="Madhya Pradesh">Madhya Pradesh</option>
              <option value="Maharashtra">Maharashtra</option>
              <option value="Manipur">Manipur</option>
              <option value="Meghalaya">Meghalaya</option>
              <option value="Mizoram">Mizoram</option>
              <option value="Nagaland">Nagaland</option>
              <option value="Odisha">Odisha</option>
              <option value="Punjab">Punjab</option>
              <option value="Rajasthan">Rajasthan</option>
              <option value="Sikkim">Sikkim</option>
              <option value="Tamil Nadu">Tamil Nadu</option>
              <option value="Telangana">Telangana</option>
              <option value="Tripura">Tripura</option>
              <option value="Uttar Pradesh">Uttar Pradesh</option>
              <option value="Uttarakhand">Uttarakhand</option>
              <option value="West Bengal">West Bengal</option>
          </select>
        </div>
        <div class="form-group">
          <label for="city">City</label>
          <input type="text" class="form-control" id="city" name="city" placeholder="Enter city">
        </div>
      </div>
      <div class="form-row">
        <div class="form-group col-md-12">
          <button type="submit" class="btn btn-primary">Search</button>
        </div>
      </div>
    </form>
    <!-- table create -->    
   
    <table class="table text-center">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">Blood Bank Name</th>
                    <th scope="col">Contact</th>
                    <th scope="col">Address</th>
                    <th scope="col" colspan="2">Action</th>
                </tr>
            </thead>
            <tbody>
              
              <%
                  String state=request.getParameter("state");
        		  String city=request.getParameter("city");
        		  try{
        	        Class.forName("com.mysql.jdbc.Driver");
            		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull","root","root");
            		  String q="select * from  Blood_Banks where city=? AND state=?";
            		  PreparedStatement p=con.prepareStatement(q);
            		  p.setString(1,city);
            		  p.setString(2,state);
            		  ResultSet r=p.executeQuery();
            		  while(r.next())
            		  {
            			  %>
            			      <tr>
                                <td><%=r.getString(2)%></td>
                                <td><%=r.getString(3) %></td>
                                <td><%=r.getString(6)%></td>
                                <td>
                                    <form action="Bank_Appoinment.jsp" method="post">
                                      <input type="hidden" name="bankname" value="<%= r.getString(2)%>">                                       
                                       <button type="submit" class="btn btn-success">Appointment</button>
                                     </form>
                                  </td>	 
                                   <td>
                                    <form action="bankLoaction.jsp" method="post">
                                      <input type="hidden" name="bankId" value="<%= r.getString(1)%>">                                       
                                         <button type="submit" class="btn btn-danger btn-sm">Location</button>
                                     </form>                                                               
                                 </td>                                                                                                 
                             </tr>
            			  <% 
            		  }
        		  }catch(Exception e){
        			  e.printStackTrace();
        		  }
              %>                          
            </tbody>
        </table>
  </div>

  <!-- Bootstrap JS (optional, for certain components) -->
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
