package BinaryTreesPrograms;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		Node root = BinaryTreeUtils.createBinaryTree();
		System.out.println("Level Order traversal of binary tree will be: ");
		BinaryTreeUtils.levelOrderTraversal(root);
	}

}

//o/p - Level Order traversal of binary tree will be: 
// 1 2 3 4 5 6 7
