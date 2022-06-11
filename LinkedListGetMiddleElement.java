package LinkedListPrograms;

public class LinkedListGetMiddleElement {

	public static void main(String[] args) {

		LinkedListUtils.push(20);
		LinkedListUtils.push(4);
		LinkedListUtils.push(15);
		LinkedListUtils.push(25);
		LinkedListUtils.push(35);
		System.out.println(" Original Linked List :: "); //  35 25 15 4 20 
		LinkedListUtils.printList();
		
		int midElement = LinkedListUtils.getMidElement();
		System.out.println("Middle Element :: "+midElement); //o/p ->Index 3 contains element  :: 15
		
		
	}

}
