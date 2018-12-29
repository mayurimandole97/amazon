<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="/WEB-INF/custom.tld" prefix="custom" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Servlet1"method="POST">
Username:<input type="text" name="username"><br><br><br>
Password:<input type="password" name="password"><br><br><br>
<input type="submit" value="submit">
<a href="jstlprac.jsp">click here</a> 
</form>
<custom:greet>This is old value</custom:greet>
<custom:greet>This is new value</custom:greet>
</body>
</html>