package edu.ace.coding.ds.linkedlist;

public class _00_Main {
	public static void main(String[] args) {
		_00_SinglyLinkedList<Integer> sll = new _00_SinglyLinkedList<Integer>();
	
		/*
	 	sll.insertAtHead(1);
		sll.insertAtHead(2);
		sll.insertAtHead(3);
		sll.insertAtHead(4);
		sll.printList();
		*/
		
		sll.insertAtEnd(1);
		sll.insertAtEnd(2);
		sll.insertAtEnd(3);
		sll.insertAtEnd(4);
		sll.insertAtEnd(5);
		sll.printList();
	}

}
