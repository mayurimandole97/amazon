<%@ page language="java" session="true"
contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    <%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="ds" driver="oracle.jdbc.driver.OracleDriver"
url="jdbc:oracle:thin:@localhost:1521:xe"
user="hr" password="hr" scope="session"/>
before update:
 <br><sql:query var="query" sql="select * from users"
dataSource="${ds}" scope="session" startRow="0" maxRows="10">
</sql:query> 

<sql:update var="query" sql="insert into users values('bcd',123)"
dataSource="${ds}" >
</sql:update>
<br>
after update:
<br>

 <sql:query var="query" sql="select * from users"
dataSource="${ds}" scope="session" startRow="0" maxRows="10">
</sql:query> 

<c:forEach items="${query.rows}" var="row" >
<c:out   value="${row.username}"></c:out><br>
<c:out  value="${row.password}"></c:out><br>
</c:forEach> 
<!--<c:set var="x" value="30"></c:set>
<c:out value="${x}"></c:out>
<c:set var="String" value="JSP-View"/>
<c:if test="${fn:contains(String,'JSP') }">
<p>JSP found</p>
</c:if><br>
<c:forEach begin="1" end="10" var="y" step="2">
<c:out value="${y}">2nd for each:</c:out>
</c:forEach><br>

${10+30}<br>
${2* 20}<br> -->



</body>
</html>