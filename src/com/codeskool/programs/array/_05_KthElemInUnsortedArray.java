package com.codeskool.programs.array;

import java.util.Arrays;

/**
 * Find kth max or min element in an array
 * @author macho
 *
 */
public class _05_KthElemInUnsortedArray {

	public static void main(String[] args) {
		int arr[] = {7, 10, 4, 3, 20, 15} ;
		int k = 3;
		
		System.out.println(kSmalestUsingSort(arr, k));
	}
	
	public static int kSmalestUsingSort(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k-1];
	}
	
	/**
	 * Pending ways
	 */
	//using min-heap
	//using max-heap
	//using QuickSelect
}
