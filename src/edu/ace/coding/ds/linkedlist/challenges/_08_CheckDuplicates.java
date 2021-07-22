package edu.ace.coding.ds.linkedlist.challenges;

import edu.ace.coding.ds.linkedlist._00_SinglyLinkedList;

public class _08_CheckDuplicates {
	
	public static void main(String[] args) {
		_00_SinglyLinkedList<Integer> sll = new _00_SinglyLinkedList();
		sll.insertAtEnd(1);
		sll.insertAtEnd(2);
		sll.insertAtEnd(3);
		sll.insertAtEnd(4);
		sll.insertAtEnd(2);
		sll.insertAtEnd(5);
		
		sll.printList();
		
		removeDuplicates(sll);
		sll.printList();
	}

	private static<T> void removeDuplicates(_00_SinglyLinkedList<T> sll) {
		
		_00_SinglyLinkedList<T>.Node current = sll.headNode;
		_00_SinglyLinkedList<T>.Node compare = null;
		
		while(current != null) {
			compare = current;
			
			while(compare.nextNode != null) {
				if(current.data.equals(compare.nextNode.data)) {
					compare.nextNode = compare.nextNode.nextNode;
				}else {
					compare = compare.nextNode;
				}
			}
			current = current.nextNode;
		}
		
	}

}
