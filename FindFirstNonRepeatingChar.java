package sde3questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingChar {

	public static void main(String[] args) {
		String s = "zxvczbtxyzvy";
		findNonRepChar(s);
		findNonRepCharUsingIndexOf(s);
	}

	private static void findNonRepCharUsingIndexOf(String s) {
		
		for(int i=0;i<s.length();i++) {
		if(s.lastIndexOf(s.charAt(i)) == s.indexOf(s.charAt(i))) {
			System.out.println(s.charAt(i));
			break;
		}
		}
	}

	private static void findNonRepChar(String s) {
		
		Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			if(hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}
			else {
				hm.put(s.charAt(i), 1);
			}
		}
		
		System.out.println(hm);
		
		for(Map.Entry<Character, Integer> entry:hm.entrySet()) {
			
	            if(entry.getValue()==1)
	            {
	            	System.out.println(entry.getKey());
	            	break;
	            }
		}
		
	}

}
