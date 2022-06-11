package ChapterTwo;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = {5,2,4,6,1,3};
		doBubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void doBubbleSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j =i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					//swap 
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
	}

}
