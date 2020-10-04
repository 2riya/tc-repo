<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
        
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        
        <link href="https://fonts.googleapis.com/css2?family=Monoton&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Chelsea+Market&display=swap" rel="stylesheet">
        
        <title>FILE CLUSTER | ADMIN</title>
    </head>
    <body>
            <div class="navbar navbar-inverse navbar-fixed-top"> 
        <div class="container"> 
            <div class="navbar-header"> 
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                    <span class="icon-bar"></span> 
                    <span class="icon-bar"></span> 
                    <span class="icon-bar"></span> 
                    <span class="icon-bar"></span> 
            </div>
            <div class="collapse navbar-collapse" id="myNavbar"> 
               <a class="navbar-brand" href="#" style="color: #fff; font-size:22px; text-shadow: 2px 2px 5px #05c0e1;">Dynamic Data Sharing using Cryptanalysis</a>
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a href="adminhome.html">Admin Home</a>
                    </li> 
                    <li>
                        <a href="admin_filecluster.html">File Cluster</a>
                    </li>
                    
                     <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                          Admin <i class="material-icons" style="font-size:15px">arrow_drop_down</i>
                        </a>
                        
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                          <a class="dropdown-item" href="admin_master.html">Master</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="admin_worker.html">Worker</a>
                          </div>
                      </li>
                    <li>
                        <a href="#">Logout</a>   
                    </li>
                </ul> 
            </div>
        </div> 
    </div>
    <div class="container" style="margin-top: 75px;">
       <center>
       <span class="page-headers">FILE CLUSTER</span>
        </center>
    </div>
        <% 
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/diplo","root","");
            Statement st = con.createStatement();
            ResultSet rt = st.executeQuery("select * from files order by upload_time desc");
        %>
        <div style="padding-top: 2%; padding-right: 8%; padding-left: 8%; ">
            <form action="" method="get">
            <table class="table table-striped" style="background-color: #D8BFD8;" >
                <thead>
                        <tr>
                          <th>File Name</th>
                          <th>Owner Name</th>
                          <th>Upload Time</th>
                          <th>Cluster</th>
                        </tr>
                        </thead>
                <%
                    while(rt.next()){
                        String fname = rt.getString("filename");
                        String oname = rt.getString("owner_name");
                        String utime = rt.getString("upload_time");
                %>
                <tbody>
                    <tr>
                        <td><%=fname %></td>
                        <td><%=oname %></td>
                        <td><%=utime %></td>
                        <td><a href="#">Cluster File</a></td>                                
                    </tr>
                </tbody>
                <% }} catch (Exception e){
            out.println(e);
        } %>
            </table>
            </form>
        </div>
    </body>
</html>
