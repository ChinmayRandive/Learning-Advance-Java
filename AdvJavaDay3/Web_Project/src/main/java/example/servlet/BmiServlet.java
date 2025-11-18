package example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class BmiServlet
 */
@WebServlet("/getBMI")
public class BmiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// Obtaining value 3 request  parameter : myName,myWeight, mtHeight
		
		String name = request.getParameter("myName");
		String weight = request.getParameter("myWeight");
		String height = request.getParameter("myHeight");
		 
		float wt = Float.parseFloat(weight);
		float ht = Float.parseFloat(height);
		float htInMtr = ht /100.0f;
		float bmi = wt /(htInMtr * htInMtr);
		
		String responseText = "<h1> Hey" + name + ",your BMI is"+ bmi+"</h1>";
		out.println(responseText);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
