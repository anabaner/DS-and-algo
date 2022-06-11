package LinkedListPrograms;

public class LinkedListGetNthNodeFromEnd {

	public static void main(String[] args) {

		LinkedListUtils.push(20);
		LinkedListUtils.push(4);
		LinkedListUtils.push(15);
		LinkedListUtils.push(35);
		System.out.println(" Original Linked List :: "); // 15 12 13 12 
		LinkedListUtils.printList();
		
		int element= LinkedListUtils.getNthNodeFromEnd(4); //index in params
		System.out.println("Index 4 from backwards contains element  :: "+element);
		
		int zeroIndexelement= LinkedListUtils.getNthNodeFromEnd(0); //index in params
		System.out.println("Index 0 from backwards err code  :: "+zeroIndexelement); // -2
		
		int negIndexelement= LinkedListUtils.getNthNodeFromEnd(-4); //index in params
		System.out.println("Index -4 from backwards err code  :: "+negIndexelement); //o/p ->Index 3 contains element  :: -3
	
	}

}
