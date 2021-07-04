package edu.ace.coding.array;

/**
 * Find minimum value in array
 * @author macho
 *
 */
public class _05_CheckMinimum {
	
	public static void main(String[] args) {
		int[] arr ={9, 2, 1, 6};
		int min = findMinimum(arr);
		System.out.println(min);
	}
	public static int findMinimum(int[] arr) {
	    // Write your code here
	    int min = arr[0];
	    for(int i = 1; i<arr.length; i++){
	        if(arr[i]<min){
	          min = arr[i];
	        }
	    }
	    return min;
	  }

}
