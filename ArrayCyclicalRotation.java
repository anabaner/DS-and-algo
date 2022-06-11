package ArrayRevision;

import java.util.Arrays;

public class ArrayCyclicalRotation {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		
		int n = arr.length;
		
		cyclicalRotate(arr,n);
		System.out.println(Arrays.toString(arr));
	}

	private static void cyclicalRotate(int[] arr, int arr_length) {
		
		int temp = arr[arr_length -1];
		
		for(int i=arr_length -1 ;i>0;i--){
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		
	}

}

//o/p - [5, 1, 2, 3, 4]

