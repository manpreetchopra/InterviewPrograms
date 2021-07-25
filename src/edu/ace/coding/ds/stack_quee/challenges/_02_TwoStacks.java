package edu.ace.coding.ds.stack_quee.challenges;

public class _02_TwoStacks<V> {

	private int top1;
	private int top2;
	private V[] arr;
	private int maxSize;
	
	public _02_TwoStacks(int size) {
		maxSize = size;
		arr = (V[])new Object[size];
		top1 = -1;
		top2 = maxSize;
	}
	
	public void push1(V value) {
		if(top1<top2 - 1) {
			arr[++top1] = value;
		}
	}
	
	public void push2(V value) {
		if(top1<top2 -1) {
			arr[--top2] = value;
		}
	}
	
	public V pop1() {
		if(top1 > -1) {
			return arr[top1--];
		}
		return null;
		
	}
	
	public V pop2() {
		if(top2 < maxSize) {
			return arr[top2++];
		}
		return null;
	}
}
