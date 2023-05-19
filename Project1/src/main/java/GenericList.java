import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public abstract class GenericList<T> implements Iterable<T> {
	private Node<T> head;
	private int length;
	
	//
	// Adds a new element data to the linked list
	// but will be implemented uniquely by children
	// classes.
	//
	public abstract void add(T data);
	
	//
	// Returns the first value of the linked list
	// and deletes the node. Return null if empty.
	//
	public T delete() {
		if(head != null) {
			Node<T> next = head.next;
			T val = head.data;
			head = next;
			this.length -= 1;
			return val;
		} else {
			return null;
		}
	}
	
	//
	// This method grabs every value in the
	// linked list and returns them in an ArrayList.
	// The linked list will be empty after this function
	// call.
	//
	public ArrayList<T> dumplist() {
		ArrayList<T> list = new ArrayList<>();
		while(head != null) {
			T val = this.delete();
			list.add(val);
		}
		return list;
	}
	
	//
	// Prints the items of the list, one value per a line
	// and if the list is empty, it prints "Empty List".
	//
	public void print() {
		if(head != null) {
			Node<T> curr = head;
			while(curr != null) {
				System.out.println(curr.data);
				curr = curr.next;
			}
		} else {
			System.out.println("Empty List");
		}
	}
	
	//
	// Returns the item at the specified index and
	// if the index is out of bounds, return null.
	//
	public T get(int index) {
		if(head != null && index < length && index >= 0) {
			Node<T> curr = head;
			int idx = 0;
			while(idx != index && curr != null) {
				curr = curr.next;
				idx++;
			}
			return curr.data;
		} else {
			return null;
		}
	}
	
	//
	// Replaces the element at specified index with the
	// given value element. Then returns the value
	// previously at that position. If index is out of
	// bounds, return null.
	//
	public T set(int index, T element) {
		if(head != null && index < length && index >= 0) {
			Node<T> curr = head;
			int idx = 0;
			while(idx != index && curr != null) {
				curr = curr.next;
				idx++;
			}
			T temp = curr.data;
			curr.data = element;
			return temp;
		} else {
			return null;
		}
	}
	
	//
	// Returns the length of the linked list
	//
	public int getLength() {
		return length;
	}
	
	//
	// Sets the length of the linked list
	//
	protected void setLength(int length) {
		this.length = length;
	}
	
	//
	// Returns a reference to the head of the list
	//
	public Node<T> getHead() {
		return head;
	}
	
	//
	// Sets the the head of the list to the reference element
	//
	protected void setHead(Node<T> element) {
		head = element;
	}
	
	public ListIterator<T> listIterator(int index) {
		return new GLListIterator<T>(this, index);
	}
	
	@Override
	public Iterator<T> iterator() {
		return new GLLIterator<T>(this);
	}
	
	public Iterator<T> descendingIterator() {
		return new ReverseGLLIterator<T>(this);
	}
	
	public class Node<S> {
		S data;
		Node<S> next;
		
		public Node(S data) {
			this.data = data;
			this.next = null;
		}
	}
}
