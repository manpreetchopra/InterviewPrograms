package edu.ace.coding.ds.stack_quee.challenges;

import java.util.Arrays;

import edu.ace.coding.ds.stack_quee._00_Stack;

public class _07_NextGreaterChallenge {
	
	public static void main(String[] args) {
		//int arr[] = {4,6,3,2,8,1,11};
		int arr[] = {4,6,3,2,8,1,11}; 
		int[] result = nextGreater(arr);
		System.out.println(Arrays.toString(result));
	}

	private static int[] nextGreater(int[] arr) {

		int[] result = new int[arr.length];
		_00_Stack<Integer> stack = new _00_Stack<Integer>(arr.length);

		for (int i = arr.length - 1; i >= 0; i--) {

			{
				while (!stack.isEmpty() && stack.top() <= arr[i]) {
					stack.pop();
				}

				if (stack.isEmpty()) {
					result[i] = -1;
				} else {
					result[i] = stack.top();
				}
			}
			stack.push(arr[i]);

		}

		return result;
	}

}
