package com.codingninjas.interview.trees.bst;

import com.codingninjas.interview.trees.binarytree.BinaryTreeNode;

public class BST {
	
	private BinaryTreeNode<Integer> root;
	private int size;
	
	public boolean isPresent(int x) {
		return isPresentHelper(root,x);
	}
	
	private static boolean isPresentHelper(BinaryTreeNode<Integer> node, int x) {
		if(node == null) {
			return false;
		}
		
		if(node.data == x) {
			return true;
		}
		
		if(x < node.data) {
			return isPresentHelper(node.left , x);
		}else {
			return isPresentHelper(node.right , x);
		}
	}
	
	public void insert(int x) {
		root = insertHelper(root, x);
	}
	
	private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int x) {
		if(node == null) {
			BinaryTreeNode<Integer> newRoot = new BinaryTreeNode<Integer>(x);
			return newRoot;
		}
		
		if(x >= node.data) {
			node.right = insertHelper(node.right, x);
		}else {
			node.left = insertHelper(node.left, x);
		}

		return node;
	}

	public boolean deleteData(int x) {
		BSTDeleteReturn output = deleteHelper(root, x);
		root = output.root;
		if(output.deleted) {
			size--;
		}
		return output.deleted;
	}
	
	private BSTDeleteReturn deleteHelper(BinaryTreeNode<Integer> root, int x) {
		
		if(root == null) {
			return new BSTDeleteReturn(null, false);
		}
		
		if(root.data < x) {
			BSTDeleteReturn rightOutput = deleteHelper(root.right, x);
			root.right = rightOutput.root;
			rightOutput.root = root;
			return rightOutput;
		}
		
		if(root.data > x) {
			BSTDeleteReturn leftOutput = deleteHelper(root.left, x);
			root.left = leftOutput.root;
			leftOutput.root = root;
			return leftOutput;
		}

		// 0 children
		if(root.left == null && root.right == null) {
			return new BSTDeleteReturn(null, true);
		}
		
		//only left child
		if(root.left != null && root.right == null) {
			return new BSTDeleteReturn(root.left, true);
		}
		
		//only right child
		if(root.left == null && root.right != null) {
			return new BSTDeleteReturn(root.right, true);
		}
		
		//both child
		int rightMin = minimum(root.right);
		root.data = rightMin;
		BSTDeleteReturn outputRight = deleteHelper(root.right, rightMin);
		root.right = outputRight.root;
		
		
		return new BSTDeleteReturn(root	, true);
	}
	
	private static int minimum(BinaryTreeNode<Integer> root){
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		
		int leftAns = minimum(root.left);
		int rightAns = minimum(root.right);
		
		return Math.min(root.data,Math.min(leftAns, rightAns));
		
	}

	public int size() {
		return size;
	}
	
	public void printTree() {
		printTreeHelper(root);
	}

	private static void printTreeHelper(BinaryTreeNode<Integer> node) {
		if(node == null) {
			return;
		}
		System.out.print(node.data+" : ");
		if(node.left != null) {
			System.out.print("L"+node.left.data+",");
		}
		if(node.right != null) {
			System.out.print("R"+node.right.data);
		}
		System.out.println();
		printTreeHelper(node.left);
		printTreeHelper(node.right);
		
	}

}
