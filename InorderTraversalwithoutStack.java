package BinaryTreesPrograms;

public class InorderTraversalwithoutStack {

	public static void main(String[] args) {
		Node root = BinaryTreeUtils.createBinaryTree();
		BinaryTreeUtils.doMorrisTraversal(root);
	}

}

//TODO - Read more on Threaded Binary Trees
/*Threaded Binary Tree concept will improve the space
complexity of Morris Preorder Traversal, Morris Inorder Traversal and Morris Postorder Traversal from O(n) to O(1).*/