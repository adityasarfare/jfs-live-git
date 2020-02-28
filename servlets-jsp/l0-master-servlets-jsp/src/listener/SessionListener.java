package listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {
	private int sessionCount = 0;

	public void sessionCreated(HttpSessionEvent se) {
		synchronized (this) {
			sessionCount++;
		}
		System.out.println("Session Created: " + se.getSession().getId());
		System.out.println("Total Sessions: " + sessionCount);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		synchronized (this) {
			sessionCount--;
		}
		System.out.println("Session Destroyed: " + se.getSession().getId());
		System.out.println("Total Sessions: " + sessionCount);
	}
}
