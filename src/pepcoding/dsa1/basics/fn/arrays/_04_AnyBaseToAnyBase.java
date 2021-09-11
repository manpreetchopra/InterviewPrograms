package pepcoding.dsa1.basics.fn.arrays;

import java.util.Scanner;

/**
Any Base to Any Base

1. You are given a number n.
2. You are given a base b1. n is a number on base b.
3. You are given another base b2.
4. You are required to convert the number n of base b1 to a number in base b2.

 * @author macho
 *
 */
public class _04_AnyBaseToAnyBase {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sourceBase = scn.nextInt();
		int destBase = scn.nextInt();

		int base10 = sourceToBase10(n, sourceBase);
		int ans = base10ToDest(base10, destBase);

		System.out.println(ans);

	}

	private static int base10ToDest(int n, int destBase) {
		int p = 1;
		int res = 0;
		while (n != 0) {
			int rem = n % destBase;
			n = n / destBase;

			res = res + rem * p;
			p = p * 10;
		}

		return res;
	}

	private static int sourceToBase10(int n, int sourceBase) {
		int p = 1;
		int res = 0;
		while (n != 0) {
			int rem = n % 10;
			n = n / 10;

			res = res + rem * p;
			p = p * sourceBase;
		}

		return res;
	}

}
