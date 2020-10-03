import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class UserLogin extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("uname");
        String password = request.getParameter("password");

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
            "jdbc:mysql://localhost/diplo","root","");
            
            PreparedStatement ps=con.prepareStatement("select * from register where username='"+username+"' and password='"+password+"'");
            
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){
                response.sendRedirect("userhome.html");
            }else{
                response.sendRedirect("duser.html");
            }
            
        }catch (Exception e) {
            out.write(e.toString());
        }

        out.close();
    }

}