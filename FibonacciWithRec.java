package ChapterThree;

public class FibonacciWithRec {
	static int i1=1;
	static int i2= 2;
	static int i3=0;
	public static void main(String[] args) {


		int n= 15 ;// print 15 fibo numbers
		
		System.out.print(i1+" "+i2+" ");
		printFibo(n-2);
	
	}

	private static void printFibo(int count) {
		if(count>0) {
			i3=i1+i2; 
			System.out.print(i3+" ");
			i1=i2;
			i2=i3;
			printFibo(count-1);
			
		}
	}

}
