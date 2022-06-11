package LinkedListPrograms;

/*methods to insert a new node in three ways 

1) At the front of the linked list 
2) After a given node. 
3) At the end of the linked list
	Time complexity of push() is O(1) as it does a constant amount of work.
*/

public class LinkedListElementInsertion {
	public static void main(String[] args) {
		LinkedListUtils.head = new Node(12);
		Node node1 = new Node(13);
		Node node2 = new Node(14);
		LinkedListUtils.head.next = node1;
		node1.next = node2; //12,13,14
		
		System.out.println(" Original Linked List :: ");
		LinkedListUtils.printList();
		
		System.out.println(" After push :: ");
		LinkedListUtils.push(5);  // 5,12,13,14
		LinkedListUtils.printList();
		
		System.out.println(" Inserting 15 in between :: ");
		LinkedListUtils.insertAfter(LinkedListUtils.head.next,15);//  5 12 15 13 14 
		//LinkedListUtils.insertAfter(node1,15);//5 12 13 15 14
		LinkedListUtils.printList();
		
		System.out.println(" After append / last node insert of 16  ::");
		LinkedListUtils.append(16);//5 12 15 13 14 16 
		LinkedListUtils.printList();
	}
	
	


}
