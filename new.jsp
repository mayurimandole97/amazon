<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- <a href="sessionServlet2">click here</a> -->
<jsp:useBean id="user1 " class="model.User" scope="session"> </jsp:useBean>
<jsp:setProperty property="username" name="user1" param="username"/>
<jsp:setProperty property="password" name="user1" param="password"/>
<a href="SessionServlet3">click here to go to</a>


</body>
</html>