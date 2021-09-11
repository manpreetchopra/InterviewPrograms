package pepcoding.dsa1.basics.gettingstarted;

import java.util.Scanner;

/**
 * 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
2. Take as input n and k.
3. Print the rotated number.
4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
   n = 12340056
   k = 3
   r = 05612340
 * @author macho
 *
 */
public class _07_RotateNumber {

	public static void main(String[] args) {
		rotateNumber();
	}

	public static void rotateNumber() {

		// write your code here
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();

		int nod = 0;
		int temp = n;

		while (temp != 0) {
			nod++;
			temp = temp / 10;
		}

		k = k % nod;

		if (k < 0) {
			k = k + nod;
		}

		/*
		 * int div = 1; int mult = 1; for (int i = 1; i <= nod; i++) { if (i <= k) div
		 * *= 10; else mult *= 10; }
		 */
		int div = (int) Math.pow(10, k);
		int mul = (int) Math.pow(10, nod - k);

		int q = n / div;
		int r = n % div;

		int rot = r * mul + q;
		System.out.println(rot);

	}
}
