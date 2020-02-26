package lambda;

public class Lambda {
	public static void main(String[] args) {
// Recipe
// Ingredient : Functional Interface
// Method : () -> {}
// Construction
		final Runnable runnable = () -> {
			System.out.println("Child Thread");
		};

		new Thread(runnable).start();
		new Thread(() -> {
			System.out.println("Child Thread");
		}).start();

		new Thread(() -> {
			System.out.println("Even Thread");
		}).start();

		new Thread(() -> {
			System.out.println("Odd Thread");
		}).start();
	}
}
