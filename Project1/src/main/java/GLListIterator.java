import java.util.ArrayList;
import java.util.ListIterator;

public class GLListIterator<E> implements ListIterator<E>{
	private int curr;
	private ArrayList<E> data;
	
	public GLListIterator(GenericList<E> g, int idx) {
		int len = g.getLength();
		data = new ArrayList<>(len);
		curr = idx;
		for(int i = 0; i < len; i++) {
			data.add(g.get(i));
		}
	}

	@Override
	public boolean hasNext() {
		return curr < data.size();
	}

	@Override
	public E next() {
		E ret = data.get(curr);
		curr++;
		return ret;
	}

	@Override
	public boolean hasPrevious() {
		return curr >= 0;
	}

	@Override
	public E previous() {
		E ret = data.get(curr);
		curr--;
		return ret;
	}

	@Override
	public int nextIndex() {
		if(curr >= 0 && curr < data.size())
			return curr;
		else
			return data.size();
	}

	@Override
	public int previousIndex() {
		if(curr >= 0 && curr < data.size())
			return curr;
		else
			return 0;
	}

	//
	// Do not need to implement following methods
	//
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(E e) {
		// TODO Auto-generated method stub
		
	}
}
