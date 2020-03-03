package listener;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletContextServlet2")
public class ServletContextServlet2 extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	//resp.getWriter().println(getServletContext().getAttribute("dbusername"));
	
	ServletContext context = getServletContext();
	String messageString = context.getAttribute("message").toString();
	resp.getWriter().println(messageString);
}
}
