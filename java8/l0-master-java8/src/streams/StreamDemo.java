package streams;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
	public static String testString;
	static Integer number;
	static int number1;

	public static void main(String[] args) {

		// System.out.println(testString.length());
		// List testList = new ArrayList();
		// testList.add(3);
		// number = number + 100;
		// number1 = number1 + 100;
		// System.out.println(number1);
		// System.out.println(number);
		// Traditional List

		List<String> listOfStrings = Arrays.asList("Java", "Oracle",
				"JavaScript");
//		// A sequential stream to the elements in a collection.
//		Stream<String> stringsStream = listOfStrings.stream();
//		// System.out.println(stringsStream);
//		// Filter the stream
//		Stream<String> filteredStream = stringsStream
//				.filter(item -> item.length() > 5);
//		Optional<String> optionalString = filteredStream.findFirst();
//		if (optionalString.isPresent()) {
//			System.out.println(optionalString);
//		} else {
//			System.out.println("No Items Found");
//		}
//
//		System.out.println("Continuing");

//		Optional<String> largeString = listOfStrings.stream()
//				.filter(str -> str.length() > 5).findAny();
//		largeString.ifPresent(System.out::println);

		listOfStrings.stream().filter(str -> str.length() > 8).findAny()
				.ifPresent(System.out::println);

//
//		Optional<String> veryLargeString = listOfStrings.stream()
//				.filter(str -> str.length() > 20).findAny();
//		veryLargeString.ifPresent(System.out::println);

	}
}
