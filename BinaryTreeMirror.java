package MSInterview;

public class BinaryTreeMirror {
	static BNode root;
	public static void main(String[] args) {

		root = new BNode(1);
		root.left = new BNode(2);
		 root.right = new BNode(3);
	     root.left.left = new BNode(4);
	        root.left.right = new BNode(5);
	        root.right.left = new BNode(6);
	        root.right.right = new BNode(7);
	        
	        System.out.println("Before mirror-----------------");
	        doInorder(root);
	        System.out.println("");
	        convertToMirror(root);
	        
	        System.out.println("After mirror-----------------");
	        doInorder(root);
	 
		
	}
	private static void convertToMirror(BNode root) {
		
		if(root==null)
			return;
		
		convertToMirror(root.left);
		convertToMirror(root.right);
		swap(root);
		
	}
	private static void swap(BNode root) {
		
		if(root==null)
			return ;
		
		BNode node = root.left;
		root.left = root.right;
		root.right = node;
		
	}
	private static void doInorder(BNode root) {
		
		if(root== null)
			return;
		
		doInorder(root.left);
		System.out.print(root.data+" ");
		doInorder(root.right);
		
	}

	
}

class BNode{
	int data;
	BNode left;
	BNode right;
	
	BNode(int data){
		this.data =data;
		left = right = null;
	
	
	}
}
