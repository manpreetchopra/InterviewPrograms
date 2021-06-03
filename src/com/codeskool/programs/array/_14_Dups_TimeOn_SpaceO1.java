package com.codeskool.programs.array;

import java.util.Arrays;

/**
 * Given an array of n elements that contains elements from 0 to n-1,
 *  with any of these numbers appearing any number of times. 
 *  Find these repeating numbers in O(n) and using only constant memory space.
 * @author macho
 *
 */
public class _14_Dups_TimeOn_SpaceO1 {

	public static void main(String[] args) {
		int array[] = {1, 2, 3, 6, 3, 6, 1};
		
		int[] arr1 = Arrays.copyOf(array, array.length);
		System.out.println(" Using Negative");
		byMakingNegative(arr1);
		int[] arr2 = Arrays.copyOf(array, array.length);
		System.out.println(" By adding length");
		byAddingLengthOfArray(arr2);
	}

	private static void byAddingLengthOfArray(int[] arr) {
		for(int i = 0; i<arr.length ; i++) {
			arr[ arr[i] % arr.length] = arr [arr[i] % arr.length] +arr.length;
		}
			
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>=arr.length*2) {
				System.out.println(i);
			}
		}
	}

	/*
	 * Logic : 
	 * 	1.Take (absolute value) all elems from array {index i} == {j} 
	 * 		since we will be negating the values also
	 * 	2.Check the value of array at {j}
	 * 	3. If arr[j] is +ve, we havnt seen j , ie arr[i] yet,
	 * 		so negative the value at arr[j]
	 * 	4. else print j
	 */
	private static void byMakingNegative(int[] arr) {
		for(int i= 0 ; i<arr.length ; i++) {
			
			int j = Math.abs(arr[i]);
			if(arr[j]>0) {
				arr[j] = -arr[j];
			}else {
				System.out.println(j);
			}
		}
	}
	
	
}
