package pepcoding.dsa1.basics.patterns;

import java.util.Scanner;

/**

1	
2	3	
4	5	6	

 * @author macho
 *
 */
public class _11_Pattern11 {
	public static void main(String[] args) {
		pattern11();
	}

	private static void pattern11() {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int val = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(val + "\t");
				val++;
			}
			System.out.println();
		}

	}

}
