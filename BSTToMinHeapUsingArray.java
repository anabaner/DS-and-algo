package BSTPrograms;

public class BSTToMinHeapUsingArray {

	public static void main(String[] args) {

		BSTUtils.insert(4);
		BSTUtils.insert(2);
		BSTUtils.insert(6);
		BSTUtils.insert(1);
		BSTUtils.insert(3);
		BSTUtils.insert(5);
		BSTUtils.insert(7);
		
		System.out.println("before transform:: ");
		BSTUtils.printPreorderValues();
		BSTUtils.convertToMinHeap();
		System.out.println("");
		System.out.println("after transform:: ");
		BSTUtils.printPreorderValues();
	
	}

}
/*Input :          4
               /   \
              2     6
            /  \   /  \
           1   3  5    7  

Output :        1
              /   \
             2     5
           /  \   /  \
          3   4  6    7 
    
          */
