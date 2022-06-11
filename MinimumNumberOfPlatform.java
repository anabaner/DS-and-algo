  package ArrayProblems;

  
 /* Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00} 
  dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00} 
  Output: 3 
  Explanation: There are at-most three trains at a time (time between 9:40 to 12:00)*/
  
public class MinimumNumberOfPlatform {

	public static void main(String[] args) {
		 int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
	        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
	        System.out.println(
	            "Minimum Number of Platforms Required = "
	            + findPlatform(arr, dep));
	}

	private static int findPlatform(int[] arr, int[] dep) {
		int platNeeded=1;
		int result=1;
		
		for(int i=0;i<arr.length;i++) {
			platNeeded =1;
			
		for(int j=i+1;j<arr.length;j++) {
				
				if((arr[i]>=arr[j] && arr[i]<=dep[j]) || (arr[j]>=arr[i] && arr[j]<=dep[i]))
					platNeeded++;
				
							}
			result =Math.max(result,platNeeded);
		}
		
		
		return result;
	}

}
