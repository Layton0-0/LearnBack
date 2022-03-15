<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a</title>
</head>
<body>
	<h1>a.jsp</h1>
	<%=application.getContextPath()%>
	<br>
	<%=application.getServerInfo()%>
	<br>
	<%=application.getServletContextName()%>
	<br>
	<%=application.getRealPath("/")%>
	<br>

	<hr>
	<%=request.getContextPath()%>
	<hr>

	<%
	application.setAttribute("application1", new String("application1"));
	session.setAttribute("session1", new String("session1"));
	request.setAttribute("request1", new String("request1"));
	%>
	<a href="b.jsp">b.jsp</a>



</body>
</html>