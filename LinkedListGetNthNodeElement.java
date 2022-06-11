package LinkedListPrograms;

public class LinkedListGetNthNodeElement {

	public static void main(String[] args) {
		LinkedListUtils.push(12);
		LinkedListUtils.push(13);
		LinkedListUtils.push(12);
		LinkedListUtils.push(15);
		System.out.println(" Original Linked List :: "); // 15 12 13 12 
		LinkedListUtils.printList();
		
		int element= LinkedListUtils.getNthNode(3); //index in params
		System.out.println("Index 3 contains element  :: "+element); //o/p ->Index 3 contains element  :: 12
	}

}
