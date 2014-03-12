<%-- 
    Document   : template
    Created on : 25-Feb-2014, 20:34:22
    Author     : Thomas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <% 
        Page p = new Page("","");
       // out.print(p.createPage());
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CMS TEMPLATE1</title>
        <link rel="stylesheet" href=<%out.print(p.getStyles());%> <!--href="../../stylesheets/stylesheetTwo.css"--> />
	</head>
	<body>
                
	  <div id="wrapper">
	   <div id="edit2" contenteditable="true">
		<header id="HEADER">
			<% out.print(p.Get("HEADER"));%>
		</header>
		</div> <!--end of header div-->

                    <nav id="EDITABLENAV">
                        <% out.print(p.Get("EDITABLENAV"));%>
                    </nav>

                    <aside id="PICS">
                        <% out.print(p.Get("PICS"));%>
                    </aside>

		    <div id = "MAIN">
                    	<div id="CONTENT">
                        	<% out.print(p.Get("CONTENT"));%>
                    	</div>
                    	<div id="CONTENT2">
                        	<% out.print(p.Get("CONTENT"));%>
                    	</div>
                    </div>
                    <footer id="FOOTER">
                    	<% out.print(p.Get("FOOTER"));%>
		    </footer>
		</div> <!--end of wrapper-->

	</body>
</html>
