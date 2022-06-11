package ArrayProblems;
/*space comp- O(1), time comp - O(n)*/

public class WaterTrappingProblem {

	public static void main(String[] args) {
		
		int arr[] =  {3, 0, 2, 0, 4};
		int n = arr.length;
		
		int max_water_trapped = getMaxWaterTrapped(arr,n);
		System.out.println(max_water_trapped);
	}

	private static int getMaxWaterTrapped(int[] arr, int n) {
		
		int hi =n-1;int lo = 0;
		int left_max = 0 ,right_max =0,result =0;
		
		
		while(lo<=hi) {
			
			if(arr[lo]<arr[hi]) {
				
				if(arr[lo]> left_max) {
					
					left_max= arr[lo];
					
				}
				else {
					result+=left_max-arr[lo];
				}
				lo++;
			}
			else {

				if(arr[hi]>right_max) {
					
					right_max= arr[hi];
					
				}
				else {
					result+=right_max-arr[hi];
				}
				hi--;
				
			}
			
		}
		return result;
		
	}

}
