package com.electroverse.myprograms;

public class Armstrong_Number {
	
	public static int len(int n) {
		
		int c=0;
		while(n!=0) {
			c++;
			n/=10;
		}
		return c;
	}

	public static boolean isArmstrong(int n) {
		
		if(n<=0) return false;
		int copy=n;
		int sum=0;
		int len=len(n);
		while(n!=0) {
			sum=sum+(int)(Math.pow(n%10, len));
			n/=10;
		}
		return sum==copy;
	}
	
	public static void main(String[] args) {
		
		for(int i=1;i<=10000;i++) {
			if(isArmstrong(i)) System.out.println(i);
		}
		
	}

}
