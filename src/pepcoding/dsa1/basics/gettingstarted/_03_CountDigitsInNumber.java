package pepcoding.dsa1.basics.gettingstarted;

import java.util.Scanner;

/**
	1. You've to count the number of digits in a number.
	2. Take as input "n", the number for which the digits has to be counted.
	3. Print the digits in that number.
 * @author macho
 *
 */
public class _03_CountDigitsInNumber {

	public static void main(String[] args) {
		countDigitsInNumber();
	}

	private static void countDigitsInNumber() {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    
	    int count = 0;
	    while(n!=0){
	        count++;
	        n = n/10;
	    }
	    
	    System.out.println(count);
	    
	   }
	
	
}
