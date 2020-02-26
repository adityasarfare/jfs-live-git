package lambda;

import java.util.Iterator;
import java.util.Spliterator;

public class OverrideDefaultMethod {

}

class CIterable implements Iterable<String> {

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Spliterator<String> spliterator() {
		return null;
	}
}