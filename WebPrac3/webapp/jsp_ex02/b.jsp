<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>b</title>
</head>
<body>
	<h1>b.jsp</h1>

	<%=application.getAttribute("application1")%> <br>
	<%=session.getAttribute("session1")%> <br>
	<%=request.getAttribute("request1")%> <br>


	<a href="c.jsp">c.jsp</a>


</body>
</html>