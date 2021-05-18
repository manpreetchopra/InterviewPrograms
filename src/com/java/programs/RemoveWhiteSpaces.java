package com.java.programs;

import java.util.Scanner;

/**
 * Java Program To Remove White Spaces From String 
 * @author macho
 *
 */
public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pease enter a sting : ");
		String inputString = sc.nextLine();
		System.out.println(usingInbuiltMethods(inputString));
		System.out.println(withoutInbuiltMethods(inputString));
	}

	
	public static String usingInbuiltMethods (String str) {
		return (str.replaceAll("\\s+", ""));
	}

	public static String withoutInbuiltMethods(String str) {
		String cleanedStr = new String();

		char[] charArray = str.toCharArray();

		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]!=' ' && charArray[i]!='\t') {
				cleanedStr+=charArray[i];
			}
		}
		return cleanedStr; 
	}

}
