package com.codeskool.programs.array;

/**
 * You are given a list of n-1 integers and
 *  these integers are in the range of 1 to n.
 *  There are no duplicates in the list.
 *   One of the integers is missing in the list. 
 *   Write an efficient code to find the missing integer.
 * @author macho
 *
 */
public class _12_MissingNumber {

	public static void main(String[] args) {
		int arr[] = {1, 2, 4, 6, 3, 7, 8};
		//Output: 5
		
		// 1 2 3 4 6 7 8
		// 1 2 3 4 5 6 7 8
		System.out.println("using arithmatci -- ");
		System.out.println(findMissingUsingArithmatic(arr));
		
		System.out.println("brute force using boolean array --");
		System.out.println(bruteForce(arr));
		
		System.out.println("using xor --best way--");
		System.out.println(usingXOR(arr));
	}

	/**
	 * n*(n+1)/2 == sum of all nums (including missig)
	 * so diff between these is missing number
	 * @param arr
	 * @return
	 */
	private static int findMissingUsingArithmatic(int[] arr) {
		
		int sum = 0;
		for(int i:arr) {
			sum = sum+i;
		}
		
		int l = arr.length+1;  //total arrays elems + 1 missing elem = total length
		int expectedSum = (l*(l+1))/2;  //28
		
		int missing = expectedSum-sum;
		return missing;
		
	}
	

	/*
	 * Brute Force 
	 * Just mark the present number sin equivalent array
	 */
	private static int bruteForce(int[] arr) {
		boolean[] b = new boolean[arr.length+1];
		
		for(int i = 0 ;i<arr.length; i++) {
			b[arr[i]-1]  = true;
		}
		
		int missing = -1;
		for(int i = 0; i<b.length;i++) {
			if(!b[i]) {
				missing = i+1;
			}
		}
		return missing;
	}
	
	/*
	 * Using XOR (best way)
	 */
	private static int usingXOR(int[] arr) {
		int xor1 = arr[0];
		int xor2 =1;
		
		for(int i = 1;i<arr.length;i++) { //array elems xor
			xor1 = xor1^arr[i];
		}
		
		for(int i=2; i <= arr.length+1;i++) { 
			//actual n = arr.length +1(missing)
			//its not array, its count, hence <=
			xor2 = xor2^i;
		}
		
		return (xor1^xor2);
	}
}
