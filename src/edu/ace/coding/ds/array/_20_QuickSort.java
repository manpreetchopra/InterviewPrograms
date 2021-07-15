package edu.ace.coding.ds.array;

import java.util.Arrays;

public class _20_QuickSort {
	public static void main(String[] args) {
		int[] arr = {3,1,7,4,8,9};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr, int left, int right) {
		if(left<right) {
		int pIndex = partition(arr, left, right);
		quickSort(arr, left, pIndex-1);
		quickSort(arr, pIndex+1, right);
		}
	}

	private static int partition(int[] arr, int left, int right) {
		
		int partition = arr[right];
		int pIndex = left;
		
		for(int i = left; i<right; i++) {
			if(arr[i] <= partition) {
				swap(arr,pIndex,i);
				pIndex++;
			}
		}
		
		swap(arr,pIndex,right);
		return pIndex;
	}

	private static void swap(int[] arr, int pIndex, int i) {
		
		int temp = arr[i];
		arr[i] = arr[pIndex];
		arr[pIndex]  =temp;
		
	}

}
