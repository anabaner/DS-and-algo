package BSTPrograms;

public class TransformBSTMaxSumTree {

	public static void main(String[] args) {

		BSTUtils.insert(11);
		BSTUtils.insert(2);
		BSTUtils.insert(29);
		BSTUtils.insert(1);
		BSTUtils.insert(7);
		BSTUtils.insert(15);
		BSTUtils.insert(40);
		BSTUtils.insert(35);
		
		System.out.println("before transform:: ");
		BSTUtils.printInorderValues();
		BSTUtils.convertToMaxSumTree();
		System.out.println("");
		System.out.println("after transform:: ");
		BSTUtils.printInorderValues();
	}

}
