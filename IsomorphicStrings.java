package StringProblems;

public class IsomorphicStrings {

	public static void main(String[] args) {

		String s1= "xxy";
		String s2 = "aab";
		System.out.println(isIsommorphic(s1,s2));
		System.out.println(isIsommorphic("aba", "xyy"));
		
		
	}

	private static boolean isIsommorphic(String s1, String s2) {
		
		int n1= s1.length();
		int n2 = s2.length();
		if(n1!=n2)
			return false;
		
		int countChars1[] = new int [26];
		int countChars2[] = new int [26];
		
		
		for(int i=0;i<n1;i++) {
			countChars1[s1.charAt(i)-'a']++;
			countChars2[s2.charAt(i)-'a']++;
		}
		for(int i=0;i<n1;i++) {
			if(countChars1[s1.charAt(i)-'a'] != countChars2[s2.charAt(i)-'a'])
				return false;
		}
		
		return true;
	}

}
