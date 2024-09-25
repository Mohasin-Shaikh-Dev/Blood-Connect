<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <!-- Font Awesome CSS for icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">    
    <style>
    		.navbars {
              background-color: rgb(14, 134, 128);
            padding: 10px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            
        }

        .navbar-brands img {
            max-height: 50px;
        }

        .navbar-navs {
            display: block;
            list-style-type: none;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
        }

        .nav-items {
            margin-left: 15px;
            
          
        }

        .nav-links {          
            color: rgb(255, 255, 255);
            font-weight: bold;
            text-decoration: none;
        }

        .nav-links:hover {
            text-decoration: underline;
            color:rgb(151, 9, 9);
            
        }
        
       .nav-items .btn{
         background-color: red;
         color:white;
       }
    </style>
</head>
<body>
   <div class="con">
         <nav class="navbars">
        <!-- Logo -->
        <a class="navbar-brands" href="#">
            <img src="image/logo1.jpg" alt="BloodConnect">
        </a>
      
        <!-- Navbar links -->
        <ul class="navbar-navs">
            <li class="nav-items">
                <a class="nav-links" href="homepage.jsp">Home</a>
            </li>
            <li class="nav-items">
                <a class="nav-links" href="aboutus.html">About Us</a>
            </li>
            <li class="nav-items">
                <a class="nav-links" href="services.jsp">Services</a>
            </li>
            <li class="nav-items">
               <button  class="btn" onclick="logout_Alert()">LogOut</button>
            </li>
        </ul>
    </nav>
   </div>   
   <script>
      function logout_Alert()
      {
    	  Swal.fire({
    		  title: "Are you sure?",
    		  text: "Are You Sure!",
    		  icon: "warning",
    		  showCancelButton: true,
    		  confirmButtonColor: "#3085d6",
    		  cancelButtonColor: "#d33",
    		  confirmButtonText: "Log Out!"
    		}).then((result) => {
    		  if (result.isConfirmed) {
    			  window.location.href = "logout.jsp";
    		  }
    		});
      }
   </script>
</body>
</html>
