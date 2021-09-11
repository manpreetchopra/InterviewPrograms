package pepcoding.dsa1.basics.fn.arrays;

import java.util.Scanner;

/**
1. You are given a base b.
2. You are given two numbers n1 and n2 of base b.
3. You are required to subtract n1 from n2 and print the value.
 * @author macho
 *
 */
public class _06_AnyBaseSubtraction {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int d = getDifference(b, n1, n2);
		System.out.println(d);

	}

	private static int getDifference(int b, int n1, int n2) {
		// write your code here

		int c = 0;
		int rv = 0;
		int p = 1;

		while (n2 > 0) {

			int d1 = n1 % 10;
			int d2 = n2 % 10;
			;

			n1 = n1 / 10;
			n2 = n2 / 10;

			int d = d2 - d1 - c;

			if (d < 0) {
				d = d + b;
				c = 1;
			} else {
				c = 0;
			}

			rv = rv + d * p;
			p = p * 10;

		}
		return rv;
	}
}
