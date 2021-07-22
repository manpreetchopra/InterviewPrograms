package edu.ace.coding.ds.linkedlist;

/**
 * Singly LinkedList Implementations
 * 
 * @author macho
 *
 */
public class _00_SinglyLinkedList<T> {

	/*
	 * Basic datastructure implementation
	 */

	public class Node {
		public T data;
		public Node nextNode;
	}

	public int size;
	public Node headNode;

	public _00_SinglyLinkedList() {
		this.size = 0;
		this.headNode = null;
	}

	/*
	 * Basic datastructure upto here
	 */

	/*
	 * Utility functions
	 */
	public boolean isEmpty(){
		if(headNode == null) 
		{
			return true;
		}else{
			return false;
		}
	}
	
	/*
	 * Insert Operations
	 */
	//Impl 1. Insert At head
	public void insertAtHead(T data) {
		
		//Creating a new node and assigning it the new data valu
		Node nextNode = new Node();
		nextNode.data = data;
		
		//Linking head to the newNode's nextNode
		nextNode.nextNode = headNode;
		headNode = nextNode;

		//incrementing size of list
		size++;
	}
	
	public void printList() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		
		Node currNode = headNode;
		while(currNode.nextNode != null) {
			System.out.print(currNode.data.toString() +" -> ");
			currNode = currNode.nextNode;
		}
		System.out.println(currNode.data.toString()+" -> null");
	}
	
	/*
	 * Challenge 1 : Insertion in a Singly Linked List (insert at End)
	 */
	public void insertAtEnd(T data) {
		
		if(isEmpty()) {
			insertAtHead(data);
			return;
		}
		Node newNode = new Node();
		newNode.data = data;
		newNode.nextNode = null;
		
		Node currNode = headNode;
		while(currNode.nextNode != null) {
			currNode = currNode.nextNode;
		}
		currNode.nextNode = newNode;
		size++;
	}
	
	/*
	 * Impl 2 : Insert After a node
	 */
	public void insertAfter(T data, T previous) {
		
		if(isEmpty()) {
			insertAtHead(data);
			return;
		}
		
		Node newNode = new Node();
		newNode.data = data;
		
		Node currNode = headNode;
		while(currNode.nextNode != null && !currNode.data.equals(previous)) {
			currNode = currNode.nextNode;
		}
		
		if(currNode != null) {
			newNode.nextNode = currNode.nextNode;
			currNode.nextNode = newNode;
			size++;
		}
	}
	
	/*
	 * Challenge 2 : Search in Singly Linked List
	 */
	public boolean search(T data) {
		
		
		Node currNode = headNode;
		while(currNode != null) {
			if(currNode.data.equals(data)) {
				return true;
			}
			currNode = currNode.nextNode;
		}
		
		return false;
	}
	
	/*
	 * Impl 3: Deletion at Head
	 */
	public void deleteAtHead() {
		if(isEmpty()) {
			return;
		}
		
		headNode = headNode.nextNode;
		size--;
	}
	
	/*
	 * Challenge 3: Delete By value
	 */
	public void deleteByValue(T data) {
		if(isEmpty()) {
			return;
		}
		
		Node currNode = headNode;
		Node prevNode = null;
		
		if(currNode.data.equals(data)) {
			deleteAtHead();
			return;
		}
		while(currNode != null && !currNode.data.equals(data)) {
			prevNode = currNode;
			currNode = currNode.nextNode;
		}
		
		
		if(currNode != null) {
			prevNode.nextNode  = currNode.nextNode;
		}
	}
	
	public void deleteAtEnd() {
		if(isEmpty()) {
			return;
		}
		
		Node currNode = headNode;
		Node prevNode = null;
		
		while(currNode.nextNode != null) {
			prevNode = currNode;
			currNode = currNode.nextNode;
		}
		
		if(prevNode != null) {
		prevNode.nextNode = null;
		}else {
			deleteAtHead();
		}
	}
	

}
