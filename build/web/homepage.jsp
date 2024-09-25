<%@page import="java.security.PublicKey"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"> 
    <link href="https://fonts.googleapis.com/css2?family=Honk&family=Oswald:wght@200&family=Pacifico&display=swap" rel="stylesheet">   
    <link rel="stylesheet" href="homepage.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:include page="navbar.jsp"></jsp:include>
<body>    
	 <!--slider -->     
       <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
        <div class="carousel-inner">
        <div class="carousel-item active">
            <img src="backgoround.jpg" class="d-block w-100" alt="..." style="height: 400px;">
        </div>
        <div class="carousel-item">
            <img src="march.jpg" class="d-block w-100" alt="..." style="height: 400px;">
        </div>
        <div class="carousel-item">
            <img src="hand.jpg" class="d-block w-100" alt="..." style="height: 400px;">
        </div>
    </div>
    <!-- Controls -->
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
    </button>
</div>          
<!--Boxes -->
      <div class="boxes">
        <div class="countingbox">
          <div class="flex-container">
              <div class="flex-box" style="background-color: rgb(3, 16, 61);">      
                  <p>23000</p>
                  <p>Approved Camps</p>
              </div>
       
              <div class="flex-box" style="background-color: rgb(1, 31, 1);">
                <p>40322</p>
                  <p>Blood Units Collected</p>
              </div>
          </div>
            
          <div class="flex-container">
              <div class="flex-box" style="background-color: rgb(31, 1, 28);">
                 <p><%=countdonors()%></p>
                  <p>Total Donors</p>
              </div>
       
              <div class="flex-box" style="background-color: rgb(61, 4, 58);">
                  <p><%=countricipient() %></p>
                  <p>Total recipient</p>
              </div>
          </div>
      </div>
     
      <div class="linkboxes">
        <div class="flex-container">
          <div class="flex-box1" style="background-color: rgb(158, 12, 12);">                      
              <p> <a href="registerdonor.jsp">  <i class="fa fa-user-circle-o" aria-hidden="true"></i>  <br> Donor <br>Register</a> </p>
          </div>
   
          <div class="flex-box1" style="background-color: rgb(216, 33, 9);">
            <p> <a href="searchdonor.jsp"> <i class="fa fa-tint"> </i> <br>Blood Availability Search</a> </p>
          </div>
          <div class="flex-box1" style="background-color: rgb(2, 30, 43);">      
            <p> <a href="camp.jsp">  <i class="fa fa-clock-o" aria-hidden="true"></i> <br>Blood Donation Camps</a> </p>
        </div>
 
        <div class="flex-box1" style="background-color: rgb(2, 37, 26);">       
          <p> <a href="bank.jsp">  <i class="fa fa-university" aria-hidden="true"></i> <br>Blood <br>Bank</a> </p>
        </div>
      </div>
    </div>   
   </div>  
    <!-- blood group information-->
    <div class="info">
      <div class="container">
        <h2 style="text-align: center; color: rgb(194, 11, 11); ;">BLOOD GROUP INFORMATION</h2>
        <table class="table table-striped">
          <thead>
            <tr>
              <th>Blood Group</th>
              <th>Can Donate To</th>
              <th>Can Receive From</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td id="bg">A+</td>
              <td>A+, AB+</td>
              <td>A+, A-, O+, O-</td>
            </tr>
            <tr>
              <td id="bg">A-</td>
              <td>A+, A-, AB+, AB-</td>
              <td>A-, O-</td>
            </tr>
            <tr>
              <td id="bg">B+</td>
              <td>B+, AB+</td>
              <td>B+, B-, O+, O-</td>
            </tr>
            <tr>
              <td id="bg">B-</td>
              <td>B+, B-, AB+, AB-</td>
              <td>B-, O-</td>
            </tr>
            <tr>
              <td id="bg">AB+</td>
              <td>AB+</td>
              <td>All Blood Groups</td>
            </tr>
            <tr>
              <td id="bg">AB-</td>
              <td>AB+, AB-</td>
              <td>A-, B-, AB-, O-</td>
            </tr>
            <tr>
              <td id="bg">O+</td>
              <td>All Blood Groups</td>
              <td>O+, O-</td>
            </tr>
            <tr>
              <td id="bg">O-</td>
              <td>All Blood Groups</td>
              <td>O-</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>

   <!--team members--> 
   <div class="teammember">
    <h1 style="text-align: center;">Team Members</h1>
    <div class="member">
      <div class="card">
        <img src="member1.jpg" alt="Profile Picture 1" class="card-img-top">
        <div class="card-body">
            <h5 class="card-title">Suban Sayyad</h5>
            <p class="card-text">Post: Blood Drive Coordinator</p>
            <p class="card-post-info">Responsible for organizing and overseeing blood donation drives and events.</p>
        </div>
    </div>
    
    <div class="card">
        <img src="member2.jpg" alt="Profile Picture 2" class="card-img-top">
        <div class="card-body">
            <h5 class="card-title">Dipali Shah</h5>
            <p class="card-text">Post: Volunteer Coordinator</p>
            <p class="card-post-info">Manages volunteers, assigns tasks, and ensures smooth operation during blood donation events.</p>
        </div>
    </div>
    
    <div class="card">
        <img src="member3.jpg" alt="Profile Picture 3" class="card-img-top">
        <div class="card-body">
            <h5 class="card-title">Pavan Badole</h5>
            <p class="card-text">Post: Community Relations Manager</p>
            <p class="card-post-info">Builds relationships with community partners, organizes community events, and fosters collaboration.</p>
        </div>
    </div>
    </div>
   </div> 
   
          
    <!-- jsp code -->  
   <%!   
	 public static String username()
	 {
	    String username="guest";
	   try
	   {		  
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","root","root@123");
		   String q="select Username from users where Mobilenumber=?";
		   PreparedStatement p=con.prepareStatement(q);
		   p.setString(1,"8766767796");
		   ResultSet r=p.executeQuery();
		   while(r.next())
		   {
			 
			 username=r.getString(1);
		   }    		   
		   
	   }catch(Exception e)
	   {
		  return e.getMessage();
	   }
	  return username;
	 }

   
   
   public static int countdonors()
	 {
	   int  donorscount=0;
	    try
	    {
	    	Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull","root","root");
          String q="select count(*) from donors";
          PreparedStatement p=con.prepareStatement(q);
          ResultSet r=p.executeQuery();
          while(r.next())
          {
          	donorscount=r.getInt(1);
          }
          
	    }catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    return donorscount;
	 }
   
   public static int countricipient()
	 {
	   int  ricipient=0;
	    try
	    {
	    	Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull","root","root");
        String q="select count(distinct Mobilenumber) from recipient";
        PreparedStatement p=con.prepareStatement(q);
        ResultSet r=p.executeQuery();
        while(r.next())
        {
        	ricipient=r.getInt(1);
        }
        
	    }catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    return ricipient;
	 }
   %>       
</body>
 <jsp:include page="footer.html"></jsp:include> 
</html>