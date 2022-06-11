package ChapterThree;

public class Fibonacci {

	public static void main(String[] args) {

		int n= 15 ;// print 15 fibo numbers
		int i1=1;
		int i2= 2;
		int i3=0;
		System.out.print(i1+" "+i2+" ");
		
		for(int i=2;i<n;i++) {
			i3=i1+i2; 
			System.out.print(i3+" ");
			i1=i2;
			i2=i3;
		}
	}

}


//1,2,3,5,8,13...