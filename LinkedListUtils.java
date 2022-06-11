package LinkedListPrograms;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import BSTPrograms.BSTNode;

public class LinkedListUtils {
	public static Node head;
	public static void printList() {//Traversing the LinkedList
		Node n = head;
		while(n!=null) {
			System.out.print(" "+n.data);
			n = n.next;
		}
		System.out.println(" ");

	}
	public static void push(int new_data) { // pushing data to head loc and moving the next elements to right
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	public static void insertAfter(Node prevNode, int new_data) {//Inserts a new node after the given prev_node.
		if(prevNode==null) {
			System.out.println("prev_node cant be null");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prevNode.next; // assigns next of prev node to next of new node now
		prevNode.next = new_node;// assigns next of prevNode to itself(newnode)

	}
	public static void append(int new_data) {
		Node new_last_node = new Node(new_data);
		if(head == null) {
			new_last_node = head;
			return;
		}
		new_last_node.next = null;//this node being the last node

		//traverse to the end of list if head not null
		Node last = head;
		while(last.next!=null) {
			last = last.next;
		}
		last.next = new_last_node;
	}
	public static void deleteNode(int key) {
		Node temp = head;
		Node prev = null;
		while(temp!=null && temp.data == key) { // when key is in head node.
			head = temp.next ;
			return;
		}
		while(temp != null && temp.data!= key) { // traverse the list keeping in track the previous nodes.
			prev = temp;
			temp = temp.next;
		}
		if(temp==null) { //if key not found to delete
			return;
		}
		prev.next = temp.next; // unlink the temp and assign the link of next data to the prev data

	}
	public static void deletePositionalNode(int position) {
		Node temp = head;
		if(head == null ) { //if linked list empty
			return ;
		}
		if(position == 0 ) { // if head node is the node to be deleted 
			head = temp.next;
			return;
		}

		// traverse through nodes from 0 to the position
		for(int i =0 ;temp != null && i<position-1;i++) {
			temp = temp.next;
		}
		if(temp == null || temp.next == null) // if position is more than no of nodes
			return;

		temp.next = temp.next.next; // Node temp->next is the node to be deleted , so assign the value to this node 
	}

	public static void deleteList() {
		head = null;
	}
	public static int getTotalNodeCount() {

		Node temp = head ;
		int count = 0;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;

	}
	public static boolean searchForKey(Node head, int key) {
		Node temp = head ;
		while(temp!=null ) {
			if(temp.data == key) {
				return true;
			}
			temp = temp.next;
		}

		return false;
	}
	public static int getNthNode(int index) {

		Node temp = head;
		int count = 0 ;

		while(temp!=null) {
			if(count == index ) {
				return temp.data;
			}
			count++;
			temp= temp.next;
		}

		return -1;
	}
	public static int getNthNodeFromEnd(int index) {

		Node temp = head ;
		int count = 0;
		while(temp!=null) {
			temp = temp.next;
			count++;
		}//finding length of linked list

		if(count<index)
			return -1  ; // index greater than length

		temp = head ; // again initialize temp as head ,loop and check where is data at index i
		for(int i = 1;i<count-index+1;i++) {//dont start loop from 0 , as we need position as 1,2,3,4 and not 0,1,2,3,4
			if( temp.next!= null) // this check for index 0 or negative index
				temp = temp.next;
			else 
				return -3;

		}
		return temp.data;

	}
	public static int getMidElement() {
		Node slow_ptr = head ; Node fast_ptr = head;
		while(fast_ptr!=null && fast_ptr.next != null) {
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
		} // if we move fast one 2 times and slow one once then slow one data gives the mid value 
		
		return slow_ptr.data;
	}
	public static int getElementCount(int elementToCount) {
		Node temp = head;
		int count = 0 ;
		while(temp!=null) {
			if(temp.data == elementToCount)
				count++;
			temp = temp.next;
		}
		return count;
	}
	public static boolean detectLoop(Node temp) {
		Set<Node> set = new HashSet<Node>();
		while(temp!=null) {
			if(set.contains(temp)) {
				return true;
			}
			set.add(temp);
			temp = temp.next;
		}
		return false;
	}
	public static boolean checkPalindrome(Node head) {
		Node temp = head;
		boolean isPalin = false;
		Stack<Integer> stack = new Stack<Integer>();
		while(temp!=null) { // first push the data in stack and then pop and check 1 by one from end of stack comparing with head
			stack.push(temp.data);
			temp = temp.next;
		}
		while(head!=null) {
			int i = stack.pop();
			if(head.data == i ) {
				isPalin =  true;
			}
			else {
				isPalin = false ;
				break;
			}
			head = head.next;
			
		}
		return isPalin;
		
		
	}
	public static BSTNode convertLlistToBST(int n) {
		
		if(n<=0)
			return null;
		
		BSTNode left = convertLlistToBST(n/2);
		
		BSTNode root = new BSTNode(head.data);  //making root of left subtree
		root.left = left; //set pointer to left subtree	
		
		head = head.next; //change head pointer of linked list for parent recursive calls
		
		root.right = convertLlistToBST(n-n/2-1);
		
		return root;
	}
	public static Node reverseList() {
		Node curr = head;
		Node next = null;
		Node prev = null;
		
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev=curr;
			curr=next;
		}
		head = prev;
		return head;
	}
	
}

class Node { //defining Node with data and pointer 
	int data;
	Node next ;
	public Node(int data) {
		this.data = data;
		next = null;
	}
}

