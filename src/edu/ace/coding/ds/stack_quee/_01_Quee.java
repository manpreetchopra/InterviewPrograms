package edu.ace.coding.ds.stack_quee;

public class _01_Quee<V> {
	
	private int maxSize;
	private int currentSize;
	private V[] arr;
	private int front;
	private int back;
	
	public _01_Quee(int size) {
		maxSize = size;
		arr = (V[])new Object[size];
		back = -1;
		front = 0;
		currentSize = 0;
	}
	
	public int getCurrentSize() {
		return currentSize;
	}
	
	public int getMaxSize() {
		return maxSize;
	}
	
	public boolean isEmpty() {
		return currentSize == 0;
	}
	
	public boolean isFull() {
		return currentSize == maxSize;
	}

	public void print() {
		System.out.println("printing : front:"+front+"   back:"+back);
		System.out.print("front ---> ");
		for(int i = front; i<=back; i++) {
			System.out.print(arr[i] +" | ");
		}
		System.out.println("<--- back");
	}
	public V top() {
		if(isEmpty()) {
			return null;
		}
		return arr[front];
	}
	
	public void enquee(V value) {
		if(isFull()) {
			return;
		}
		
		back = (back + 1)%maxSize;
		arr[back] = value;
		currentSize++;
	}
	
	public V deQuee() {
		if(isEmpty()) {
			return null;
		}
		
		V temp = arr[front];
		front = (front + 1)%maxSize;
		currentSize--;
		
		return temp;
	}
}
