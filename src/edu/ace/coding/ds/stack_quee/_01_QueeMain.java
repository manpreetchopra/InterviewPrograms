package edu.ace.coding.ds.stack_quee;

public class _01_QueeMain {

	public static void main(String[] args) {
		_01_Quee<Integer> q = new _01_Quee<Integer>(5);
		System.out.println("isFull " + q.isFull());
		System.out.println("isEmpty " + q.isEmpty());
		for (int i = 0; i < 5; i++) {
			q.enquee(i);
		}

		q.print();
		System.out.println("isFull " +q.isFull());
		System.out.println("isEmpty "+q.isEmpty());
		
		for(int i=0; i<5; i++) {
			q.deQuee();
		}
		System.out.println("isFull " +q.isFull());
		System.out.println("isEmpty "+q.isEmpty());

		q.print();
	}

}
