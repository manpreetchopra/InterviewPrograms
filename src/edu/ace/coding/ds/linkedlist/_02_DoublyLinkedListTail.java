package edu.ace.coding.ds.linkedlist;

public class _02_DoublyLinkedListTail<T> {
	
	class Node{
		public T data;
		public Node nextNode;
		public Node prevNode;
	}
	
	public int size;
	public Node headNode;
	public Node tailNode;
	
	public _02_DoublyLinkedListTail() {
		size = 0;
		headNode = null;
		tailNode = null;
	}
	
	public boolean isEmpty() {
		if(headNode == null || tailNode == null) {
			return true;
		}
		return false;
	}
	
	public Node getHeadNode() {
		return headNode;
	}
	
	public Node getTailNode() {
		return tailNode;
	}
	
	public int getSize() {
		return size;
	}
	
	public void printList() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		
		Node currNode = headNode;
		System.out.print("<- null ->");
		while(currNode.nextNode !=null) {
			System.out.print(currNode.data.toString()+" <-> ");
			currNode = currNode.nextNode;
		}
		System.out.println(currNode.data+" -> null");
	}
	
	public void insertAtHead(T data) {

		Node newNode = new Node();
		newNode.data = data;
		newNode.nextNode = headNode;
		newNode.prevNode = null;
		
		if(!isEmpty()) {
			headNode.prevNode = newNode;
		}else {
			tailNode = newNode;
		}
		headNode = newNode;
		size++;
	}
	
	public void insertAtEnd(T data) {
		
		if(isEmpty()) {
			insertAtHead(data);
			return;
		}
		Node newNode = new Node();
		newNode.data = data;
		newNode.nextNode = null;
		newNode.prevNode = tailNode;
		tailNode.nextNode = newNode;
		tailNode = newNode;
		
		size++;
	}
	
	public void deleteAtHead() {
		if(isEmpty()) {
			return;
		}
		
		headNode = headNode.nextNode;
		if(headNode == null) {
			tailNode = null;
		}else {
			headNode.prevNode = null;
		}
		size--;
	}
	
	public void deleteAtTail() {
		if(isEmpty()) {
			return;
		}
		
		tailNode = tailNode.prevNode;
		if(tailNode != null) {
			tailNode.nextNode = null;
		}else {
			headNode = null;
		}
		size--;
	}

}
