package ArrayPrograms;

/*BUBBLE SORT - 
 *  time complexity of Bubble Sort is O(n2),space complexity for Bubble Sort is O(1)
 *  BINARY SEARCH-
 *   time complexity of the binary search algorithm is O(log n). 
 *   The best-case time complexity would be O(1) when the central index would directly match the desired value. 
 *   The worst-case scenario could be the values at either extremity of the list or values not in the list
 *   In the iterative method, the space complexity would be O(1). While in the recursive method, the space complexity would be O(log n)
 */


public class ArraySortingandSearching {

	public static void main(String[] args) {
		int arr[] = {4, 3, 2,7, 5,1, 6,7,12}; //o/p -> 1 2 3 4 5 6 7 7 12 
		int n = arr.length;
		int key = 7;
		sortArray(arr,n);
		 for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");     
	        }  
		int pos = binarySearch(arr,n,key);//o/p=>3
		System.out.println("pos:: "+pos); 
	}
	
	private static int binarySearch(int[] arr, int n, int key) {
		int low = 0;
		int high = n-1;
		int pos = -1;
		while(low<=high) {
			int mid = (high+low)/2;
			if(key == arr[mid]) {
				pos =  mid;
				break;
			}
			else if(key < arr[mid]) {
				high = mid-1;
			}
			else if(key>arr[mid]) {
				low = mid+1;
			}
		}
		
		return pos;
		
	}
	public static int[] sortArray(int arr[],int n) {
		
		int temp = 0;
		for(int i = 0;i<n;i++) {
		     for(int j=1; j < (n-i); j++){  
			if(arr[j]<arr[j-1]) {
				temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				
			}
		  }
		}
		
		
	return arr;
	}

}
