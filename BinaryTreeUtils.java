package BinaryTreesPrograms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeUtils {
static int flag = 0;
static int count = 0;
	public static Node createBinaryTree() {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

        return tree.root;
		
		/*
		  1 
		/   \
		2    3
	   / \  / \
	   4  5 6 7
	   
	   */
		 
	}

	public static void levelOrderTraversal(Node root) {
		//https://java2blog.com/binary-tree-level-order-traversal-java/
		//similar to BFS - counting level wise 
		
		Queue<Node> queue = new LinkedList<Node>();
		
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			Node temp = queue.poll();
			
			 System.out.print(" "+temp.data);
			 
			if(temp.left!=null) {
				queue.add(temp.left);
			}
			
			if(temp.right!=null) {
				queue.add(temp.right);
			}
			
		}
	}

	public static void levelOrderInsertion(Node root, int key) {
		
		if(root == null) {
			root = new Node(key);
			return;
		}
		
		Queue<Node> queue = new LinkedList<Node>();
		
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			Node temp = queue.poll();
			
			// System.out.print(" "+temp.data);
			 
			if(temp.left==null) {
				temp.left = new Node(key);
				break;
			}
			else {
				queue.add(temp.left);
			}
			
			if(temp.right ==null) {
				temp.right = new Node(key);
				break;
			}
			else {
				queue.add(temp.right);
			}
			
		}
		
	}

	public static void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(" "+root.data);
		inorder(root.right);
	}

	public static void printInOrder(Node root) {
		if(root == null)
			return;
		printInOrder(root.left);
		System.out.print(" "+root.data);
		printInOrder(root.right);
	}

	public static void printPreOrder(Node root) {
		if(root == null)
			return;
		System.out.print(" "+root.data);
		printPreOrder(root.left);
		printPreOrder(root.right);
	}

	public static void printPostOrder(Node root) {
		if(root == null)
			return;
		printPostOrder(root.left);
		printPostOrder(root.right);
		System.out.print(" "+root.data);
	}

	public static void doMorrisTraversal(Node root) {
		
		Node current , pre ;
		if(root == null) 
			return;
		
		current = root;
		
		while(current!=null) {
			if(current.left == null) {
				System.out.print(current.data+" ");
				current = current.right;
			}
			else {
				pre = current.left;
				while(pre.right!=null && pre.right!= current) 
					pre = pre.right;
					if(pre.right == null) {
						pre.right = current ;
						current = current.left;
					}
					else {
						pre.right = null;
						System.out.print(current.data+" ");
						current = current.right;
					}
				}
			}
	}

	public static void printPostFromInPre(int[] in, int[] pre, int n) {
		int root = search(in,pre[0],n);
		
		if(root!=0) {
			printPostFromInPre(in,Arrays.copyOfRange(pre, 1, n),root); //print left subtree
		}
		if(root!=n-1) {
			printPostFromInPre(Arrays.copyOfRange(in, root+1, n),Arrays.copyOfRange(pre,root+1, n),n-root-1); //print right subtree
		}
		System.out.print(pre[0]+" "); // print root
	}

	private static int search(int[] in, int preFirstElem, int n) {
		
		for(int i = 0;i<n;i++) {
			if(in[i]==preFirstElem)
				return i;
		}
		return -1;
		
		
	}

	public static void getNodefromIndex(Node node, int n) {
		   
		 if (node == null)  
		        return;  
		    
		    if (count <= n) {  
		    	getNodefromIndex(node.left, n);  
		        count++;  
		    
		        if (count == n)  
		            System.out.println("nth node inorder:: "+ node.data);  
		    
		        getNodefromIndex(node.right, n);  
		    }  
	}
	
	 public static void inorder(Node root, int num) {
		 int count = 0;
		 if (root == null)
	            return;
		 Node node = root;
		 Stack<Node> stack = new Stack<Node>();

		 while (node != null || stack.size() > 0) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }

        node = stack.pop();
        count++;
        if (count == num) {
            System.out.println("nth node inorder with Stack ::"+node.data);
            break;
        }
        node = node.right;

    }
	 }

	public static void printnthPostorder(Node root, int indexofNodeToCheck) {
	
		if(root == null)
			return;
		
		if(flag<=indexofNodeToCheck) {
			printnthPostorder(root.left, indexofNodeToCheck);
			printnthPostorder(root.right, indexofNodeToCheck);
			flag++;
			if(flag == indexofNodeToCheck) {
				System.out.println("nth node Postorder:: "+root.data);
			}
		}
	}

}
