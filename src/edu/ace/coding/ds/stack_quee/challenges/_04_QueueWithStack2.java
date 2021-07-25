package edu.ace.coding.ds.stack_quee.challenges;

import edu.ace.coding.ds.stack_quee._00_Stack;

public class _04_QueueWithStack2<V> {
	
	public static void main(String[] args) {
		_04_QueueWithStack2.QueueWithStack2 q= new _04_QueueWithStack2.QueueWithStack2(10);
		System.out.println(q.isEmpty());
		
		for(int i=1; i<=10; i++) {
			q.enquee(i*2);
		}
		//q.print();
		while(!q.isEmpty()) {
			System.out.println(q.dequee());
		}
	}

	static class QueueWithStack2<V>{
		_00_Stack<V> stack1;
		_00_Stack<V> stack2;
		
		
		public QueueWithStack2(int size) {
			stack1 = new _00_Stack<V>(size);
			stack2 = new _00_Stack<V>(size);
		}
		
		public boolean isEmpty() {
			return (stack1.isEmpty() && stack2.isEmpty());
		}
		
		public void enquee(V value) {
			stack1.push(value);
		}
		
		public V dequee() {
			if(isEmpty()) {
				return null;
			}
			
			if(stack2.isEmpty()) {
				while(!stack1.isEmpty()) {
					stack2.push(stack1.pop());
				}
				return stack2.pop();
			}else {
				return stack2.pop();
			}
		}
		
	}
}
