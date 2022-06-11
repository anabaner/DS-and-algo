package LinkedListPrograms;

/*Time Complexity: O(n) 
Auxiliary Space: O(1)*/
public class LinkedListGetElementOccurenceCount {

	public static void main(String[] args) {
		LinkedListUtils.push(15);
		LinkedListUtils.push(4);
		LinkedListUtils.push(15);
		LinkedListUtils.push(15);
		LinkedListUtils.push(35);
		System.out.println(" Original Linked List :: "); //  35 15 15 4 15
		LinkedListUtils.printList();
		
		int elementOccurenceCount = LinkedListUtils.getElementCount(15);
		System.out.println(" elementOccurenceCount :: "+elementOccurenceCount); // o/p->3
		
		
	}

}
