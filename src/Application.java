
public class Application {

	public static void main(String[] args) {
		
		
		Queue restaurant = new Queue();
		
		System.out.println("Bill, Alice and Bob are in line.\n");
		
		restaurant.enqueue("Bill");
		restaurant.enqueue("Alice");
		restaurant.enqueue("Bob");
		restaurant.printList();
		System.out.println();
		
		System.out.println("A customer is served.\n");
		restaurant.dequeue();
		
		System.out.println("Jane arrives\n");
		restaurant.enqueue("Jane");
		restaurant.printList();
		System.out.println();
		
		System.out.println("Hamad arrives\n");
		restaurant.enqueue("Hamad");
		restaurant.printList();
		System.out.println();
		
		System.out.println("Two customers are served.\n");
		restaurant.dequeue();
		restaurant.dequeue();
		
		System.out.println("Jim arrives\n");
		restaurant.enqueue("Jim");
		restaurant.printList();
		System.out.println();
		
		System.out.println("A customer is served.\n");
		restaurant.dequeue();
		restaurant.printList();
		System.out.println();
		
		System.out.println("A customer is served.\n");
		restaurant.dequeue();
		restaurant.printList();
		

	}

}
