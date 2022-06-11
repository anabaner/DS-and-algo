package BSTPrograms;

public class BSTNodeDeletion {

	public static void main(String[] args) {


		BSTUtils.insert(50);
		BSTUtils.insert(30);
		BSTUtils.insert(20);
		BSTUtils.insert(40);
		BSTUtils.insert(70);
		BSTUtils.insert(60);
		BSTUtils.insert(80);

		BSTUtils.printInorderValues();

		System.out.println("\nDelete 20");
		BSTUtils.deleteKey(20);
		System.out.println("Inorder traversal of the modified tree");
		BSTUtils.printInorderValues();

		System.out.println("\nDelete 50");
		BSTUtils.deleteKey(50);
		System.out.println("Inorder traversal of the modified tree");
		BSTUtils.printInorderValues();
	}
}
/*  BST
50
/     \
30      70
/  \    /  \
20   40  60   80

 * https://www.geeksforgeeks.org/binary-search-tree-set-2-delete/
 *
 */
