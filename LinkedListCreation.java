package LinkedListPrograms;

public class LinkedListCreation {
	public static void main(String[] args) {

		LinkedListUtils.head = new Node(5);
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		LinkedListUtils.head.next = node1;
		node1.next = node2;
		node2.next = node3;
		LinkedListUtils.printList();

	}
}

