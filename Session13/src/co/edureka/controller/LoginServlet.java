package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;


@WebServlet({ "/LoginServlet", "/Login", "/Awesome" })
public class LoginServlet extends HttpServlet {
	
	// doPost is executed IFF Client is sending a request my selecting the method as post
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		
		// extract the data from request
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		JDBCHelper helper = new JDBCHelper(); 
		helper.createConection();
		
		boolean flag = helper.loginUser(user);
		
		helper.closeConenction();
		
		// Sending the data back as response
		response.setContentType("text/html"); // MIME
		PrintWriter out = response.getWriter(); // PrintWriter API will be used to send back the response
		
		out.print("<html><body><center>");
		out.print("<h3>");
//		out.print(user.toString());
		
		if(flag){
			out.print("Welcome, "+user.email+" !! Your Login is Successful!!");
			//out.print("<h4><a href='Welcome'>Enter Home</a></h4>");
			
			// Logic to fetch data.
			String name = "John Watson";
			int age = 30;
			
			//1. Session Tracking: Cookies
			// A HashMap i.e. a key value pair
			/*Cookie ck1 = new Cookie("keyName", name);
			Cookie ck2 = new Cookie("keyEmail", user.email);
			Cookie ck3 = new Cookie("keyAge", String.valueOf(age));
			
			//ck1.setMaxAge();
			
			// Add Cookie to client's machine
			response.addCookie(ck1);
			response.addCookie(ck2);
			response.addCookie(ck3);
			
			// HW: Implement Remember Me !! (During Login)
			// 	   One Time Login
			 */
			
			// Forwarding the data:
			//2. Session Tracking: URL ReWriting | Query String
			//out.print("<h4><a href='Welcome?keyName="+name+"&keyEmail="+user.email+"&keyAge="+age+"'>Enter Home</a></h4>");
			
			//3. Session Tracking: Hidden Form Field
			/*String form = "<form action='Welcome' method='post'>"
					+ "<input type='hidden' name='txtName' value='"+name+"'/>"
					+ "<input type='hidden' name='txtEmail' value='"+user.email+"'/>"
					+ "<input type='hidden' name='txtAge' value='"+age+"'/>"
					+ "<input type='submit' value='Enter Home'/>"
					+ "</form>";
			out.print(form); // as a response
			*/
			
			//4. Session Tracking: HttpSession API
			out.print("<h4><a href='Welcome'>Enter Home</a></h4>");
			
			HttpSession session = request.getSession(); // get the reference to the session object on the server
			
			session.setAttribute("keyName", name);
			session.setAttribute("keyEmail", user.email);
			session.setAttribute("keyAge", age); // here type will be taken care of
			
			// HW: Implement Login and Logout
			
			//session.invalidate(); // clear all the stored data in session object
			
		}else{
			out.print("Sorry, "+user.email+" !! Your Login is Failed !!");
			response.sendRedirect("https://google.co.in");
		}
		
		out.print("</h3>");
		out.print("</center></body></html>");
	}

}
