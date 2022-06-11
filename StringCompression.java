package ArraysAndStrings;

public class StringCompression {

	public static void main(String[] args) {

		
		String s = "aabcccccaaa";
		String compStr = compressString(s);
		System.out.println(compStr);
		
	}

	private static String compressString(String s) {
		
		String compStr="";
		for(int i=0;i<s.length();i++) {
		
		int count =1;
		while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)) {
			count++;
			i++;
		}
		
		compStr = compStr+s.charAt(i)+count;
		
		}
		
		return compStr;
	}

}
