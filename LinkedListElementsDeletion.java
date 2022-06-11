package LinkedListPrograms;

/*Iterative Method:
To delete a node from the linked list, we need to do the following steps. 
1) Find the previous node of the node to be deleted. 
2) Change the next of the previous node. 
3) Free memory for the node to be deleted.*/
public class LinkedListElementsDeletion {

	public static void main(String[] args) {
		
		LinkedListUtils.push(12);
		LinkedListUtils.push(13);
		LinkedListUtils.push(12);
		LinkedListUtils.push(15);
		System.out.println(" Original Linked List :: ");
		LinkedListUtils.printList();
		
		System.out.println(" After positional delete :: ");
		LinkedListUtils.deletePositionalNode(1);// here key is the position of data to be deleted  from the linked list 
		LinkedListUtils.printList();
		
		System.out.println(" After data delete :: ");
		LinkedListUtils.deleteNode(12);// here key is the data to be deleted in the linked list 
		LinkedListUtils.printList();
		
	
	}

}
/*
 * o/p
 * 
 * Original Linked List :: 15 12 13 12 
 * After delete :: 15 13 12
 */
