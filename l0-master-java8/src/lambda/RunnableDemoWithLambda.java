package lambda;

public class RunnableDemoWithLambda {
	public static void main(String[] args) {
		new Thread(() -> {
			for (int ctr = 1; ctr < 10; ctr = ctr + 2) {
				System.out.println(ctr);
			}
		}).start();

		Runnable runnableLambda = () -> {
			System.out.println("runnableLambda");
		};

		new Thread(runnableLambda).start();

		new Thread(() -> {
			System.out.println("Child Thread");
		}).start();

		new Thread(() -> {
			String testString = "My Test";
			System.out.println(testString);
		}).start();
	}
}