package pepcoding.dsa1.basics.gettingstarted;

import java.util.Scanner;

/**
	1. You've to print first n fibonacci numbers.
	2. Take as input "n", the count of fibonacci numbers to print.
	3. Print first n fibonacci numbers.
 * @author macho
 *
 */
public class _02_Fibbonaci {

	public static void main(String[] args) {
		printFibbonaci();
	}

	private static void printFibbonaci() {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int current = 0;
		int next = 1;

//		System.out.println(prev);
//		System.out.println(current);

		for (int i = 0; i < n; i++) {
			System.out.println(current);
			int sum = current + next;
			//System.out.println(sum);
			current = next;
			next = sum;
		}

	}
}
