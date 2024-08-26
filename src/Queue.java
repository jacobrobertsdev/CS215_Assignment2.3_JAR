
/**
 * The Queue class represents a Queue using the GenericLinkedList<T> class. Adds
 * methods to enque, deque, and print the current queue.
 */
public class Queue {

	GenericLinkedList<String> queue;

	/**
	 * Default constructor Instantiates a GenericLinkedList of Strings
	 * 
	 */
	public Queue() {
		queue = new GenericLinkedList<String>();
	}

	/**
	 * Adds a node at the tail / end of the queue
	 * 
	 * @param item the data for the new node
	 */
	public void enqueue(String item) {

		queue.addNode(new GenericNode<String>(item));

	}

	/**
	 * Removes a node from the head / front of the queue
	 * 
	 * @throws IllegalStateException if the queue is empty
	 */
	public void dequeue() throws IllegalStateException {

		if (queue.isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}

		GenericNode<String> head = queue.getList();
		head = head.getNextNode();
		queue.setHead(head);

	}

	/**
	 * Prints the current queue as a string
	 * 
	 */
	public void printList() {

		String result = "Current queue: ";

		GenericNode<String> currentNode = queue.getList();

		while (currentNode != null) {

			if (currentNode != queue.getTail()) {
				
				result += (currentNode.getData() + ", ");
				currentNode = currentNode.getNextNode();

			} else {
				
				result += (currentNode.getData());
				currentNode = currentNode.getNextNode();
			}

		}

		System.out.println(result);
	}

}
