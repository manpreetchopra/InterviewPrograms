package edu.ace.coding.ds.array;

import java.util.Arrays;

/**
 * Given a sorted array, create a new array containing squares of all the
 * numbers of the input array in the sorted order.
 * 
 * Input: [-2, -1, 0, 2, 3]
 * Output: [0, 1, 4, 4, 9]
 * @author macho
 *
 */
public class _24_SortedArraySquares {
	public static void main(String[] args) {

		int[] arr = { -2, -1, 0, 2, 3 };
		int[] result = makeSquaresByFirstNonNegative(arr);
		System.out.println(Arrays.toString(result));
		
		int[] result2 = makeSquaresByFirstNonNegative(arr);
		System.out.println(Arrays.toString(result2));
	}

	private static int[] makeSquaresDirect2Pointers(int[] arr) {
		
		int[] result = new int[arr.length];
		int p1 = 0;
		int p2 = arr.length-1;
		
		int endIdx = arr.length-1;
		
		while(p1<p2) {
			int p1sq = arr[p1]*arr[p1];
			int p2sq = arr[p2]*arr[p2];
			
			if(p1sq>p2sq) {
				result[endIdx--] = p1sq;
				p1++;
			}else {
				result[endIdx--] = p2sq;
				p2--;
			}
		}
		return result;
	}
	
	private static int[] makeSquaresByFirstNonNegative(int[] arr) {
		// TODO Auto-generated method stub
		
		int[] result = new int[arr.length];
		int startIdx = 0;
		int i = 0;
		for(; i<arr.length; i++) {
			if(arr[i] >=0) {
				break;
			}
		}
		int p1 = i-1;
		int p2 = i;
		
		while(p1>=0 && p2<arr.length) {
			int p1sq = arr[p1]* arr[p1];
			int p2sq = arr[p2]* arr[p2];
			
			if(p1sq < p2sq) {
				result[startIdx++] = p1sq;
				p1--;
			}else {
				result[startIdx++] = p2sq;
				p2++;
			}
			
		}
		
		while(p1>=0) {
			result[startIdx++] = arr[p1] * arr[p1];
			p1--;
		}

		while(p2 < arr.length) {
			result[startIdx++] = arr[p2] * arr[p2];
			p2++;
		}
		return result;
	}

}
