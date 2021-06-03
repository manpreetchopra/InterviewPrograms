package com.codeskool.programs.array;

import java.util.HashMap;
import java.util.Map;

public class _16_Common_Three_SortedArrays {
	public static void main(String[] args) {
		
		int arr1[] = {1, 5, 10, 20, 40, 80,100}; 
		int arr2[] = {6, 7, 20, 80, 100} ;
		int arr3[] = {3, 4, 15, 20, 30, 70, 80,100, 120}; 
	System.out.println("Brute Force ---");
	bruteForce(arr1,arr2,arr3);
	System.out.println();
	System.out.println("Using Map ---");
	usingMap(arr1,arr2,arr3);
	
	System.out.println();
	System.out.println("Using arra's sorted property");
	
	commonWithDups(arr1,arr2,arr3);
	}

	private static void commonWithDups(int[] arr1, int[] arr2, int[] arr3) {

		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<arr1.length && j<arr2.length && k<arr3.length) {
			if(arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				int elem = arr1[i];
				System.out.print(elem+"  ");
				
				/*
				 * Below handles dups in arrays
				 */
				while(i<arr1.length && elem == arr1[i]) {
					i++;
				}
				while(j<arr2.length && elem == arr2[j]) {
					j++;
				}
				while(k<arr3.length && elem == arr3[k]) {
					k++;
				}
				/* till here*/
				
			}
			else if(arr1[i]<arr2[j]) {
				i++;
			}else if(arr2[j]<arr3[k]) {
				j++;
			}else {
				k++;
			}
		}
		
	}

	private static void usingMap(int[] arr1, int[] arr2, int[] arr3) {
	
		Map<Integer,Integer> map2 = new HashMap<>();
		Map<Integer,Integer> map3 = new HashMap<>();
		
		for(int j:arr2) {
			if(map2.containsKey(j)) {
				map2.put(j, map2.get(j)+1);
			}else {
				map2.put(j, 1);
			}
		}
		
		for(int k:arr3) {
			if(map3.containsKey(k)) {
				map3.put(k, map2.get(k)+1);
			}else {
				map3.put(k, 1);
			}
		}
		
		for( int i:arr1) {
			if(map2.containsKey(i)&& map3.containsKey(i)) {
				System.out.print(i+"  ");
			}
		}
		
	}

	private static void bruteForce(int[] arr1, int[] arr2, int[] arr3) {
		
		for(int i = 0;i<arr1.length;i++) {
		
			for(int j = 0;j<arr2.length;j++) {
				if(arr1[i] == arr2[j]) {
					for(int k = 0; k<arr3.length; k++) {
						if(arr2[j] == arr3[k]) {
							System.out.print(arr2[j]+"  ");
						}
					}
				}
			}
		}
		
	}

}
