package pepcoding.dsa1.basics.fn.arrays;

import java.util.Scanner;

/**
1. You are given a number n.
2. You are given a base b. n is a number on base b.
3. You are required to convert the number n into its corresponding value in decimal number system.
 * @author macho
 *
 */
public class _03_AnyBaseToDecimal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();
		int d = getValueIndecimal(n, b);
		System.out.println(d);
	}

	private static int getValueIndecimal(int n, int b) {
		// write your code here
		// n^b = x^10 , find x

		int res = 0;
		int p = 1;
		while (n != 0) {
			int rem = n % 10;
			n = n / 10;

			res = res + rem * p;
			p = p * b;
		}

		return res;
	}
}
