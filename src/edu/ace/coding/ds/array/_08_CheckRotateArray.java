package edu.ace.coding.ds.array;

import java.util.Arrays;

/**
 * Right Rotate the Array by One Index
 * @author macho
 *
 */
public class _08_CheckRotateArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		rotateArray(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	  public static void rotateArray(int[] arr){

	        int temp = arr[arr.length-1];

	        for(int i = arr.length-1; i>0; i--){
	          arr[i] = arr[i-1];
	        }

	        arr[0] = temp;
	        
	    }
}
