package pepcoding.dsa1.basics.patterns;

import java.util.Scanner;

/**
 
 		*	
	*	*	*	
*	*	*	*	*	
	*	*	*	
		*	
 
 * @author macho
 *
 */
public class _05_Pattern5 {

	public static void main(String[] args) {
		pattern5();
	}

	private static void pattern5() {
		Scanner scn = new Scanner(System.in);

		// write ur code here
		int n = scn.nextInt();
		int sp = n / 2;
		int st = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}

			for (int j = 1; j <= st; j++) {
				System.out.print("*\t");
			}

			if (i <= n / 2) {
				sp--;
				st = st + 2;
			} else {
				sp++;
				st = st - 2;
			}
			System.out.println();
		}
	}
}
