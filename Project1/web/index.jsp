<%-- 
    Document   : index
    Created on : 18-Feb-2014, 18:12:15
    Author     : as11
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CMS Builder</title>
        <link href="stylesheet.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div id="wrapper">
         <center>
             <h1>Charity Management Website!</h1> 
             <!--<a href="login.jsp">Already a member: login here!</a>
              <a href="register.jsp">Not a member! Register here!</a>-->
             <form name="login" method="post" action="RegServlet" id="login">
                 <h2>Login here!</h2>
                <input type="hidden" name="pagename" value="login"/>
                <table>
                        <tr>
                                <td>Email</td>
                                <td><input type="text" name="txtEmail"/></td>
                        </tr>
                        <tr>
                                <td>Password</td>
                                <td><input type="password" name="txtPassword"/></td>
                        </tr>
                        <tr>
                                <td><button type="submit">Login</button></td>
                        </tr>
                </table>
             </form>
             
            <form name="registration" action="RegServlet" method="post" id="register">
                  <h2>Register here!</h2>
                <input type="hidden" name="pagename" value="register"/>
                <table cellpadding="5" cellspacing="5">
                    <tr>
                            <td>First Name</td>
                            <td><input type="text" name="txtFName"/></td>
                    </tr>
                    <tr>
                            <td>Last Name</td>
                            <td><input type="text" name="txtLName"/></td>
                    </tr>
                    <tr>
                            <td>Email</td>
                            <td><input type="text" name="txtEmail"></td>
                    </tr>
                    <tr>
                            <td>Password</td>
                            <td><input type="password" name="txtPassword"/></td>
                    </tr>
                    <tr>
                            <td><button type="submit">Submit</button></td>
                    </tr>
                </table>
             </form>
           </center>
        </div><!--closing wrapper div-->
    </body>
</html>