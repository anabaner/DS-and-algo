package LinkedListPrograms;

public class LinkedListReversal {

	public static void main(String[] args) {
	
		/*
		 * LinkedListUtils.push(10); LinkedListUtils.push(15); LinkedListUtils.push(25);
		 */
		LinkedListUtils.head=new Node(10);
		LinkedListUtils.head.next=new Node(15);
		LinkedListUtils.head.next.next=new Node(20);
		
		LinkedListUtils.reverseList();
		LinkedListUtils.printList();
	}

}
