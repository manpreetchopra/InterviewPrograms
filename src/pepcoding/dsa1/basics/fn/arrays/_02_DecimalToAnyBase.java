package pepcoding.dsa1.basics.fn.arrays;

import java.util.Scanner;

/**
1. You are given a decimal number n.
2. You are given a base b.
3. You are required to convert the number n into its corresponding value in base b.
 * @author macho
 *
 */
public class _02_DecimalToAnyBase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();
		
//		int dn = getValueInBase(n, b);
		int dn = getValueInBaseNoMath(n, b);
		
		System.out.println(dn);
	}

	private static int getValueInBaseNoMath(int n, int b) {
		// write code here

		int pow = 1;
		int res = 0;
		while (n != 0) {
			int rem = n % b;
			
			n = n / b;
			
			res = res+ rem*pow;
			pow= pow*10;
		}
		return res;
	}
	
	private static int getValueInBase(int n, int b) {
		// write code here

		int pow = 0;
		int res = 0;
		while (n != 0) {
			int rem = n % b;
			res = res + rem * (int) Math.pow(10, pow);
			n = n / b;
			pow++;
		}
		return res;
	}
}
