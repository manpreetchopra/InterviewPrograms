package com.codeskool.programs.array;

import java.util.Arrays;

/**
 * Program to cyclically rotate an array by one
 * @author macho
 *
 */
public class _11_Rotate_Cyclic {

	public static void main(String[] args) {
		//Output: arr[] = {5, 1, 2, 3, 4}
		 int arr[] = {1, 2, 3, 4, 5};
		 
		 int[] arr1 = Arrays.copyOf(arr, arr.length);
		 rotateByIteration(arr1);
		 System.out.println(Arrays.toString(arr1));
	
		 int[] arr2 = Arrays.copyOf(arr, arr.length);
		 System.out.println("2 Pointers");
		 usingTwoPointerSwap(arr2);
		 System.out.println(Arrays.toString(arr2));
	}

	/*
	 * Using simple Iteration
	 */
	private static void rotateByIteration(int[] arr) {
		int temp = arr[arr.length-1];
		
		for(int i = arr.length-1;i>0;i--) {
			arr[i] = arr[i-1];
		}
		
		arr[0] = temp;
	}
	
	/*
	 * Using 2 Pointers and swapping elements
	 */
	private static void usingTwoPointerSwap(int[] arr) {
		 int i=0;
		 int j= arr.length-1;
		 
		 while(i!=j) {
			 int temp = arr[i];
			 arr[i] = arr[j];
			 arr[j] = temp;
		 i++;
		 }
	}	
}
