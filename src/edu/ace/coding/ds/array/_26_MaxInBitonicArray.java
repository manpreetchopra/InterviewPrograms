package edu.ace.coding.ds.array;

/**
 * Find the maximum value in a given Bitonic array. An array is considered
 * bitonic if it is monotonically increasing and then monotonically decreasing.
 * Monotonically increasing or decreasing means that for any index i in the
 * array arr[i] != arr[i+1].
 * 
 * Input: [1, 3, 8, 12, 4, 2]
 * Output: 12
 * Explanation: The maximum number in the input bitonic array is '12'.
 * 
 * @author macho
 *
 */
public class _26_MaxInBitonicArray {

	public static void main(String[] args) {
		int[] arr = {1, 3, 8, 12, 4, 2};
		
		int max = findMax(arr);
		System.out.println(max);
	}

	private static int findMax(int[] arr) {
		int start  = 0 ;
		int end = arr.length-1;
		while(start<end) {
			int middle = start + (end-start)/2;

			if(arr[middle] < arr[middle+1]) {
				start = middle+1;
			}else {
				end = middle;
			}
		}
		return arr[start];
		
	}

}
