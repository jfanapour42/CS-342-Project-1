public class GenericStack<T> extends GenericList<T> {
	private Node<T> tail;
	
	public GenericStack (T element) {
		Node<T> n = new Node<>(element);
		this.setHead(n);
		this.tail = n;
		this.setLength(1);
	}
	
	//
	// Removes the tail node from the underlying linked list
	// and returns the value stored there.
	//
	public T removeTail() {
		T val;
		if (this.getLength() == 0) {
			return null;
		} else if (this.getLength() == 1) {
			val = this.tail.data;
			this.tail = null;
			this.setHead(null);
		} else {
			Node<T> curr = this.getHead();
			while (curr.next.next != null) {
				curr = curr.next;
			}
			val = this.tail.data;
			curr.next = null;
			this.tail = curr;
		}
		this.setLength(this.getLength()-1);
		return val;
	}

	//
	// Add a new element data to the top (head) of the stack
	//
	@Override
	public void add(T data) {
		Node<T> n = new Node<>(data);
		// stack is empty so set tail to new node
		if (this.getLength() == 0) {
			this.tail = n;
		}
		// add new node in front of head and change head
		n.next = this.getHead();
		this.setHead(n);
		this.setLength(getLength() + 1);
	}
	
	//
	// Puts new element 'data' to the top of the stack
	//
	public void push(T data) {
		this.add(data);
	}
	
	//
	// Removes the element at the top of the stack
	//
	public T pop() {
		return this.delete();
	}
}
