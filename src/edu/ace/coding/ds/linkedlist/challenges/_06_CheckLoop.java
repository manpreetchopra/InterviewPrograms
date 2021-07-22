package edu.ace.coding.ds.linkedlist.challenges;

import edu.ace.coding.ds.linkedlist._00_SinglyLinkedList;

/**
 * Challenge 6 : Detect Loop in a Linked List
 * @author macho
 *
 */
public class _06_CheckLoop {

	public static void main(String[] args) {
		_00_SinglyLinkedList<Integer> sll = new _00_SinglyLinkedList<Integer>();
		sll.insertAtHead(1);
		sll.insertAtHead(2);
		sll.insertAtHead(3);
		
		System.out.println("Before addin loop");
		sll.printList();
		System.out.println(detectLoop(sll));
		sll.headNode.nextNode.nextNode = sll.headNode;
		System.out.println("After adding loop");
		//sll.printList();
		System.out.println(detectLoop(sll));
	}

	private static<T> boolean detectLoop(_00_SinglyLinkedList<T> sll) {
		// TODO Auto-generated method stub
		_00_SinglyLinkedList<T>.Node slow = sll.headNode;
		_00_SinglyLinkedList<T>.Node fast = sll.headNode;
		
		while(slow !=null && fast !=null && fast.nextNode != null) {
			slow = slow.nextNode;
			fast = fast.nextNode.nextNode;
			if(slow == fast) {
				return true;
			}
		}
		return false;
		
	}
}
