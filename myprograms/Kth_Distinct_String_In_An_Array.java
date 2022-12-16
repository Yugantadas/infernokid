package com.electroverse.myprograms;

public class Kth_Distinct_String_In_An_Array {
	
	public static String kthDistinct(String[] arr, int k) {
        int c=0;
        for(int i=0;i<arr.length;i++){
            boolean b = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].equals(arr[j])) {
                    b=false;
                    arr[j]="";
                    arr[i]="";
                    break;
                }
                else b = true;
            }
            System.out.println(b);
            if(c == k && b==true) return arr[i];    
        }
        return "";
    }

	public static void main(String[] args) {
		
		String[] arr = {"d","b","c","b","c","a"};
		System.out.println(Kth_Distinct_String_In_An_Array.kthDistinct(arr, 2));
		
	}

}