package MSInterview;
/*
 * Sapace comp - O(n) time compl - O(1) - lookup time and add time both
 */
import java.util.HashSet;

public class IntersectionOf2LinkedListHash {

	static Node head1 ;
	static Node head2 ;
	public static void main(String[] args) {
		createLinkedList1(head1);
		createLinkedList2(head2);
		int intpoint = findIntersection(head1,head2);
		System.out.println(intpoint);
	
		
	}
	
	private static void createLinkedList2(Node head2) {
		// creating second linked list
		IntersectionOf2LinkedListHash list = new IntersectionOf2LinkedListHash();
        list.head2 = new Node(10);
        list.head2.next = new Node(15);
        list.head2.next.next = new Node(30);		
	}
	private static void createLinkedList1(Node head1) {
		 // creating first linked list
		IntersectionOf2LinkedListHash list = new IntersectionOf2LinkedListHash();
        list.head1 = new Node(3);
        list.head1.next = new Node(6);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(15);
        list.head1.next.next.next.next = new Node(30);
	}
	
	private static int findIntersection(Node head1, Node head2) {
		HashSet<Integer> set = new HashSet<Integer>();
		while(head1!=null) {
			set.add(head1.data);
			head1 = head1.next;
		}
		
		while(head2!=null) {
			if(set.contains(head2.data)) {
				return head2.data;
			}
			head2=head2.next;
			
		}
		return -1;
	}

}


class Node{
	
	int data;
	Node next ;
	
	Node(int data){
		this.data = data;
		next = null;
	
	}
	
	
}
