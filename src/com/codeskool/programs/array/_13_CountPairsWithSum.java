package com.codeskool.programs.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Count pairs with given sum
 * @author macho
 *
 */
public class _13_CountPairsWithSum {
	/**
	 *  Input  :  arr[] = {1, 5, 7, -1}, 
	    sum = 6
		Output :  2
		Pairs with sum 6 are (1, 5) and (7, -1)
	*/
	
	public static void main(String[] args) {
		int arr[] = {1, 5, 7, -1};
		int sum = 6;
		System.out.println("using BruteForce");
		System.out.println(bruteForce(arr,sum));
		System.out.println("Using Map as lookup");
		System.out.println(usingMap(arr,sum));
	}

	/*
	 * Simple bruteForce
	 */
	private static int bruteForce(int[] arr,int sum) {
		
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]+arr[j] == sum) {
					count++;
				}
			}
		}
		return count;
	}
	
	/*
	 * Using map lookup for each required number as key
	 */
	private static int usingMap(int[] arr, int sum) {
		Map<Integer,Integer> freqMap = new HashMap<>();
		int doubleCount = 0;
		for(int i:arr) {
			if(freqMap.containsKey(i)) {
				freqMap.put(i, freqMap.get(i)+1);
			}else {
				freqMap.put(i, 1);
			}
		}
		
		for(int i: arr) {
			int reqdNumber = sum - i;
			if(freqMap.containsKey(reqdNumber)) {
				doubleCount+= freqMap.get(reqdNumber);
			}
		}
		
		return doubleCount/2;
	}


}
