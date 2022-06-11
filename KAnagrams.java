package StringProblems;

import java.util.Arrays;

public class KAnagrams {

	public static void main(String[] args) {
		  String str1 = "anagram";
	        String str2 = "grammar";
	        int k = 2;
	        if (arekAnagrams(str1, str2, k))
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	}

	private static boolean arekAnagrams(String s1, String s2, int k) {
		
		int n1= s1.length();
		int n2 = s2.length();
		int count =0;
		if(n1!=n2)
			return false;
		
		int countChars1[] = new int [26];
		int countChars2[] = new int [26];
		
		
		for(int i=0;i<n1;i++) {
			countChars1[s1.charAt(i)-'a']++;
			countChars2[s2.charAt(i)-'a']++;
		}
		System.out.println(Arrays.toString(countChars1));
		for(int i=0;i<26;i++) {
			if(countChars1[i] > countChars2[i])
				count = count+Math.abs(countChars1[i] - countChars2[i]);
		}
		
		return count<=k;
	}

}
