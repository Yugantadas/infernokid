package com.electroverse.myprograms;


import java.util.Scanner;

import com.electroverse.arrays.Sort;

public class Nth_Largest_Smallest_Element {
	
    static int c = 0;
	
	public static int[] removeDuplicates(int[] arr) {
		
		int max = arr[arr.length - 1] + 1;
        for (int i = 0; i < arr.length; i++) {    // remove duplicates
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[i] != max) {
                    c++;
                    arr[j] = max;
                }
            }
        }
        return arr;
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {453, 721, -434, -823, -354, 615, 352, -662, -66, 110,0,0,9 -809, -102, 958, -330, 1000, 386, -434, 305, 68, -33, -434, 58, 633, -629, 757, 107, -683, 879, -505, -308, 531, -520, 879, 975, 691, -184, 747, 325, 115, 607, 687, 217, 765, -316, -696, 660, 621, -700, 626, -529, -510, -615, 427, 865, 256, 16, -549, 951, -846, -330, 266, -972, 656, 696, -724, -121, -655, 624, -121, -104, -743, 884, -851, 397, -487, -869, 832, -543, -313, 160, -947, -297, 201, 58, -821, -440, 746, -565, -699, -227, -564, -868, 443, 113, -190, -531, 648, 446, -737, 337};
        int len = arr.length;
        arr=Sort.quicksort(arr,0,arr.length-1);
        arr=Nth_Largest_Smallest_Element.removeDuplicates(arr);
        arr=Sort.quicksort(arr,0,arr.length-1);
        int[] arr1 = new int[len - c];
        for (int i = 0; i < len - c; i++) arr1[i] = arr[i];
        for (int i = 0; i < len - c; i++) System.out.print(arr1[i] + " ");
        System.out.println();
        System.out.println("enter the degree of smallest element");
        int l1 = sc.nextInt();
        System.out.println(arr1[l1 - 1]);
        System.out.println("enter the degree of largest element");
        int l2 = sc.nextInt();
        System.out.println(arr1[len - c - l2]);
        sc.close();
    }

}