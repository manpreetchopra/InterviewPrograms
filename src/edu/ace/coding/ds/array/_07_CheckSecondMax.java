package edu.ace.coding.ds.array;

/**
 * Find Second Maximum Value in an Array
 * @author macho
 *
 */
public class _07_CheckSecondMax {

	public static void main(String[] args) {
		int[] arr = {4,2,1,5,0};
		
		int second = findSecondMaximumOnePass(arr);
		System.out.println(second);
		
		int second2 = findSecondMaximumTwoPass(arr);
		System.out.println(second2);
	}
	public static int findSecondMaximumOnePass(int[] arr)
	  {
	    // Write - Your - Code
	    int first = arr[0];
	    int second = arr[1];

	    for(int i = 2; i<arr.length; i++){
	      if(arr[i]>first){
	        second = first;
	        first = arr[i];
	      }else if(arr[i]>second && arr[i] != first){ //imp to check arr[i]!=first for dup first
	        second = arr[i];
	      }
	    }

	    return second;
	  }
	
	public static int findSecondMaximumTwoPass(int[] arr) {
		int max = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		if(second>max) {
			max = arr[1];
			second = arr[0];
		}
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]> second && arr[i]<max) {
				second = arr[i];
			}
		}
		
		return second;
	}
}
