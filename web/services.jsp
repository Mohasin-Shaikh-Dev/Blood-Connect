<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Services</title>
    <!-- Bootstrap CSS -->
    <link href="https://fonts.googleapis.com/css2?family=Honk&family=Oswald:wght@200&family=Pacifico&display=swap" rel="stylesheet">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <style>     
        .service-header{
            text-align: center;
            margin-top: 30px;
            margin-bottom: 30px;
            color: rgb(10, 8, 8);
           font-family: 'Permanent Marker', cursive; 
           font-family: 'Honk', system-ui;
           font-size: 55px;
        }
                  
        .service-box {
           color: rgb(10, 1, 1);
            padding: 10px;        
            height: 100%; /* Ensure each box takes up full height */
            background-color: white;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.9);
       
        }

        .row .service-box {
           border-bottom-right-radius: 30px;
        }
        .service-box:hover{
            background-color: rgb(247, 230, 230);
        }

        .service-box h3 {
            margin-bottom: 20px;
            font-family: 'Permanent Marker', cursive;
            color: rgb(189, 76, 23);
            font-weight: bold;          
        }
        .service-box p {
            margin-bottom: 20px;
            font-family: 'Dancing Script', cursive;

        }
        .btn-custom {
            margin-top: auto; /* Align button to the bottom */
            padding: 10px 20px;
            background-color: lightgreen;
            color: black;
            border: none;
            font-family: 'Shadows Into Light', cursive;
            font-weight: bold;           
        }
                     
    </style>
</head>
<jsp:include page="navbar.jsp"></jsp:include>  
<body style="background-color: gray;"> 
   <div class="container-fluid">
   		<div class="container">   	   
        <h1 class="service-header">Services</h1>       
        <div class="row">
            <div class="col-md-3">
                <div class="d-flex flex-column h-100">
                    <div class="service-box flex-fill">
                        <h3>Donor Registration</h3>
                        <p>Register as a blood donor and save lives. Your registration helps us build a database of donors who can be contacted in times of need. Your willingness to donate blood can make a significant difference in someone's life. Donating blood is a noble act that can impact lives positively.</p>
                        <a href="registerdonor.jsp" class="btn btn-primary btn-custom">Register Now</a>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="d-flex flex-column h-100">
                    <div class="service-box flex-fill">
                        <h3>Search for Donor</h3>
                        <p>Find blood donors in your area or specific blood type. Our search feature allows you to quickly locate potential donors based on their location, blood group, and availability. You can also filter the search results to find the most relevant matches. Searching for donors has never been easier!</p>
                        <a href="searchdonor.jsp" class="btn btn-primary btn-custom">Search Now</a>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="d-flex flex-column h-100">
                    <div class="service-box flex-fill">
                        <h3>Blood Donation Camp</h3>
                        <p> Our camps are organized regularly in collaboration with various organizations and institutions. Donating blood at these camps not only helps save lives but also raises awareness about the importance of blood donation.Join us in making a difference</p>
                        <a href="camp.jsp" class="btn btn-primary btn-custom">Join Camp</a>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="d-flex flex-column h-100">
                    <div class="service-box flex-fill">
                        <h3>Blood Bank</h3>
                        <p>Access our blood bank for urgent blood requirements. Our blood bank maintains a stock of different blood types and ensures timely availability for patients in need. We follow strict protocols to ensure the safety and quality of donated blood. Your support in utilizing our blood bank helps us serve the community better.</p>
                        <a href="bank.jsp" class="btn btn-primary btn-custom">View Blood Bank</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
   </div>  	  
    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
