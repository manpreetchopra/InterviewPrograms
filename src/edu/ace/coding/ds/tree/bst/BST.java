package edu.ace.coding.ds.tree.bst;

public class BST {

	private Node root;
	private int size;
	
	public boolean add(int value) {
		if(root == null) {
			root = new Node(value);
			return true;
		}
		
		Node currentNode = root;
		
		while(currentNode != null) {
			Node leftChild = currentNode.getLeft();
			Node rightChild = currentNode.getRight();
			
			if(value < currentNode.getData()) {
				if(leftChild == null) {
					leftChild = new Node(value);
					currentNode.setLeft(leftChild);
					return true;
				}
				currentNode = leftChild;
			}
			
			else if(value >  currentNode.getData()) {
				if(rightChild == null) {
					rightChild = new Node(value);
					currentNode.setRight(rightChild);
					return true;
				}
				currentNode = rightChild;
			}
		}
		return false;
	}
	
	public void addRecursive(int value) {
		System.out.println("adding "+value);
		 root = addRecursive(root, value);
	}
	
	public Node addRecursive(Node root , int value) {
		if(root == null) {
			root = new Node(value);
			return root;
		}
		
		if(value < root.getData()) {
			Node left = addRecursive(root.getLeft(),value);
			root.setLeft(left);
		}
		
		else {
			Node right = addRecursive(root.getRight(),value);
			root.setRight(right);
		}
		
		return root;
	}
	
	public Node search(int value) {
		
		Node currentNode = root;
		
		while(currentNode != null) {
			Node leftChild = currentNode.getLeft();
			Node rightChild = currentNode.getRight();
			
			if(currentNode.getData() == value) {
				return currentNode;
			}
			
			if(value < currentNode.getData()) {
				currentNode = leftChild;
			}else {
				currentNode = rightChild;
			}
		}
		System.out.println("No data found for "+value);
		return null;
	}
	
	public Node searchRecursive(int value) {
		return searchRecursive(root, value);
	}
	
	public Node searchRecursive(Node root,int value) {
		if(root == null) {
			System.out.println("No data found for "+value);
			return null;
		}
		
		if(value == root.getData()) {
			return root;
		}
		
		if(value < root.getData()) {
			return searchRecursive(root.getLeft(), value);
		}else {
			return searchRecursive(root.getRight(), value);
		}
	}
	
	public void printTree() {
		printTreeHelper(root);
	}
	
	private static void printTreeHelper(Node root) {
		if (root == null) {
			return;
		}

		System.out.print(root.getData() + ":");
		if (root.getLeft() != null) {
			System.out.print("L" + root.getLeft().getData() + ",");
		}
		if (root.getRight() != null) {
			System.out.print("R" + root.getRight().getData());
		}
		System.out.println();
		printTreeHelper(root.getLeft());
		printTreeHelper(root.getRight());
	}
}

