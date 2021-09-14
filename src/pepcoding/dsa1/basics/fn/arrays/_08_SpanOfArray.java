package pepcoding.dsa1.basics.fn.arrays;

import java.util.Scanner;

public class _08_SpanOfArray {

	public static void main(String[] args) {

	    // write your code here
	    
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    
	    int arr[] = new int[n];
	    
	    for(int i =0; i<n; i++){
	        arr[i] = scn.nextInt();
	    }
	    
	    int min = Integer.MAX_VALUE;
	    int max = Integer.MIN_VALUE;
	    
	    for(int i =0; i<arr.length; i++){
	        if(arr[i] > max){
	            max = arr[i];
	        }    
	        if(arr[i] < min){
	            min = arr[i];
	        }
	    }
	    
	    System.out.print(max-min);
	    
	 
	}
}
