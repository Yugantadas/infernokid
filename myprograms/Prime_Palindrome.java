package com.electroverse.myprograms;

public class Prime_Palindrome {
	
	public static boolean isPrime_Palindrome(int n) {
		
		if(Prime_Checking.isPrime(n)) {
			if(Palindrome.isPalindrome(n)) return true;
		}
		return false;
	}

	public static void main(String[] args) {

		for(int i=1;i<1000000;i++) {
			if(isPrime_Palindrome(i)) System.out.println(i);
		}
		
	}

}
