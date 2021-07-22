package edu.ace.coding.ds.linkedlist;

public class _01_DoublyLinkedList<T> {

	class Node {
		T data;
		Node prevNode;
		Node nextNode;
	}

	public int size;
	public Node headNode;

	public _01_DoublyLinkedList() {
		headNode = null;
		size = 0;
	}

	public boolean isEmpty() {
		if (headNode == null) {
			return true;
		}
		return false;
	}

	public void insertAtHead(T data) {

		// Creating new node
		Node newNode = new Node();
		newNode.data = data;
		//Setting next and prev of new Node
		newNode.prevNode = null; // since its insertAtHead, there wont be any prev for new node
		newNode.nextNode = headNode; // since its insertAtHead, the newNode's next will become headNode

		//Adjusting the headNode since its made as node next to new Node
		if(headNode != null) { //in case list was empty
			headNode.prevNode = newNode;
		}
		//making headNode as new Node, since its inserted at head
		headNode = newNode;
		
		//adjusting size of list
		size++;
	}
	
	public void printList() {
		
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		
		Node currNode = headNode;
		System.out.print("null <-");
		while(currNode.nextNode != null) {
			System.out.print(currNode.data+" <-> ");
			currNode = currNode.nextNode;
		}
		
		System.out.println(currNode.data+" ->null");
	}
	
	public void deleteAtHead() {
		if(isEmpty()) {
			return;
		}
		
		headNode = headNode.nextNode;
		headNode.prevNode = null;
		size--;
	}
	
	public void deleteByValue(T data) {
		if(isEmpty()) {
			return;
		}
		
		Node currNode = headNode;
		
		if(currNode.data.equals(data)) {
			deleteAtHead();
		}
		
		while(currNode !=null && !currNode.data.equals(data)) {
			currNode = currNode.nextNode;
		}
		
		if(currNode != null) {
			currNode.prevNode.nextNode = currNode.nextNode;
			if(currNode.nextNode != null) {
				currNode.nextNode.prevNode = currNode.prevNode;
			}
			size--;
		}
	}

}
