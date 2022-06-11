package ArrayProblems;

public class AddingOneToDigitsRecursion {

	public static void main(String[] args) {
		int arr[] = {0,9,9,9,9};
		int n = arr.length -1;
		getSum(arr,n);
		
		if(arr[0]>0)
			System.out.print(arr[0]+",");
		
		for(int i=1;i<=n;i++) {
			System.out.print(arr[i]);
			
			if(i<n)
				System.out.print(",");
		}
		   
	}

	private static void getSum(int[] arr, int length) {
		
		int i= length;
		
		if(arr[i]<9) {
			arr[i]= arr[i]+1;
		    return;
		}
		arr[i]=0;
		i--;
		getSum(arr,i);
			
	}

}
