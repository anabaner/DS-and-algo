package ArrayRevision;

import java.util.Arrays;

public class ArrayReversal {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		
		int n = arr.length;
		
		arrayReverse(arr,n);
		System.out.println(Arrays.toString(arr));
	}

	private static void arrayReverse(int[] arr, int n) {
		
		int start = 0;
		int end = n-1;
		int temp;
		
		while(start<end) {
			//keep swapping the values
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start ++;
			end--;
		}
		
	}

}
