package ArrayRevision;

import java.util.Arrays;

public class ArrayOddEvenIndexProblem {

	public static void main(String[] args) {

		int arr[] =  { 6, 4, 2, 1, 8, 3 };
		
		int n = arr.length;
		
		arrayEvenOddRearrange(arr,n);
		System.out.println(Arrays.toString(arr));
		
		
	}

	private static void arrayEvenOddRearrange(int[] arr, int n) {
		
		for(int i=0;i<n-1;i++) {
			if(i%2==0 && arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i] =arr[i+1];
				arr[i+1] = temp;
			}
			
			if(i%2!=0 && arr[i]<arr[i+1]) {
				int temp = arr[i];
				arr[i] =arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		
	}

}

//o/p - 4 6 1 8 2 3 Timecompl - O(n) space - O(1)
