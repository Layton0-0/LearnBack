<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="java.io.*" %>
  <%@ page import="com.oreilly.servlet.*" %>
  <%@ page import="com.oreilly.servlet.multipart.*" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� ���ε� ���</title>
</head>
<body>
 <%
  String path="D:\\MyWeb\\Web08\\webapp\\upload";
  int postSize=3*1024*1024;
  try{
	 MultipartRequest MR
	  =new MultipartRequest(request,path,postSize,"euc-kr",
			 new DefaultFileRenamePolicy());
	 
	  String file=MR.getFilesystemName("uploadfile");
	   String file2=MR.getOriginalFileName("uploadfile");
	   out.println("���� ="+ MR.getParameter("subject")+"<br>");
	   out.println("����� �����̸� ="+file+"<br>");
	   out.println("���ε�� �����̸� ="+file2+"<br>");
	      
  }catch(Exception e)
  {e.getStackTrace();}
  
 %>
</body>
</html>