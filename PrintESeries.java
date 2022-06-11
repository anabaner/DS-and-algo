package ChapterThree;

// E-series =>
// e^x = 1 + x/1! + x^2/2! + x^3/3! + ...... 

//It can be written as- 
//e^x = 1 + (x/1) (1 + (x/2) (1 + (x/3) (........) ) ) 

public class PrintESeries {

	public static void main(String[] args) {
    int x=1;
    int n=10;
    
    float p=  exponential(x,n);
    System.out.println(p);
	}

	private static float exponential(int x, int n) {
		float sum =1;
		for(int i=n-1;i>0;i--) {
			sum = 1+ x*sum/i;
		}
		return sum;
	}

}
