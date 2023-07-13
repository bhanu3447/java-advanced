<%@page import="java.util.List"%>
<%@page import="trailexpressionlanguage.customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%  List<customer> clist=(List)session.getAttribute("clist");%>

<%for(customer c:clist) {%>
<%=c %>
<br>
<%} %>




<%-- <h1>${clist }</h1> --%>
</body>
</html>