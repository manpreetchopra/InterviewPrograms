package edu.ace.coding.ds.tree.bst;

public class Main {

	public static void main(String[] args) {
		BST bsT = new BST();
		bsT.add(6);
		bsT.add(4);
		bsT.add(9);
		bsT.add(5);
		bsT.add(2);
		bsT.add(8);
		bsT.add(12);
		bsT.add(10);
		bsT.add(14);
		System.out.println(">> Tree <<");
		bsT.printTree();

		Node temp = bsT.searchRecursive(5);
		if (temp != null) {
			System.out.println("\n" + temp.getData() + " found in Tree !");
		}
		temp = bsT.searchRecursive(51);
		if (temp != null) {
			System.out.println("\n" + temp.getData() + " found in Tree !");
		}
		
	}
}
