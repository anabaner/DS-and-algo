package sde3questions;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a set of numbers, find out all subsets of the set such that
the sum of all the numbers in the subset is equal to a target number.
s = [ 1, 2, 3, 4, 5 ] 
target = 5 
op = [ [ 1,4 ] , [2,3] , [5] ]
 */
public class SubsetsEqualsK {

	public static void main(String[] args) {

		int arr []= {1,2,3,4,5};
		int k = 5;
		List<List<Integer>> list = getSubsets(arr,k);
		System.out.println(list);
		
	}

	private static List<List<Integer>> getSubsets(int[] arr, int k) {
		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> masterList = new ArrayList<List<Integer>>();
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j] ==k)
					list.add(arr[i]);
					list.add(arr[j]);
					masterList.add(list);
		}
		}
		return masterList;
	}

}
