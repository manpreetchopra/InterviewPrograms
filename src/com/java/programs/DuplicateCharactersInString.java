package com.java.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Java Program to Find Duplicate Characters In A String
 * @author macho
 *
 */
public class DuplicateCharactersInString {

	public static void main(String[] args) {
		String duplicatedStr = "JavaJ2EE";
		printDuplicateChars(duplicatedStr);
	}
	
	public static void printDuplicateChars(String str) {
		Map<Character,Integer> charCountMap  = new HashMap<>();
		
		char[] charArray = str.toCharArray();
		
		for(char ch:charArray) {
			if(charCountMap .containsKey(ch)) {
				charCountMap.put(ch, charCountMap.get(ch)+1);
			}else {
				charCountMap.put(ch, 1);
			}
		}
		
		Set<Character> keys = charCountMap.keySet();
		
		for(char key:keys) {
		if(charCountMap.get(key)>1) {
			System.out.println(key +" repeated "+charCountMap.get(key)+ " times");
		}	
		}
	}
}
