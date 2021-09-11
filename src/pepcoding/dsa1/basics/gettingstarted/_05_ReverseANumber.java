package pepcoding.dsa1.basics.gettingstarted;

import java.util.Scanner;

public class _05_ReverseANumber {

	public static void main(String[] args) {
		reverseNumber();
	}

	private static void reverseNumber() {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		while (n != 0) {
			System.out.println(n % 10);
			n = n / 10;
		}

	}

}
