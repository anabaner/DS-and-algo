package ArrayRevision;

import java.util.Arrays;

public class LargestELementinArray {

	public static void main(String[] args) {
		int arr[] =  { 6, 4, 2, 1, 8, 3 };
		
		int n = arr.length;
		
		 int max = arrayfindLargest(arr,n);
		 System.out.println(max);
	}


	private static int arrayfindLargest(int[] arr, int n) {
		
		int max = arr[0];
		
		for (int i=0;i<n;i++) {
			if(arr[i]>max)
				max = arr[i];
				
		}
		return max;
		
	}
	
	
	

}
