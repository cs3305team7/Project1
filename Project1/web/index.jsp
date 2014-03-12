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
            <header>
                <h1>Charity Management Website!</h1>
                <nav>
                    <ul>
                    <li>
                    <a id=\"current\" href=\"index.php\">Home</a>
                    </li>
                    <li>
                    <a href=\"about.php\">About</a>
                    </li>
                    <li>
                    <a href=\"news.php\">Add Page</a>
                    </li>
                    <li>
                    <a href=\"#\">Link</a>
                    </li>
                    </ul>
                </nav>
            </header>
         <center>
             <section id="leftColumn">
                 <h3>Contact Us</h3>
                 <p>We are located in Cork</p>
                 <p>We are located in Cork</p>
                 <p>We are located in Cork</p>
                 <p>We are located in Cork</p>
             </section>
             <section id="rightColumn">
                <h3>Twitter Feed</h3>
                <p>We are located in Cork</p> 
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
                            <td><button type="submit">Register</button></td>
                    </tr>
                </table>
             </form>
             </section>
             <div id="main">
             <!--<a href="login.jsp">Already a member: login here!</a>
              <a href="register.jsp">Not a member! Register here!</a>-->
             <p>Welcome to our website!</p>
             </div>
           <footer>&copy Team 7.</footer>
        </div><!--closing wrapper div-->
    </body>
</html>