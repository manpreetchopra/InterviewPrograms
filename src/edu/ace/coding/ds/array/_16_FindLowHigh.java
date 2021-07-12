package edu.ace.coding.ds.array;

import java.util.Arrays;
import java.util.List;

/**
 * Find Low/High Index of a Key in a Sorted Array
 * 
 * @author macho
 *
 */
public class _16_FindLowHigh {
	public static void main(String[] args) {
		List<Integer>  arr = Arrays.asList(1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4,4, 5, 5, 5, 6, 6, 6, 6, 6, 6);
		int key = 5;
		
		
		int result[] = new int[2];
		result[0] = findLow(arr, key);
		result[1] = findHigh(arr, key);
		System.out.println(Arrays.toString(result));

	}

	private static int findHigh(List<Integer> arr, int key) {
		int index = -1;

		int start = 0;
		int end = arr.size()-1;
		
		while(start<=end) {
			
			int middle = (start+end)/2;
			if(arr.get(middle) <= key) {
				start = middle+1;
			}else {
				end = middle - 1;
			}
			
			if(arr.get(middle) == key) {
				index = middle;
			}
		}
		return index;

	}

	private static int findLow(List<Integer> arr, int key) {
		int index = -1;

		int start = 0;
		int end = arr.size()-1;
		
		while(start <= end) {
			
			int middle = (start+end)/2;
			
			if(arr.get(middle) >= key) {
				end = middle - 1;
			}else {
				start = middle +1;
			}
			if(arr.get(middle) == key) {
				index = middle;
			}
		}
		return index;
	}

}
