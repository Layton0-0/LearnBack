<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� ���ε� ���</title>
</head>
<body>
	<%
	response.setContentType("text/html; charset=EUC-KR");

	out.println(" <html> <body> <h3>�����ø��� ����</h3>");
	out.println("���ε� ������ Ÿ������" + request.getContentType() + "<br>");
	out.println("���ε� ������ Ÿ�Ա���" + request.getContentLength() + "<br>");
	out.println("<hr><font color=blue> <br> ");
	InputStreamReader isr = new InputStreamReader(request.getInputStream(), "EUC-KR");
	BufferedReader br = new BufferedReader(isr);
	for (String line; (line = br.readLine()) != null;) {
		out.println(line + " ");
	}
	out.println("</font></body></html>");
	out.close();
	%>
</body>
</html>