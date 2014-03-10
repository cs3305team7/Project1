<%-- 
    Document   : welcome
    Created on : 08-Mar-2014, 11:43:21
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
        <h1>Charity Management Website!</h1>
        <form id="themeSelection" action="themeOne/index.jsp">
        Theme One <br>
        <img src="themeOne.png" alt="Charity Case" title=""  />
        <input id="themebtn" type="submit" value="Select Theme">
        </form>
        <form id="themeSelection" action="themeTwo/index.jsp">
        Theme Two<br>
        <img src="themeTwo.png" alt="Charity Case" title=""  />
        <input id="themebtn" type="submit" value="Select Theme">
        </form>
        <form id="themeSelection" action="themeThree/index.jsp">
        Theme Three<br>
        <img src="themeThree.png" alt="Charity Case" title=""  />
        <input id="themebtn" type="submit" value="Select Theme">
        
        </form>
       <a href="#wrapper" class="btn">Back to Top</a>
        <a href="#" class="btn" onclick="history.go(-1)">Go Back</a>
       <footer>&copy Team 7.</footer>
        </div><!--closing wrapper div-->
    </body>
</html>

