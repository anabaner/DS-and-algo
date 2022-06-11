package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Print set of Keys having same value in hashmap
Example input:
Map<Integer, String> map = new HashMap<>();
map.put(1, "x");
map.put(2, "y");
map.put(3, "x");
map.put(4, "z");
Output:
{x=[1, 3], y=[2], z=[4]}*/

public class MapDuplicates {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "x");
		map.put(2, "y");
		map.put(3, "x");
		map.put(4, "z");
		
		getArrayOfKeys(map);
		
		}

	private static void getArrayOfKeys(HashMap<Integer, String> map) 
	{
		HashMap<String,List<Integer>> countMap = new HashMap<String,List<Integer>>();
		
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			if(!countMap.containsKey(entry.getValue())) {
				countMap.put(entry.getValue(), new ArrayList<>());
			}
				 List<Integer> keys = countMap.get(entry.getValue());
				  keys.add(entry.getKey());
				  countMap.put(entry.getValue(), keys);
		}
		
		System.out.println(countMap);
		
		
	}

}
