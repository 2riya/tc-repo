import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ServerLogin extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String sid = request.getParameter("sid");
        String password = request.getParameter("password");

        if(sid.equals("diplo-server") && password.equals("server")){
            response.sendRedirect("serverhome.html");
        }else{
            response.sendRedirect("serv.html");
        }
        
        out.close();
    }

}