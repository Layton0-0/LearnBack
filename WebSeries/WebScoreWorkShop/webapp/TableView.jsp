<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>TableView02</title>
</head>
<body>
	<%
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = null;
	String url = "jdbc:mysql://127.0.0.1:3306/yoondb";
	String user = "root";
	String password = "1121";
	conn = DriverManager.getConnection(url, user, password);
	Statement statement = conn.createStatement();
	ResultSet resultset = statement.executeQuery("select * from Score");
	%>

	<h2>Test01 Table의 내용을 출력해보자</h2>

	<%
	while (resultset.next()) {	%>
	<%=resultset.getInt(1)%>
	<%=resultset.getString(2)%>
   <%=resultset.getString(3)%> <br>
	<%	}
	%>
	
</body>
</html>