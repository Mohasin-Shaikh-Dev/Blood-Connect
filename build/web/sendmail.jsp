<%@ page import="java.sql.*" %>
<%@ page import="java.util.Properties" %>
<%@ page import="javax.mail.*" %>
<%@ page import="javax.mail.internet.*" %>

<%
String recipientEmail = request.getParameter("email");

Properties props = new Properties();
props.put("mail.smtp.host", "your_smtp_host");
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.port", "your_smtp_port");

Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("your_email@example.com", "your_password");
    }
});

try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank", "root", "root");

    String q = "SELECT firstName, lastName, mobileNumber, bloodGroup, city FROM donors WHERE email_Id=?";
    PreparedStatement p = con.prepareStatement(q);
    p.setString(1, recipientEmail);
    ResultSet rs = p.executeQuery();

    String emailContent = "";

    while (rs.next()) {
        String firstName = rs.getString("firstName");
        String lastName = rs.getString("lastName");
        String mobileNumber = rs.getString("mobileNumber");
        String bloodGroup = rs.getString("bloodGroup");
        String city = rs.getString("city");

        emailContent += "Name: " + firstName + " " + lastName + "\n";
        emailContent += "Mobile Number: " + mobileNumber + "\n";
        emailContent += "Blood Group: " + bloodGroup + "\n";
        emailContent += "City: " + city + "\n\n";
    }

    MimeMessage message = new MimeMessage(session);
    message.setFrom(new InternetAddress("your_email@example.com"));
    message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
    message.setSubject("Blood Donor Needed");
    message.setText(emailContent);

    Transport.send(message);

    response.sendRedirect("confirmation.jsp");

    con.close();
} catch (Exception e) {
    out.println("Error: " + e.getMessage());
}
%>
