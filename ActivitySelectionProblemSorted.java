
public class ActivitySelectionProblemSorted {

	public static void main(String[] args) {
		
		 int s[] =   {1, 3, 0, 5, 8, 5};
		 int f[] =   {2, 4, 6, 7, 9, 9};
		 int n = s.length;
		    
		    getMaxActivites(s,f,n);
		
	}

	private static void getMaxActivites(int[] s, int[] f, int n) {
		
		int i=0;
		System.out.print(i+" ");
		for(int j=1;j<n;j++) {
			
			if(s[j]>=f[i]) {
				System.out.print(j+" ");
				i=j;
		}
		}
	}

}

//o/p 0 1 3 4 - indexes of the activities
//time compl - O(n)
