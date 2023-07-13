<%@page import="com.google.protobuf.ExperimentalApi"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hey there i am using what's application</h1>
<% //what ever we can write in scriplet tag can be like class display extends httpservlet(internal functionality)
   //void service(httpreq,httpresp)
System.out.println("helloworld");
System.out.println(a);
%>

<%="hello world" //expression tag//writer.write("hello world") will be writen in printwriter()//
                     //standard name of print writer is out.write//
%> 
 
 
 <%="<h1>"+"hello world"+"</h1>" %>
 
 
 
 <%! int a=10; //declaration tag this non static variable will be created insde display class and outside httpservlet method
 %>
 
 <%List<Integer> l=new ArrayList(); %>
 
 //directive/pagedirective//
 <%@page import="java.util.List" %>
  
</body>
</html>