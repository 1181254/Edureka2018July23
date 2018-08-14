<%@page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %> 
<%@ page buffer="8kb" %> 
<%@ page isThreadSafe="true" %>   
<%@ page import="java.util.Date" %>
<%@ include file="header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP</title>
</head>
<body>
	
	<h3>Welcome to JSP Page</h3>
	
	<h3>Sriptlet Tag</h3>
	
	<%-- <h4>a is: <% out.print(a); %></h4> error --%>
	
	
	<h4>Its: <%= date %></h4>
	<h4>pi is: <% out.print(pi); %></h4>
	
	<%
		int a = 10;
		int b = 20;
		int c = a+b;
		out.print("c is: "+c); // out is a ref var of PrintWriter Object, available implicitly.
	%>
	
	<h4>a is: <% out.print(a); %></h4>
	
	<%
		if(a>b){
	%>
		<h4>Greatest is A</h4>
	<%		
		}else{
	%>
		<h4>Greatest is B</h4>
	<%		
		}
	%>
	
	<h3>Declarative Tag</h3>
	
	<%!
		double pi = 3.14;
		double area(double radius){
			return (pi*radius*radius);
		}
		
		Date date = new Date();
	%>
	
	<h3>Area of Circle with radius 2.2 is <% out.print(area(2.2)); %></h3>
	
	<h3>Expression Tag</h3>
	<h3>Area of Circle with radius 3.3 is <%= area(3.3) %></h3>
	<h3>Pi is <%= pi %></h3>
	
	<%
		int[] arr = {10,20,30,40,50};
		out.print("arr[1] is: "+arr[1]); // write this instruction in try catch
		
		// Java Object Creation
		User uRef1 = new User();
		uRef1.setName("Mike");
		uRef1.setEmail("mike@example.com");
		uRef1.setPassword("pass123");		
		
	%>
	
	<h4>Name is: <%= uRef1.getName() %></h4>
	<h4>Email is: <%= uRef1.getEmail() %></h4>
	<h4>Password is: <%= uRef1.getPassword() %></h4>
	
	<jsp:useBean id="uRef2" class="co.edureka.model.User"/>
	<jsp:setProperty property="name" name="uRef2" value="Leo"/>
	<jsp:setProperty property="email" name="uRef2" value="leo@example.com"/>
	<jsp:setProperty property="password" name="uRef2" value="leo@123"/>
	
	<h4>Name is: <jsp:getProperty property="name" name="uRef2"/> </h4>
	<h4>Email is: <jsp:getProperty property="email" name="uRef2"/> </h4>
	<h4>Password is: <jsp:getProperty property="password" name="uRef2"/> </h4>
	
	<h3>JSTL Demo</h3>
	<c:forEach var="i" begin="1" end="10">
		<h4><c:out value="${i}"/></h4>
	</c:forEach>
	
	<c:set var="age" value="30"/>
	Age is: <c:out value="${age}"/>
	
</body>
</html>