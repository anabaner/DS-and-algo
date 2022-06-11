package ChapterTwo;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {

	int arr[] = {5,2,4,6,1,3};
	
	mergeSort(arr);
	System.out.println(Arrays.toString(arr));
	
	}

	private static void mergeSort(int[] arr) {
		
		int r = arr.length-1;
		int p = 0;
		
		mergeRecSort(arr,p,r);
	}

	private static void mergeRecSort(int[] arr, int p, int r) {
		
		// take two temp arrays Left and Right 
		
		if(p<r) {
		int q = p+(r-p)/2; //stackoverflow error if P is not added in beginning with r-p/2
		
		//divide
		mergeRecSort(arr,p,q);
				
		mergeRecSort(arr, q+1, r);
		
		//conquer/merge
		conquer (arr,p,q,r);
		}
	}

	private static void conquer(int[] A, int p, int q, int r) {
		int n1= q-p+1;
		int n2= r-q;

		int Left[] = new int[n1];
		int Right[] = new int [n2];
		
		//copying elements from orig A to left nd right 
		
		for(int i =0;i<Left.length;i++) {
			Left[i] = A[p+i];
		}
		for(int i =0;i<Right.length;i++) {
			Right[i] = A[q+1+i];
		}
		
		int i=0,j=0 ,k=p;
		
		while(i<n1 && j<n2) {
			if(Left[i]<=Right[j]) {
				A[k] = Left[i];
				i++;
			}
			else {
				A[k] = Right[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			A[k] = Left[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			A[k] = Right[j];
			j++;
			k++;
		}
	}
}
