package sde3questions;

import java.util.Arrays;

public class StringRepeatingChars {

	public static void main(String[] args) {
		String str = "abcabc";
		String rep = getRepeatingPattern(str);
		System.out.println(rep);
	}
	
	
	public static String getRepeatingPattern(String str) {
	    String repeatingPattern =null;
	    for(int i=0;i<str.length();i++) {
	        repeatingPattern = str.substring(0, i+1);
	        String[] ary = str.split(repeatingPattern);
	        System.out.println(Arrays.toString(ary));
	        if(ary.length==0) {
	            break;
	        }
	    }
	 return repeatingPattern;
	}

}
