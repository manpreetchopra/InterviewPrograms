package edu.ace.coding.ds.linkedlist.challenges;

import edu.ace.coding.ds.linkedlist._02_DoublyLinkedListTail;

public class _11_PalindromeChallenge {
	public static void main(String[] args) {
		
		_02_DoublyLinkedListTail<Integer> list= new _02_DoublyLinkedListTail();
		
		list.insertAtEnd(1);
		list.insertAtEnd(2);
		list.insertAtEnd(3);
		list.insertAtEnd(2);
		
	
		System.out.println(isPallindorme(list));
		
	}

	private static<T> boolean isPallindorme(_02_DoublyLinkedListTail<T> list) {
			
		_02_DoublyLinkedListTail<T>.Node head = list.headNode;
		_02_DoublyLinkedListTail<T>.Node tail = list.tailNode;
		
		if(head == null) {
			return true;
		}
		
		while(head != tail) {
			if(!head.data.equals(tail.data)) {
				return false;
			}
			head= head.nextNode;
			tail = tail.prevNode;
		}
		return true;
	}

}
