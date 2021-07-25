package edu.ace.coding.ds.stack_quee.challenges;

import edu.ace.coding.ds.stack_quee._00_Stack;

public class _04_QueueWithStack<V> {
	public static void main(String[] args) {
		_04_QueueWithStack.QueueWithStacK<Integer> q =  new _04_QueueWithStack.QueueWithStacK<Integer>(10);

		for(int i=1; i<=10; i++) {
			q.enquee(i);
		}
		q.print();
		q.dequee();
		q.dequee();
		q.print();
	}

	static class QueueWithStacK<V> {
		_00_Stack<V> stack1;
		_00_Stack<V> stack2;

		public QueueWithStacK(int size) {
			stack1 = new _00_Stack<V>(size);
			stack2 = new _00_Stack<V>(size);
		}

		public boolean isEmpty() {
			return stack1.isEmpty();
		}

		public void enquee(V value) {
			stack1.push(value);
		}

		public V dequee() {

			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
			V result = stack2.pop();

			while (!stack2.isEmpty()) {
				stack1.push(stack2.pop());
			}
			return result;
		}

		public void print() {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}

			System.out.print("front ---> ");
			while (!stack2.isEmpty()) {
				V value = stack2.pop();

				System.out.print(value + " | ");
				stack1.push(value);
			}
			System.out.println(" <--- back");
		}

	}
}
