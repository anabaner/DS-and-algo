package ArrayProblems;
/*
 * time compl - O(n), space com - O(n)
 */
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		int arr [] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
		int majorElement = findMajorityElem(arr,arr.length);
		System.out.println(majorElement);
	}

	private static int findMajorityElem(int[] arr, int length) {
		
		Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<length;i++) {
			if(hm.containsKey(arr[i])) {
				int count = hm.get(arr[i])+1;
				if(count>length/2)
					return arr[i];
				else
					hm.put(arr[i], count);
			}
			else{
				hm.put(arr[i], 1);
			}
		}
		return 0;
	}

}
