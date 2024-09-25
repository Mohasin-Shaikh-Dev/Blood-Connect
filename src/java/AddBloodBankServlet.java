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
@WebServlet(urlPatterns = {"/AddBloodBankServlet"})
public class AddBloodBankServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String jdbcURL = "jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull";
        String dbUser = "root";
        String dbPassword = "root";

        String blood_bank_name = request.getParameter("blood_bank_name");
        String contact = request.getParameter("contact");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String area = request.getParameter("area");
        String locationCode = request.getParameter("locationCode");

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
            String query = "INSERT INTO Blood_Banks (blood_bank_name, contact, city, state, area, loactionCode) VALUES (?, ?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(query);
            statement.setString(1, blood_bank_name);
            statement.setString(2, contact);
            statement.setString(3, city);
            statement.setString(4, state);
            statement.setString(5, area);
            statement.setString(6, locationCode);
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
                out.println("window.location.href = 'admin.jsp';");
                out.println("});");
                out.println("</script>");
                out.println("</body></html>");
            } 
            RequestDispatcher rd=request.getRequestDispatcher("AddBloodBank.jsp");
            rd.include(request, response);
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            out.println(e.getMessage());
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
