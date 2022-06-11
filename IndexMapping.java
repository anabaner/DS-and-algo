package Hashing;
/*Given a limited range array contains both positive and non-positive numbers, 
 * i.e., elements are in the range from -MAX to +MAX. Our task is to search if some number is present in the array or not in O(1) time.
 * Since range is limited, we can use index mapping (or trivial hashing). 
 * We use values as the index in a big array. Therefore we can search and insert elements in O(1) time.
 */
public class IndexMapping {
	static int MAX = 1000;
	static boolean has[][] = new boolean[MAX+1][2];
	public static void main(String[] args) {
		
		int a[] = {-5,3,4,-2,1};
		int n = a.length;
		insert(a,n);
		int X = -2 ;
		
		if(search(X) == true) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
	}

	private static boolean search(int X) {
		
		boolean searchResult = false ;
		
		if(X>=0) {
			if(has[X][0] == true) {
				searchResult= true;
			}
		}
		int abs = Math.abs(X);
		if(has[abs][1] ==  true) {
			searchResult = true;
		}
		
		return searchResult;
	}

	private static void insert(int[] a, int n) {
		
		//if element is positive insert in [0] else take the abs value of negative element and put in [1]
		for(int i = 0;i<n;i++) {
			if(a[i]>=0) {
				has[a[i]][0] = true;
			}
			else {
			int abs = Math.abs(a[i]);
				has[abs][1] = true;
			}
			}
		}

}
