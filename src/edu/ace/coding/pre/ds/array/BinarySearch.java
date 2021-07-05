package edu.ace.coding.pre.ds.array;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = {1, 10, 20, 47, 59, 63, 75, 88, 99, 107, 120, 133};
		int key = 47;
		
		int rIndex = binarySearchRec(arr, key);
		System.out.println(rIndex);
		
		int rIndex2 = binarySearchIter(arr, key);
		System.out.println(rIndex2);
	}
	
	/*
	 * Iterative method
	 */
	static int binarySearchIter(int[] a, int key) {
		int start = 0;
		int end = a.length-1;
		int kIndex = -1;
		
		while(start <= end){
			int mid = (start + end)/2;

			if(a[mid] > key){
				end = mid-1;
			}else if(a[mid] < key){
				start = mid+1;
			}else{
				kIndex = mid;
				break;
			}
		}

		return kIndex;
	}
	
	
	static int binarySearchRec(int[] a, int key) {
	    return binarySearchRec(a, key, 0, a.length - 1);
	  }
	
	/*
	 * Recursive method
	 */
	static int binarySearchRec(int[] a, int key, int min, int max){
	    if(min > max){
	      return -1;
	    }
	    int middle = (max+min)/2;

	    if(a[middle] > key){
	      return binarySearchRec(a, key, min, middle-1);
	    }else if(a[middle] < key){
	      return binarySearchRec(a, key, middle+1, max);
	    }else{
	      return middle;
	    }
	   
	  }

}
