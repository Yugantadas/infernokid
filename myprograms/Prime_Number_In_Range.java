package com.electroverse.myprograms;

import java.util.Scanner;

public class Prime_Number_In_Range extends Prime_Checking {
	
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the start");
			int start = sc.nextInt();
			System.out.println("enter the end");
			int end = sc.nextInt();
			int s = 0;
			int sum = 0;
			for (int i = start; i <= end; i++) {
			    if (isPrime(i)) {
			        s = s + 1;
			        sum = sum + i;
			        System.out.println(i);
			    }
			}
			System.out.println("number of prime numbers = " + s);
			System.out.println("sum of prime numbers from " + start + " to " + end + " is " + sum);
		}
    }

}
