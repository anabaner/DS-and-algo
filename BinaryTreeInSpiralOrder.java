package MSInterview;

public class BinaryTreeInSpiralOrder {
static BTNode root;
	public static void main(String[] args) {
		BinaryTreeInSpiralOrder tree = new BinaryTreeInSpiralOrder();
        tree.root = new BTNode(1);
        tree.root.left = new BTNode(2);
        tree.root.right = new BTNode(3);
        tree.root.left.left = new BTNode(7);
        tree.root.left.right = new BTNode(6);
        tree.root.right.left = new BTNode(5);
        tree.root.right.right = new BTNode(4);
        System.out.println("Spiral order traversal of Binary Tree is ");
        tree.printSpiral(tree.root);
	}
	
	
	private void printSpiral(BTNode root) {
		
		int height = getHeight(root);
		boolean ltr = false ;
		
		for(int i=0;i<height;i++) {
			printGivenLevelNode(root,i,ltr);
			ltr = !ltr;
		}
		
	}


	private void printGivenLevelNode(BTNode node, int level, boolean ltr) {
		if(node==null)
			return;
		
		if(level ==1)
			System.out.println(node.data);
		
		if(level>1) {
			
			if(ltr!=false) {
				printGivenLevelNode( node.left,  level-1,  ltr);
				printGivenLevelNode( node.right,  level-1,  ltr);
			}
			
			else {
				printGivenLevelNode( node.right,  level-1,  ltr);
				printGivenLevelNode( node.left,  level-1,  ltr);
			}
			
		}
	}


	private int getHeight(BTNode root) {
		
		if(root == null)
			return 0;
		
		  int lheight = getHeight(root.left);
          int rheight = getHeight(root.right);

			/*
			 * if (lheight > rheight) return (lheight + 1); else return (rheight + 1);
			 */
          
          return (lheight > rheight)?lheight+1:rheight+1;
	}

}

 class BTNode{
	
	int data ;
	BTNode left;
	BTNode right;
	
	BTNode(int data){
		this.data = data;
		left = right = null;
	}
	
	
}
