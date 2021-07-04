package edu.ace.coding.array;

/**
 * Find First non repeating value in array
 * @author macho
 *
 */
public class _06_CheckFirstUnique {

	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 9, 9,3, 5};
		
		int num = withoutUsingBoolfindFirstUnique(arr);
		System.out.println(num);
		
		int num2 = findFirstUnique(arr);
		System.out.println(num2);
		
		
	}
	public static int withoutUsingBoolfindFirstUnique(int[] arr) 
	 {
	   int result = -1;
	   for(int i = 0; i<arr.length; i++){
	     int j;
	     for(j = 0; j<arr.length; j++){
	       if(i!= j && arr[i] == arr[j]){
	         break;
	       }
	     }
	     if(j == arr.length){
	       result = arr[i];
	       break;
	     }
	   }
	   // write your code here
	   return result;
	 }
	
	public static int findFirstUnique(int[] arr) {
		
		int result;
		for(int i = 0; i<arr.length; i++) {
			boolean isRepeat = false;
			for(int j = 0; j<arr.length; j++) {
				if(i!=j && arr[i] == arr[j]) {
					isRepeat = true;
					break;
				}
			}
			
			if(!isRepeat) {
				return arr[i];
			}else {
				isRepeat = false;
			}
		}
		return -1;
	}
}
