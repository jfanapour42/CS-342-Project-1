

public class GLProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to project 1");
		GenericQueue<Integer> GQ = new GenericQueue<>(1);
		GQ.print();
		System.out.println("Removed " + GQ.dequeue() + " from queue");
		GQ.enqueue(2);
		GQ.print();
		System.out.println("List length: " + GQ.getLength());
	}
}
