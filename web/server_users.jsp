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
        
        <link href="https://fonts.googleapis.com/css2?family=Monoton&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Chelsea+Market&display=swap" rel="stylesheet">
        
        <title>Users</title>
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
                        <a href="serverhome.html">Server Home</a>
                    </li> 
                    <li>
                        <a href="server_users.html">Users</a>
                    </li> 
                    <li>
                        <a href="server_file.html">File</a>
                    </li> 
                    <li>
                        <a href="duser.html">Logout</a>   
                    </li>
                </ul> 
            </div>
        </div> 
    </div>
    <div class="container" style="margin-top: 75px;">
       <center>
           <span class="page-headers">USERS&nbsp;&nbsp;&nbsp;VIEW</span>
        </center>
    </div>
        <% 
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/diplo","root","");
            Statement st = con.createStatement();
            ResultSet rt = st.executeQuery("select * from register");
        %>
        <div style="padding-top: 2%; padding-right: 8%; padding-left: 8%; ">
            <form action="" method="get">
            <table class="table table-striped" style="background-color: #D8BFD8;" >
                <thead>
                        <tr>
                          <th>Name</th>
                          <th>Username</th>
                          <th>Phone No.</th>
                          <th>Email</th>
                        </tr>
                        </thead>
                <%
                    while(rt.next()){
                        String name = rt.getString("name");
                        String uname = rt.getString("username");
                        String phone = rt.getString("phone");
                        String email = rt.getString("email");
                %>
                <tbody>
                    <tr>
                        <td><%=name %></td>
                        <td><%=uname %></td>
                        <td><%=phone %></td>
                        <td><%=email %></td>                                
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
