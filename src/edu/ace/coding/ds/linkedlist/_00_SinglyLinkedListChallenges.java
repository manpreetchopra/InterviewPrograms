package edu.ace.coding.ds.linkedlist;

public class _00_SinglyLinkedListChallenges<T> extends _00_SinglyLinkedList<T>{
	
	/*
	 * Challenge 4: Find the Length of a Linked List
	 */
	public int length() {
		int count = 0 ;
		
		Node currNode  = headNode;
		while(currNode != null) {
			count++;
			currNode = currNode.nextNode;
		}
		return count;
	}
	
	

}
