package pepcoding.dsa1.basics.gettingstarted;

import java.util.Scanner;

/**
 * 1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
3. Take input "num1" and "num2" as the two numbers.
4. Print their GCD and LCM.
 * @author macho
 *
 */

public class _08_GcdLcm {

	public static void main(String[] args) {
		findGcdAndLcm();
	}

	private static void findGcdAndLcm() {
		// write your code here
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int origN1 = n1;
		int origN2 = n2;

		while (n1 % n2 != 0) {
			int rem = n1 % n2;
			n1 = n2;
			n2 = rem;
		}

		int gcd = n2;
		int lcm = (origN1 * origN2) / gcd;

		System.out.println(gcd);
		System.out.println(lcm);

	}
}
