package MSInterview;
/*
 * Time comp = O(m+n) , space comp -O(1)
 */
public class IntersectionOf2LLUsingCount {

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
			
			int c1 = getCount(head1);
			int c2 = getCount(head2);
			int d = Math.abs(c1-c2);
			int getIntPoint = 0 ;
			
			if(c1>c2) {
				 getIntPoint = getIntPoint(d,head1,head2);
			}
			else if(c2>c1) {
				getIntPoint = getIntPoint(d,head2,head1);
			}
			
			return getIntPoint;
		}

		private static int getIntPoint(int d, Node node1, Node node2) {
			
			for(int i=0;i<d;i++) {
				if(node1==null)
					return -1 ;
				node1=node1.next;
			}
			
			while(node1!=null && node2!=null) {
				if(node1.data==node2.data)
					return node1.data;
				
				node1= node1.next;
				node2= node2.next;
				
			}
			return -1;
			
		}

		private static int getCount(Node head) {
			int count = 0;
			while(head!=null) {
				count++;
				head = head.next;
			}
			return count;
		}
	

}
