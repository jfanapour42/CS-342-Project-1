import java.util.ArrayList;
import java.util.Iterator;

public class ReverseGLLIterator<E> implements Iterator<E> {
	private int curr;
	private ArrayList<E> data;
	
	public ReverseGLLIterator(GenericList<E> g) {
		int len = g.getLength();
		data = new ArrayList<>(len);
		curr = len - 1;
		for(int i = 0; i < len; i++) {
			data.add(g.get(i));
		}
	}

	@Override
	public boolean hasNext() {
		return curr >= 0;
	}

	@Override
	public E next() {
		E ret = data.get(curr);
		curr--;
		return ret;
	}
}