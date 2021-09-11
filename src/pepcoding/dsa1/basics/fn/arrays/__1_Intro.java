package pepcoding.dsa1.basics.fn.arrays;

import java.util.Scanner;

/**
 * nPr = n!/(n-r)!
 * @author macho
 *
 */
public class __1_Intro {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int r = scn.nextInt();
		
		int nFact = fact(n);
		int nmrFact = fact(n-r);
		
		int npr = nFact/nmrFact;
		System.out.println(n+"P"+r+" = "+npr);
	}
	
	public static int fact(int x) {
		int rv = 1;
		
		for(int i =1; i<=x; i++) {
			rv = rv*i;
		}
		return rv;
	}
	
}
