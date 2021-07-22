package edu.ace.coding.ds.linkedlist.challenges;

import edu.ace.coding.ds.linkedlist._00_SinglyLinkedList;

public class _05_CheckReverse {

	public static void main(String[] args) {
		_00_SinglyLinkedList<Integer> sll = new _00_SinglyLinkedList<Integer>();
		
		for(int i=0;i<15;i+=2) {
			sll.insertAtEnd(i);
		}
		
		System.out.println("before : ");
		sll.printList();
		System.out.println("reverese");
		reverse(sll);
		sll.printList();
	}

	// null-> 1->2->3->4->null
	//
	/* next , prev = null;
	 * current =1
	 * next = current.next
	 * current.next = prev
	 * prev = current
	 * current =next
	 */
	private static<T> void reverse(_00_SinglyLinkedList<T> sll) {
		_00_SinglyLinkedList<T>.Node current = sll.headNode;
		_00_SinglyLinkedList<T>.Node previous = null;
		_00_SinglyLinkedList<T>.Node next = null;
		
		while(current != null) {
			next = current.nextNode;
			current.nextNode = previous;
			previous = current;
			current = next;
		
		}
		
		sll.headNode = previous;
		
	}
}
