package com.codingninjas.interview.trees.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {
	
	public class BalanceTreeReturn{
		public int height;
		public boolean isBalanced;
	}
	
	public static void printTree(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return;
		}
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
		
	}
	
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return;
		}
		System.out.print(root.data+" : ");
		if(root.left != null) {
			System.out.print("L"+root.left.data+",");
		}
		if(root.right != null) {
			System.out.print("R"+root.right.data);
		}
		System.out.println();
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
		
	}
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
		q.offer(root);
		
		while(!q.isEmpty()) {
			BinaryTreeNode<Integer> current = q.poll();
			System.out.print(current.data+":");
			if(current.left != null) {
				System.out.print("L"+current.left.data+",");
				q.offer(current.left);
			}
			if(current.right != null) {
				System.out.print("R"+current.right.data);
				q.offer(current.right);
			}
			System.out.println();
			
		}
	}
	
	public static BinaryTreeNode<Integer> takeInput() {
		System.out.println("Enter Root : ");
		Scanner sc = new Scanner(System.in);
		Integer rootData = sc.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> rootLeft = takeInput();
		BinaryTreeNode<Integer> rootRight = takeInput();
		
		root.left = rootLeft;
		root.right = rootRight;
		
		return root;
	}
	
	public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot, int data, boolean isLeft) {
		if(isRoot) {
		System.out.println("Enter Root : ");
		}else {
			if(isLeft) {
				System.out.println("Enter Left Node of "+data+" : ");
			}else {
				System.out.println("Enter Right Node of "+data+" : ");
			}
		}
		Scanner sc = new Scanner(System.in);
		Integer rootData = sc.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> rootLeft = takeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rootRight = takeInputBetter(false, rootData, false);
		
		root.left = rootLeft;
		root.right = rootRight;
		
		return root;
	}
	
	public static BinaryTreeNode<Integer> takeInputLevelWise(){
		System.out.println("Enter Root : ");
		Scanner sc = new Scanner(System.in);
		
		int rootData  = sc.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> rootNode = new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
		q.offer(rootNode);
		while(!q.isEmpty()) {
			BinaryTreeNode<Integer> currentNode = q.poll();
			
			System.out.println("Enter left of "+currentNode.data);
			int leftData = sc.nextInt();
			if(leftData != -1) {
				BinaryTreeNode<Integer> leftNode = new BinaryTreeNode<Integer>(leftData);
				currentNode.left = leftNode;
				q.offer(leftNode);
			}
			

			System.out.println("Enter right of "+currentNode.data);
			int rightData = sc.nextInt();
			if(rightData != -1) {
				BinaryTreeNode<Integer> rightNode = new BinaryTreeNode<Integer>(rightData);
				currentNode.right = rightNode;
				q.offer(rightNode);
			}
			
		}
		return rootNode;
		
	}
	
	public static int numOfNodes(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return 0;
		}
		
		int leftNodeCount = numOfNodes(root.left);
		int rightNodeCount = numOfNodes(root.right);
		return 1 + leftNodeCount + rightNodeCount;
		
	}
	
	
	
	
	
	
	
	public static int sumOfNodes(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		int leftSum = sumOfNodes(root.left);
		int rightSum = sumOfNodes(root.right);
		
		return leftSum + rightSum + root.data;
		
	}
	
	public static void preOrderTraversal(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return;
		}
		System.out.print(root.data+" : ");
		
		if(root.left != null) {
			System.out.print("L"+root.left.data+",");
		}

		if(root.right != null) {
			System.out.print("R"+root.right.data);
		}
		System.out.println();
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	
	public static void postOrder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data);
	}
	
	
	public static int largest(BinaryTreeNode<Integer> root) {

		if (root == null) {
			return -1;
		}

		int leftLargest = largest(root.left);
		int rightLargest = largest(root.right);

		return Math.max(root.data, Math.max(leftLargest, rightLargest));
	}
	
	public static int numOfNodesGreaterThanX(BinaryTreeNode<Integer> root, Integer x) {
		
		if(root == null) {
			return 0;
		}
		
		int leftNodesGraterThanX = numOfNodesGreaterThanX(root.left,x);
		int rightNodesGreaterThanX = numOfNodesGreaterThanX(root.right,x);
		
		int totalNodesGreateThanX = leftNodesGraterThanX + rightNodesGreaterThanX;
		if(root.data>x) {
			totalNodesGreateThanX = totalNodesGreateThanX + 1;
		}
		
		return totalNodesGreateThanX;
	}
	
	
	public static int heightOfTree(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return 0;
		}
		int lftHt = root.left!=null?1:0;
		int rtHt = root.right!=null?1:0;
		int ht = 1;
		
		if(root.left != null) {
			lftHt += heightOfTree(root.left);
			
		}
		
		if(root.right!=null) {
			rtHt += heightOfTree(root.right);
		}

		if(lftHt == rtHt && rtHt ==0) {
			return ht;
		}
		return lftHt>rtHt?lftHt:rtHt;
		
	}
	
	
	public static int heightOfTreeCNModified(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return 0;
		}
		
		int leftHeight = heightOfTreeCNModified(root.left);
		int rightHeight = heightOfTreeCNModified(root.right);
		
		if(leftHeight > rightHeight) {
			return leftHeight + 1;
		}else {
			return rightHeight + 1;
		}
	}
	
	public static int heightOfTreeCN(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return 0;
		}
		
		return Math.max(heightOfTreeCN(root.left), heightOfTreeCN(root.right))+1;
	}
	
	
	public static int numberOfLeaves(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return 0;
		}
		
		if(root.left == null && root.right == null) {
			return 1;
		}
		
		int leftLeaves = numberOfLeaves(root.left);
		int rightLeaves = numberOfLeaves(root.right);
		
		return leftLeaves + rightLeaves;
	}

	public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {
	
		if(root == null) {
			return;
		}
		
		if(k==0) {
			System.out.println(root.data);
			return;
		}
		
		printAtDepthK(root.left, k-1);
		printAtDepthK(root.right, k-1);
	}
	
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, Integer x) {
		if(root == null) {
			return false;
		}
		
		if(root.data == x) {
			return true;
		}
		boolean leftExists = isNodePresent(root.left, x);
		boolean rightExists = isNodePresent(root.right, x);
		
		return leftExists||rightExists;
	}
	
	public static void printNodesWithoutSibblings(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return;
		}
		
		if(root.left == null && root.right != null) {
			System.out.println(root.right.data);
		}
		
		if(root.left != null && root.right == null) {
			System.out.println(root.left.data);
		}

		printNodesWithoutSibblings(root.left);
		printNodesWithoutSibblings(root.right);
		
	}
	
	public static void changeDepthToTree(BinaryTreeNode<Integer> root) {
		changeDepthToTreeHelper(root, 0);
	}
	
	public static void changeDepthToTreeHelper(BinaryTreeNode<Integer> root , int level) {
		if(root == null) {
			return;
		}
		
		root.data = level;
		changeDepthToTreeHelper(root.left, level+1);
		changeDepthToTreeHelper(root.right, level+1);
	}
	
	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return null;
		}
		
		if(root.left == null && root.right == null) {
			return null;
		}
		
		root.left = removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		return root;
	}
	
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		
		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);
		
		BinaryTreeNode<Integer> tmp = root.left;
		root.left = root.right;
		root.right = tmp;
	}
	
	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return true;
		}
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		if(Math.abs(leftHeight - rightHeight)>1) {
			return false;
		}
		
		return isBalanced(root.left) && isBalanced(root.right);
	}
	
	public static BalanceTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			BalanceTreeReturn ans = new BinaryTreeUse().new BalanceTreeReturn();
			ans.height = 0;
			ans.isBalanced = true;
			return ans;
		}
		
		BalanceTreeReturn leftAns = isBalancedBetter(root.left);
		BalanceTreeReturn rightAns = isBalancedBetter(root.right);
		
		boolean isBalanced = true;
		int height = Math.max(leftAns.height,rightAns.height) + 1;
		
		if(Math.abs(leftAns.height - leftAns.height) >1) {
			isBalanced = false;
		}
		
		if(!leftAns.isBalanced || !rightAns.isBalanced) {
			isBalanced = false;
		}
		
		BalanceTreeReturn ans = new BinaryTreeUse().new BalanceTreeReturn();
		ans.height = height;
		ans.isBalanced = isBalanced;
		
		return ans;
	}
	
	public static int diameter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		int option1 = height(root.left) + height(root.right);
		int option2 = diameter(root.left);
		int option3 = diameter(root.right);
		
		return Math.max(option1, Math.max(option2, option3));
	}
	
	class Pair{
		public int height;
		public int diameter;
		
		public Pair(int height, int diameter) {
			this.height = height;
			this.diameter = diameter;
		}
	}
	
	public static Pair diameterImproved(BinaryTreeNode<Integer> root) {
		if(root == null) {
			Pair p = new BinaryTreeUse().new Pair(0,0);
			return p;
		}
		
		Pair leftPair = diameterImproved(root.left);
		Pair rightPair = diameterImproved(root.right);
		
		int height = Math.max(leftPair.height, rightPair.height) +1;
		int distance = leftPair.height + rightPair.height ;
		int diameter = Math.max(distance, Math.max(leftPair.diameter, rightPair.diameter));
		
		Pair p = new BinaryTreeUse().new Pair(height, diameter);
		return p;
	}
	
	private static int height(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		return Math.max(height(root.left), height(root.right))+1;
	}
	
	/*
	 * Binary Search Tree
	 */
	
	public static boolean searchNode(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			return false;
		}
		
		if(root.data == x) {
			return true;
		}else if(x<root.data) {
			return searchNode(root.left, x);
		}else {
			return searchNode(root.right, x);
		}
	}
	
	public static void printInRange(BinaryTreeNode<Integer> root, int k1, int k2) {
		if(root == null) {
			return;
		}
		
		if(root.data<k1) {
			printInRange(root.right, k1, k2);
		}else if(root.data >k2) {
			printInRange(root.left, k1, k2);
		}else {
			System.out.println(root.data);
			printInRange(root.left, k1, k2);
			printInRange(root.right, k1, k2);
		}
		
	}
	
	public static BinaryTreeNode<Integer> sortedArrayToBST(int[] arr){
		int start = 0;
		int end = arr.length-1;
		return sortedArrayToBST(arr, start, end);
		
	}
	
	public static boolean isBST(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return true;
		}
		
		int leftMax = largest(root.left);
		
		if(leftMax >= root.data) {
			return false;
		}
		int rightMin = minimum(root.right);
		if(rightMin < root.data) {
			return false;
		}
		
		boolean isLeftBST = isBST(root.left);
		boolean isRightBST = isBST(root.right);
		return isLeftBST && isRightBST;
		
	}
	
	
	public static IsBSTReturn isBST2(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			IsBSTReturn ans = new IsBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
			return ans;
		}
		
		IsBSTReturn leftANs = isBST2(root.left);
		IsBSTReturn rightANs = isBST2(root.right);
		
		int min = Math.min(root.data, Math.min(leftANs.min, rightANs.min)); 
		int max = Math.max(root.data, Math.max(leftANs.max, rightANs.max));
		
		boolean isBST = true;
		
		if(leftANs.max >= root.data) {
			isBST = false;
		}
		
		if(rightANs.min < root.data) {
			isBST = false;
		}
		
		if(!leftANs.isBST || !rightANs.isBST) {
			isBST = false;
		}
		
		IsBSTReturn ans = new IsBSTReturn(min,max,isBST);
		return ans;
		
	}

	public static boolean isBST3(BinaryTreeNode<Integer> root) {
		return isBST3Helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	private static boolean isBST3Helper(BinaryTreeNode<Integer> root, int minValue, int maxValue) {
		
		if(root == null) {
			return true;
		}
		
		if(root.data < minValue || root.data > maxValue) {
			return false;
		}
		
		boolean isLfetBST = isBST3Helper(root.left, minValue, root.data-1);
		boolean isRightBST = isBST3Helper(root.right, root.data, maxValue);
		
		return isLfetBST && isRightBST;
		
	}
	
	public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root, int x){
		if(root == null) {
			return null;
		}
		
		if(root.data == x) {
			ArrayList<Integer> output = new ArrayList<>();
			output.add(root.data);
			return output;
		}
		
		ArrayList<Integer> leftOutput = nodeToRootPath(root.left, x);
		if(leftOutput != null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		ArrayList<Integer> rightOutput = nodeToRootPath(root.right, x);
		if(rightOutput != null) {
			rightOutput.add(root.data);
			return rightOutput;
		}
		
		return null;
	} 
	
	
	public static ArrayList<Integer> nodeToRootPathBST(BinaryTreeNode<Integer> root, int x){
		
		if(root == null) {
			return null;
		}
		
		if(root.data == x) {
			ArrayList<Integer> output = new ArrayList<>();
			output.add(root.data);
			return output;
		}
		
		if(x < root.data) {
			ArrayList<Integer> leftOutput = nodeToRootPathBST(root.left, x);
			if(leftOutput != null) {
				leftOutput.add(root.data);
			}
			return leftOutput;
		}
		
		else{
			ArrayList<Integer> rightOutput = nodeToRootPathBST(root.right, x);
			if(rightOutput != null) {
				rightOutput.add(root.data);
			}
			return rightOutput;
		}
		
		//return null;
	}

	private static int minimum(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return Integer.MAX_VALUE;
		}
		int leftMin = minimum(root.left);
		int rightmin = minimum(root.right);

		return Math.min(root.data, Math.min(leftMin, rightmin));

	}


	private static BinaryTreeNode<Integer> sortedArrayToBST(int[] arr, int start, int end) {
		if(start>end) {
			return null;
		}
		
		int mid = start + (end-start)/2;
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);
		root.left = sortedArrayToBST(arr, start, mid-1);
		root.right = sortedArrayToBST(arr, mid+1, end);
		return root; 
	}

	public static void main(String[] args) {
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//		
//		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
//		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
//		root.left = rootLeft;
//		root.right = rootRight;
//		
//		BinaryTreeNode<Integer> twoLeft = new BinaryTreeNode<Integer>(4);
//		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(5);
//		rootLeft.left = twoLeft;
//		rootLeft.right = twoRight;
//		
//		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(6);
//		rootRight.left = threeLeft; 
//		
//		printTree(root);
//		System.out.println("-----------------");
//		printTreeDetailed(root);
	
//		BinaryTreeNode<Integer> root = takeInput();
//		printTreeDetailed(root);
	
		//BinaryTreeNode<Integer> root = takeInputBetter(true, 0 , true);
		//BinaryTreeNode<Integer> root  = takeInputLevelWise();
		
		int[] arr = {1,2,3,4,5,6,7};
		BinaryTreeNode<Integer> root = sortedArrayToBST(arr);
		System.out.println("tree print---------------");
		printTreeDetailed(root);
		
		System.out.println("---no of nodes");
		System.out.println(numOfNodes(root));
		
		System.out.println("---sum of nodes");
		System.out.println(sumOfNodes(root));
		
		//preOrderTraversal(root);
		System.out.println("--------post Order");
		postOrder(root);
		System.out.println();
		
		System.out.println("------------largest-------");
		System.out.println(largest(root));
		
		System.out.println("---------No of Nodes greater than X(5)");
		System.out.println(numOfNodesGreaterThanX(root,5));
		
		System.out.println("--------ht of tree");
		System.out.println(heightOfTree(root));
		System.out.println(heightOfTreeCNModified(root));
		System.out.println(heightOfTreeCN(root));
		
		System.out.println("---------num of leaves");
		System.out.println(numberOfLeaves(root));
		
		System.out.println("print at depth k");
		printAtDepthK(root, 2);
		
		System.out.println("-----------isNodePresent");
		System.out.println(isNodePresent(root, 6));
		
		System.out.println("----------nodes wthout sibblins");
		printNodesWithoutSibblings(root);
		
//		System.out.println("----------removing leaves");
//		
//		printTreeDetailed(removeLeaves(root));
//		
//		System.out.println("mirror tree----------");
//		mirrorBinaryTree(root);
//		printTreeDetailed(root);
//		
		System.out.println("---------isBalanced");
		System.out.println(isBalanced(root));
		
		System.out.println("-------isBalanced Improved");
		System.out.println(isBalancedBetter(root));
		
		System.out.println("--------------diameter");
		System.out.println(diameter(root));
		
		System.out.println("--------------diameter iproved");
		System.out.println(diameterImproved(root).diameter);
		
		printLevelWise(root);
		System.out.println("searchNode : "+searchNode(root,3));
		System.out.println("isBST -- : "+isBST(root));
		System.out.println("isBST2 -- : "+isBST2(root).isBST);
		
		
		int[] arr2 = {2,4,7,5,8,3,1};
		
		BinaryTreeNode<Integer> root2 = sortedArrayToBST(arr2);
		printTreeDetailed(root2);
		ArrayList<Integer> path = nodeToRootPath(root2, 1);
		System.out.println(path);
		
		
	}
	
}
