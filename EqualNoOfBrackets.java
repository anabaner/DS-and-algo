package StringProblems;

public class EqualNoOfBrackets {

	public static void main(String[] args) {

		
		 String str = "(()))(()()())))";
	        System.out.println(findIndex(str));
	}

	private static int findIndex(String str) {
		
		int count_close =0;
		int len = str.length();
		for(int i=0;i<len;i++) {
			if(str.charAt(i)==')') {
				count_close++;
			}
		}
		for(int i=0;i<len;i++) {
			
			if(count_close==i) {
				return i;
			}
			
		}
		
		return len;
	}

}
