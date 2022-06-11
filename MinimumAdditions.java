package MapPrograms;

import java.util.Scanner;

public class MinimumAdditions {

	public static void main(String[] args) {

		 Scanner s = new Scanner(System.in);
	        int T =s.nextInt();
	        
	        for(int m= 0 ;m<=T;m++) {
	        	int N = s.nextInt();
	        	int K = s.nextInt();
	        	int A[] = new int[N];
	        	int sum = 0;
	        	for(int i =0;i<N;i++) {
	        		A[i] = s.nextInt();
	        		sum = sum+A[i];
	        	}
	        	 double floorValue = Math.floor(sum/N);
	 	     //   System.out.println("floorvalue:: "+floorValue);	
	 	        
	 	       double ans=0;
	 	        if(K==0){
	 	            ans=(sum-N)+1;
	 	        }else{
	 	            double lim=(sum/(K+1))-N;
	 	            if(lim+1>0){
	 	                ans=(lim+1);
	 	            }else{
	 	                ans=0;
	 	            }  
	 	        }
	 	        
	 	        System.out.println(ans);
	        }
	        
	        
	       
	}

}


/*
 Problem : minimum number of non-negative integers that should be added so that floor of an average of array  is less than or equal to K
 Array A 
 floor of avg of Array = A(i to N)/ N
 input 
 A. T -No . of Test Cases 
 1. N , K - N ->length array ,K ->bound
 2. A - Array A of N length
 
2 -T
2 1 -N,K
3 1 - A
2 2 - N K
2 1 - A
*/