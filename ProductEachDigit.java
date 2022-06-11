package ArrayProblems;

import java.util.Arrays;

public class ProductEachDigit {

	public static void main(String[] args) {

		int arr[] = { 12,3,5,2,7};
		
		int output[] = getProductOfRemElements(arr);
		System.out.println(Arrays.toString(output));
	}

	private static int[] getProductOfRemElements(int[] arr) {
		
		int prod = 1;
		for(int i=0;i<arr.length;i++) {
			prod*= arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = prod/ arr[i];
		}
		
		
		return arr;
	}

}
