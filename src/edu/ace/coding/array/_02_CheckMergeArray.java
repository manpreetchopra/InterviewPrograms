package edu.ace.coding.array;

/**
 * Given two sorted arrays, merge them into one array, which should also be
 * sorted.
 * 
 * @author macho
 *
 */
class CheckMergeArray {
	// merge arr1 and arr2 into a new result array
	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		
		int i = 0;
		int j = 0;

		int[] result = new int[arr1.length + arr2.length];
		int idx = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				result[idx] = arr1[i];
				idx++;
				i++;
			} else {
				result[idx] = arr2[j];
				idx++;
				j++;
			}
		}

		while (i < arr1.length) {
			result[idx] = arr1[i];
			idx++;
			i++;
		}

		while (j < arr2.length) {
			result[idx] = arr2[j];
			idx++;
			j++;
		}
		return result;
	}

}