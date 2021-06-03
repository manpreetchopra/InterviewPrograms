package com.codeskool.programs.array;

/**
 * Range and Coefficient of range of Array
 * Range: Difference between the maximum value and the minimum value in the distribution. 
	Coefficient of Range: (Max – Min) / (Max + Min).
 * @author macho
 *
 */
public class _08_RangeCofficient {

	public static void main(String[] args) {
		int arr[] = {15, 16, 10, 9, 6, 7, 17} ;
		findRandAndCoff(arr);
	}

	private static void findRandAndCoff(int[] arr) {
		
		int max = findMax(arr);
		int min = findMin(arr);
		
		float range = max - min;
		float coff = range/(min+max);
		
		System.out.println("Range  : "+range);
		System.out.println("Coff : "+coff);
	}

	/*
	 * Find Max num
	 */
	private static int findMax(int[] arr) {
		int max = arr[0];
		for(int i = 1; i<arr.length; i++) {
			//max = Math.max(max, arr[i]);
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	/*
	 * Find min num
	 */
	private static int findMin(int[] arr) {
		int min = arr[0];

		for(int i = 1; i<arr.length; i++) {
			//min = Math.min(min, arr[i]);
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
}
