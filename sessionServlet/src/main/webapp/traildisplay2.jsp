<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="sess2withreqdispatcher.customer"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% customer c=(customer)session.getAttribute("customer");%>
<h1>HELLO USER</h1>
<h2>name:<%=c.getName()%></h2>
<h1>please verify your details</h1>
<h2>id:<%=c.getId() %></h2>
<h2>email:<%=c.getEmail()%></h2>
<h2>age:<%=c.getAge() %></h2>
<h2>address:<%=c.getAddress() %></h2>

</body>
</html>