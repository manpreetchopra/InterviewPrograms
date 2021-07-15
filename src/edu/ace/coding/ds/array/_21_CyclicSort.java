package edu.ace.coding.ds.array;

import java.util.Arrays;

/**
 * Given an array of size n, having all the values between 1 to n , sort the array
 * All values from 1 to n will be there in array
 * no value can repeat
 * Input: [3, 1, 5, 4, 2]
 * Output: [1, 2, 3, 4, 5]
 * @author macho
 *
 */
public class _21_CyclicSort {

	public static void main(String[] args) {
		int[] arr = {3, 1, 5, 4, 2};
		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void cyclicSort(int[] arr) {
		int i = 0;
		while(i<arr.length) {
			if(arr[i] != i+1) {
				int idx = arr[i]-1;
				swap(arr,i,idx);
			}else {
				i++;
			}
		}
		
	}

	private static void swap(int[] arr, int i, int idx) {
		int temp = arr[i];
		arr[i] = arr[idx];
		arr[idx] = temp;
		
	}
}
