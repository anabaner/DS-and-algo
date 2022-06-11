package BSTPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import BinaryTreesPrograms.Node;

public class BSTUtils {

static BSTNode root;
static int index;
static int sum = 0;
public BSTUtils() {
		root = null;
		
	}
public static void insert(int key) {
	 root = insertRec(root,key);
}

private  static BSTNode insertRec(BSTNode root, int key) {
	
	if(root == null) {
		root = new BSTNode (key);
		return root;
	}
	
	if(key > root.data) {
		root.right =  insertRec(root.right, key);
	}
	else if(key < root.data) {
		root.left =  insertRec(root.left, key);
	}
	return root;
}

public  static void  printInorderValues() {
	
	doInorderTraversal(root);
	
}

public  static void doInorderTraversal(BSTNode root) {
	if(root == null)
		return;
	
	doInorderTraversal(root.left);
	System.out.print(root.data+" ");
	doInorderTraversal(root.right);
	
}

public  static void  printPreorderValues() {
	
	doInorderTraversal(root);
	
}

public  static void doPreOrderTraversal(BSTNode root) {
	if(root == null)
		return;
	
	System.out.print(root.data+" ");
	doPreOrderTraversal(root.left);
	doPreOrderTraversal(root.right);
	
}

	public static void deleteKey(int keyToDelete) {
	
		root = deleteRec(root,keyToDelete);

	
	}
	private static BSTNode deleteRec(BSTNode root, int keyToDelete) {
		
		if(root == null) {
			return root;
		}
		//if >root , then search right and delete
		if(keyToDelete >root.data) {
			root.right = deleteRec(root.right, keyToDelete);
		}
		else if(keyToDelete <root.data) {  //if <root , then search left and delete
			root.left  = deleteRec(root.left, keyToDelete);
		}
		else {  // if nodetoDelete is root node
			if(root.left == null) {
				return root.right;
			}
			else if(root.right == null) {
				return root.left;
			}
			root.data = minValue(root.right); // find the inorder successor of the root
			root.right = deleteRec(root.right,root.data);  // then delete the node and replace with the inorder successor
		}
		return root;
		
	}
	private static int minValue(BSTNode successor) {
		int minValue = successor.data;
		while (successor.left != null) {
			minValue = successor.left.data;
			successor = successor.left;
		}
		return minValue;
	}
	public static void binaryTreeToBST(Node root) {
		if(root==null)
			return;
		//counting nodes to decide size
		int n= countNodes(root);
		System.out.println("no of nodes:: "+n);
		//initialize array
		int arr[] = new int[n];
		
		//copy elements of binary tree to array 
		putElemofBinaryTreeToArray(root,arr);
		
		Arrays.sort(arr); //sort using quick sort(complexity- n^2)
		
		//make index 0 and again copy back from array to BST
		index=0;
		generateBSTfromArr(root,arr);
		
		//do in order and print values
		printValues(root);
		
		
	}
	private static void printValues(Node root) {
		if(root==null) {
			return;
		}
		
		printValues(root.left);
		System.out.print(root.data+" ");
		printValues(root.right);
		
		
	}
	private static void generateBSTfromArr(Node root, int[] arr) {
		
		if (root==null)
			return;
		
		generateBSTfromArr(root.left, arr);
		
		root.data =	arr[index];
		index++;
		
		generateBSTfromArr(root.right, arr);
		
	}
	private static void putElemofBinaryTreeToArray(Node root, int[] arr) {
		if (root==null)
			return;
		
		putElemofBinaryTreeToArray(root.left, arr);
		
		arr[index] = root.data;
		index++;  //copy root data and move to next element
		
		putElemofBinaryTreeToArray(root.right, arr);
		
	}
	private static int countNodes(Node root) {
		if(root== null)
			return 0;
		
		return countNodes(root.left)+countNodes(root.right)+1;
	}
	public static void convertToMaxSumTree() {
		convertToMaxSumTreeRecur(root);
	}
	private static void convertToMaxSumTreeRecur(BSTNode root) {
	//TODO do it without recursion	
		if(root==null)
			return;
		
		if(root.right != null)
		System.out.println("right data" +root.right.data);
		
		convertToMaxSumTreeRecur(root.right);
		
		sum = sum+root.data;
		System.out.println("sum:: " +sum);
		root.data = sum -root.data;
		System.out.println("root.data:: " +root.data);
		
		convertToMaxSumTreeRecur(root.left);
		
	}
	
	public static void convertToMinHeap() {
		List<Integer> arr = new ArrayList<Integer>();
		convertBSTToArray(root,arr);
		convertArrayToMinHeap(root,arr);
	}
	private static void convertArrayToMinHeap(BSTNode root, List<Integer> arr) {
		if(root==null)
			return;
		root.data = arr.get(index++);
		convertArrayToMinHeap(root.left,arr);
		convertArrayToMinHeap(root.right, arr);
	}
	private static void convertBSTToArray(BSTNode root, List<Integer> arr) {
		if(root==null)
			return;
		convertBSTToArray(root.left,arr);
		arr.add(root.data);
		convertBSTToArray(root.right, arr);
	}
}
