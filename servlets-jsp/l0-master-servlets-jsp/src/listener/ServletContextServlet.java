package listener;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletContextServlet")
public class ServletContextServlet extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	   // resp.getWriter().println(getServletContext().getAttribute("dbusername"));
	    
	    ServletContext context = getServletContext();
	   context.setAttribute("message", "From ServletContextServlet ");
}
}
