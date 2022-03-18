<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	allList
	<table border="1">
		<tr>
			<th>이름</th>
			<th>나이</th>
			<th>취미</th>
			<c:if test="${!empty allList }">
				<c:forEach items="${allList }" var="obj">
					<tr>
						<td>${obj.name}</td>
						<td>${obj.age}</td>
						<td>${obj.hobby}</td>
					</tr>
				</c:forEach>
			</c:if>
		</tr>
	</table>
	<a href="<%=application.getContextPath()%>/index.html">처음화면</a>
</body>
</html>