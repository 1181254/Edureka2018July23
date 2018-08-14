<%@ page import="co.edureka.db.JDBCHelper"%>
<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>
<%-- <%@ include file="header.jsp" %>  --%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h4><i>Logging in ${param.txtEmail}</i></h4>

	<jsp:include page="header.jsp"/>

	<%
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		// JDBC to Login User
		JDBCHelper helper = new JDBCHelper();
		helper.createConection();
		boolean flag = helper.loginUser(user);
		helper.closeConenction();
		
		if(flag){
			out.print("<h3>Welcome, You are Logged In !!</h3>");
			out.print("<a href='home.jsp'>Enter Home</a>");
			
			// Session Tracking
			/*Cookie ck1 = new Cookie("keyName","John Watson");
			Cookie ck2 = new Cookie("keyEmail",user.email);
			Cookie ck3 = new Cookie("keyAge",String.valueOf(30));
			
			response.addCookie(ck1);
			response.addCookie(ck2);
			response.addCookie(ck3);*/
			
			//HW: URL ReWriting and HiddenFormFields
			
			// HttpSession Object
			session.setAttribute("keyName","John Watson");
			session.setAttribute("keyEmail",user.email);
			session.setAttribute("keyAge",30);
			
			// pageContext
			//pageContext.setAttribute("keyName","John Watson",PageContext.SESSION_SCOPE);
			//String name = (String) pageContext.getAttribute("keyName",PageContext.SESSION_SCOPE);
		%>	
			<jsp:forward page="home.jsp"/>
		<%	
		}else{
			out.print("<h3>Please Try Again !!</h3>");
			response.sendRedirect("https://www.google.co.in");
		}
	%>

	
</body>
</html>