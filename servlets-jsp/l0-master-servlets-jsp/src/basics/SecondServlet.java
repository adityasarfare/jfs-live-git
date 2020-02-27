package basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String fnameString = request.getParameter("fname");
		if (fnameString == null) {
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head><title>First Servlet</title></head>");
			out.println(
					"<body><h1>Welcome to the world of Servlets!</h1></body>");
			out.println(
					"<form action='/l0-master-servlets-jsp/second' method='post'>");
			out.println("<input type='text' name='fname'>");
			out.println("<input type='submit' value='Submit Form'>");
			out.println("</form>");
			out.println("</html>");
		} else {
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head><title>First Servlet</title></head>");
			out.println("<body>");
			out.println("<h1> Entered Name is : " + fnameString + "</h1>");
			out.println("</body>");
			out.println("</html>");
		}
	}

//	@Override
//	protected void service(HttpServletRequest request,
//			HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<head><title>First Servlet</title></head>");
//		out.println("<body><h1>Service Method!</h1></body>");
//		out.println("</html>");
//	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String fnameString = request.getParameter("fname");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>First Servlet</title></head>");
		out.println("<body>");
		out.println("<h1> Entered Name is : " + fnameString + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
