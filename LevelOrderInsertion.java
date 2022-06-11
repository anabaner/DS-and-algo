package BinaryTreesPrograms;

public class LevelOrderInsertion {

	public static void main(String[] args) {
		Node root = BinaryTreeUtils.createBinaryTree();
		int key = 12 ;
		System.out.println("Order before insertion ::");
		BinaryTreeUtils.inorder(root);
		BinaryTreeUtils.levelOrderInsertion(root,key);
		System.out.println("");
		System.out.println("Order after insertion ::");
		BinaryTreeUtils.inorder(root);
	}
	
	// o/p 
	/* Order before insertion ::
	 4 2 5 1 6 3
	 Order after insertion ::
	  4 2 5 1 6 3 12 */

}
