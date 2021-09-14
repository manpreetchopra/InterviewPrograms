package pepcoding.dsa1.basics.fn.arrays;

import java.util.Scanner;

/**

1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1

Assumption - number represented by a2 is greater.

 * @author macho
 *
 */
public class _12_DiffOf2Arrays {

	public static void main(String[] args) {
		diff();
	}

	private static void diff() {
		// write your code here

		Scanner scn = new Scanner(System.in);

		int n1 = scn.nextInt();
		int[] a1 = new int[n1];
		for (int i = 0; i < a1.length; i++) {
			a1[i] = scn.nextInt();
		}

		int n2 = scn.nextInt();
		int[] a2 = new int[n2];
		for (int i = 0; i < a2.length; i++) {
			a2[i] = scn.nextInt();
		}

		int[] res = new int[a2.length];

		int i = a1.length - 1;
		int j = a2.length - 1;
		int k = res.length - 1;

		int b = 0;

		while (k >= 0) {
			int d = 0;

			if (j >= 0) {
				d = a2[j];
			}

			if (b > 0) {
				d = d - b;
			}

			if (i >= 0) {
				d = d - a1[i];
			}

			if (d < 0) {
				b = 1;
				d = d + 10;
			} else {
				b = 0;
			}

			res[k] = d;

			i--;
			j--;
			k--;

		}

		int idx = 0;
		while (idx < res.length) {
			if (res[idx] == 0) {
				idx++;
			} else {
				break;
			}
		}

		// System.out.println("start from "+idx);

		while (idx < res.length) {
			System.out.println(res[idx]);
			idx++;
		}

	}

}
