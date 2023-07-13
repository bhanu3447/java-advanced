<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
<h1><%=session.getAttribute("id") %></h1>
<h3><%=session.getAttribute("name") %></h3>
<h2><%=session.getAttribute("email") %></h2>


<% String class1=(String)request.getAttribute("class"); %>
<%out.write(class1); %>
<% response.getWriter(); %>
</body>
</body>
</html>