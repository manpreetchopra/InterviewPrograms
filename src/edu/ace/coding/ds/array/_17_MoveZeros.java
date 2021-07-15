package edu.ace.coding.ds.array;

import java.util.Arrays;

/**
 * Move all zeros to the left of an array while maintaining its order.
 * @author macho
 *
 */
public class _17_MoveZeros {

	public static void main(String[] args) {
		int[] arr = {1, 10, -1, 11, 5, 0, -7, 0, 25, -35};
		moveZerosToLeft(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void moveZerosToLeft(int[] A) {
	    
		  //1 , 10 , 20 , 0 , 59 , 63 , 0 , 88 , 0 
		  //[1, 10, -1, 11, 5, 0, -7, 0, 25, -35]
		   

		    int read = A.length-1;
		    int write = A.length -1;

		    while(read>=0){
		      if(A[read] == 0){
		        read --;
		        
		      }else{
		        A[write] = A[read];
		        write--;
		        read--;
		      }
		    }

		    while(write>=0){
		      A[write] = 0;
		      write--;
		    }
		  
		  }
}
