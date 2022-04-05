<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
  .mybox{
        color:red;
        font-weight:bold;
  }
</style>
</head>

<body>
<form:form  commandName="user"> 
      <table>
          <tr>
              <td>First Name:</td>
              <td><form:input path="firstName" /></td>                      
                <td> <form:errors   path="firstName"  cssStyle="color: #ff0000;" />  </td>
          </tr>
          <tr>
              <td>Last Name:</td>
              <td><form:input path="lastName" /></td>
              <td> <form:errors   path="lastName"  cssStyle="color: #ff0000;" />  </td>
          </tr>
          <tr>
              <td colspan="2">
                  <input type="submit" value="Save Changes" />
              </td>
          </tr>
      </table>
  </form:form>
</body>
</html>