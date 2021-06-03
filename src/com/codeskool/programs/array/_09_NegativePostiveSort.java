package com.codeskool.programs.array;

import java.util.Arrays;

/**
 * Move all negative numbers to beginning and positive to end with constant extra space
 * @author macho
 *
 */
public class _09_NegativePostiveSort {
	public static void main(String[] args) {
		int[] arr = {-1,2,4,-3,9,10,8,-5};

		int[] arr1  = Arrays.copyOf(arr, arr.length);
		quickSortPartition(arr1);
		System.out.println(Arrays.toString(arr1));

		int[] arr2  = Arrays.copyOf(arr, arr.length);
		usingTwoPointers(arr2);
		System.out.println(Arrays.toString(arr2));

	}

	/**
	 * Using Partition Technique of QuickSort algo
	 * @param arr
	 */
	private static void quickSortPartition(int[] arr) {
		int current = 0;
		int swapped = 0;

		while(current<arr.length) {
			if(arr[current]<0) {
				int temp = arr[current];
				arr[current] = arr[swapped];
				arr[swapped] = temp;

				current++;
				swapped++;
			}else {
				current++;
			}
		}
	}

	/**
	 * Using 2 Pointers
	 * @param arr
	 */
	private static void usingTwoPointers(int[] arr) {
		int l=0;
		int r = arr.length-1;

		while(l<=r) {
			if(arr[l]>0 && arr[r]<0) {
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;

				l++;
				r--;
			}
			else if(arr[l]<0 && arr[r]<0) {
				l++;
			}
			else if(arr[l]>0 && arr[r]>0) {
				r--;
			}
			else if(arr[l]<0 && arr[r]>0) {
				l++;
				r--;
			}
		}

	}

}
