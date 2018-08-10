package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/MyFilter")
public class MyFilter implements Filter {

	// When object is removed from memory
	public void destroy() {
		System.out.println("==MyFilter destroy==");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		response.setContentType("text/html"); // MIME
		PrintWriter out = response.getWriter();
		
		// Pre-Processing
		out.print("<h3>Pre-Processing</h3>");
		
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		if(!(email.isEmpty() && password.isEmpty())){
			// pass the request along the filter chain
			chain.doFilter(request, response); // will send the request to RegisterServlet
		}else{
			out.print("<h3>Please Enter Correct Details First !!</h3>");
		}
		
		// Post-Processing
		out.print("<h3>Post-Processing</h3>");
	}

	
	// When object is constructed
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("==MyFilter init==");
	}

}
