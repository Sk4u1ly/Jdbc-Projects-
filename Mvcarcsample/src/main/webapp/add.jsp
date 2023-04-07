<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sum</title>
</head>
<body>
<form action="add" method ="post">
<h2>Summetion</h2>
<table>
<tr>
<td>Number1<input type="text" name="num1"/></td>
</tr>
<tr>
<td>Number2<input type="text" name="num2"/></td>
</tr>
<tr>
   <td><input type="Submit" value="add" /></td>
   </tr>
 </table>
</form>
<%
if(request.getAttribute("res")!=null){
out.println(request.getAttribute("res"));
}
%>
</body>
</html>
