package com.codeskool.programs.array;

/**
 * Largest Sum Contiguous Subarray
 * 
 * Write an efficient program to find the sum of contiguous subarray 
 * within a one-dimensional array of numbers that has the largest sum. 
 * 
 * @author macho
 *
 */
public class _22_LargestSumSubarray {

	public static void main(String[] args) {
		int[] arr =  {-2, -3, 4, -1, -2, 1, 5, -3};
		int[] arr2 =  {-2, -3,- 4, -1, -2};
		
		System.out.println("BruteForce----");
		System.out.println(bruteForce(arr));
		
		System.out.println("using kadane's algo ---");
		System.out.println(usingKadane(arr2));
		
		System.out.println("impreoved kadanes, handling all -ve elems");
		System.out.println(improvedKadane(arr2));
	}

	private static int improvedKadane(int[] arr) {
		int currentMax = arr[0];
		int maxSoFar = arr[0];
		
		for(int num: arr) {
			currentMax+= num;
			
			currentMax = Math.max(currentMax, num);
			maxSoFar = Math.max(currentMax, maxSoFar);
		}
		return maxSoFar;
	}

	/*
	 * Kadane's algo
	 */
	private static int usingKadane(int[] arr) {
		int max = Integer.MIN_VALUE;
		
		int sum = 0;
		for(int num: arr) {
			sum+= num;
			
			if(sum>max) {
				max = sum;
			}
			if(sum<0) {
				sum = 0;
			}
		}
		return max;
	}

	private static int bruteForce(int[] arr) {

		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=i; j<arr.length; j++) {
				sum+= arr[j];
				if(sum>max) {
					max = sum;
				}
			}
		}
		return max;
	}
}
