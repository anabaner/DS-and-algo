package LinkedListPrograms;

public class EntireLinkedListDeletion {

	public static void main(String[] args) {
		LinkedListUtils lu = new LinkedListUtils();
		//lu.push(5);
		LinkedListUtils.push(30);
		LinkedListUtils.push(25);
		LinkedListUtils.push(15);
		System.out.println(" Original Linked List :: ");
		LinkedListUtils.printList();
		
		LinkedListUtils.deleteList();
		LinkedListUtils.push(10);
		System.out.println("Linked list after deletion ::");
		LinkedListUtils.printList();
	}

}
