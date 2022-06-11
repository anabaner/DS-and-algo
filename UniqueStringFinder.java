package ArraysAndStrings;

import java.util.HashSet;
import java.util.Set;
/* n = length of the string
* Space: O(n)
* Time: O(n)
*/
public class UniqueStringFinder {

	
	
	public static void main(String[] args) {
		
		String s = "abcd10jk";
		boolean c = checkIfUnique(s);
		boolean c1 = checkIfUniqueUsingSet(s);
		System.out.println(c +" "+ c1);
	}

	private static boolean checkIfUnique(String s) {
		if(s.length()>128)
			return false;
		
		boolean b[] = new boolean [128];
		for(int i=0;i<s.length();i++) {
			if(b[s.charAt(i)])
					return false;
		
		b[s.charAt(i)] = true;
		}
		return false;
	}
	
	
	private static boolean checkIfUniqueUsingSet(String s) {
	  Set<Character> foundChars = new HashSet<Character>();
      for (char c : s.toCharArray()) {
          if (foundChars.contains(c)) return false;
          foundChars.add(c);
      }
      return true;
	}

}
