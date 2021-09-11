package pepcoding.dsa1.basics.fn.arrays;

import java.util.Scanner;

public class _07_AnyBaseMultiplication {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int d = getProduct(b, n1, n2);
		System.out.println(d);

	}

	private static int getProduct(int b, int n1, int n2) {
		// multiply n1 with all digits of n2
		// keep adding above multipication results by shifting 1 pos

		int rv = 0;
		int p = 1;
		while (n2 > 0) {
			int d2 = n2 % 10;
			n2 = n2 / 10;

			int prod = getProductOfDigit(b, n1, d2);
			rv = getSum(b, rv, prod * p);
			p = p * 10;
		}

		return rv;
	}

	private static int getSum(int b, int n1, int n2) {

		int rv = 0;
		int c = 0;
		int p = 1;
		while (n1 > 0 || n2 > 0 || c > 0) {

			int d1 = n1 % 10;
			int d2 = n2 % 10;

			n1 = n1 / 10;
			n2 = n2 / 10;

			int d = d1 + d2 + c;

			c = d / b;
			d = d % b;

			rv = rv + d * p;
			p = p * 10;

		}

		return rv;
	}

	private static int getProductOfDigit(int b, int n, int d2) {
		int rv = 0;

		int c = 0;
		int p = 1;
		while (n > 0 || c>0) {
			int d1 = n % 10;
			n = n / 10;

			int d = d1 * d2 + c;

			c = d / b;
			d = d % b;

			rv = rv + d * p;
			p = p * 10;
		}

		return rv;
	}
}
