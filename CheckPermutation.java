package ArraysAndStrings;

import java.util.Arrays;

public class CheckPermutation {

	public static void main(String[] args) {
		String s1= "geeksforgeeks";
		String s2 = "forgeeksgeeks";
		boolean isPerm = checkifPerm(s1,s2);
		System.out.println(isPerm);
	}

	private static boolean checkifPerm(String s1, String s2) {
		
		if(s1.length()!=s2.length())
				return false;
		
		char c1[] = s1.toCharArray();
		Arrays.sort(c1);
		
		char c2[] = s2.toCharArray();
		Arrays.sort(c2);
		
		for(int i=0;i<c1.length;i++) {
			if(c1[i] == c2[i])
				return true;
		}
		
		
		return false;
	}

}
