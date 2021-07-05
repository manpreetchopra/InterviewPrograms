package edu.ace.coding.ds.array;

import java.util.Arrays;

/**
 *  find two numbers that add up to "n" 
 * @author macho
 *
 */
public class _03_CheckSum {
	public static void main(String[] args) {
		int[] arr = {1,4,6,2,3};
		int num = 7;
		
		//Uisng BruteForce
		int[] resultBF = findSumBruteForce(arr,num);
		System.out.println(Arrays.toString(resultBF));
		
		//Using Sort and 2 pointers
		int[] result2P = sortAndTwoPointers(arr,num);
		
		System.out.println(Arrays.toString(result2P));
		
		
	}

	/*
	 * 1. Sort the array in asecnding order
	 * 2. Use 2 pointers, start and end Pointer
	 * if arr[start]+ arr[end] > num, end--
	 * if arr[start]+ arr[end] < num, start++
	 * if arr[start]+ arr[end] = num, we found the pair
	 */
	private static int[] sortAndTwoPointers(int[] arr, int num) {
		
		//sort elems from 0 till last elem(ie length-1)
		arr = sortArray(arr,0,arr.length-1);
		//System.out.println(Arrays.toString(arr));
		
		int p1 = 0;
		int p2 = arr.length-1;
		int[] result  = new int[2];
		while(p1<p2) {
			if(arr[p1] + arr[p2] == num) {
				result[0]= arr[p1];
				result[1]= arr[p2];
				
				//if sum matches, end the program and return
				return result;
			}else if(arr[p1] + arr[p2] < num) {
				p1++;
			}else if(arr[p1] + arr[p2] > num){
				p2--;
			}
		}
		
		return result;
	}

	/*
	 * Using QuickSort
	 */
	private static int[] sortArray(int[] arr, int min, int max) {
		
		if(min<max) {
		//partition the array and get partition index
		int pIndex = partition(arr, min, max);
		sortArray(arr, min, pIndex-1);
		sortArray(arr, pIndex+1, max);
		}
		return arr;
	}

	private static int partition(int[] arr, int min, int max) {
		
		int pivot = arr[max];
		int pIndex = min;
		
		for(int i = min; i<max; i++) {
			if(arr[i] <= pivot) {
				swap(arr, i, pIndex);
				pIndex++;
			}
		}
		swap(arr, pIndex, max);
		
		return pIndex;
	}

	private static void swap(int[] arr, int i, int pIndex) {
		int temp = arr[i];
		arr[i] = arr[pIndex];
		arr[pIndex] = temp;
		
	}

	/*
	 * BruteForce Technique
	 * Use 2 nested loops and check of each pair of sum in the array
	 */
	private static int[] findSumBruteForce(int[] arr, int num) {
		int[] result = new int[2]; 
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] +arr[j] == num) {
					result[0]=arr[i];
					result[1] = arr[j];
				}
			}
		}
		
		return result;
	}

}
