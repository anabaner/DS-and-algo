package ChapterThree;

public class FactorialWithRec {

	public static void main(String[] args) {

		int n=6;
		
		int fact = printFact(n);
		System.out.println(fact);
	}

	private static int printFact(int n) {
		
		if(n==1)
			return 1;
		else {
			if(n>1) {
				return n*printFact(n-1);
			}
		}
		return 1;
		
	}

}
