package features;

import java.util.Optional;

public class OptionalDemo {
	static String testString;

	public static void main(String[] args) {
		if (Math.random() > 0.5) {
			testString = "Welcome";
		}
		Optional testStringOptional = Optional.ofNullable(testString);
		if (testStringOptional.isPresent())
			System.out.println(testStringOptional.get());
		else {
			System.out.println("No String Available");
		}
	}
}
