package ArrayRevision;

public class ArrayLeftRotatePrint {

	public static void main(String[] args) {

		int arr[] = {3,4,6,7,9};
		
		int k = 2;
		int n = arr.length;
		
		leftRotatePrint(arr,k,n);
		
		
	}

	
	public static void leftRotatePrint(int arr[],int k , int n) {
		
		int mod = k%n;
		System.out.println(mod);
		for(int i=0;i<n;i++) {
			
		 System.out.print(arr[(i+mod) %n]+" ");
			
		}
	}
}
//o/p - 6 7 9 3 4 