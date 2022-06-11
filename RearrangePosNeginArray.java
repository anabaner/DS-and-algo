package ArrayRevision;
/*
 * Space com- O(1) -no temp array is reqd , used to quick sort which is inplace algo
 * Time com - O(n) - since we need to iterate over all elements
  */
import java.util.Arrays;

public class RearrangePosNeginArray {

	public static void main(String[] args) {

		int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
		
		int n = arr.length;
		
		arrayReaarange(arr,n);
		//System.out.println(Arrays.toString(arr));
		
	}

	private static void arrayReaarange(int[] arr, int n) {
		int partitioningIndex  = doQuickSortPartition(arr,n);
		
		System.out.println(partitioningIndex);
		
		// now swap neg with pos nos alternatively 
		
		int neg =0; int pos = partitioningIndex+1;
		
		while(arr[neg]<0 && neg<pos && pos<n) {
			int temp = arr[neg];
			arr[neg] = arr[pos];
			arr[pos] = temp;
			
			pos++;
			neg= neg+2;
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	private static int doQuickSortPartition(int[] arr, int n) {
		 int temp =0;
		 int partitioningIndex =-1;
		//taking quick sort pivot as 0 and comparing with 0 to find neg and pos
		for(int j=0;j<n;j++) {
			if(arr[j]<0) {
				partitioningIndex++;
				temp = arr[partitioningIndex];
				arr[partitioningIndex] = arr[j];
				arr[j] = temp;
			}
		}
		return partitioningIndex;
	}

}

/*
 * output
 * 
 * 2 
 * [4, -3, 5, -1, 6, -7, 2, 8, 9]
 */
