package com.electroverse.myprograms;

import com.electroverse.simpleprgs.Rev_Number;

public class Palindrome extends Rev_Number{
    public static boolean isPalindrome(int n) {

    	if(n==rev(n))return true;
    	return false;
    	
    }
    public static void main(String[] args) {
        
    	System.out.println(isPalindrome(122));
    	
    }
}