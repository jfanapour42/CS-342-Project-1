import java.util.Iterator;

public class GLLIterator<E> implements Iterator<E> {
	private GenericList<E>.Node<E> curr;
	
	public GLLIterator(GenericList<E> g) {
		curr = g.getHead();
	}

	@Override
	public boolean hasNext() {
		return (curr != null);
	}

	@Override
	public E next() {
		E ret = curr.data;
		curr = curr.next;
		return ret;
	}
}
