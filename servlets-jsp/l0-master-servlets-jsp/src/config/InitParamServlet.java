package config;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParamServlet extends HttpServlet {
	String dayString = null;
	String monthString = null;

	public void init(ServletConfig config) throws ServletException {
		dayString = config.getInitParameter("Day");
		monthString = config.getInitParameter("Month");
		System.out.println("init () ");
		System.out.println(dayString + " " + monthString);
	}
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("service");
		System.out.println(dayString + " " + monthString);
	}
}

