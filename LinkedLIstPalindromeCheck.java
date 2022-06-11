package LinkedListPrograms;
//Time Complexity - O(n)
public class LinkedLIstPalindromeCheck {

	public static void main(String[] args) {
		LinkedListUtils.push(1);
		LinkedListUtils.push(2);
		LinkedListUtils.push(3);
		LinkedListUtils.push(4);
		LinkedListUtils.push(3);
		LinkedListUtils.push(2);
		LinkedListUtils.push(1);
		System.out.println(" Original Linked List :: "); //   1 2 3 4 3 2 1 
		LinkedListUtils.printList();
		boolean isPalin = LinkedListUtils.checkPalindrome(LinkedListUtils.head);
		System.out.println("isPalin :: "+isPalin);
	}

}
