<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" enctype="multipart/form-data"
		modelAttribute="uploadFile" action="upload">
		<h3>** 업로드할 파일 선택 **</h3>	<br>
    파일 : <form:input type="file" path="file" name="file" />	<br>		<br>
		<p style="color: red; font-weight: bold">	<form:errors path="file" /></p>
		<br>     
   설명 : <br>
		<form:textarea name="desc" path="desc" cols="40" rows="10" />	<br>	<br>
		<input type="submit" value="전 송">
	</form:form>
</body>
</html>




