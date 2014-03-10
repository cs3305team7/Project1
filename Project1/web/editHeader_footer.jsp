<%-- 
    Document   : header_footer
    Created on : 08-Mar-2014, 17:57:58
    Author     : as11
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <% /*
        Page p = new Page("","");
        out.print(p.createPage());
    */%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CMS TEMPLATE1</title>
		
        <link rel="stylesheet" type="text/css" href="stylesheets/stylesheetTem2.css" id="stylesheet">
		<!--href="../../stylesheets/stylesheetOne.css"--> 
		<script type="text/javascript">
		function submitForm() {
                    $.ajax({type:'POST', url: 'submit.php', data:$('#form2').serialize(), success: function(response) {
                        $('#form2').find('.form_result').html(response);
                    }});
		</script>
	</head>
	<body>
             <form id="form2">   
            <div id="wrapper">
                 <a href="editHeader_footer.jsp" class="btn">Step 1</a>
                <a href="editTemplate.jsp" class="btn">Step 2</a>
                <a href="themeSelection.jsp" class="btn">Step 3</a>		
                <div>
		
                    <header id="HEADER">
                        <h2>Header Content</h2>
                              <div id="toolbar2" style="display: none;">
                               <a data-wysihtml5-action="change_view">html view</a> <br> <br>
                                    <a data-wysihtml5-command="bold" title="CTRL+B">bold</a> |
                                    <a data-wysihtml5-command="italic" title="CTRL+I">italic</a>|
                                    <a data-wysihtml5-command="formatBlock" data-wysihtml5-command-value="h1">h1</a> |
                                    <a data-wysihtml5-command="formatBlock" data-wysihtml5-command-value="h2">h2</a> 
                              </div>
                              <textarea id="textarea2" placeholder="Enter text ..."><%/* out.print(p.Get("HEADER"));*/%></textarea>
                              <br><input type="reset" value="Reset form!">


                            <div id="log2"></div>
                    <script src="js/simple.js"></script>
                    <script src="js/wysihtml5-0.4.0pre.js"></script>
                    </header>
		
		
                    <footer id="FOOTER">
                        <h2>Footer Content</h2>
                            <div id="toolbar4" style="display: none;">
                            <a data-wysihtml5-action="change_view">html view</a> <br> <br>
                            <a data-wysihtml5-command="bold" title="CTRL+B">bold</a> |
                            <a data-wysihtml5-command="italic" title="CTRL+I">italic</a>
                            </div>
                            <textarea id="textarea4" placeholder="Enter text ..."><%/* out.print(p.Get("FOOTER"));*/%></textarea>
                            <br><input type="reset" value="Reset form!">
                            <div id="log4"></div>
                            <input class="buttons" id="Submit2" type="submit" value="Submit!">
                    </footer>
                            <a href="#wrapper" class="btn">Back to Top</a>
                             <a href="#" class="btn" onclick="history.go(-1)">Go Back</a>
                    </div>	
               
                            
					<script>
							
							  
							  	 var editor2 = new wysihtml5.Editor("textarea2", {
								toolbar:        "toolbar2",
								stylesheets:    "stylesheet.css",
								parserRules:    wysihtml5ParserRules
							  });
							  
							
							  
							    var editor4 = new wysihtml5.Editor("textarea4", {
								toolbar:        "toolbar4",
								stylesheets:    "stylesheet.css",
								parserRules:    wysihtml5ParserRules
							  });
							  
							  var log2 = document.getElementById("log2");
							  var log4 = document.getElementById("log4");
							  
							  
								editor2
								.on("load", function() {
								  log2.innerHTML += "";
								})
								.on("focus", function() {
								  log2.innerHTML += "";
								})
								.on("blur", function() {
								  log2.innerHTML += "";
								})
								.on("change", function() {
								  log2.innerHTML += "";
								})
								.on("paste", function() {
								  log2.innerHTML += "";
								})
								.on("newword:composer", function() {
								  log2.innerHTML += "";
								})
								.on("undo:composer", function() {
								  log2.innerHTML += "";
								})
								.on("redo:composer", function() {
								  log2.innerHTML += "";
								});
								
								
								editor4
								.on("load", function() {
								  log4.innerHTML += "";
								})
								.on("focus", function() {
								  log4.innerHTML += "";
								})
								.on("blur", function() {
								  log4.innerHTML += "";
								})
								.on("change", function() {
								  log4.innerHTML += "";
								})
								.on("paste", function() {
								  log4.innerHTML += "";
								})
								.on("newword:composer", function() {
								  log4.innerHTML += "";
								})
								.on("undo:composer", function() {
								  log4.innerHTML += "";
								})
								.on("redo:composer", function() {
								  log4.innerHTML += "";
								});
								
								
							</script>
		</div> <!--end of wrapper-->      
                 </form>
	</body>
</html>

