package pepcoding.dsa1.basics.patterns;

import java.util.Scanner;

/**

		1	
	2	3	2	
3	4	5	4	3	
	2	3	2	
		1	

 * @author macho
 *
 */
public class _15_Pattern15 {
	
	public static void main(String[] args) {
		pattern15();
	}

	private static void pattern15() {
		Scanner scn = new Scanner(System.in);

		// write ur code here

		int n = scn.nextInt();
		int num = 1;

		int sp = n / 2;
		int st = 1;
		int val = 1;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}

			int cval = val;
			for (int j = 1; j <= st; j++) {
				System.out.print(cval + "\t");

				if (j <= st / 2) {
					cval++;
				} else {
					cval--;
				}
			}

			System.out.println();

			if (i <= n / 2) {
				sp--;
				st = st + 2;
				val++;
			} else {
				sp++;
				st = st - 2;
				val--;
			}

		}
	}

}
