
public class NumberOfPathsInAMatrix {

	public static void main(String[] args) {

		int arr[][]  = new int[4][3];
		int countPaths = getNoOfPaths(4,3);
		System.out.println(countPaths);		
		
	}

	private static int getNoOfPaths(int m, int n) {
		
		if(m==1 || n==1)
			return 1;
		
		
		return getNoOfPaths(m, n-1)+getNoOfPaths(m-1, n); // + numberOfPaths(m-1, n-1); -if digonal movement allowed
	}

}
