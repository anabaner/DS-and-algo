package BinaryTreesPrograms;
//A tree whose elements have at most 2 children is called a binary tree
/*A Tree node contains following parts. 
1. Data 
2. Pointer to left child 
3. Pointer to right child
*/
//The maximum number of nodes at level ‘l’ of a binary tree is 2^l.
//The Maximum number of nodes in a binary tree of height ‘h’ is 2^h – 1.
//In a Binary Tree with N nodes, minimum possible height or the minimum number of levels is Log2(N+1)
//A Binary Tree with L leaves has at least | Log2L |+ 1   levels 
//In Binary tree where every node has 0 or 2 children, the number of leaf nodes is always one more than nodes with two children(internal nodes).
public class BinaryTree {
	
	Node root;
	
	BinaryTree(int key){
		root = new Node(key);
	}
	
	BinaryTree(){
		root = null ;
	}
	public static void main(String[] args) {
		Node root = BinaryTreeUtils.createBinaryTree();
	
		
	}

}
