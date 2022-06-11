package ChapterFive;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {

		 int arr[] = { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };
		 heapsort(arr,arr.length);
		 System.out.println(Arrays.toString(arr));
	}


	private static void heapsort(int[] arr, int n) {
		BuildMaxHeap.buildMaxHeap(arr, n);
		
		  for(int i = n-1; i > 0; i--) {
			  int temp =arr[0];
			  arr[0] =arr[i]; 
			  arr[i] = temp;
		  BuildMaxHeap.heapify(arr, i,0);
		  }
		 
		
		
	}

}
