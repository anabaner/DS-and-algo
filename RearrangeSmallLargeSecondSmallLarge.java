package ArrayRevision;

import java.util.Arrays;

public class RearrangeSmallLargeSecondSmallLarge {
	public static void main(String[] args) {


		int arr[] =  { 5, 8, 1, 4, 2, 9, 3, 7, 6 };
		
		int n = arr.length;
		
		arraySortAndRearrange(arr,n);
		System.out.println(Arrays.toString(arr));
		
	
	}

	private static void arraySortAndRearrange(int[] arr, int n) {
		Arrays.sort(arr);
		
		int tempArr[] = new int[n];
		int arrIndex = 0;
		
		for(int i=0,j=n-1;i<=n/2||j>n/2;i++,j--) {
		
			
			if(arrIndex<n) {
				tempArr[arrIndex] = arr[i];
				
				arrIndex++;
			}
			
			if(arrIndex<n) {
				tempArr[arrIndex] = arr[j];
				arrIndex++;
			}
			
		}
		for(int i=0;i<n;i++) {
			arr[i] = tempArr[i];
		}
	}
}
// o/p =  {1, 9, 2, 8, 3, 7, 4, 6, 5}