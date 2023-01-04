<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<%
	//check if there is a session 
	if (session.getAttribute("isLoggedIn") != null) {
		// if there is a session , then all is well
		out.print("<h1>Welcome Home</h1>");
		//Goto the SessionRemoveServlet 
		out.print("<form action=\"../" + request.getContextPath() + "/RemoveSessionServlet\" method=\"POST\">");
		out.print("<input type=\"submit\" value=\"Remove Session\" />");
		out.print("</form>");
	} else {
		out.print("<h1>Error</h1>");
		response.sendRedirect("index.jsp");
	}
	%>
</body>
</html>