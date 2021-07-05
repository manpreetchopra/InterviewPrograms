package edu.ace.coding.ds.array;

/**
 * Find the Sum of Maximum Sum Subarray
 * input : arr = {1, 7, -2, -5, 10, -1}
 * output : 11
 * @author macho
 *
 */
public class _11_FindSumOfMaxSumSubArr {

	public static void main(String[] args) {
		int[] arr = {1, 7, -2, -5, 10, -1};
		
		int maxSum = findMaxSumSubArray(arr);
		System.out.println(maxSum);
		
		int maxSum2 = findMaxSumSubArrayKadanes(arr);
		System.out.println(maxSum2);
	}
	
	/*
	 * Using kadanes algo
	 */
	public static int findMaxSumSubArrayKadanes(int[] arr) {
		 
		 int max = arr[0];
		 int currMax = arr[0];
		 
		 for(int i = 1; i<arr.length; i++) {
			 if(currMax<0) {
				 currMax = arr[i];
			 }else {
				 currMax = currMax+arr[i];
			 }
			 
			 if(currMax > max) {
				 max = currMax;
			 }
		 }
		 
		 return max;
	 }
	 
	 /*
	  * Similar to Kadane's algo, little modified myself
	  */
	 public static int findMaxSumSubArray(int[] arr) {
	        // Write - Your - Code
	        //-2, 10, 7, -5, 15, 6
	        int max = Integer.MIN_VALUE;
	        int tempSum = 0;
	        for(int i = 0; i<arr.length; i++){
	            tempSum = tempSum + arr[i];
	            
	            if(tempSum>max){
	                max = tempSum;
	            }
	            //should not continue adding if sum is -ve
	            if(tempSum<0){
	                tempSum = 0;
	            }
	        }
	        return max;
	    }
}
