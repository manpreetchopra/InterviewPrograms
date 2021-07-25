package edu.ace.coding.ds.stack_quee.challenges;

import edu.ace.coding.ds.stack_quee._00_Stack;
import edu.ace.coding.ds.stack_quee._01_Quee;

public class _03_CheckReverseKQuee {
	
	public static void main(String[] args) {
		_01_Quee<Integer> q = new _01_Quee<Integer>(10);
		for(int i=1; i<=10; i++) {
			q.enquee(i);
		}
		q.print();
		int k  = 5;
		
		reverseK(q,k);
		q.print();
		
	}

	private static<V> void reverseK(_01_Quee<V> q, int k) {
		
		_00_Stack stack = new _00_Stack(k);
		
		for(int i=0; i<5; i++) {
			stack.push(q.deQuee());
		}
		
		while(!stack.isEmpty()) {
			q.enquee((V)stack.pop());
		}
		
		for(int i=0; i<q.getCurrentSize() - k; i++) {
			q.enquee(q.deQuee());
		}
		
	}

}
