package pepcoding.dsa1.basics.fn.arrays;

import java.util.Scanner;

/**
1. You are given a number n.
2. You are given a digit d.
3. You are required to calculate the frequency of digit d in number n.
 * @author macho
 *
 */
public class _01_DigitFrequency {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int d = scn.nextInt();
		int f = getDigitFrequency(n, d);
		System.out.println(f);
	}

	private static int getDigitFrequency(int n, int d) {
		// write code here
		int freq = 0;

		while (n != 0) {
			int rem = n % 10;
			if (rem == d) {
				freq++;
			}
			n = n / 10;

		}
		return freq;
	}

}
