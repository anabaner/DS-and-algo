package Misc;

import java.util.*;
import java.util.Map.Entry;

public class SortingByFrequency {

	public static void main(String[] args) {

		int arr [] = {2, 5, 2, 8, 5, 6, 8, 8};  //{8, 8, 8, 2, 2, 5, 5, 6}
		int size = arr.length;
		int count = 0;
		Map<Integer,Integer> map = getFreqCount(arr);;
		List<Integer> list = getOrderedMapValues(map);
		
	
		 
		/*
		 * List<Integer> l1 = new ArrayList<Integer>(); // Arrays.sort(list);
		 * List<Integer> l = new ArrayList<Integer>(); for(int i =0 ;i<list.size();i++ )
		 * { // for(int j = i;j<list.size();j++) { int key =0; count = list.get(i);
		 * System.out.println("count ::"+count); for (Entry<Integer, Integer> entry :
		 * map.entrySet()) { System.out.println("entry   ::"+entry); if
		 * (entry.getValue().equals(count) && !l1.contains(key)) { key = entry.getKey();
		 * System.out.println("entry key  ::"+key); l1.add(key); }}
		 * System.out.println("key ::"+key); for(int j = 0;j<count;j++) { l.add(key); }
		 * // l =Collections.nCopies(count, key);
		 * 
		 * 
		 * } System.out.println("List ::"+l);
		 */
	}

	private static List<Integer> getOrderedMapValues(Map<Integer, Integer> map) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>(map.values());
		// list = map.values();
		 Collections.sort(list);
		 Collections.reverse(list);
		 System.out.println("list ::"+list);
		 return list;
	
	}

	private static Map<Integer, Integer> getFreqCount(int[] arr) {
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	Map<Integer,Integer> mapIndex = new HashMap<Integer,Integer>();
	for(int i=0;i<arr.length;i++) {
			
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}
			else {
				map.put(arr[i], map.get(arr[i])+1);
				mapIndex.put(arr[i],i);
			}
		}
		
		System.out.println("freq map:: "+map); //get the frequency of the nos
		System.out.println("index map:: "+mapIndex); 
		return map;
	}

}
