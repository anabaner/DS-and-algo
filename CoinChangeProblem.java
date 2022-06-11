package ArrayProblems;

public class CoinChangeProblem {
		 
		static int count(int S[], int m, int n)
		{
		     
		    if (n == 0)
		        return 1;
		     
		    if (n < 0)
		        return 0;
		 
		    if (m <= 0 && n >= 1)
		        return 0;
		 
		    return count(S, m - 1, n) +
		           count(S, m, n - S[m - 1]);
		}
		 
		public static void  main(String args[])
		{
		    int arr[] = { 1, 2, 3 };
		    int m = arr.length;
		     
		    System.out.println(count(arr, m, 4));
		}
		 
		 
		

}
/*
 * For example, for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}. So output should be 4. 
 * For N = 10 and S = {2, 5, 3, 6}, there are five solutions: {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}. 
 * So the output should be 5.
 */
