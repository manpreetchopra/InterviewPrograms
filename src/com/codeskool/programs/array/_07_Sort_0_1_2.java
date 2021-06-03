package com.codeskool.programs.array;

import java.util.Arrays;

/**
 * Sort an array of 0s, 1s and 2s
 * @author macho
 *
 */
public class _07_Sort_0_1_2 {

	public static void main(String[] args) {
		int arr[] =  {0, 1, 2, 0, 1, 2};
		
		
		//1. Using simple Iterative way
		int[] arrCopy = Arrays.copyOf(arr, arr.length);
		System.out.println("Using simple iteration");
		System.out.println("arrCopy before sort: "+Arrays.toString(arrCopy));
		simpleIterative(arrCopy);
		System.out.println("arrCopy after sort : "+Arrays.toString(arrCopy));
		
		System.out.println("Using Three Pointer");
		int[] arrCopy2 = Arrays.copyOf(arr, arr.length);
		System.out.println("arrCopy2 before sort : "+Arrays.toString(arrCopy2));
		threePointerSort(arrCopy2);
		System.out.println("arrCopy2 after sort : "+Arrays.toString(arrCopy2));
		
	}
	
	public static void simpleIterative(int[] arr) {
		int zeroCount = 0;
		int oneCount = 0;
		int twoCount = 0;

		for(int i:arr) {
			if(arr[i] == 0) {
				zeroCount++;
			}else if(arr[i] == 1) {
				oneCount++;
			}else {
				twoCount++;
			}
		}


		for(int i=0;i<zeroCount;i++) {
			arr[i] = 0;
		}

		for(int i = zeroCount; i < (zeroCount+oneCount) ; i++) {
			arr[i] = 1;
		}

		for(int i = (zeroCount+oneCount) ;i<arr.length; i++) {
			arr[i] = 2;
		}


	}
	
	//2. Using 3 pointers
		public static void threePointerSort(int[] arr) {
			
			int low = 0;
			int mid = 0;
			int high = arr.length-1;
			
			while(mid<=high) {
				if(arr[mid]==0) {
					//swap mid and low
					//increment mid and low
					int temp = arr[mid];
					arr[mid] = arr[low];
					arr[low] = temp;
					
					mid++;
					low++;
				}else if(arr[mid] == 1) {
					//increment mid
					mid++;
				}else if(arr[mid]==2) {
					//swap mid and high
					int temp = arr[mid];
					arr[mid] = arr[high];
					arr[high] = temp;
					
					high--;
					//decrement high
				}
			}
		}
	
	
}
