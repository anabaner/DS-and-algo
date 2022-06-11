package ArrayPrograms;

public class ArrayRotations {
	/*
	 * Time complexity : O(n * d) 
		Auxiliary Space : O(1)
	 */
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int n = arr.length;
		int d= 2;
		int temp =0;
		for(int j=0;j<d;j++) {
			 temp = arr[0];
		for(int i = 0;i<n-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[n-1] = temp;
		}
		
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		/*
		 * rightRotate(arr,n,d); for (int i = 0; i < arr.length; i++) {
		 * System.out.print(arr[i] + " "); } //6 7 1 2 3 4 5 leftRotate(arr,n,d); for
		 * (int i = 0; i < arr.length; i++) { System.out.print(arr[i] + " "); } //3 4 5
		 * 6 7 1 2
		 * 
		 */
	}
	private static void leftRotate(int[] arr, int n, int d) {
		 for (int i = 0; i < d; i++)
	            leftRotatebyOne(arr, n);
	}
	private static void leftRotatebyOne(int[] arr, int n) {
		int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
                arr[i] = arr[i + 1];
        arr[n-1] = temp;
	}
	public static void rightRotate(int arr[],int n,int d) {
		int temp[] = new int[d];
		for(int j =0;j<d;j++) {
		int last = arr[n-1];
		for(int i = n-1;i>0;i--) {
			/*
			 * if(i<d) { temp[i]=arr[i]; }
			 */
			arr[i] = arr[i-1];
			
		}
		arr[0] = last;
		
	}
	}

}


//Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements. 
//Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
//o/p - arr[] = [3, 4, 5, 6, 7, 1,2]