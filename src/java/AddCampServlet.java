
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
@WebServlet(urlPatterns = {"/AddCampServlet"})
public class AddCampServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String campName = request.getParameter("campName");
        String contact = request.getParameter("contact");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String campDate = request.getParameter("campDate");
        String campStartTime = request.getParameter("campStartTime");
        String campEndTime = request.getParameter("campEndTime");
        String locationCode = request.getParameter("locationCode");

        String campTime = campStartTime + " - " + campEndTime;

        String jdbcURL = "jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull";
        String dbUser = "root";
        String dbPassword = "root";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            String sql = "INSERT INTO CampDetails (camp_name, contact, address, city, camp_date, camp_time, locationCode) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, campName);
            statement.setString(2, contact);
            statement.setString(3, address);
            statement.setString(4, city);
            statement.setString(5, campDate);
            statement.setString(6, campTime);
            statement.setString(7, locationCode);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                out.println("<html><head>");
                out.println("<script src='https://cdn.jsdelivr.net/npm/sweetalert2@11'></script>");
                out.println("</head><body>");
                out.println("<script>");
                out.println("Swal.fire({");
                out.println("icon: 'success',");
                out.println("title: 'Success!',");
                out.println("text: 'Camp Added successfully.',");
                out.println("confirmButtonColor: '#3085d6',");
                out.println("confirmButtonText: 'OK'");
                out.println("}).then(() => {");
                out.println("window.location.href = 'admin.jsp';"); // Redirect to another page
                out.println("});");
                out.println("</script>");
                out.println("</body></html>");
            }
             RequestDispatcher rd=request.getRequestDispatcher("addcamp.jsp");
            rd.include(request, response);
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
          }
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
