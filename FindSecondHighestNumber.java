package sde3questions;

public class FindSecondHighestNumber {

	public static void main(String[] args) {

		int arr [] = {-7,5,-2,0};   // 1,5,6,2,3
		int n = findSecondHighestNo(arr);
		System.out.println(n);
		
	}

	private static int findSecondHighestNo(int[] arr) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>highest) {
				secondHighest = highest;
				highest = arr[i];
				
			}
			else if(arr[i] !=highest && arr[i]>secondHighest ) {
				secondHighest = arr[i];
			}
			
		}
		return secondHighest;
	}

}
