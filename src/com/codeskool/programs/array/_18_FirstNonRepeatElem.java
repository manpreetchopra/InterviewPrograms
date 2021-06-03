package com.codeskool.programs.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Find the first non-repeating element in a given array of integers.
 * @author macho
 *
 */
public class _18_FirstNonRepeatElem {

	public static void main(String[] args) {
		int arr[] = {1, 2, 1, 3, 2};
		
		System.out.println("Brute Force --");
		System.out.println(bruteForce(arr));
		
		System.out.println("Using Map --");
		System.out.println(usingMap(arr));
		
	
	}



	private static int usingMap(int[] arr) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i:arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		
		for(int i:arr) {
			if(map.get(i)==1) {
				return i;
			}
		}
		return -1;
		
	}

	private static int bruteForce(int[] arr) {
	
		/*
		for(int i = 0; i<arr.length; i++) {
			boolean repeat = false;
			for(int j=0; j<arr.length; j++) {
				if( i!=j && arr[i] == arr[j]) {
					repeat = true;
					break;
				}
			}
			if(repeat == false) {
				return arr[i];
			}
		}
		*/
		int n = arr.length;
		for(int i = 0;i<n; i++) {
			int j;
			for( j = 0 ; j<n; j++) {
				if(i!=j && arr[i]==arr[j]) {
					break;
				}
			}
			if(j==n) {
				return arr[i];
			}
		}
		return -1;
		
	}
}
