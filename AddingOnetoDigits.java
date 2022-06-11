package ArrayProblems;

import java.util.Vector;

public class AddingOnetoDigits {

	public static void main(String[] args) {
		Vector<Integer> vect = new Vector<Integer>();
        vect.add(1);
        vect.add(7);
        vect.add(8);
        vect.add(9);
 
        incrementVector(vect);
 
        for (int i = 0; i < vect.size(); i++)
            System.out.print(vect.get(i) + " ");
	}

	private static void incrementVector(Vector<Integer> vect) {
		int n = vect.size();
		
		//to get the carry
		vect.set(n-1, vect.get(n-1)+1);
		
		int carry =  vect.get(n-1)/10;
		
		vect.set(n-1, vect.get(n-1)%10);
		
		for(int j=n-2;j>=0;j--) {
			if(carry==1) {
			vect.set(j, vect.get(j)+1);
			carry =  vect.get(j)/10;
			vect.set(j, vect.get(j)%10);
			}	
		}
		if(carry ==1)
			vect.add(0,1); //add 1 to the first index
		
		
	}

}
//o/p -  1 7 9 0 

//Input : [9, 9, 9]
//Output : [1, 0, 0, 0]