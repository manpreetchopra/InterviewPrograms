package edu.ace.coding.array;

import java.util.Arrays;

/*
 * In this problem, you have to implement the int [] removeEven(int[] arr)
 * method, which removes all the even elements from the array and returns back
 * updated array.
 */
public class _01_CheckRemoveEven {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 5, 10, 6, 3 };
		System.out.println("orig arr : ");
		System.out.println(Arrays.toString(arr));

		arr = removeEven(arr);
		// arr = removeAtIndex(arr, 3);
		// arr = removeEvenInMem(arr);

		System.out.println("modified arr : ");
		System.out.println(Arrays.toString(arr));

	}

	/*
	 * By Creating a new array to hold only odd numbers
	 */
	public static int[] removeEven(int[] arr) {

		// Get number of odd elems to create a new array to hold odd elems
		int oddElems = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddElems++;
			}
		}

		// new array result to hold only odd elems
		int[] result = new int[oddElems];
		int resultIdx = 0;

		// Putting only odd elems to result array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				result[resultIdx++] = arr[i];
			}
		}
		return result;
	}

	/*
	 * In-Memory, not creating a new array, instead using the original array, and
	 * putting -999 in the end for the even elems removed
	 */
	public static int[] removeEvenInMem(int[] arr) {

		// not using for loop here, as the increment should happen only for odd elems
		// if elem is even, the array is shifted to left, hence index should remain same
		// for next iteration
		int i = 0;
		while (i < arr.length) {
			if (arr[i] % 2 == 0) {
				// this elem needs to be removed, hence shifting the array from index i
				
				// using while loop just to initialize the counter j outside, this counter is used
				// to put -999 after the array is shifted
				int j = i;
				while (j < arr.length - 1) {
					arr[j] = arr[j + 1];
					j++;
				}
				arr[j] = -999;
			} else {
				i++;
			}
		}
		return arr;
	}

	/*
	 * Test code for removing elem at some index
	 */
	public static int[] removeAtIndex(int[] arr, int index) {

		for (int i = index; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = -999;
		return arr;
	}
}
