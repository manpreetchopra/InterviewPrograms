package edu.ace.coding.array;

import java.util.Arrays;

/**
 * Re-arrange Positive & Negative Values
 * @author macho
 *
 */
public class _09_CheckReArrange {

	public static void main(String[] args) {
		int[] arr = {2 ,4, -6 ,8 ,-5, -10 };
		
		int[] arr1 = Arrays.copyOf(arr, arr.length);
		reArrangeTwoPointers(arr1);
		System.out.println(Arrays.toString(arr1));
		
		int[]arr2 = Arrays.copyOf(arr, arr.length);
		reArrangePartition(arr2);
		System.out.println(Arrays.toString(arr2));
		
		reArrangeNewArray(arr);
	}
	
	/*
	 * Using 2 POinters
	 */
	public static void reArrangeTwoPointers(int[] arr) {

	    int i = 0;
	    int j = arr.length-1;

	    while(i<j){
	      if(arr[i]<0 && arr[j]>0){
	        i++;
	        j--;
	      }else if(arr[i] > 0 && arr[j] < 0){
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;

	        i++;
	        j--;
	      }
	      else if(arr[i] < 0 && arr[j] < 0){
	        i++;
	      }else if(arr[i] > 0 && arr[j] >0){
	        j--;
	      }
	    }
	  }
	
	/*
	 * Using Partition from QuickSort
	 */
	public static void reArrangePartition(int[] arr) {
		int pivot = 0;
		int pIndex = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]<=pivot) {
				int temp =arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				
				pIndex++;
			}
		}
	}
	
	/**
	 * Using new Array-- 2 loops
	 */
	public static void reArrangeNewArray(int[] arr) {
		
		int[] result = new int[arr.length];
		
		int idx = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]<0) {
				result[idx] = arr[i];
				idx++;
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>=0) {
				result[idx] = arr[i];
				idx++;
			}
		}
	System.out.println(Arrays.toString(result));
	}
}
