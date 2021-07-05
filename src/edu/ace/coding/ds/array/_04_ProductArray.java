package edu.ace.coding.ds.array;

import java.util.Arrays;

/**
 * Array of Products of All Elements Except Itself
 * @author macho
 *
 */
public class _04_ProductArray {
	public static void main(String[] args) {
		int[] arr = {-1, 2, -3, 4, -5};


		int[] resultBF = bruteForce(arr);
		System.out.println(Arrays.toString(resultBF));

		int[] resultLR = leftRightProduct(arr);
		System.out.println(Arrays.toString(resultLR));
	}

	/*
	 * Using maintaining arrays with left products and right products O(2n)
	 */
	private static int[] leftRightProduct(int[] arr) {
		
		int[] result = new int[arr.length];
		
		int temp = 1;
		
		//temp result array with all elems having product of left elems
		for(int i = 0; i<arr.length; i++) {
			result[i] = temp;
			temp = temp*arr[i];
		}
		
		temp =1;
		
		//result array with elems having product of right elems
		//(inclusing product of left elems in prev setp) 
		for(int i=arr.length-1; i>=0;i--) {
			result[i] = result[i] *temp;
			temp = temp*arr[i];
		}
		return result;
	}

	/*
	 * BruteForce -- use nested loops (i,j) both from 0 to n-1
	 * if i!=j , then only do the product(which means except for current index)
	 */
	private static int[] bruteForce(int[] arr) {
		
		int[] result = new int[arr.length];
		for(int i = 0; i<arr.length; i++) {
			int product = 1;
			for(int j = 0; j<arr.length; j++) {
				if(i!=j) {
					product = product*arr[j];
				}
			}
			result[i] = product;
		}
		return result;
	}

}
