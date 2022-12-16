package com.electroverse.myprograms;

import com.electroverse.simpleprgs.Rev_Number;

public class Binary_To_Decimal_Viceversa extends Rev_Number {
	
	public static int binaryToDecimal(int n) {
		
		int s=0;
		int c=0;
		while(n!=0) {
			s+=(n%10)*Math.pow(2, c);
			n/=10;
			c++;
		}
		return s;
	}
	
	public static int decimalToBinary(int num) {
		
		int n=Math.abs(num);
		int c=0;
		while(n!=1) {
			c=(c*10)+n%2;
			n=n/2;
		}
		c=c*10+1;
		if(num<0) return -rev(c);
		return rev(c);
	}

	public static void main(String[] args) {

		System.out.println(decimalToBinary(-91));
		System.out.println(binaryToDecimal(decimalToBinary(-91)));
		
	}

}