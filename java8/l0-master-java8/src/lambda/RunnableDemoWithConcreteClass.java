package lambda;

public class RunnableDemoWithConcreteClass {
	public static void main(String[] args) {
		Odd oddObj = new Odd();
		Thread testThread = new Thread(oddObj);
		testThread.start();
	}
}

class Odd implements Runnable {
	@Override
	public void run() {
		for (int ctr = 1; ctr < 10; ctr = ctr + 2) {
			System.out.println(ctr);
		}
	}

}