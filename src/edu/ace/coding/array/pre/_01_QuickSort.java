package edu.ace.coding.array.pre;

import java.util.Arrays;

public class _01_QuickSort {

	public static void main(String[] args) {
		int[] arr = {1,6,2,9,5,4,6,7};
		arr = sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] sort(int[] arr, int min, int max) {
		
		if(min<max) {
		int pIndex = partition(arr,min,max);
		sort(arr, min, pIndex-1);
		sort(arr, pIndex+1, max);
		}
		return arr;
	}

	private static int partition(int[] arr, int min, int max) {
		int pivot = arr[max];
		int pIndex = min;
		
		for(int i=min; i<max; i++) {
			if(arr[i]<=pivot) {
				swap(arr,pIndex,i);
				pIndex++;
			}
		}
		swap(arr,max,pIndex);
		return pIndex;
	}

	private static void swap(int[] arr, int pIndex, int i) {
		int temp = arr[pIndex];
		arr[pIndex] = arr[i];
		arr[i] = temp;
		
	}
}
