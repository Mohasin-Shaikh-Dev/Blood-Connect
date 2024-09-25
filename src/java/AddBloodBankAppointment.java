import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/AddBloodBankAppointment"})
public class AddBloodBankAppointment extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out=response.getWriter();
        String jdbcURL = "jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull";
            String dbUser = "root";
            String dbPassword = "root";

            String bloodBankName = request.getParameter("bloodBank");
            String donorName = request.getParameter("name");
            String phone = request.getParameter("phone");
            String bloodType = request.getParameter("bloodType");
            int units = Integer.parseInt(request.getParameter("units"));
            String appointmentDate = request.getParameter("date");
            String appointmentTime = request.getParameter("time");

            Connection connection = null;
            PreparedStatement statement = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
                String query = "INSERT INTO BloodBankAppointments (bloodBankName, Donor_Name, phone, bloodType, units, appointmentDate, appointmentTime) VALUES (?, ?, ?, ?, ?, ?, ?)";
                statement = connection.prepareStatement(query);
                statement.setString(1, bloodBankName);
                statement.setString(2, donorName);
                statement.setString(3, phone);
                statement.setString(4, bloodType);
                statement.setInt(5, units);
                statement.setString(6, appointmentDate);
                statement.setString(7, appointmentTime);
                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    out.println("<html><head>");
                    out.println("<script src='https://cdn.jsdelivr.net/npm/sweetalert2@11'></script>");
                    out.println("</head><body>");
                    out.println("<script>");
                    out.println("Swal.fire({");
                    out.println("icon: 'success',");
                    out.println("title: 'Success!',");
                    out.println("text: 'Appointment added successfully.',");
                    out.println("confirmButtonColor: '#3085d6',");
                    out.println("confirmButtonText: 'OK'");
                    out.println("}).then(() => {");
                    out.println("window.location.href = 'bank.jsp';");
                    out.println("});");
                    out.println("</script>");
                    out.println("</body></html>");
                } 
                RequestDispatcher rd=request.getRequestDispatcher("bank.jsp");
                rd.include(request, response);
            } catch (ClassNotFoundException | SQLException e) {
                out.println(e.getMessage());
            }    
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
