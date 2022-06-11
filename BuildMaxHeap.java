package ChapterFive;

import java.util.Arrays;

public class BuildMaxHeap {

	public static void main(String[] args) {

		
		 int arr[] = { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };
		 
	        int n = arr.length;
	        buildMaxHeap(arr,n);
	        System.out.println(Arrays.toString(arr));
	}

	public static void buildMaxHeap(int[] arr, int n) {

		 for (int i = n / 2 - 1; i >= 0; i--)
	            heapify(arr, n,i);
		
	}

	public static void heapify(int arr[], int n, int i) {

		int largest =i ; //assuming i is the root and is the largest value
		int left =2*i+1;
		int right = 2*i+2;
		
		if(left<n && arr[left]>arr[largest])
			largest = left;
		
		if(right<n && arr[right]>arr[largest])
			largest = right;
		
		if(largest!=i) { //swap the root
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] =temp;
			heapify(arr,n,largest);
		}
		
		
	}

}
