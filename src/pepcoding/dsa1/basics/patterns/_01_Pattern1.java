package pepcoding.dsa1.basics.patterns;

import java.util.Scanner;

/**
 * 1. You are given a number n.
   2. You've to create a pattern of * and separated by tab as shown in output format.

*	
*	*	
*	*	*	
*	*	*	*	
*	*	*	*	*	

 * @author macho
 *
 */
public class _01_Pattern1 {

	public static void main(String[] args) {
		pattern1();
	}

	private static void pattern1() {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		// write ur code here

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}

	}

}
