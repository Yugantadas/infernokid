package com.electroverse.myprograms;

import java.util.Scanner;

public class My_Calculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for armstrong numbers");
		System.out.println("enter 2 for prime numbers");

		int c=sc.nextInt();
		switch(c) {
		case 1:
			System.out.println("enter start");
			int start=sc.nextInt();
			System.out.println("enter end");
			int end=sc.nextInt();
			for(int i=start;i<=end;i++) {
				if(Armstrong_Number.isArmstrong(i)) System.out.println(i);
			}
			break;
		case 2:
			System.out.println("enter start");
			int start1=sc.nextInt();
			System.out.println("enter end");
			int end1=sc.nextInt();
			for(int i=start1;i<=end1;i++) {
				if(Prime_Checking.isPrime(i)) System.out.println(i);
			}
		}
		
		My_Calculator.main(args);
		sc.close();
		
	}

}
