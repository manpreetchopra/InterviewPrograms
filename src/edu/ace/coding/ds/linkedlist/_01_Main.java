package edu.ace.coding.ds.linkedlist;

public class _01_Main {

	public static void main(String[] args) {
		_01_DoublyLinkedList<Integer> dll = new _01_DoublyLinkedList<Integer>();
		
		dll.insertAtHead(1);
		/*
		dll.insertAtHead(2);
		dll.insertAtHead(3);
		dll.insertAtHead(4);
		*/
		dll.printList();
		dll.deleteAtHead();
	}
}
