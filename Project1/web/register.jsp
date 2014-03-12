<%-- 
    Document   : register
    Created on : 16-Feb-2014, 12:28:47
    Author     : as11
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <form name="registration" action="RegServlet" method="post">
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
                    <td>UserName</td>
                    <td><input type="text" name="txtUName"/></td>
            </tr>
            <tr>
                    <td>Charity Name</td>
                    <td><input type="text" name="txtCharityName"></td>
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
    </body>
</html>