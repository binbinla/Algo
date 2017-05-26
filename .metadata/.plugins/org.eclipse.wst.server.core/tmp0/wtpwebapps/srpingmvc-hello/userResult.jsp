<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC Form handing</title>
</head>
<body>
<h2> user result</h2>
	<table>
		<tr>
			<td>Name </td>
			<td>${u.name} </td>
		</tr>
		<tr>
			<td>Password </td>
			<td>${u.password} </td>
		</tr>
	</table>
</body>
</html>