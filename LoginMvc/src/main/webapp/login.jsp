<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<script>
    history.forward();
</script>
<body>
<h2>Please Enter Credential</h2>
<form action="save" method="post">
<table>
<tr>
<td>Userid<input type="text" name="userid"/></td>
</tr> 
<tr>
<td>Passwd<input type="password" name="password"/></td>
</tr>
<tr>
   <td><input type="Submit" value="Login" /></td>
   </tr>
</table>
</form>
<%
if(request.getAttribute("error")!=null){
	out.println(request.getAttribute("error"));
}



%>
</body>
</html>