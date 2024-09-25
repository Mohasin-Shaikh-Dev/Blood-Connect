import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(urlPatterns = {"/CampRegister"})
public class CampRegister extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String bloodGroup = request.getParameter("bloodGroup");
        String contact = request.getParameter("contact");
        String city = request.getParameter("address");
        String area = request.getParameter("area");
        HttpSession session = request.getSession();
        String campname = session.getAttribute("campname").toString();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull", "root", "root");
        String q = "INSERT INTO camp_register (first_name, last_name, blood_group, gender, contact, city, area, camp_name) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement p = con.prepareStatement(q);
        p.setString(1, firstName);
        p.setString(2, lastName);
        p.setString(3, bloodGroup);
        p.setString(4, request.getParameter("gender"));
        p.setString(5, contact);
        p.setString(6, city);
        p.setString(7, area);
        p.setString(8, campname);       
        int rowsInserted = p.executeUpdate();        
        if (rowsInserted > 0) {
            out.println("<html><head>");
            out.println("<script src='https://cdn.jsdelivr.net/npm/sweetalert2@11'></script>");
            out.println("</head><body>");
            out.println("<script>");
            out.println("Swal.fire({");
            out.println("icon: 'success',");
            out.println("title: 'Success!',");
            out.println("text: 'Register successfully.',");
            out.println("confirmButtonColor: '#3085d6',");
            out.println("confirmButtonText: 'OK'");
            out.println("}).then(() => {");
            out.println("window.location.href = 'camp.jsp';");
            out.println("});");
            out.println("</script>");
            out.println("</body></html>");
        }
        RequestDispatcher rd=request.getRequestDispatcher("campregister.jsp");
            rd.include(request, response);
    } catch (Exception e) {
        e.printStackTrace();
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
