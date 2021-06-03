package com.codeskool.programs.array;

import java.util.HashSet;
import java.util.Set;

public class _17_FirstRepeatingElem {

	public static void main(String[] args) {
		int arr[] = {10, 5, 3, 4, 3, 5, 6};
		
		System.out.println("using Brute Force");
		System.out.println(bruteForce(arr));
		
		System.out.println("using HashSet");
		System.out.println(hashSet(arr));
		
		System.out.println("Using temp array (O(n))");
		System.out.println(tempArray(arr));
	}

	private static int tempArray(int[] arr) {
	
		int size = arr.length;
		
		for(int i:arr) {
			if(size<i) {
				size = i;
			}
		}
		
		int[] temp = new int[size+1];
		
		for(int i = 0; i<arr.length; i++) {
			int num = arr[i];
			temp[num]++;
		}
		
		for(int i = 0; i<arr.length; i++) {
			int num = arr[i];
			if(temp[num]>1) {
				return num;
			}
		}
		return -1;
	}

	/*
	 * Loop through end till begining,
	 *  otherwise we may return the elem which dup value comes first(3)
	 *  which is not same as the 1st elem that repeats (5)
	 *  
	 *  if the set already contains the elem, update the repeat elem, 
	 *  so that we reach the begining of the array
	 */
	private static int hashSet(int[] arr) {
		Set<Integer> set = new HashSet<>();
		int repeat = -1;
		for(int i = arr.length-1; i>0;i--) {
			if(!set.add(arr[i])) {
				repeat = arr[i];
			}
		}
		return repeat;
		
	}

	/*
	 * Simple brute Force using 2 loops
	 */
	private static int bruteForce(int[] arr) {

		for(int i = 0; i<arr.length;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}
}
