<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
 for(int i=0;i<=100;i++)
 {
out.println("out �����Դϴ� ����� �ɱ��?\n ����� �ȴٸ� 8kb �Ѿ ���¶��ϴ�");
 }
out.clearBuffer();
out.println("��� ������ ũ��="+out.getBufferSize()+"<br>");
out.println("������ ���� ������ ũ�� ="+out.getRemaining()+"<br>");
out.flush(); 
out.println("flush �� ������ ���� ������ ũ�� ="+ out.getRemaining());

/*
-javax.servlet.jsp.JspWriter�� ���� ��ü ������ out�� PageContext ��ü�� getOut() �޼��带 ����Ͽ� 
 JSP �����̳ʿ� ���� �����ǰ� �ʱ�ȭ �Ѵ� 
-��¹��� ũ��� 8KB�̸�, Page �������� buffer �Ӽ��� �̿��ؼ� ũ�⸦ �����ؼ� ����Ѵ�. 
-JspWriter�� java.io.Write Ŭ������ ��ӹ޾� ������ Ŭ�����̸� write(), print(), println() ���� 
��¸޼��带 ����Ѵ�
*/

%>
</body>
</html>