package pepcoding.dsa1.basics.patterns;

import java.util.Scanner;

/**
 * Half empty hour glass

*	*	*	*	*	*	*	
	*				*	
		*		*	
			*	
		*	*	*	
	*	*	*	*	*	
*	*	*	*	*	*	*

 * @author macho
 *
 */
public class _18_Pattern18 {

	public static void main(String[] args) {
		pattern18();
	}

	private static void pattern18() {
		Scanner scn = new Scanner(System.in);

		// write ur code here

		int n = scn.nextInt();

		int st = n;
		int sp = 0;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}

			for (int j = 1; j <= st; j++) {
				if (i > 1 && i <= n / 2 && j > 1 && j < st) {
					System.out.print("\t");
				} else {
					System.out.print("*\t");
				}
			}

			if (i <= n / 2) {
				st = st - 2;
				sp++;
			} else {
				st = st + 2;
				sp--;
			}
			System.out.println();
		}

	}
}
