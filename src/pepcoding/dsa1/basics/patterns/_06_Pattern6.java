package pepcoding.dsa1.basics.patterns;

import java.util.Scanner;

/**
 
*	*	*		*	*	*	
*	*				*	*	
*						*	
*	*				*	*	
*	*	*		*	*	*
 
 * @author macho
 *
 */
public class _06_Pattern6 {

	public static void main(String[] args) {
		pattern6();
	}

	private static void pattern6() {
		Scanner scn = new Scanner(System.in);

		// write ur code here

		int n = scn.nextInt();

		int st = n / 2 + 1;
		int sp = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= st; j++) {
				System.out.print("*\t");
			}

			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}

			for (int j = 1; j <= st; j++) {
				System.out.print("*\t");
			}

			if (i <= n / 2) {
				st = st - 1;
				sp = sp + 2;
			} else {
				st = st + 1;
				sp = sp - 2;
			}
			System.out.println();
		}

	}
}
