<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file ="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>new</title>
</head>
<body>
<h2>New Registration</h2>
<form action="newData" method="post">
<table>
<tr>
<td>name<input type="text" name="name"/></td>
</tr>
<tr>
<td>city<input type="text" name="city"/></td>
</tr>
<tr>
<td>email<input type="text" name="email"/></td>
</tr>
<tr>
<td>mobile<input type="text" name="mobile"/></td>
</tr>
<tr>
   <td><input type="Submit" value="Save" /></td>
   </tr>
</table>
</form>
<%
if(request.getAttribute("msg")!=null){
	out.println(request.getAttribute("msg"));
}


%>
</body>
</html>