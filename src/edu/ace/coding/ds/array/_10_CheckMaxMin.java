package edu.ace.coding.ds.array;

import java.util.Arrays;

/**
 * Rearrange Sorted Array in Max/Min Form
 * Input : arr = {1, 2, 3, 4, 5}
 * Output : arr = {5, 1, 4, 2, 3}
 * @author macho
 *31,8,27
 */
public class _10_CheckMaxMin {
	

	public static void main(String[] args) {
		int[]  arr = {1, 2, 3, 4, 5};
		
		int[] arr1 = Arrays.copyOf(arr, arr.length);
		maxMinWithModulus(arr1);
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		maxMinOddEvenIdx(arr2);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOf(arr, arr.length);
		maxMinBoolFlag(arr3);
		System.out.println(Arrays.toString(arr3));
	}
	
	/*
	 * Using Divide and modulus technique
	 */
	public static void maxMinWithModulus(int[] arr) {
		//Get a value to be used as constant which is bigger than max value in array
		//This value to be used to take mod and divide the array elems
		int max = arr[arr.length-1]+1;
		
		int p1 = 0;
		int p2 = arr.length-1;
		
		for(int i = 0 ; i<arr.length; i++) {
			if(i%2==0) {
			arr[i] = arr[i] + (arr[p2]%max*max);
			p2--;
			}else {
			arr[i] = arr[i] + (arr[p1]%max*max);
			p1++;
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = arr[i]/max;
		}
	}
	
	/*
	 * Tow Pointer technique with a bool flag
	 * loop thru array to form result array
	 * use 2 pointers - start(small) and end(big) pointing to orig array
	 * put the arr elem in result array while switching the bool flag and inc/dec pointers
	 */
	public static void maxMinOddEvenIdx(int[] arr) {

		int p1 = 0;
		int p2 = arr.length-1;

		int[] result = new int[arr.length];

		for(int i = 0; i<arr.length; i++){
			if(i%2 == 0){
				result[i] = arr[p2--];
			}else{
				result[i] = arr[p1++];
			}
		}

		for(int i= 0; i<result.length; i++){
			arr[i] = result[i];
		}
	}


	/*
	 * Two Pointer technique with using even/odd tech
	 * loop thru array to form result array
	 * use 2 pointers - start(small) and end(big) pointing to orig array
	 * put the arr elem in result array based on if result arr index is even(big numbers)/odd(small num)
	 */
	public static void maxMinBoolFlag(int[] arr) {
		int p1 = 0;
		int p2 = arr.length-1;

		int[] result = new int[arr.length];

		boolean maxFlag = true;
		for(int i = 0; i<arr.length; i++){

			if(maxFlag){
				result[i] = arr[p2--];
			}else{
				result[i] = arr[p1++];
			}
			maxFlag = !maxFlag;
		}

		for(int i= 0; i<result.length; i++){
			arr[i] = result[i];
		}
	}
}
