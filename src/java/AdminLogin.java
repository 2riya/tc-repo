import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AdminLogin extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String aid = request.getParameter("aid");
        String password = request.getParameter("password");

        if(aid.equals("diplo") && password.equals("diplo")){
            response.sendRedirect("adminhome.html");
        }else{
            response.sendRedirect("admin.html");
        }
        
        out.close();
    }

}