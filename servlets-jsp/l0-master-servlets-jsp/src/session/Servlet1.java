package session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session1")
public class Servlet1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// insertDB();
		String username = request.getParameter("username");
		String language = request.getParameter("language");
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("usernamekey", username);
		httpSession.setAttribute("languagekey", language);
	}
}
