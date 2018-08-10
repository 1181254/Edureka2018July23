package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Sending the data back as response
		response.setContentType("text/html"); // MIME
		PrintWriter out = response.getWriter(); 
		
		String type = request.getParameter("txtType");
		
		if(type.equals("login")){
			
			String email = request.getParameter("txtEmail");
			String password = request.getParameter("txtPassword");
			
			if(email.isEmpty() || password.isEmpty()){
				RequestDispatcher dispatcher1 = request.getRequestDispatcher("loginuser.html");
				dispatcher1.include(request, response);
				out.print("<h3><center>Please Enter Details First</center></h3>");
			}else{
				RequestDispatcher dispatcher = request.getRequestDispatcher("Awesome");
				dispatcher.forward(request, response);
				
				out.print("<h3>Request Forwarded to LoginServlet from FrontController</h3>");				
			}
			
			
		}
		
		if(type.equals("register")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("Register");
			dispatcher.forward(request, response);
		}
		
		out.print("<h3>Hello from FrontController</h3>");
	}

}
