<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.*, com.entity.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
input {
	font-size: x-large;
}
</style>
</head>
<body>
<%-- 	<%
	Score my_score = (Score) request.getAttribute("find");
	%> --%>
	<c:set var="myScore" value="${find}"></c:set>
	<form action="ScoreUpdate">
		<table border=1 width="70%"
			style="height: 400px; border-style: solid; font-size: x-large;">
			<tr>
				<th>�̸�</th>
				<td>${myScore.name}
				<input type="hidden" name="name" value="${myScore.name}" /></td>
			</tr>
			<tr>
				<th>����</th>
				<td><input type="text" name="kor"
					value="${myScore.kor}"></td>
			</tr>
			<tr>
				<th>����</th>
				<td><input type="text" name="eng"
					value="${myScore.eng}"></td>
			</tr>
			<tr>
				<th>����</th>
				<td><input type="text" name="mat"
					value="${myScore.mat}"></td>
			</tr>
			<tr>
				<th>�� ��</th>
				<td>${myScore.tot}</td>
			</tr>
			<tr>
				<th>���</th>
				<td>${myScore.avg}</td>
			</tr>
			<tr>
				<th>����</th>
				<td>${myScore.grade}</td>
			</tr>
			<tr>
				<td align="center" colspan="2"><input type="submit" value="����" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>





