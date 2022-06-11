package ArraysAndStrings;

public class OneAwayStringEdit {

	// Returns true if edit distance
	// between s1 and s2 is one, else false
	static boolean isEditDistanceOne(String s1, String s2)
	{
	    int m = s1.length(), n = s2.length();
	 
	    if (Math.abs(m - n) > 1)
	        return false;
	 
	    int count = 0;
	 
	    int i = 0, j = 0;
	    while (i < m && j < n)
	    {
	        if (s1.charAt(i) != s2.charAt(j))
	        {
	            if (count == 1)
	                return false;
	 
	            if (m > n)
	                i++;
	            else if (m< n)
	                j++;
	            else
	            {
	                i++;
	                j++;
	            }
	             
	            count++;
	        }
	 
	        else // If current characters match
	        {
	            i++;
	            j++;
	        }
	    }
	 
	    // If last character is extra
	    // in any string
	    if (i < m || j < n)
	        count++;
	 
	    return count == 1;
	}
	 
	public static void main (String[] args)
	{
	    String s1 = "gfg";
	    String s2 = "gf";
	    if(isEditDistanceOne(s1, s2))
	        System.out.print("Yes");
	    else
	        System.out.print("No");
	}
	}
	
	
