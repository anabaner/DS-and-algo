package ArrayProblems;

public class MaxNoOfConsecutiveOnes {

	public static void main(String[] args) {

		int arr[] = {1, 1, 0, 0,1, 0, 1, 0, 1, 1, 1, 1};
                   
		int n = arr.length;

		System.out.println(getMaxLength(arr, n));
		
		
	}

	private static int getMaxLength(int[] arr, int n) {
		
		int count =0,result=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==0)
				count =0;
			
			else {
				count++;
				result = Math.max(result, count);
			}
			
		}
		
		return result;
	}

}
