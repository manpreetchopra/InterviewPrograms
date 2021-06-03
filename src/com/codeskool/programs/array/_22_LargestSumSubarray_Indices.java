package com.codeskool.programs.array;

/**
 * Bonus Question of 22
 * Print the start and end indices of Largest Sum Subarray
 * @author macho
 *
 */
public class _22_LargestSumSubarray_Indices {

	public static void main(String[] args) {
		 int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		 
		 kadane(arr);
	}

	private static void kadane(int[] arr) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int start = 0;
		int end = 0;
		int s = 0;
		for(int i=0; i<arr.length; i++){
			sum+= arr[i];
			
			if(sum<0) {
				sum = 0;
				s = i+1;
			} 
			
			if(sum>max) {
				max = sum;
				end = i;
				start = s;
			}
		}
		
		System.out.println("max : "+max);
		System.out.println("indices : "+start+" till "+end);
		
	}
}
