package ArrayRevision;

public class AtleastTwoElementsGreater {

	public static void main(String[] args) {

		int arr[] =  { 7, -2, 3, 4, 9, -1};
		
		int n = arr.length;
		
		  arrayFindAtleastTwoElementsGreater(arr,n);
		// System.out.println(max);
	
	}

	private static void arrayFindAtleastTwoElementsGreater(int[] arr, int n) {
		// to find the second max in the array and then find all elements lesser than second
		int first = Integer.MIN_VALUE;
		int second = Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>first) {
				second = first;
				first = arr[i];
			}
			else if(arr[i]>second)
				second = arr[i];
		}
		
		for(int i=0;i<n;i++) 
			if(arr[i]<second)
				System.out.print(arr[i]+" ");
	}

}
// time compl - O(n) o/p  =  -2 3 4 -1 