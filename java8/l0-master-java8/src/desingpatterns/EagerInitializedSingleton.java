package desingpatterns;

class EagerInitializedSingleton {
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

class SingletonEx {
	// Single to n
	// Step 1 : create a private static final variable of the class.
	private static final SingletonEx INSTANCE = new SingletonEx();

	private String testVar = "test";

	// Step 2 : private constructor
	private SingletonEx() {

	}

	// Step 3 : have an accessor to access the instance
	public static SingletonEx getInstance() {
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