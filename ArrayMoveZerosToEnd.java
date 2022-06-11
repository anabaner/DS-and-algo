package ArrayRevision;

import java.util.Arrays;

public class ArrayMoveZerosToEnd {

	public static void main(String[] args) {


		int arr[] = {1, 2, 0, 0, 0, 3, 6};
		
		int n = arr.length;
		
		moveZerosToEnd1(arr,n);
		System.out.println(Arrays.toString(arr));
		
	
	}

	private static void moveZerosToEnd(int[] arr, int n) {

		int count = 0 ;
		
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr[count++] = arr[i];
			}
		}  // this gives o/p  -[1, 2, 3, 6] so pos nos are moved in front
		
		while(count<n) {
			arr[count++] =0;  //o/p [1, 2, 3, 6, 0, 0, 0] fill the array with zeros from count to n
		}
	}
	
	private static void moveZerosToEnd1(int[] arr, int n) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[count++] = arr[i];
			}}
		System.out.println(count);
			
			while(count<n) {
				arr[count++] = 0;
			}
		
	}

}
