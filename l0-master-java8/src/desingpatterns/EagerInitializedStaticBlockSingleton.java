package desingpatterns;

public class EagerInitializedStaticBlockSingleton {
	public static void main(String[] args) {
		// SingletonEx singletonEx = new SingletonEx();
		// SingletonEx singletonEx1 = new SingletonEx();
		SingletonEx singletonEx = SingletonEx.getInstance();
		// singletonEx.test();
		// singletonEx.setTest("changed");
		SingletonEx singletonEx1 = SingletonEx.getInstance();
		System.out.println(singletonEx);
		System.out.println(singletonEx1);
		singletonEx = null;
		singletonEx1.test();
		// singletonEx.test();
	}
}

class SingletonEx1 {
	// Single to n
	// Step 1 : create a private static final variable of the class.
	private static SingletonEx1 INSTANCE;

	private String testVar = "test";

	// Step 2 : private constructor
	private SingletonEx1() {

	}

	// Step 2.1 add a static block to handle exception
	static {
		try {
			INSTANCE = new SingletonEx1();
		} catch (Exception exception) {
			throw new RuntimeException("Exception instantiating the singleton");
		}
	}

	// Step 3 : have an accessor to access the instance
	public static SingletonEx1 getInstance() {
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