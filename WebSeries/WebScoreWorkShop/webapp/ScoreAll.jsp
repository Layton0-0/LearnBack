<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.*, com.entity.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- 	<%		
ArrayList<Score> sm = (ArrayList<Score>) request.getAttribute("all");
	%> --%>
	<table border=1 width="90%">
		<tr>
			<th>�̸�</th>
			<th>����</th>
			<th>����</th>
			<th>����</th>
			<th>�� ��</th>
			<th>���</th>
			<th>����</th>
			<th>����</th>
			<th>����</th>
		</tr>
<%-- 		<%
			for (Score res : sm) {
		%> --%>
		
		<c:forEach var="scoreVO" items="${all}">
		<tr>
			<td>${scoreVO.name}</td>
			<td>${scoreVO.kor}</td>
			<td>${scoreVO.eng}</td>
			<td>${scoreVO.mat}</td>
			<td>${scoreVO.tot}</td>
			<td>${scoreVO.avg}</td>
			<td>${scoreVO.grade}</td>
			
			<td><a href="ScoreFind?name=${scoreVO.name}"> ���� </a></td>
			<td><a href="ScoreDelete?name=${scoreVO.name}"> ���� </a></td>
			<!-- ScoreFind ���� ���Ͽ� View���� �Է��� �޾Ƽ� �����Ѵ�. -->
<%-- 			<td><a href="ScoreFind?name=<%=res.getName()%>"> ���� </a></td>
			<td><a href="ScoreDelete?name=<%=res.getName()%>"> ���� </a></td> --%>
			</tr>
			</c:forEach>
		
<%-- 		<%
			/* } */
		%> --%>
		<tr>
			<td align="center" colspan="9">
			<a href="ScoreInsert.html">�Է�
			</a></td>
		</tr>
	</table>
</body>
</html>













