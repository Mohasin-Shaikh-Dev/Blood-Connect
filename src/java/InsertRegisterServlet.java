import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/InsertRegisters")
@MultipartConfig(maxFileSize = 16 * 1024 * 1024)
public class InsertRegisterServlet extends HttpServlet {
   static {
        try {
            // Load the MySQL JDBC driver class
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "root";
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String mobileNumber = request.getParameter("mobilenumber");
        String email = request.getParameter("email");
        String bloodGroup = request.getParameter("bloodgroup");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        String city = request.getParameter("city");
        String pincode = request.getParameter("pincode");
        String area = request.getParameter("area");

        InputStream inputStream = null;
        Part filePart = request.getPart("image");
        if (filePart != null) {
            inputStream = filePart.getInputStream();
        }

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD)) {
            String sql = "INSERT INTO donors (firstName, lastName, mobileNumber, email_Id, bloodGroup, gender, Date_Of_Birth, city, PinCode, Area, image) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, mobileNumber);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, bloodGroup);
            preparedStatement.setString(6, gender);
            preparedStatement.setString(7, dob);
            preparedStatement.setString(8, city);
            preparedStatement.setString(9, pincode);
            preparedStatement.setString(10, area);
            if (inputStream != null) {
                preparedStatement.setBlob(11, inputStream);
            }

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                  out.print("<html>");
                  out.print("<head>");
                   out.print("<script src='https://cdn.jsdelivr.net/npm/sweetalert2@11'></script>");
                   out.print("</head>");
                   out.print("<body>");
                   out.print("<script>");
                   out.print("Swal.fire({");
                   out.print("  title: 'Good Job!',");
                   out.print("  text: 'welcome to the world of Donors',");
                   out.print("  icon: 'success',");
                   out.print("  confirmButtonText: 'OK'");
                   out.print("}).then(() => {");
                   out.print("  window.location.href = 'homepage.jsp';"); // Redirect to the home page
                   out.print("});");
                   out.print("</script>");
                   out.print("</body>");
                   out.print("</html>");
            } else {
               
            }
            RequestDispatcher rd=request.getRequestDispatcher("registerdonor.jsp");
            rd.include(request, response);
        } catch (SQLException ex) {
            ex.printStackTrace(); // Handle any SQL errors
            // Redirect to an error page
        }
    }
}
