package sde3questions;

import java.util.Arrays;

public class DecimalToBinary {

	public static void main(String[] args) {

		int i=10;
		convertDecimalToBinary(i);
		
		int binary = 1010;
		convertBinaryToDecimal(binary);
		
	}

	

	private static void convertDecimalToBinary(int decimal) {
		
		int binary [] = new int[40];
		int i = 0;
		while(decimal>0) {
			binary[i] = decimal%2;
			decimal = decimal/2;
			i++;
		}
		
		for(int j = i-1;j>=0;j--)
			System.out.print(binary[j]+" ");
	}
	
	private static void convertBinaryToDecimal(int binary) {
		int decimal_value = 0;
		int base = 1;
		String strBinary = String.valueOf(binary);
		for(int i=strBinary.length()-1;i>=0;i--) {
			if(strBinary.charAt(i) == '1') {
				decimal_value+=base;
				
			}
			base = base*2;
		}
		System.out.println(decimal_value);
		
	}

}
