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
out.println("out 연습입니다 출력이 될까요?\n 출력이 된다면 8kb 넘어간 상태랍니다");
 }
out.clearBuffer();
out.println("출력 버퍼의 크기="+out.getBufferSize()+"<br>");
out.println("사용되지 않은 버퍼의 크기 ="+out.getRemaining()+"<br>");
out.flush(); 
out.println("flush 후 사용되지 않은 버퍼의 크기 ="+ out.getRemaining());

/*
-javax.servlet.jsp.JspWriter의 내장 객체 변수인 out은 PageContext 객체의 getOut() 메서드를 사용하여 
 JSP 컨테이너에 의해 생성되고 초기화 한다 
-출력버퍼 크기는 8KB이며, Page 지시자의 buffer 속성을 이용해서 크기를 수정해서 사용한다. 
-JspWriter은 java.io.Write 클래스를 상속받아 생성된 클래스이며 write(), print(), println() 등의 
출력메서드를 사용한다
*/

%>
</body>
</html>