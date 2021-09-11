package pepcoding.dsa1.basics.gettingstarted;

import java.util.Scanner;

public class _04_PrintDigitsOfANumber {
	
	public static void main(String[] args) {
		printDigitsOfANumber();
	}

	private static void printDigitsOfANumber() {
		// write your code here
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nod = 0;
		int tmp = n;
		while (tmp != 0) {
			nod++;
			tmp = tmp / 10;
		}

		int div = (int) Math.pow(10, nod - 1);

		while (div != 0) {
			System.out.println(n / div);
			n = n % div;
			div = div / 10;
		}
	}

}
