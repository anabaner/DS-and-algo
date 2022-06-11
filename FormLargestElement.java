package ArrayRevision;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Timecompl - O(nlogn) for sorting and loop run in O(n) time  space - O(1)

public class FormLargestElement {

	public static void main(String[] args) {
		String arr[] =  { "54", "546", "548", "60"};
		
		List<String> list = Arrays.asList(arr);
		
		formLargestElement(list);
	}

	private static void formLargestElement(List<String> list) {
		Collections.sort(list,new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				
				String XY = s1+s2;
				String YX = s2+s1;
				return XY.compareTo(YX)> 0 ? -1 : 1;
			}
			
		});
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
	}

}
