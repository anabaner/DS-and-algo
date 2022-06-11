package ArraysAndStrings;

public class StringRotation {

	public static void main(String[] args) {

		String s1 ="waterbottle"; 
		String s2 ="erbottlewat";
		
		boolean check = isSubstring(s1,s2);
		System.out.println(check);
		
	}

	private static boolean isSubstring(String s1, String s2) {
		
		if(s1.length() == s2.length() && s1.length()>0) {
			String s1s1 = s1+s1;
			return s1s1.contains(s2);
		}
		
		return false;
	}

}

/*
 * Time compl - O(n)
 */
