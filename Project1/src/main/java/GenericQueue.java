public class GenericQueue<T> extends GenericList<T> {
	private Node<T> tail;
	
	public GenericQueue (T element) {
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
	// Add the new element data to the end of the queue
	//
	@Override
	public void add(T data) {
		Node<T> n = new Node<>(data);
		// If queue is empty, then new node is head and tail
		if (this.getLength() == 0) {
			this.setHead(n);
			this.tail = n;
			this.setLength(getLength() + 1);
			return;
		}
		// Add the new node at the end of queue and change the tail
		this.tail.next = n;
		this.tail = n;
		this.setLength(getLength() + 1);
	}
	
	//
	// Adds the new element to the end of the queue
	//
	public void enqueue(T data) {
		this.add(data);
	}
	
	//
	// Removes the first element at the front of the queue
	//
	public T dequeue() {
		return this.delete();
	}
}
