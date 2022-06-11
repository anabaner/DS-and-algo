package ArraysAndStrings;
/*  Backtracking
 * time com-  O(n*n!) 
 * space comp - O(|s|)
 */
public class PrintAllPermutationsOfAString {

	public static void main(String[] args) {
		
	 String ans = "";
	 String str = "ABC";
	 
	 permute(str,ans);
		
	}

	private static void permute(String str, String ans) {
		
		if(str.length() ==0) {
			System.out.println(" "+ans);
			return;
		}
		
		
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			String leftSubstr = str.substring(0,i);
			String rightSubstr = str.substring(i+1);
			String total = leftSubstr+rightSubstr;
			permute(total,ans+ch);
			
		}
		
		
	}

}

/*
 * ABC
 ACB
 BAC
 BCA
 CAB
 CBA*/
