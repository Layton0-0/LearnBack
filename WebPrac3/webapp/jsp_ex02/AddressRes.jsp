<%@page import="com.test.Address"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>주소 응답</title>
</head>
<body>
	
	<%
		com.test.Address Alist02 = new com.test.Address();
	
	%>
	<jsp:useBean id="Alist" class="com.test.Address"/>
	
	<!-- set을 여러번 쓰지 않기 위해 와일드카드를 사용.  -->
	<jsp:setProperty name="Alist" property="*" />
	<!-- 
	Alist02.setName(request.getParameter("name"));
	Alist02.setAddr(request.getParameter("addr"));
	Alist02.setTel(request.getParameter("tel"));
	 -->
	


	<jsp:getProperty name="Alist" property="name" />
	님 반갑습니다
	<br>
	<jsp:getProperty name="Alist" property="name" />
	님 의 주소는
	<jsp:getProperty name="Alist" property="addr" />
	이고
	<br>전화번호는
	<jsp:getProperty name="Alist" property="tel" />
	입니다.
</body>
</html>