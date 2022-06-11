package ChapterTwo;

public class LinearSearch {

	public static void main(String[] args) {

		int elemToBeSearched = 5;
		
		int arr[] = {4,6,5,7,8,2,1};
		doLinearSearch(arr,elemToBeSearched);
	}

	private static void doLinearSearch(int[] arr,int elemToBeSearched) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==elemToBeSearched) {
				System.out.println("Element "+elemToBeSearched+"found in position :: "+i);
			}
		}
		
		
	}

}
