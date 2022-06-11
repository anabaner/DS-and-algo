package ArrayRevision;

import java.util.Arrays;

public class ArrayRearrangement {

	public static void main(String[] args) {
		int arr[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
		
		int n = arr.length;
		
		fixArray(arr,n);
		System.out.println(Arrays.toString(arr));
		
		
		
	}

	private static void fixArray(int[] arr, int n) {
		
		int temp;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				if(i==arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					break;
				}
				
				
			}
		}
		for(int i=0;i<n;i++) {
			if(arr[i]!=i)
				arr[i] =-1;
		}
		
		
	}

}
//[-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]

