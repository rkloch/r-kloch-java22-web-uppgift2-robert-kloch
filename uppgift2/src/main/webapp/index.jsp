<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5>Login</h5>
<form action="<%= request.getContextPath() %>/Controller" method="post">
	Username:
	
	<input type="text" name="username">
	Password:
	<input type="text" name="password">
	<input type="submit" value="Login">
</form>
</body>
</html>