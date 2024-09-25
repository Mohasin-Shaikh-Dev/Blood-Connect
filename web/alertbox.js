/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function loginalert()
{
   Swal.fire({
        icon: "error",
        title: "Oops...",
        text: "Invalid MobileNumber or Password !",
    }).then((result) => {
        if (result.isConfirmed) {
            // Redirect to a different page
            window.location.href = "login.html"; // Change "differentPage.jsp" to your desired page
        }
    });
}

function forgotalert() {
  Swal.fire({
       title:"User Not found",
  }).then((result)=>{
      if(result.isConfirmed)
      {
           window.location.href = "forgotpass.html";
      }
  });
}

function updatepassalert() {
    Swal.fire({
        icon: "success",
        title: "Password Updated!",
        text: "Your password has been successfully updated.",
    }).then((result) => {
        if (result.isConfirmed) {
            window.location.href = "login.html"; // Redirect to login page
        }
    });
}

function notdonor()
   {
	   Swal.fire({
		   title: "The Internet?",
		   text: "That thing is still around?",
		   icon: "question"
		 });
   }
	




