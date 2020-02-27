package basics;

public class App {
	public static void main(String[] args) {
		FirstServlet firstServlet = new FirstServlet();
		firstServlet.test();
		firstServlet.service(null, null);
	}
}
