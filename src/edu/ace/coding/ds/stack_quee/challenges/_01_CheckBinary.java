package edu.ace.coding.ds.stack_quee.challenges;

import java.util.Arrays;

import edu.ace.coding.ds.stack_quee._01_Quee;

/**
 * Challenge 1: Generate Binary Numbers from 1 to n using Queue
 * @author macho
 *
 */
public class _01_CheckBinary {

	public static void main(String[] args) {
		int n = 10;
		String[] result = generateBinary(n);
		System.out.println(Arrays.toString(result));
	}

	private static String[] generateBinary(int n) {

		String[] result = new String[n];
		
		_01_Quee<String>  q = new _01_Quee<String>(n+1);
		q.enquee("1");
		
		for(int i=0; i<n; i++) {
			result[i] = q.deQuee();
			String s1 = result[i] + "0";
			String s2 = result[i] + "1";
			q.enquee(s1);
			q.enquee(s2);
		}
		return result;
		
	}
}
