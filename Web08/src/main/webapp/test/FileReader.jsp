<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<title>BufferedReader�� �̿��� ���� �б�</title>
</head>
<body>
	<%
	String Path = "/test02/ex.txt";
	%>
	���� ���:
	<br>
	<%=application.getRealPath(Path)%>
	<br>
	<hr>
	<br>
	<%=Path%>�� ������ �Ʒ��� �����ϴ�.
	<br>
	<hr>
	<%
	BufferedReader br = null;
	char[] buff = new char[512];
	int len = -1;

	try {
		br = new BufferedReader(new InputStreamReader(
				                     application.getResourceAsStream(Path)));

		while ((len = br.read(buff)) != -1) {
			out.println(new String(buff, 0, len));
		}
	} catch (IOException ex) {
		out.println("���� �߻�: " + ex.getMessage());
	} finally {
		if (br != null)
			try {
		br.close();
			} catch (IOException ex) {
			}
	}
	%>
</body>
</html>










