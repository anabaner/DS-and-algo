package StringProblems;

import java.util.Arrays;

public class MinDistanceBetweenWords {

	public static void main(String[] args) {
		   String s = "geeks for geeks contribute practice";
	        String w1 = "geeks";
	        String w2 = "practice";
	        System.out.println(distance(s, w1, w2));
	}

	private static int distance(String s, String w1, String w2) {
		
	 String words[] = s.split("\\s");
	 System.out.println(Arrays.toString(words));
	 int n = words.length;
	 if(w1.equals(w2))
		 return 0;
	 
	 int prev =0,i=0,min_dist=n+1;
	 for( i=0;i<n;i++) {
		 
		 if(words[i].equals(w1) || words[i].equals(w2)) {
			 prev =i;
			 break;
		 }
		 
	 }
	 while(i<n) {
		 if(words[i].equals(w1) || words[i].equals(w2)) {
			 if((!words[prev].equals(words[i]))&& ((i-prev)<min_dist)){
				 min_dist =i-prev-1;
				 prev =i;
			 }
			 else
				 prev =i;
		 }
		 i++;
	 }
			 
		return min_dist;
	}

}

//o/p - 1 
