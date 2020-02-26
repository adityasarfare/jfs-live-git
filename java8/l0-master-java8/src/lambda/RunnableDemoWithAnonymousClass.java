package lambda;

public class RunnableDemoWithAnonymousClass {
	public static void main(String[] args) {
		Thread testThread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int ctr = 1; ctr < 10; ctr = ctr + 2) {
					System.out.println(ctr);
				}
			}
		});
		testThread.start();
	}
}
