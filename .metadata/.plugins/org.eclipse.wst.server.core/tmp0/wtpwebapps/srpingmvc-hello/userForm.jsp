<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC Form handing</title>
</head>
<body>
<h2> 用户注册</h2>
<mvc:form modelAttribute="user" action="result.mvc">
	<table>
		<tr>
			<td><mvc:label path="name">Name</mvc:label> </td>
			<td><mvc:input path="name"/> </td>
		</tr>
				<tr>
			<td><mvc:label path="password">Password</mvc:label> </td>
			<td><mvc:input path="password"/> </td>
		</tr>
		<tr>
			<td colspan="2">
			<input type="submit" value="Submit"/>
			 </td>
		</tr>
	</table>
</mvc:form>
</body>
</html>