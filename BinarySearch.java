package ChapterTwo;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {5,3,6,7,9}; //3,5,6,7,9
		int key = 7;
		int index = doBinarySearch(arr,key);
		System.out.println(index);

	}

	private static int doBinarySearch(int arr[], int keyTobeSearched) {
		
		Arrays.sort(arr);
		int n = arr.length;
		int low = 0,high = n-1;
		
		while(low<=high) {
		int mid = low+(high-low) /2;
		//System.out.println(mid);
		if(arr[mid]== keyTobeSearched) {
			return mid;
		}
		 if(arr[mid]<keyTobeSearched)
			low=mid+1;
		else
			high = mid-1;
		
	}
		return -1;
	}

}
