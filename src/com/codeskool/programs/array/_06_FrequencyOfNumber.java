package com.codeskool.programs.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Find the frequency of a number in an array
 * @author macho
 *
 */
public class _06_FrequencyOfNumber {

	public static void main(String[] args) {
		 //int a[] = {0, 5, 5, 5, 4};
		 int a[] = {1, 1, 2, 2, 2, 2, 3};
         int num = 2;
         //1. using single loop for single number frequency
         System.out.println("Iterative way ---");
         System.out.println(iterativeFrequency(a, num));
         
         //2. Using map
         System.out.println("Map ---");
         printCountsFromMap(usingMapForMultiples(a));
         
         //3.for sorted array, using binary Search
         System.out.println(countUsingBinarySearch(a, num));
         
	}
	
	/*
	 * Simple Iteration
	 */
	public static int iterativeFrequency(int[] arr, int num){
		int freq = 0;
		for(int i:arr) {
			if(i==num) {
				freq++;
			}
		}
		return freq;
	}
	
	/*
	 * Using hashes
	 */
	public static Map<Integer,Integer> usingMapForMultiples(int arr[]) {
		Map<Integer,Integer> countMap = new HashMap<>();
		for(int i:arr) {
			if(countMap.containsKey(i)) {
				countMap.put(i, countMap.get(i)+1);
			}else {
				countMap.put(i, 1);
			}
		}
		return countMap;
	}
	
	public static void printCountsFromMap(Map<Integer,Integer> map) {
		Set<Integer> keys = map.keySet();
		
		for(int key:keys) {
			System.out.println(key+"   comes "+map.get(key));
		}
	}
	
	
	/**
	 * 
	 * If array is sorted,  Binary Search method can also be applied
	 */
	
	public static int binarySearch(int[] arr, int l, int r, int num) {
		
		if(l>r) {
			return -1;
		}
		
		int mid = l+ (r-l)/2;
		
		if(arr[mid] == num) {
			return mid;
		}
		else if(arr[mid]>num) {
			return binarySearch(arr, l, mid-1, num);
		}
		else {
			return binarySearch(arr, mid+1, r, num);
		}
	}
	
	public static int countUsingBinarySearch(int[] arr, int num) {
		
		int index = binarySearch(arr, 0, arr.length-1, num);
		
		if(index == -1) {
			return 0;
		}
		int count = 1;
		int l = index-1;
		
		while(l>=0 && arr[l]==num) {
			count++;
			l--;
		}
		
		int r = index+1;
		while(r<arr.length && arr[r]==num) {
			count++;
			r++;
		}
		return count;
	}
	
}
