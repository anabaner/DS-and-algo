package MSInterview;

public class BinaryTreeCousins {

	static BSNode root;
	
	public static void main(String[] args) {
		root = new BSNode(4);
		root.left.left = new BSNode(4);
		root.left.right = new BSNode(6);
		root.left.left.left = new BSNode(5);
		root.left.left.right = new BSNode(1);
		root.left.right.left = new BSNode(2);
		root.left.right.right = new BSNode(3);
		
		getAllCousins(root, root.left.left);

	}

	private static void getAllCousins(BSNode root, BSNode node) {

		int level = getLevel(root,node,1);
		printLevel(root,node,level);
	}

	private static int getLevel(BSNode root, BSNode node, int level) {
		if(root==null)
			return 0;
		
		if(root== node)
			return level;
		
		int downLevel = getLevel(root.left, node, level+1);
		if(downLevel!=0)
			return downLevel;
		return getLevel(root.right, node, level+1);
		
		
	}
	
	private static void printLevel(BSNode root, BSNode node, int level) {
		
		if(root==null || level<2)
			return ;
		
		if(level ==2) {
			if(root.left==node ||root.right==node)
				return;
		if(root.left !=null)
			System.out.println(root.data);
		
		if(root.right !=null)
			System.out.println(root.data);
		}
		
		else if(level>2) {
			printLevel(root.left,  node,  level-1) ;
			printLevel( root.right,  node,  level-1) ;
		}
	}

	

}


class BSNode{
	
	int data;
	BSNode left;
	BSNode right;
	
	BSNode(int data){
		this.data = data;
	}
}
