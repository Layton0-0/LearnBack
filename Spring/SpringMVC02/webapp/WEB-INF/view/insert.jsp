<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="font-size: 1.5em;">
	<form action="<%=application.getContextPath()%>/insertRes.sp"
		method="Post">
<table>
<tr>
	<td>이름</td>
	<td><input type="text" name="name" /></td>
</tr>
<tr>
	<td>나이</td>
	<td><input type="text" name="age" /></td>
</tr>
<tr>
	<td>취미</td>
	<td><input type="text" name="hobby" /></td>
</tr>

<tr>
	<td><input type="submit" value="회원 등록" /></td>
</tr>
</table>
</form>

</body>

</html>