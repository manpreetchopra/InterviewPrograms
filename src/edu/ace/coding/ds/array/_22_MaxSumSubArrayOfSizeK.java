package edu.ace.coding.ds.array;

public class _22_MaxSumSubArrayOfSizeK {
	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 1, 5};
		int k =2;
		
		int maxSumW; 
		int maxSumB;
		int maxSumS;
		
		maxSumW= findMaxSumSubArrayWindow(arr,k);
		System.out.println(maxSumW);
		maxSumB = findMaxSumSubArrayBrute(arr,k);
		System.out.println(maxSumB);
		maxSumS = findMaxSumSubArrayWindowSingleLoop(arr, k);
		System.out.println(maxSumS);
		
		k=3;
		arr = new int[]{ 2, 1, 5, 1, 3, 2};
		maxSumW= findMaxSumSubArrayWindow(arr,k);
		System.out.println(maxSumW);
		maxSumB = findMaxSumSubArrayBrute(arr,k);
		System.out.println(maxSumB);
		maxSumS = findMaxSumSubArrayWindowSingleLoop(arr, k);
		System.out.println(maxSumS);
		
		
	}

	private static int findMaxSumSubArrayWindowSingleLoop(int[] arr, int k) {
		
		int maxSum = 0;
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum =sum+arr[i];
			
			if( i >= k-1) {
				
				if(i >= k)
					sum = sum- arr[i-k];
				
				if(sum>maxSum) {
					maxSum = sum;
				}
				
				
			}
		}
		return maxSum;
	}
	private static int findMaxSumSubArrayWindow(int[] arr, int k) {
		int start = 0;
		int sum = 0;
		
		for(int i = 0;i<k; i++) {
			sum = sum+arr[i];
		}
		int maxSum = sum;
		for(int i = k; i<arr.length; i++) {
			sum =sum+arr[i] - arr[start]; // start can also be replaced with i-k
			start++;
			if(sum>maxSum) {
				maxSum = sum;
			}
		}
		return maxSum;
	}

	private static int findMaxSumSubArrayBrute(int[] arr, int k) {
		int maxSum = 0;
		for(int i = 0; i<arr.length-k;i++) {
			int sum = 0;
			for(int j=i; j<i+k; j++) {
				sum = sum+arr[j];
			}
			if(sum>maxSum) {
				maxSum = sum;
			}
		}
		return maxSum;
	}
}
