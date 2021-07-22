package edu.ace.coding.ds.linkedlist.challenges;

import edu.ace.coding.ds.linkedlist._00_SinglyLinkedList;

public class _10_NthElementChallenge {
	public static void main(String[] args) {
		_00_SinglyLinkedList<Integer> list  = new _00_SinglyLinkedList<Integer>();
		
		list.insertAtEnd(1);
		list.insertAtEnd(2);
		list.insertAtEnd(3);
		list.insertAtEnd(4);
		list.insertAtEnd(5);
		
		Object result = finNthFromEnd(list,3);
		System.out.println(result.toString());
	}

	private static <T> Object finNthFromEnd(_00_SinglyLinkedList<T> list, int n) {
		
		int size = list.size;
		n = size-n;
		
		if(size == 0 || n>size) {
			return null;
		}
		
		_00_SinglyLinkedList<T>.Node current = list.headNode;
		int counter = 0;
		while(current != null) {
			if(n == counter) {
				return current.data;
			}
			current = current.nextNode;
			counter++;
			
		}
		return null;
		
	}

}
