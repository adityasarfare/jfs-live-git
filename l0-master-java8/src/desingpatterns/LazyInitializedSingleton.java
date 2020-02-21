package desingpatterns;

public class LazyInitializedSingleton {
	public static void main(String[] args) {
		// SingletonEx singletonEx = new SingletonEx();
		// SingletonEx singletonEx1 = new SingletonEx();
		SingletonEx2 singletonEx = SingletonEx2.getInstance();
		// singletonEx.test();
		// singletonEx.setTest("changed");
		// SingletonEx2 singletonEx1 = singletonEx;
		SingletonEx2 singletonEx1 = SingletonEx2.getInstance();
		System.out.println(singletonEx);
		System.out.println(singletonEx1);
		// singletonEx = null;
		singletonEx1.test();
		// singletonEx.test();
	}
}

class SingletonEx2 {
	// Single to n
	// Step 1 : create a private static final variable of the class.
	private static SingletonEx2 INSTANCE;

	private String testVar = "test";

	// Step 2 : private constructor
	private SingletonEx2() {

	}

	// Step 3 : have an accessor to access the instance
	public static SingletonEx2 getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonEx2();
		}
		return INSTANCE;
	}

	//
//		public void setTest(String pTest) {
//			testVar = pTest;
//		}
	//
//		public void test() {
//			System.out.println(testVar);
//		}
	public void test() {
		System.out.println("test data");
	}
}