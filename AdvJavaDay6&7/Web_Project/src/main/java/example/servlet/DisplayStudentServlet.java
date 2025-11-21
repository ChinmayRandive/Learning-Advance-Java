package example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import example.jdbc.Student;

/**
 * Servlet implementation class DisplayStudentServlet
 */
@WebServlet("/doDisplay")
public class DisplayStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		//PrintWriter out = request.getAttribute("currentStudent");
		
		PrintWriter out = response.getWriter();
		//Retrieving the attribute: currentStudent from the incoming
		Object obj = request.getAttribute("currentStudent");
		Student std = (Student)obj;
		String name = std.getName();
		String city = std.getCity();

		out.println("<h2>Showing Student Details:</h2>");
		out.println("<h2>Name: " + name + "</h2>");
		out.println("<h2>City: " + city + "</h2>");
		}
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
