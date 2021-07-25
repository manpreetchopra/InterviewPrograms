package edu.ace.coding.ds.stack_quee;

import java.util.Arrays;

public class _00_StackMain {
	public static void main(String[] args) {
		
		_00_Stack<Integer> stack = new _00_Stack<Integer>(5);
		System.out.println("isFull: "+stack.isFull());
		System.out.println("isEmpty: "+stack.isEmpty());
		
		System.out.println("Pushing values");
		for(int i = 0; i < 5; i++) {
			stack.push(i);
		}
		stack.print();
		System.out.println("isFull "+stack.isFull());
		
		System.out.println(stack.pop());
		stack.print();
		
		for(int i=0; i<3; i++) {
			stack.pop();
		}
		stack.print();
		
		System.out.println("isEmpty : "+stack.isEmpty());
		System.out.println("isFull : "+stack.isFull());
	}

}
