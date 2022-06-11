package ArrayProblems;
/*
 * Time compl - O(n)
 */
public class MajorityEleminArray {

	public static void main(String[] args) {

		 int arr[] = {1, 30, 40, 50, 60, 70, 23, 20};
	        int n = arr.length;
	        System.out.println("The maximum element is "+ 
	                            findMaximum(arr, 0, n-1));
		
	}

	private static int findMaximum(int[] arr, int low, int high) {
		
		int max = arr[0];
		for(int i=low;i<high;i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		
		return max;
	}

}
