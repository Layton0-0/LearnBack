<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" errorPage="errorRes.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>errorInput</title>
</head>
<body>
 <% String name=request.getParameter("name");
   if(name.equals("홍길동"))
   {
	    name= "이름이 입력되었습니다";
    }
  %>

    <h4> <%=name %> </h4>

</body>
</html>