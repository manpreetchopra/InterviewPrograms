package edu.ace.coding.ds.array;

/**
 * Given an array of positive numbers and a positive number ‘S,’ find the length
 * of the smallest contiguous subarray whose sum is greater than or equal to
 * ‘S’. Return 0 if no such subarray exists
 * 
 * @author macho
 *
 */
public class _23_MinSizeSubArraySum {

	public static void main(String[] args) {
		 int result = findMinSubArray(7, new int[] { 2, 1, 5, 2, 3, 2 });
		    System.out.println("Smallest subarray length: " + result);
		    result = findMinSubArray(7, new int[] { 2, 1, 5, 2, 8 });
		    System.out.println("Smallest subarray length: " + result);
		    result = findMinSubArray(8, new int[] { 3, 4, 1, 1, 6 });
		    System.out.println("Smallest subarray length: " + result);
	}

	private static int findMinSubArray(int S, int[] arr) {
		
		int start =0;
		int sum = 0;
		int subLength = arr.length;
		for(int i = 0; i<arr.length; i++) {
			sum = sum + arr[i];
			
			while(sum>=S) {
				if(i - start+1 < subLength) {
					subLength = i-start+1;
				}
				sum = sum - arr[start];
				start++;
			}
		}
		return subLength;
	}
}
