package com.electroverse.myprograms;

public class Prime_Checking {
	
	public static boolean isPrime(int n) {
    	if(n<0) return false;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
            	return false;
            }
        }
        return true;
    }

}