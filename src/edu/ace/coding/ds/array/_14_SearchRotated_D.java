package edu.ace.coding.ds.array;

import java.util.Arrays;

/**
 * Search for a given number in a sorted array, with unique elements, that has
 * been rotated by some arbitrary number. Return -1 if the number does not
 * exist.
 * 
 * @author macho
 *
 */
public class _14_SearchRotated_D {

	public static void main(String[] args) {
		int[] arr = { 6, 7, 1, 2, 3, 4, 5 };

		int[] arr1 = Arrays.copyOf(arr, arr.length);

		int result1 = binarySearchRotatedRecursive(arr1, 3);
		System.out.println(result1);

		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int result2 = binarySearchRotatedIter(arr2, 3);
		System.out.println(result2);
	}

	private static int binarySearchRotatedIter(int[] arr, int key) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = (start + end) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[start] <= arr[mid] && key >= arr[start] && key <= arr[mid]) {
				end = mid - 1;
			} else if (arr[mid] <= arr[end] && key >= arr[mid] && key <= arr[end]) {
				start = mid + 1;
			} else if (arr[start] >= arr[mid]) {
				end = mid - 1;
			} else if (arr[mid] >= arr[end]) {
				start = mid + 1;
			}
		}

		return -1;
	}

	static int binarySearchRotatedRecursive(int[] arr, int key) {

		return binarySearchRotatedRecursive(arr, 0, arr.length - 1, key);

	}

	public static int binarySearchRotatedRecursive(int[] arr, int start, int end, int key) {

		if (start > end) {
			return -1;
		}
		int mid = (start + end) / 2;

		if (arr[mid] == key) {
			return mid;
		}
		if (arr[start] <= arr[mid] && key >= arr[start] && key <= arr[mid]) {
			return binarySearchRotatedRecursive(arr, start, mid - 1, key);
		} else if (arr[mid] <= arr[end] && key >= arr[mid] && key <= arr[end]) {
			return binarySearchRotatedRecursive(arr, mid + 1, end, key);
		} else if (arr[start] >= arr[mid]) {
			return binarySearchRotatedRecursive(arr, start, mid - 1, key);
		} else if (arr[mid] >= arr[end]) {
			return binarySearchRotatedRecursive(arr, mid + 1, end, key);
		}

		return -1;

	}
}
