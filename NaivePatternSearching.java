
public class NaivePatternSearching {

	public static void main(String[] args) {

		String str = "THIS IS A TEST TEXT";
		String pat = "TEST";
		search(str,pat);
		
	}

	private static void search(String str, String pat) {

		int m = str.length();
		int n = pat.length();
		
		for(int i=0;i< m-n;i++) {
			
			int j;
			
			for(j=0;j<n;j++)
				if(str.charAt(i+j)!=pat.charAt(j))
					break;
			
			if(n==j)
				System.out.println("pattern found at index "+i);
			
		}
		
		
	}

}
