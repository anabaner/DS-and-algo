package MapPrograms;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        int i =s.nextInt();
	        int j =s.nextInt();
	        int[][] rev = new int[i][j];
	        for(int k = 0;k<i;k++) {
	        	for(int m=0;m<j;m++) {
	        		 rev[k][m] =  s.nextInt();
	        	}
	        }
	        for(int k = 0;k<j;k++) {
	        	for(int m=0;m<i;m++) {
	        		System.out.print(rev[m][k] +" ");
	        	}
	        	System.out.println();
	}

}
}
/*
row = 2
column = 3 
3 4 5
5 4 2
Transpose:
3 5 
4 4 
5 2
*/