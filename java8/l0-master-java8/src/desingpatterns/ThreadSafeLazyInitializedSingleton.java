package desingpatterns;

public class ThreadSafeLazyInitializedSingleton {
	public static void main(String[] args) {
		// SingletonEx singletonEx = new SingletonEx();
		// SingletonEx singletonEx1 = new SingletonEx();
		SingletonEx4 singletonEx = SingletonEx4.getInstance();
		// singletonEx.test();
		// singletonEx.setTest("changed");
		// SingletonEx2 singletonEx1 = singletonEx;
		SingletonEx4 singletonEx1 = SingletonEx4.getInstance();
		System.out.println(singletonEx);
		System.out.println(singletonEx1);
		// singletonEx = null;
		singletonEx1.test();
		// singletonEx.test();
	}
}

class SingletonEx4 {
	// Single to n
	// Step 1 : create a private static final variable of the class.
	private static SingletonEx4 INSTANCE;

	private String testVar = "test";

	// Step 2 : private constructor
	private SingletonEx4() {

	}

	// Step 3 : have an accessor to access the instance
//	public static synchronized SingletonEx4 getInstance() {
//		// 50 lines of code which does some activity
//		if (INSTANCE == null) {
//			INSTANCE = new SingletonEx4();
//		}
//		return INSTANCE;
//	}

	public static synchronized SingletonEx4 getInstance() {
		// 50 lines of code which does some activity
		if (INSTANCE == null) {
			INSTANCE = new SingletonEx4();
		}
		return INSTANCE;
	}

//	public static SingletonEx4 getInstance() {
//		// 50 lines of code which does some activity
//		synchronized (SingletonEx4.class) {
//			if (INSTANCE == null) {
//				INSTANCE = new SingletonEx4();
//			}
//		}
//
//		return INSTANCE;
//	}

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