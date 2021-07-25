package edu.ace.coding.ds.stack_quee;

public class _00_Stack<V> {
	private int top;
	private int maxSize;
	private V[] arr; 

	public _00_Stack(int size){
		maxSize = size;
		top = -1;
		arr = (V[])new Object[size];
	}
	
	public void print() {
		for(int i=0; i<=top; i++) {
			System.out.print(arr[i]+" | ");
		}
		System.out.println(" --->");
	}
	
	public int getMaxSize() {
		return maxSize;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize-1;
	}
	
	public V top() {
		if(isEmpty()) {
			return null;
		}
		return arr[top];
	}
	
	public void push(V value) {
		if(isFull()) {
			System.out.println("Stack already full");
			return;
		}
		arr[++top] = value;
	}
	
	public V pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		return arr[top--];
	}
	
}
