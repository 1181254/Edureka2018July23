package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet({ "/HomeServlet", "/Welcome" })
public class HomeServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html"); // MIME
		PrintWriter out = response.getWriter();
		
		Date date = new Date();
		out.print("<center>");
		out.print("<h3>Welcome, User. Its: "+date+"</h3>");
		
		// Reading all the cookies from client's browser
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			out.print(ck.getName()+" - "+ck.getValue()+"<br/>");
		}*/
		
		// Read the data from URL
		//String name = request.getParameter("keyName");
		//String email = request.getParameter("keyEmail");
		//String age = request.getParameter("keyAge"); // int a = Integer.parseInt(age);
		
		// Read the data from Hidden Form Fields
		/*String name = request.getParameter("txtName");
		String email = request.getParameter("txtEmail");
		String age = request.getParameter("txtAge");*/
		
		// Read the data from Session Object
		HttpSession session = request.getSession();
		
		String name = (String)session.getAttribute("keyName");
		String email = (String)session.getAttribute("keyEmail");
		int age = (int)session.getAttribute("keyAge");
		
		out.print("<b>Details: <br/>"+name+"<br/>"+email+"<br/>"+age+"</b>");
		
		//session.getId() // Session ID for the User
		
		out.print("</center>");
	}

}
