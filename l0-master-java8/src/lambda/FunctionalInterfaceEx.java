package lambda;

import java.util.ArrayList;

@FunctionalInterface
interface FunctionalInterface1 {
	abstract void test();

	// void test1();
	static void staticMethod() {
		System.out.println("Static Method");
	}

	default void defaultMethod() {
		System.out.println("Default Method");
	}
}

interface FunctionalInterface2 extends FunctionalInterface1 {
	abstract void test();

	// void test1();
	static void staticMethod() {
		System.out.println("Static Method");
	}

	default void defaultMethod() {
		System.out.println("Default Method");
	}
}

class Test implements FunctionalInterface1 {

	@Override
	public void test() {
		System.out.println("New Method");

	}

	@Override
	public void defaultMethod() {
		System.out.println("Default Method");
	}

	static void staticMethod() {
		System.out.println("Static New Method");
	}
}

class Test1 implements FunctionalInterface1 {

	@Override
	public void test() {
		// TODO Auto-generated method stub

	}

}

public class FunctionalInterfaceEx {
	public static void main(String[] args) {
		FunctionalInterface1.staticMethod();
		ArrayList list = new ArrayList();
		list.add("one");
		list.add("two");
		list.forEach((item) -> System.out.println(item));
		list.forEach(System.out::println);
	}
}
