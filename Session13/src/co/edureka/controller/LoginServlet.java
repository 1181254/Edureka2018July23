package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		}else{
			out.print("Sorry, "+user.email+" !! Your Login is Failed !!");
		}
		
		out.print("</h3>");
		out.print("</center></body></html>");
	}

}
