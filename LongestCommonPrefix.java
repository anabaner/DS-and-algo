package sde3questions;
/*
 * Input  : {“geeksforgeeks”, “geeks”, “geek”, “geezer”}
	Output : "gee"
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {

		String arr []= {"geeksforgeeks", "geeks", "geek", "geezer"};
		String ans = longestCommonPrefix(arr,arr.length);
		System.out.println(ans );
		
		
	}

	private static String longestCommonPrefix(String[] arr, int length) {
		String prefix = arr[0];
		for(int i=0;i<arr.length;i++) {
			prefix = longestCommonPrefixUtil(prefix,arr[i]);
		}
		
		return prefix;
	}

	private static String longestCommonPrefixUtil(String prefix, String str) {
		
		int n1= prefix.length();
		int n2 = str.length();
		String result = "";
		
		for(int i=0 ,j=0;i<n1 && j<n2;i++,j++) {
			if(prefix.charAt(i)!=str.charAt(j)) {
				break;
			}
			result = result+str.charAt(i);
			
		}
		return result;

	}
	
}
