package edu.ace.coding.ds.linkedlist;

public class _02_main {

	public static void main(String[] args) {
		_02_DoublyLinkedListTail<Integer> dllT = new _02_DoublyLinkedListTail<Integer>();
		
		dllT.printList();
		dllT.insertAtHead(1);
		dllT.insertAtHead(2);
		dllT.insertAtHead(3);
		dllT.printList();
	}
}
