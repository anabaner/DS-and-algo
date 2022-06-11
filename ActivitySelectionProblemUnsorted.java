import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionProblemUnsorted {

	public static void main(String[] args) {

		Activity arr [] = new Activity[6]; 
		 	arr[0] = new Activity(5, 9);
		    arr[1] = new Activity(1, 2);
		    arr[2] = new Activity(3, 4);
		    arr[3] = new Activity(0, 6);
		    arr[4] = new Activity(5, 7);
		    arr[5] = new Activity(8, 9);
		    
		    getMaxActivities(arr,6); // no of activities - 5
		
	}

	private static void getMaxActivities(Activity[] arr, int n) {
		
		Arrays.sort(arr,new ActivityComparator());
		
		for(Activity a:arr) {
			System.out.println("["+a.start+" "+a.finish+"]");
		}
		
		System.out.println(" Getting the list of activities ----------");
		int i=0;
		System.out.println("["+arr[i].start+" "+arr[i].finish+"]");
		for(int j=1;j<n;j++) {
			
			if(arr[j].start>=arr[i].finish) {
				System.out.println("["+arr[j].start+" "+arr[j].finish+"]");
				i=j;
			}
		}
	}

}

class ActivityComparator implements Comparator<Activity>{ // sorting based on finish time

	@Override
	public int compare(Activity o1, Activity o2) {
		return o1.finish - o2.finish;
	}
	
	
}

class Activity{
	
	int start;
	int finish;
	Activity(int start, int end){
		this.start = start;
		this.finish = end;
	}
	
}
