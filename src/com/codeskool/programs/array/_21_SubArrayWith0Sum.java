package com.codeskool.programs.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Find if there is a subarray with 0 sum
 * Given an array of positive and negative numbers, 
 * find if there is a subarray (of size at-least one) with 0 sum.
 * @author macho
 *
 */
public class _21_SubArrayWith0Sum {

	public static void main(String[] args) {
		int[] arr = {4, 2, -3, 1, 6};

		System.out.println("Brute Force ---");
		System.out.println(bruteForce(arr));

		System.out.println("using set");
		System.out.println(usingSet(arr));
	}

	private static boolean usingSet(int[] arr) {

		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for(int num:arr) {
			sum+= num;
			if(sum==0 || num==0 || set.contains(sum)) {
				return true;
			}else {
				set.add(sum);
			}		
		}
		return false;
	}

	private static boolean bruteForce(int[] arr) {

		for(int i = 0; i<arr.length; i++) {
			int sum = 0;
			for(int j=i; j<arr.length; j++) {
				sum += arr[j];
				if(sum == 0) {
					return true;
				}
			}
		}
		return false;

	}
}
