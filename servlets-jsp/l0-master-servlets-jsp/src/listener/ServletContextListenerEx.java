package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextListenerEx implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext context = sce.getServletContext();
		String dbuserString = context.getInitParameter("dbuser");
		System.out.println("The user loaded : " + dbuserString);
		System.out.println("DB connection established ");
		//context.setAttribute("dbusername", dbuserString);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("DB connection destroyed");
	}
}
