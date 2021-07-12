package edu.ace.coding.ds.array;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Max sliding window Given a large array of integers and a window of size www,
 * find the current maximum value in the window as the window slides through the
 * entire array.
 * 
 * @author macho
 *
 */
public class _13_MaxSlidingWindow_D {

	public static void main(String[] args) {
		int[] arr = { -4, 2, -5, 3, 6 };
		int w = 3;

		int[] result = maxSlidingWidow(arr, w);
		System.out.println(Arrays.toString(result));

	}

	private static int[] maxSlidingWidow(int[] arr, int w) {
		int n = arr.length;
		int[] result = new int[n - w + 1];

		Deque<Integer> dq = new LinkedList<>();

		int i = 0;

		for (; i < w; i++) {
			while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
				dq.removeLast();
			}
			dq.addLast(i);
		}

		for (; i < arr.length; i++) {
			result[i - w] = arr[dq.peekFirst()];

			while (!dq.isEmpty() && dq.peekFirst() <= i - w) {
				dq.removeFirst();
			}
			while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
				dq.removeLast();
			}
			dq.addLast(i);
		}

		result[i - w] = arr[dq.peekFirst()];

		return result;
	}

	public static ArrayDeque<Integer> findMaxSlidingWindow(int[] arr, int windowSize) {
		ArrayDeque<Integer> result = new ArrayDeque<>();

		int n = arr.length;
		int w = windowSize;

		Deque<Integer> dq = new LinkedList<>();

		int i = 0;
		for (; i < w; i++) {
			while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
				dq.removeLast();
			}
			dq.addLast(i);
		}

		for (; i < n; i++) {
			result.add(arr[dq.peekFirst()]);

			while (!dq.isEmpty() && dq.peekFirst() <= i - w) {
				dq.removeFirst();
			}

			while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
				dq.removeLast();
			}
			dq.addLast(i);
		}
		result.add(arr[dq.peekFirst()]);
		// Write your code
		return result;
	}

}
