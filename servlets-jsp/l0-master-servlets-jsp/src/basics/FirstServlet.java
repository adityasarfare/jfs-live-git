package basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	public FirstServlet() {
		System.out.println("Constructor!");
	}

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// Write html content to the browser using PrintWriter
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>First Servlet</title></head>");
		out.println("<body><h1>Welcome to the world of Servlets!</h1></body>");
		out.println(
				"<form action='/l0-master-servlets-jsp/first' method='post'>");
		out.println("<input type='text' name='fname'>");
		out.println("<input type='submit' value='Submit Form'>");
		out.println("</form>");
		out.println("</html>");
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

	@Override
	public void init() throws ServletException {
		System.out.println("Init called");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("service");
		try {
			resp.getWriter().println("service invoked!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() {
		System.out.println("destroy");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return super.getServletConfig();
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return super.getServletInfo();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public void test() {
		System.out.println("test method");
	}
}
