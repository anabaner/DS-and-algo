package ChapterFour;

public class MaxSubArrayBruteForce {

	public static void main(String[] args) {

		 int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
	        int n = a.length;
	        maxSubArraySum(a, n);
		
	}

	private static void maxSubArraySum(int[] A, int n) {
		int max_so_far =Integer.MIN_VALUE;
		int max_ending_here = 0;
		int start=0;int end =0;
		int s = 0;
		for(int i=0;i<n;i++) {
			max_ending_here = max_ending_here+A[i];
			if(max_so_far<max_ending_here) {
				 max_so_far = max_ending_here ;
				start = s;
				end =i;
			}
			 if(max_ending_here<0) {
				 max_ending_here =0;
				s=i+1;
			}
			
		}
		System.out.println("Max contiguous sum = "+max_so_far+"start:: "+start+" end:: "+end);
	}

}
