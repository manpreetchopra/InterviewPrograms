package edu.ace.coding.ds.stack_quee.challenges;

import edu.ace.coding.ds.stack_quee._00_Stack;

public class _05_CheckSortStack {
	public static void main(String[] args) {
		_00_Stack<Integer> stack = new _00_Stack<Integer>(7);
		
			stack.push(2);
	        stack.push(97);
	        stack.push(4);
	        stack.push(42);
	        stack.push(12);
	        stack.push(60);
	        stack.push(23);
	        
	        stack.print();
	        
	        
	        sort(stack);
	        stack.print();
	        //97 | 60 | 42 | 23 | 12 | 4 | 2 |  --->
	        /*
	        sortRec(stack);
	        stack.print();
	        */
	}

	
	private static void sortRec(_00_Stack<Integer> stack) {
		if(stack.isEmpty()) {
			return;
		}
		
		int temp =stack.pop();
		sortRec(stack);
		insertAtCorrectPosition(stack,temp);
		
	}


	private static void insertAtCorrectPosition(_00_Stack<Integer> stack, int temp) {
		
		if(stack.isEmpty() || temp < stack.top()) {
			stack.push(temp);
			return;
		}
		
		int elem = stack.pop();
		insertAtCorrectPosition(stack, temp);
		stack.push(elem);
	}


	private static void sort(_00_Stack<Integer> stack) {

		_00_Stack<Integer> tempStack = new _00_Stack<Integer>(stack.getMaxSize());

		while (!stack.isEmpty()) {
			Integer value = stack.pop();
			/*
			if (!tempStack.isEmpty() && value >= tempStack.top()) {
				tempStack.push(value);
			} else
			*/ {
				while (!tempStack.isEmpty() && tempStack.top() > value) {
					stack.push(tempStack.pop());
				}
				tempStack.push(value);
			}
		}

		while (!tempStack.isEmpty()) {
			stack.push(tempStack.pop());
		}
	}

}
