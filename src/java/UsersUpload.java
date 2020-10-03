import java.io.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
import com.oreilly.servlet.MultipartRequest;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;

@WebServlet("/uploadServlet")
@MultipartConfig(maxFileSize = 65535)

public class UsersUpload extends HttpServlet {  
  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  

        /* MultipartRequest m=new MultipartRequest(request,"D:/");  
        out.print("successfully uploaded"); */
        
        InputStream inputStream = null;
        Part filePart = request.getPart("uploadedFile");
        String fname = null;
        String fsize = null;
        
        
        if (filePart != null) {
            // prints out some information for debugging
            
            //fname = new File(filePart.getName()).getName();
            fname = filePart.getName();
            fsize = filePart.getSize() + " bytes";
            
             
            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
            "jdbc:mysql://localhost/diplo","root","");

            PreparedStatement ps=con.prepareStatement(
            "insert into files(filename, content, owner_name, size, file_key) values(?,?,?,?,?)");

            ps.setString(1,fname);
            if(inputStream != null)
                ps.setBlob(2,inputStream);            
            ps.setString(3,"XYZ");
            ps.setString(4,fsize);
            ps.setString(5,"PQR");

            int i=ps.executeUpdate();
            if(i>0){
              response.sendRedirect("users_upload.html");
            }
            con.close();
        }catch (Exception e) {
            out.write(e.toString());
        }

        out.close();
    }  
}  