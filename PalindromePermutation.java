package ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {

	public static void main(String[] args) {
		String str = "Tact Coa";
	    System.out.println(checkPermutationOfPalindrome(str));
	}

	private static boolean checkPermutationOfPalindrome(String str) {
		
		char[] arr = str.replaceAll("[\\s]", "").toLowerCase().toCharArray();
	    Map<Character, Integer> map = new HashMap<Character, Integer>();

	    for (char ch : arr) {
	      int count = 1;
	      if (map.containsKey(ch)) {
	        count = map.get(ch);
	        count++;
	      }
	      map.put(ch, count);
	    }
	    
	    boolean foundOdd = false;
	    for (char ch : map.keySet()) {
	      int value = map.get(ch);
	      System.out.println("" + ch + ":" + value);
	      if (value % 2 == 1) {
	        if (foundOdd) {
	          return false;
	        }
	        foundOdd = true;
	      }
	    }
		
		
		return true;
	}

}
