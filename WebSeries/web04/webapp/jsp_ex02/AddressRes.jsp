<%@page import="com.test.Address"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�ּ� ����</title>
</head>
<body>
	
	<%
		com.test.Address Alist02 = new com.test.Address();
	
	%>
	<jsp:useBean id="Alist" class="com.test.Address"/>
	
	<!-- set�� ������ ���� �ʱ� ���� ���ϵ�ī�带 ���.  -->
	<jsp:setProperty name="Alist" property="*" />
	<!-- 
	Alist02.setName(request.getParameter("name"));
	Alist02.setAddr(request.getParameter("addr"));
	Alist02.setTel(request.getParameter("tel"));
	 -->
	


	<jsp:getProperty name="Alist" property="name" />
	�� �ݰ����ϴ�
	<br>
	<jsp:getProperty name="Alist" property="name" />
	�� �� �ּҴ�
	<jsp:getProperty name="Alist" property="addr" />
	�̰�
	<br>��ȭ��ȣ��
	<jsp:getProperty name="Alist" property="tel" />
	�Դϴ�.
</body>
</html>