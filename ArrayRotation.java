package ArrayRevision;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {

		int left_rotate_arr[] = { 3,5,7,9,12 };
		
		int right_rotate_arr[] = { 1, 2, 3, 4, 5 };
		
		int k = 2;
		int n_left = left_rotate_arr.length;
		
		leftRotate(left_rotate_arr,k,n_left);
		System.out.println(Arrays.toString(left_rotate_arr));
		
		
		int n_right = right_rotate_arr.length;
		rightRotate(right_rotate_arr,k,n_right);
		System.out.println(Arrays.toString(right_rotate_arr));
	}

	private static void rightRotate(int[] arr, int k, int n) {
		for(int i=n; i>k; i--) {
			rightRotateUtil(arr,n);
		}
	}

	private static void rightRotateUtil(int[] arr, int n) {
		
		  	int i, temp;
	        temp = arr[0];
	        for (i = 0; i < n - 1; i++)
	            arr[i] = arr[i + 1];
	        
	        arr[i] = temp;
	}

	private static void leftRotate(int[] arr, int k, int n) {
		
		for(int i=0;i<k;i++) {
			leftRotateUtil(arr,n);
		}
		
	}

	private static void leftRotateUtil(int[] arr, int n) {
		int temp = arr[0];
		
		for(int i=0;i<n-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[n-1] = temp;
	}

}
//[7, 9, 12, 3, 5]
//[4, 5, 1, 2, 3]
