package LinkedListPrograms;

public class LinkedListSearchingElement {

	public static void main(String[] args) {
		
		LinkedListUtils.push(12);
		LinkedListUtils.push(13);
		LinkedListUtils.push(12);
		LinkedListUtils.push(15);
		System.out.println(" Original Linked List :: ");
		LinkedListUtils.printList();
		
		boolean isKeyFound= LinkedListUtils.searchForKey(LinkedListUtils.head,12); //head ,key in params
		System.out.println("isKeyFound :: "+isKeyFound);
		
		
	}

}
