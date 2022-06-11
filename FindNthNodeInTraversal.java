package BinaryTreesPrograms;
/*Time Complexity: O(n), where n is the number of nodes in the given binary tree. 
Auxiliary Space: O(1)
*/
public class FindNthNodeInTraversal {

	public static void main(String[] args) {
		Node root = BinaryTreeUtils.createBinaryTree(); 
		int indexofNodeToCheck = 4;//getting value of the node from this index using inorder traversal
		BinaryTreeUtils.getNodefromIndex(root,indexofNodeToCheck);
		BinaryTreeUtils.inorder(root,indexofNodeToCheck);
		BinaryTreeUtils.printnthPostorder(root,indexofNodeToCheck);
	}
}
