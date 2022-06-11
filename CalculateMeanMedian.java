package ArrayRevision;

import java.util.Arrays;

public class CalculateMeanMedian {

	public static void main(String[] args) {

		int arr[] =  {1, 3, 4, 2, 6, 5, 8, 7};
		
		int n = arr.length;
		
		  int mode = calcMode(arr,n);
		  
		  double median = calcMedian(arr,n);
		// System.out.println(max);
		  System.out.println(median);
			System.out.println(mode);
	}
//time compl -mode :- O(n), median - O(nlogn) since we sort in median
	private static double calcMedian(int[] arr, int n) {
		//first sort array
		// find n is even or odd 
		// if even then calc sum of middle 2 elements and divide by 2
		// if odd get the middle element
		double median = 0;
		Arrays.sort(arr);
		
		if(n%2==0) {
			median = (arr[n/2]+arr[(n-1)/2])/2.0;
		}
		else if(n%2 !=0) {
			
			median = arr[n/2];
			
		}
		return median;
	}

	private static int calcMode(int[] arr, int n) {
		//sum/n
		
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum = sum+arr[i];
		}
		return sum/n;
	}

}
