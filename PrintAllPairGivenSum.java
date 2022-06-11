package ArrayProblems;

import java.util.Arrays;

public class PrintAllPairGivenSum {

	public static void main(String[] args) {

		 int arr[] = { 2, 3, 4, -2, 6, 8, 9, 11 };
	        Arrays.sort(arr);
	 
	        pairedElements(arr, 6);
	}

	private static void pairedElements(int[] arr, int sum) {
		
		
		int low =0; int high = arr.length-1;
		
		while(low<high) {
			
			if(arr[low]+arr[high] ==sum)
				System.out.println("( "+arr[low]+","+arr[high]+" )");
			
			 if(arr[low]+arr[high] >sum)
				high--;
			else 
				low++;
		}
		
		
	}

}
