package sde3questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given a Binary Tree of size N and an integer K. 
 * Print all nodes that are at distance k from root (root is considered at distance 0 from itself).
 *  Nodes should be printed from left to right. If k is more that height of tree, nothing should be printed.

For example, if below is given tree and k is 2. Output should be 4 5 6.

          1
       /     \
     2        3
   /         /   \
  4        5    6 
     \
      8
 */


public class TreeKDistFromRoot {

	public static void main(String[] args) {
		//BinaryTreeUtils.createBinaryTree();
		BinaryTreeUtils.root = new Node(1);
		BinaryTreeUtils.root.left = new Node(2);
		BinaryTreeUtils.root.right = new Node(3);
		BinaryTreeUtils.root.left.left = new Node(4);
		BinaryTreeUtils.root.right.left = new Node(5);
		BinaryTreeUtils.root.right.right = new Node(6);
		BinaryTreeUtils.root.left.left.right = new Node(8);
		BinaryTreeUtils.doInorderTraversal(BinaryTreeUtils.root);
		List<Integer> list = BinaryTreeUtils.getTreeAsList();
		List<Integer> distList = new ArrayList<Integer>();
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		System.out.println(list);
		int k=2;
		for(Integer i :list) {
			map.put(i,BinaryTreeUtils.findDistanceFromRoot(BinaryTreeUtils.root,i));
			
		}
		for(Map.Entry<Integer, Integer> hm:map.entrySet()) {
			
			if(hm.getValue() == k)
				distList.add(hm.getKey());
			
		}
		System.out.println("distList:: "+distList);
		
		BinaryTreeUtils.findKDistant(BinaryTreeUtils.root,k);
		
		
		
	}

}

class Node{
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data=data;
		left = right =null;
		}
}
class BinaryTreeUtils {
	public static Node root;
	static List<Integer> list = new ArrayList<Integer>();
	public static void doInorderTraversal(Node root) {
		
		if(root == null)
			return;
		doInorderTraversal(root.left);
		System.out.print(root.data+" ");
		list.add(root.data);
		doInorderTraversal(root.right);
		
		
		
	}
	
	public static int findDistanceFromRoot(Node root, Integer eachElement) {
		if(root==null)
			return -1;
		int dist = -1;
		
		if(root.data == eachElement || (dist = findDistanceFromRoot(root.left, eachElement))>=0
				||(dist = findDistanceFromRoot(root.right, eachElement))>=0)
					dist++;
		
		return dist;
		
		
	}
	public static List<Integer> getTreeAsList() {
		return list;
	}
	
	public static void findKDistant(Node root, int k) {
		
		if(root == null || k<0)
			return;
		if(k==0) {
			System.out.print(root.data+" ");
		}
		findKDistant(root.left,k-1);
		findKDistant(root.right,k-1);
	}
	
}
