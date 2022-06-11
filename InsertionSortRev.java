package ChapterTwo;

import java.util.Arrays;

public class InsertionSortRev {

	public static void main(String[] args) {

		int arr[] = {5,2,4,6,1,3};
		
		insertionSortRev(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void insertionSortRev(int A[]) {
		//int i= 0;
		for(int j = A.length-1;j>=0;j--) {
			
			int key = A[j];
			int i = j+1;
			while(i<A.length && A[i]>key) {
				A[i-1] = A[i];
				i++;
			
			}
			A[i-1] = key;
			}
		}

}


//o/p - [6, 5, 4, 3, 2, 1]
