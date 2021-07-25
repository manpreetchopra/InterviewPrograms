package edu.ace.coding.ds.stack_quee.challenges;

import edu.ace.coding.ds.stack_quee._00_Stack;

public class _10_MinStackO1 {

	public static void main(String[] args) {
		_10_MinStackO1.MinStack minStack = new _10_MinStackO1.MinStack(10);
		minStack.push(47);
		minStack.push(27);
		minStack.push(31);
		minStack.push(41);
		minStack.push(46);
		
		System.out.println(minStack.min());
		
	}

	static class MinStack {
		int maxSize;
		_00_Stack<Integer> mainStack;
		_00_Stack<Integer> minStack;

		// constructor
		public MinStack(int maxSize) {
			// Write -- Your -- Code
			mainStack = new _00_Stack<>(maxSize);
			minStack = new _00_Stack<>(maxSize);
			this.maxSize = maxSize;
		}

		// removes and returns value from stack
		public Integer pop() {
			// Write -- Your -- Code

			minStack.pop();
			return mainStack.pop();
		}

		// pushes value into the stack
		public void push(Integer value) {
			// Write -- Your -- Code
			mainStack.push(value);

			if (!minStack.isEmpty() && minStack.top() < value) {
				minStack.push(minStack.top());
			} else {
				minStack.push(value);
			}
		}

		// returns minimum value in O(1)
		public int min() {
			// Write -- Your -- Code
			return minStack.top();
		}

	}
}
