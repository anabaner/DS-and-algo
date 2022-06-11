package ChapterFour;

public class MaxSubarrayDivideConquer {

	public static void main(String[] args) {

		 int a[] = { -2, -5, 6, -2, -3, 1, 5, -6 };
	        int n = a.length;
	        int start =0 ;int end = n-1;
			
	        int max_contiguous_sum = maxSubArraySum(a, start,end);
		System.out.println("max_contiguous_sum:: "+max_contiguous_sum);
	
		
	}

	private static int maxSubArraySum(int[] A, int start, int end) {
		
		if(start ==end )
			return A[start];
		
		int mid =((start+end)/2);
		
		int left_maxsubarray_sum = maxSubArraySum(A,start,mid);
		int right_maxsubarray_sum = maxSubArraySum(A, mid+1, end);
		int cross_sum = findMaxCrossSum(A,start,mid,end);
		
		//System.out.println(left_maxsubarray_sum+" "+right_maxsubarray_sum);
		
		int max_contiguous_sum = Math.max(Math.max(left_maxsubarray_sum, right_maxsubarray_sum), cross_sum);
		return max_contiguous_sum;
		
	}

	private static int findMaxCrossSum(int[] A, int start, int mid, int end) {
		
		int left_sum = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i=mid;i>=0;i--) {
			sum = sum+A[i];
			if(sum>left_sum)
				left_sum = sum;
		}
		int right_sum = Integer.MIN_VALUE;
		sum = 0;
		
		for(int i=mid+1;i<=end;i++) {
			sum=sum+A[i];
			if(sum>right_sum)
				right_sum =sum;
		}
		
		
		return Math.max(left_sum+right_sum,Math.max(left_sum, right_sum));
	}

}
