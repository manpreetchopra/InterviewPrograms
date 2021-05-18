package com.java.programs;

/**
 * Java program to reverse a string
 * @author macho
 *
 */
public class _1_ReverseString {

	public static void main(String[] args) {
		String str = "MyJava";
		System.out.println(reverseUsingStringBuffer(str));
		System.out.println(iterativeMethod(str));
		System.out.println(recursiveMethod(str));
	}
	
	/*
	 * Using StringBuffer's inbuilt method
	 */
	public static String reverseUsingStringBuffer(String str) {
		StringBuffer sbf= new StringBuffer(str);
		sbf.reverse();
		return sbf.toString();
	}

	/*
	 * Using Iterative approach
	 */
	public static String iterativeMethod(String str) {

		String reversed = new String();
		for(int i = str.length()-1;i>=0;i--) {
			reversed+=str.charAt(i);
		}

		return reversed;
	}

	/*
	 * Using Recursive approach
	 */
	public static String recursiveMethod(String str) {
		if(str==null || str.length()<=1) {
			return str;
		}

		return recursiveMethod(str.substring(1))+str.charAt(0);
	}
}
