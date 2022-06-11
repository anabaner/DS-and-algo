package BSTPrograms;

import BinaryTreesPrograms.BinaryTreeUtils;
import BinaryTreesPrograms.Node;

public class BinarySearchTreeToBSTConversion {

	public static void main(String[] args) {
		Node root = BinaryTreeUtils.createBinaryTree();
		BSTUtils.binaryTreeToBST(root);
		
	}

}
