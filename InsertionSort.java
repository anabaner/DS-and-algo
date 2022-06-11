package ChapterTwo;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int arr[] = {5,2,4,6,1,3};
		
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void insertionSort(int A[]) {
		//int i= 0;
		for(int j = 1;j<A.length;j++) {
			
			int key = A[j];
			int i = j-1;
			while(i>=0 && A[i]>key) {
				A[i+1] = A[i];
				i--;
			
			}
			A[i+1] = key;
			}
		}

}
