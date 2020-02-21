package features;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
	public static void main(String[] args) {
		// staticMethodReference();
		// objectInstanceMethodReference();
		// arbitraryObjectInstanceMethodReference();
		constructorMethodReference();
	}

	private static void staticMethodReference() {
		// using lambda expression to call the static method of a class
		Counter counter = array -> Utils.countElements(array);
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println(counter.count(intArray));

		// using static method reference
		Counter counter2 = Utils::countElements;
		System.out.println(counter2.count(intArray));

		// using static method reference again
		Counter counter3 = Utils::addElements;
		System.out.println(counter3.count(intArray));
	}

	private static void objectInstanceMethodReference() {
		// using lambda expression to call the static method of a class
		Utils utils = new Utils();
		Counter counter = array -> utils.countElementsIns(array);
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println(counter.count(intArray));

		// using static method reference
		Counter counter2 = utils::countElementsIns;
		System.out.println(counter2.count(intArray));
	}

	private static void arbitraryObjectInstanceMethodReference() {
		String[] strArray = { "a", "A", "E", "I", "O", "U", "a", "e", "i", "o", "u" };
		// using anonymous function
		/*
		 * Arrays.sort(strArray, new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) { return
		 * o1.compareToIgnoreCase(o2); } });
		 */

		// using lambdas
		/*
		 * Arrays.sort(strArray, (element1, element2) ->
		 * element1.compareToIgnoreCase(element2));
		 * System.out.println(Arrays.toString(strArray));
		 */

		// using instance method of an arbitrary object
		Arrays.sort(strArray, String::compareToIgnoreCase);
	}

	private static void constructorMethodReference() {
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);

		/*
		 * String string = intList.parallelStream() .collect(() -> new StringBuilder(),
		 * (x, y) -> x.append(y), (a, b) -> a.append(b)).toString();
		 * System.out.println(string);
		 */

		// using constructor method reference
		/*
		 * String string = intList.parallelStream() .collect(StringBuilder::new, (x, y)
		 * -> x.append(y), (a, b) -> a.append(b)).toString();
		 * System.out.println(string);
		 */

		// using constructor method reference + method reference
		String string = intList.parallelStream()
				.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
		System.out.println(string);
	}
}

@FunctionalInterface
interface Counter {
	int count(Object[] objArray);
}

class Utils {
	public static int countElements(Object[] array) {
		return array.length;
	}

	public int countElementsIns(Object[] array) {
		return array.length;
	}

	public static int addElements(Object[] array) {
		int sum = 0;
		for (Integer element : (Integer[]) array) {
			sum = sum + element;
		}
		return sum;
	}

}
