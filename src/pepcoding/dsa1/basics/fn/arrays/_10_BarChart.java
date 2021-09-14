package pepcoding.dsa1.basics.fn.arrays;

import java.util.Scanner;

/**
 * Bar Chart
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print a bar chart representing value of arr a.

Sample Input : 
5
3
1
0
7
5

Sample output :

			*		
			*		
			*	*	
			*	*	
*			*	*	
*			*	*	
*	*		*	*	

 * @author macho
 *
 */
public class _10_BarChart {
	public static void main(String[] args) {

		// write your code here

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();

		}

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		for (int i = max; i > 0; i--) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] >= i) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}

	}

}
