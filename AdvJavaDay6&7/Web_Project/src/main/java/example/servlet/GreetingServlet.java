package example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class GreetingServlet
 */
@WebServlet(name = "MyGreetingServlet", urlPatterns = { "/doGreet" })
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() {
		System.out.println("Inside Init()");
	}
	@Override
	public void destroy() {
		System.out.println("Inside destroy()");
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//when a request is made to a servlet, this doGet() method is invoked 
		// it provides logic for handling the request.
		
		System.out.println("Welcome to Servlet");
		response.setContentType("text/html");//MIME: Multipurpose Internet male extension
		String responseText = "<h1 style ='color:red'>Welcome to Servlets</h1>";
		
		
		
		PrintWriter out = response.getWriter();
		out.println(responseText);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
