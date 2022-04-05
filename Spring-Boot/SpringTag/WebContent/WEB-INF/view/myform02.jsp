<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form:form commandName="preferences">
		<table>
			<tr>
				<td>Subscribe to newsletter?:</td>
				<%-- Approach 1: Property is of type java.lang.Boolean --%>
				<td><form:checkbox path="receiveNewsletter" /></td>
			</tr>

			<tr>
				<td>Interests:</td>
				<td>
					<%-- Approach 2: Property is of an array or of type java.util.Collection --%>
					Quidditch: <form:checkbox path="interests" value="Quidditch" />
					Herbology: <form:checkbox path="interests" value="Herbology" />
					Defence Against the Dark Arts: <form:checkbox path="interests"
						value="Defence Against the Dark Arts" />
				</td>
			</tr>
			<tr>
				<td>Favourite Word:</td>
				<td>
					<%-- Approach 3: Property is of type java.lang.Object --%> Magic: <form:checkbox
						path="favouriteWord" value="Magic" />
				</td>
			</tr>
			<tr>
				<td>Interests:</td>
				<td>
					<%-- Property is of an array or of type java.util.Collection --%> <form:checkboxes
						path="interests" items="${interestList}" />
				</td>
			</tr>
			<tr>
				<td>Skills:</td>
				<td><form:select path="skills"  items="${skills}" /></td>
			</tr>
		</table>
		<input type="submit" value="확인" />
	</form:form>








</body>
</html>