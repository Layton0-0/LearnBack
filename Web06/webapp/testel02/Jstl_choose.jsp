<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<meta charset="EUC-KR">
 <body>
    <c:if test="${pageContext.request.method=='POST'}">�Է��� ���� ����� �ٲٸ�  :
      <c:choose>
      <c:when test="${param.enter=='1'}">One
      <br />
      </c:when>
      <c:when test="${param.enter=='2'}">Two
      <br />
      </c:when>
      <c:when test="${param.enter=='3'}">Three
      <br />
      </c:when>
         <c:otherwise>
        <c:out value="${'���̻� ��ȯ�����ʽ��ϴ�'}" /> 
        <br />
      </c:otherwise>
    </c:choose>
    </c:if>
    <form method="post">���ڸ� 1���� 3���� �Է����ּ���
        <input type="text" name="enter" />
      <input type="submit" value="Ȯ��" />
    <br />
    </form>
  </body>
</html>
