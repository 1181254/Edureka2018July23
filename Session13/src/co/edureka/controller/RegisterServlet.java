package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;


@WebServlet({ "/RegisterServlet", "/Register" })
public class RegisterServlet extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("==init executed==");
	}

	
	public void destroy() {
		System.out.println("==destroy executed==");
	}

	// service is executed for any type of request i.e. get or post or any other
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("==service executed==");
		
		User user = new User();
		
		// extract the data from request
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		JDBCHelper helper = new JDBCHelper(); 
		helper.createConection();
		
		int i = helper.registeruser(user);
		
		helper.closeConenction();
		
		// Sending the data back as response
		response.setContentType("text/html"); // MIME
		PrintWriter out = response.getWriter(); // PrintWriter API will be used to send back the response
		
		out.print("<html><body><center>");
		out.print("<h3>");
//		out.print(user.toString());
		
		if(i>0){
			out.print("Welcome, "+user.name+" !! You are Registered with us !!");
		}else{
			out.print("Sorry, "+user.name+" !! Your Registeration Failed !!");
		}
		
		out.print("</h3>");
		out.print("</center></body></html>");
	}

}
