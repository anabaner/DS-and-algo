package LinkedListPrograms;

/*count the number of nodes in a given singly linked list.
 * Can be both iterative / recursive, below is iterative method*/

public class LinkedListLengthCalc {

	public static void main(String[] args) {

		LinkedListUtils.head = new Node(12);
		Node node1 = new Node(13);
		Node node2 = new Node(14);
		LinkedListUtils.head.next = node1;
		node1.next = node2; 
		LinkedListUtils.push(5);  
		LinkedListUtils.push(53);  
		System.out.println(" Original Linked List :: ");
		LinkedListUtils.printList();
		//LinkedListUtils.head =null; // for checking empty list 
		System.out.print("Size of list :: "+LinkedListUtils.getTotalNodeCount()); //o/p - 5
				
		
	}

}
