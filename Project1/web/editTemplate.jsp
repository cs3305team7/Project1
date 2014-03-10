<%-- 
    Document   : editTemplate
    Created on : 08-Mar-2014, 17:58:32
    Author     : as11
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <% 
        /**Page p = new Page("","");
        out.print(p.createPage());**/
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CMS TEMPLATE1</title>
		
        <link rel="stylesheet" type="text/css" href="stylesheets/stylesheetTem2.css" id="stylesheet">
		<!--href="../../stylesheets/stylesheetOne.css"--> 
		<script type="text/javascript">
		
			
		
<!-- 
//Browser Support Code
 $(document).ready(function() {
                $("#navForm").gs_ajax_form({
                    trigger_el: '#btnTrigger',
                    target_url: 'submit.php',
                    additional_data: {another_key: 'another_value'},
                    before_request_condition: function() {
                        console.log('inside before_request_condition');
                        return true;
                    },
                    before_request: function() {
                        console.log('inside before_request');
                    },
                    after_request_success: function() {
                        console.log('inside after_request_success');
                    },
                    after_request_error: function() {
                        console.log('inside after_request_error');
                    }
                });
            });

	$(document).ready(function () {
    $('#textarea').click(function () {
        $.ajax({
            type: "POST",
            url: "submit.php", //get response from this file
            data: {
                name: name_val
            },
            success: function (response) {

                $("textarea#textarea").val(response); //send response to textarea
            }
        });
    });
});
		</script>
	</head>
	<body>
                
	  <div id="wrapper">
	  <a href="editHeader_footer.jsp" class="btn">Step 1</a>
        <a href="editTemplate.jsp" class="btn">Step 2</a>
         <a href="themeSelection.jsp" class="btn">Step 3</a>	
	   <div>
		</div> 
		<nav id="EDITABLENAV">
						<form  id="navForm">
                                                    <h2>Navigation Form</h2>
						  <div id="toolbar3" style="display: none;">
						  <a data-wysihtml5-action="change_view">html view</a> <br> <br>
							<a data-wysihtml5-command="createLink">insert link</a> 							
							
							<div data-wysihtml5-dialog="createLink" style="display: none;">
							  <label>
								Link:
								<input data-wysihtml5-dialog-field="href" value="http://">
							  </label>
							  <a data-wysihtml5-dialog-action="save">OK</a>&nbsp;<a data-wysihtml5-dialog-action="cancel">Cancel</a>
							</div>
							
						  </div>
						  <%/** out.print(p.Get("EDITABLENAV"));**/%><br>
						 <br>
						  <table>
						    <tr>
							<td>
						    Name:<input type="text" name="linkName1" placeholder="Enter name" id="form1"><br>
							</td>
							<td>
							Full URL:<input type="text" name="url1" placeholder="Enter full URL"><br>
							</td>
							</tr>
							<tr>
							<td>
							<br>
							Name:<input type="text" name="linkName2" placeholder="Enter name" id="form2"><br>
							</td>
							<td>
							Full URL:<input type="text" name="url2" placeholder="Enter full URL"><br>
							</td>
							</tr>
							<tr>
							<td><br>
							Name:<input type="text" name="linkName3" placeholder="Enter name" id="form3"><br></td>
							<td>Full URL<input type="text" name="url3" placeholder="Enter full URL"><br></td>
							</tr>
						  <tr><td><input class="buttons" type="reset" value="Reset form!"></td>
						  <td><input class="buttons" type="submit" value="Submit!"></td></tr>
						 </table>
						</form>
						<div id="log3"></div>
						
					</nav> 
                    <aside id="PICS">
                        <h2>Images Column</h2>
                        <%/** out.print(p.Get("PICS"));*/%><br> <br>
						IMAGE UPLOAD INCOMPLETE!
					</aside>


                    <div id="CONTENT">
                        
						<form name="ajaxform" id="ajaxform">
                                                    <h2>Main Content</h2>
						  <div id="toolbar" style="display: none;">
						  <a data-wysihtml5-action="change_view">html view</a> <br> <br>
							<a data-wysihtml5-command="bold" title="CTRL+B">bold</a> |
							<a data-wysihtml5-command="italic" title="CTRL+I">italic</a> |
							<a data-wysihtml5-command="createLink">insert link</a> |
							<a data-wysihtml5-command="insertImage">insert image</a> |
							<a data-wysihtml5-command="formatBlock" data-wysihtml5-command-value="h1">h1</a> |
							<a data-wysihtml5-command="formatBlock" data-wysihtml5-command-value="h2">h2</a> |
							<a data-wysihtml5-command="insertUnorderedList">insertUnorderedList</a> |
							<a data-wysihtml5-command="insertOrderedList">insertOrderedList</a>
							
							
							<div data-wysihtml5-dialog="createLink" style="display: none;">
							  <label>
								Link:
								<input data-wysihtml5-dialog-field="href" value="http://">
							  </label>
							  <a data-wysihtml5-dialog-action="save">OK</a>&nbsp;<a data-wysihtml5-dialog-action="cancel">Cancel</a>
							</div>
							
							<div data-wysihtml5-dialog="insertImage" style="display: none;">
							  <label>
								Image:
								<input data-wysihtml5-dialog-field="src" value="http://">
							  </label>
							  <label>
								Align:
								<select data-wysihtml5-dialog-field="className">
								  <option value="">default</option>
								  <option value="wysiwyg-float-left">left</option>
								  <option value="wysiwyg-float-right">right</option>
								</select>
							  </label>
							  <a data-wysihtml5-dialog-action="save">OK</a>&nbsp;<a data-wysihtml5-dialog-action="cancel">Cancel</a>
							</div>
						  </div> <!--end of toolbar div of text Editor-->
						  <textarea id="textarea" placeholder="Enter text ..."><% /**out.print(p.Get("CONTENT"));*/%></textarea>
						  <br><input class="buttons" type="reset" value="Reset form!">
						  <input class="buttons" type="submit" value="Submit!">
						</form><!--End of form -->
						<div id="log"></div>
							<script src="js/advanced.js"></script>
							<script src="js/wysihtml5-0.4.0pre.js"></script>
				   <a href="#wrapper" class="btn">Back to Top</a>
                                     <a href="#" class="btn" onclick="history.go(-1)">Go Back</a>
                    </div><!--End of CONTENT div-->
                 
					<script>
							  var editor = new wysihtml5.Editor("textarea", {
								toolbar:        "toolbar",
								stylesheets:    "stylesheet.css",
								parserRules:    wysihtml5ParserRules
							  });
							  
							   	 var editor3 = new wysihtml5.Editor("textarea3", {
								toolbar:        "toolbar3",
								stylesheets:    "stylesheet.css",
								parserRules:    wysihtml5ParserRules
							  });
							  
							   
							  var log = document.getElementById("log");							 
							  var log3 = document.getElementById("log3");
							 						  
							  editor
								.on("load", function() {
								  log.innerHTML += "";
								})
								.on("focus", function() {
								  log.innerHTML += "";
								})
								.on("blur", function() {
								  log.innerHTML += "";
								})
								.on("change", function() {
								  log.innerHTML += "";
								})
								.on("paste", function() {
								  log.innerHTML += "";
								})
								.on("newword:composer", function() {
								  log.innerHTML += "";
								})
								.on("undo:composer", function() {
								  log.innerHTML += "";
								})
								.on("redo:composer", function() {
								  log.innerHTML += "";
								});
								
								editor3
								.on("load", function() {
								  log3.innerHTML += "";
								})
								.on("focus", function() {
								  log3.innerHTML += "";
								})
								.on("blur", function() {
								  log3.innerHTML += "";
								})
								.on("change", function() {
								  log3.innerHTML += "";
								})
								.on("paste", function() {
								  log3.innerHTML += "";
								})
								.on("newword:composer", function() {
								  log3.innerHTML += "";
								})
								.on("undo:composer", function() {
								  log3.innerHTML += "";
								})
								.on("redo:composer", function() {
								  log3.innerHTML += "";
								});
								
								
							</script>
		</div> <!--end of wrapper-->            
	</body>
</html>

