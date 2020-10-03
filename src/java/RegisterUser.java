import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class RegisterUser extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name=request.getParameter("name");
        String username=request.getParameter("uname");
        String pass=request.getParameter("password");
        String email=request.getParameter("email");
        String number=request.getParameter("contact");

        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(
        "jdbc:mysql://localhost/diplo","root","");

        PreparedStatement ps=con.prepareStatement(
        "insert into register(name, username, password, email, phone) values(?,?,?,?,?)");

        ps.setString(1,name);
        ps.setString(2,username);
        ps.setString(3,pass);
        ps.setString(4,email);
        ps.setString(5,number);

        int i=ps.executeUpdate();
        if(i>0){
          response.sendRedirect("reg.html");
        }

        }catch (Exception e) {
            out.write(e.toString());
        }

        out.close();
    }

}