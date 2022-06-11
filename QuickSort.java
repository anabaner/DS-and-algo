package ChapterSix;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {

		 int arr[] = { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };
		 quickSort(arr,0,arr.length-1);
		 System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int low, int high) {
		
		if(low<high) {
			int q= partition(arr,low,high);
			quickSort(arr, low, q-1);
			quickSort(arr, q+1, high);
		}
		
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i=low-1;
		
		for(int j= low;j<high;j++) {
			if(arr[j]<=pivot) {
				i++;
				
				int temp = arr[i];
				arr[i] =arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high] ;
		arr[high] = temp;
		
		return i+1;
		
	}
}
