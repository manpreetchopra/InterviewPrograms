package com.java.programs;

import java.util.Arrays;

/**
 * Check The Equality Of Two Arrays In Java
 * @author macho
 *
 */
public class _4_EqualityOfTwoArrays {

	public static void main(String[] args) {
		int[] arrayOne = {2, 5, 1, 7, 4};
        int[] arrayTwo = {2, 5, 1,7, 4};
        
        //iterating over arrays and checking
        System.out.println(iterativeMethod(arrayOne, arrayTwo));
 
        //using Arrays equals for 1-d array
        System.out.println(usingArrayEquals(arrayOne, arrayTwo));
        
        
        //Using deep equsl for 2-d array
        String[][] s1 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
        String[][] s2 = { {"java", "swings", "j2e1e" }, { "struts", "jsp", "hibernate"} };
        System.out.println(usingArrayDeepEquals(s1, s2));
	
	}
	
	public static boolean iterativeMethod(int[] arrayOne, int[] arrayTwo) {
		if(arrayOne.length!=arrayTwo.length) {
			return false;
		}
		
		boolean equality = true;
		for(int i=0;i<arrayOne.length;i++) {
			if(arrayOne[i]!=arrayTwo[i]) {
				equality=false;
				break;
			}
		}
		return equality;
		
	}
	
	/*
	 * Array equals method for 1-d arrays
	 */
	public static boolean usingArrayEquals(int[] arrayOne, int[] arrayTwo){
	
		//If order of numbers doesnt matter
		/*
		 * Arrays.sort(arrayOne); Arrays.sort(arrayTwo);
		 */
		return Arrays.equals(arrayOne, arrayTwo);
	}
	
		
	public static boolean usingArrayDeepEquals(String[][] arrayOne, String[][] arrayTwo) {
		
		return Arrays.deepEquals(arrayOne, arrayTwo);
	}
	
}
