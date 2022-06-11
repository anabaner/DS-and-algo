package ArraysAndStrings;

public class StringEditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1= "Helloo";
		String str2 = "Helo";
		int dist = editDistance(str1.toCharArray(),str2.toCharArray(), str1.toCharArray().length,str2.toCharArray().length);
		System.out.println(dist);
		
		int dist1 = editDistance1(str1,str2, str1.length(),str2.length());
		System.out.println(dist1);
	}
	
	
	static int editDistance ( char[] cs, char[] cs2,int m,int n )

	{

	if ( cs2.length == n ) 
			return (cs.length-m);

	if ( cs.length== m)
		return (cs2.length-n);

	if ( cs[m] == cs2[n] )
		return editDistance(cs, cs2, m+1, n+1 );

	if ( cs[m] != cs2[n] )

	   return 1+Math.min(Math.min(editDistance(cs, cs2, m, n+1), editDistance(cs, cs2, m+1, n)), editDistance(cs, cs2, m+1,n+1));
	
	
	return 0;

	}
	
	
	static int editDistance1(String S, String T, int i, int j)
	{
	        //base cases
	        if (i == 0)
	                return j;
	        if (j == 0)
	                return i;

	        //recursive call, start with match check
	        if (S.charAt(i) == T.charAt(j))
	                return editDistance1(S, T, i-1, j-1);
	        else
	        {       //no match, recurse three times

	                int sub = editDistance1(S, T, i-1, j-1) + 1;
	                int ins = editDistance1(S, T, i, j-1) + 1;
	                int del = editDistance1(S, T, i-1, j) + 1;

	                return Math.min(Math.min(sub, ins), del);
	        }
	}
	

}
