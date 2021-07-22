package edu.ace.coding.ds.linkedlist.challenges;

import edu.ace.coding.ds.linkedlist._00_SinglyLinkedList;

public class _09_UnionIntersectionChallenge {

	public static void main(String[] args) {
		_00_SinglyLinkedList<Integer> list1 = new _00_SinglyLinkedList<Integer>();
		 for(int i=7; i>3; i--){
	            list1.insertAtHead(i);
	        }
		
		_00_SinglyLinkedList<Integer> list2 = new _00_SinglyLinkedList<Integer>();
		  for(int i=0; i<5; i++){
	            list2.insertAtHead(i);
	        }
		  
		  list1.printList();
		  list2.printList();
		  
		  _00_SinglyLinkedList result = intersect(list1,list2);
		  System.out.println("After intersection");
		  result.printList();
		  
		  union(list1,list2);
		  System.out.println("after union");
		  list1.printList();
	}

	private static <T> _00_SinglyLinkedList<T> intersect(_00_SinglyLinkedList<T> list1, _00_SinglyLinkedList<T> list2) {
		_00_SinglyLinkedList<T> result = new _00_SinglyLinkedList<T>();
		_00_SinglyLinkedList<T>.Node head1 = list1.headNode;
		_00_SinglyLinkedList<T>.Node head2 = null;
		
		while(head1 != null) {
			
			head2 = list2.headNode;
			while(head2 != null) {
				if(head1.data.equals(head2.data)) {
					result.insertAtEnd(head1.data);
				}
				head2 = head2.nextNode;
			}
			
			head1 = head1.nextNode;
		}
		
		return result;
	}

	private static <T> void union(_00_SinglyLinkedList<T> list1, _00_SinglyLinkedList<T> list2) {

		_00_SinglyLinkedList<T>.Node head = list1.headNode;
		
		while(head.nextNode != null) {
			head = head.nextNode;
		}
		head.nextNode = list2.headNode;
		
	}
}
