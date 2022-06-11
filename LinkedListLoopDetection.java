package LinkedListPrograms;
//LinkedList behaves as Stack if we use push or pop and behaves as queue if we usee add/remove inbuilt methods

/*Time complexity: O(n). 
Only one traversal of the loop is needed.
Auxiliary Space: O(n). 
n is the space required to store the value in hashmap.  -> if we use Floyd s algo using slow and fast pointers space become O(1) since
we dont need hashmap 
there are 5 ways of detection - https://www.geeksforgeeks.org/detect-loop-in-a-linked-list/
*/

public class LinkedListLoopDetection {

	public static void main(String[] args) {
		LinkedListUtils.push(15);
		LinkedListUtils.push(4);
		LinkedListUtils.push(15);
		LinkedListUtils.push(35);
		System.out.println(" Original Linked List :: "); //  35 15 15 4 15
		LinkedListUtils.printList();
		LinkedListUtils.head.next.next.next = LinkedListUtils.head; // for testing purpose create loop 
		boolean isLoopDetected = LinkedListUtils.detectLoop(LinkedListUtils.head);
		System.out.println("isLoopDetected:: "+isLoopDetected);
}

}
