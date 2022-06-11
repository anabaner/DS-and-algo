package BSTPrograms;

import LinkedListPrograms.LinkedListUtils;
//Time Complexity: O(n)
public class LinkedListToBSTConversion {

	public static void main(String[] args) {
		LinkedListUtils.push(7);
		LinkedListUtils.push(6);
		LinkedListUtils.push(5);
		LinkedListUtils.push(4);
		LinkedListUtils.push(3);
		LinkedListUtils.push(2);
		LinkedListUtils.push(1);
		
		LinkedListUtils.printList();
		int n = LinkedListUtils.getTotalNodeCount();
		BSTNode root = LinkedListUtils.convertLlistToBST(n);
		BSTUtils.doPreOrderTraversal(root);
		//LinkedListUtils.push(7);
	}

}

/*
o/p
linked list = 1 2 3 4 5 6 7 
after Preorder - 4 2 1 3 6 5 7
*/