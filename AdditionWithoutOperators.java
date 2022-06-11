package sde3questions;

public class AdditionWithoutOperators {

	public static void main(String[] args) {
		int a= 10;
		int b= 20;
		double c = methodAddition1(a,b);
		System.out.println(c);
		int d = methodAddition2(a,b);
		System.out.println(d);
	}

	private static int methodAddition2(int a, int b) {
		while(b!=0) {
			int carry = a&b;
			a= a^b;
			b = carry <<1;
			
		}
		return a;
	}

	private static double  methodAddition1(int a, int b) {
		return Math.log(Math.exp(a) * Math.exp(b));
	}

}
/*
Inputs	Outputs
A	B	C	S
0	0	0	0
0	1	0	1
1	0	0	1
1	1	1	0

C - AND
S - OR 
Sum = 2C +S

*/

