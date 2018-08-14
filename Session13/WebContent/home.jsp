<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>

	<center>
		<br/>
		<h3>Welcome Home</h3>
		<h4>Its <%= new Date()%></h4>
		
		<%
			/*Cookie[] ckArr = request.getCookies();
			for(Cookie ck : ckArr){
				out.print(ck.getName()+" | "+ck.getValue()+"<br/>");
			}*/
		%>
		
		<h3>Details</h3>
		<h2>Name is: <%= session.getAttribute("keyName") %></h2>
		<h2>Email is: <%= session.getAttribute("keyEmail") %></h2>
		<h2>Age is: <%= session.getAttribute("keyAge") %></h2>
		
	</center>

</body>
</html>