package com.codeskool.programs.array;

import java.util.Arrays;

public class _15_QuickSort {
	public static void main(String[] args) {
		int arr[] = {20,60,50,30,40,10,90};

		int low = 0;
		int high = arr.length-1;
		quickSort(arr,low,high);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int low, int high) {

		if(low<high) {
			int pi = partitionHigh(arr,low,high);
			//if(low<pi-1) 
			{
				quickSort(arr, low, pi-1);
			}
			//if(high>pi) 
			{
				quickSort(arr, pi+1,high);
			}
		}
	}

	
	  private static int partitionLow(int[] arr, int low, int high) {
	 
		int pivot = arr[low];

		int start = low;
		int end = high;

		while(start<end) {
			while(start<high && arr[start]<=pivot) {
				start++;
			}

			while(end>low && arr[end]>pivot) {
				end--;
			}

			if(start<end) {
				swap(arr,start,end);
				start++;
				end--;
			}
		}
		swap(arr,end,low);
		return end;
	}
	 

	 public static int partitionHigh(int[]arr , int start, int end) {
	 
		
		int pivot = arr[end];
		int swapPosition = start;
		while(start<=end) {
			if(arr[start]<pivot) {
				swap(arr,start,swapPosition);
				swapPosition++;
			}
			start++;
		}
		swap(arr,swapPosition,end);
		return swapPosition;
	}
	
	
	public static int partition3(int[] arr, int start, int end) {
		
		int pivot = arr[start];
		
		while(start<=end) {
			
			while(arr[start]<=pivot) {
				start++;
			}
			while(arr[end]>pivot) {
				end--;
			}
			if(start<end) {
				swap(arr,start,end);
			}
		}
		
		return end;
	}
	private static void swap(int[] arr, int low, int high) {
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;

	}

}
