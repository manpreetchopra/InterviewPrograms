package edu.ace.coding.ds.linkedlist.challenges;


import edu.ace.coding.ds.linkedlist._00_SinglyLinkedList;

public class _07_CheckMid {

	public static void main(String[] args) {
		_00_SinglyLinkedList<Integer> sll = new _00_SinglyLinkedList<Integer>();
		sll.insertAtEnd(1);
		sll.insertAtEnd(2);
		sll.insertAtEnd(3);
		sll.insertAtEnd(4);
		sll.insertAtEnd(5);
		sll.insertAtEnd(6);
		sll.printList();
		
		Object data = findMiddle(sll);
		System.out.println(data.toString());
		
	}

	private static<T> Object findMiddle(_00_SinglyLinkedList<T> sll) {

		_00_SinglyLinkedList<T>.Node slow= sll.headNode;
		_00_SinglyLinkedList<T>.Node fast= sll.headNode;
		
		while(slow != null && fast != null && fast.nextNode != null) {
			fast = fast.nextNode.nextNode;
			if(fast != null) {
				slow = slow.nextNode;
			}
		}
		return slow.data;
	}
}
