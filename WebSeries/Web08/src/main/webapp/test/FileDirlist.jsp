<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.io.*" %>
<html>
<head>
  <title>���ϰ� ���丮  ����Ʈ</title>
</head>
<body>
<%! String path; %>
<% path = application.getRealPath("/upload/");
String[] listing =new File(path).list();				
		for(int i=0;i<listing.length;++i){
			out.println("list ["+i+"] :<a href="
		            +listing[i]+"> " +listing[i]+"</a> <br>");
		}
	out.println("<hr> �����ø����̼� ������Ʈ�� ="+request.getContextPath() +"<br><hr>");
	out.println("���� ������ ="+	request.getServletPath()+"<br><hr>"); 
	out.println("���� �۾� ���ø����̼��� ��Ʈ ��� ="+application.getRealPath("/") +"<br><hr>");
      
%>
</body>
</html>