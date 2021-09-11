package pepcoding.dsa1.basics.gettingstarted;

import java.util.Scanner;

/**
 * 1. You are required to check if a given set of numbers is a valid pythagorean triplet.
2. Take as input three numbers a, b and c.
3. Print true if they can form a pythagorean triplet and false otherwise.

hyp*hyp = a*a + b*b
 * @author macho
 *
 */
public class _10_PythagoreanTriplet {

	public static void main(String[] args) {
		pythagoreanTriplet();
	}

	private static void pythagoreanTriplet() {
	    // write your code here  
	    Scanner scn = new Scanner(System.in);
	    int a = scn.nextInt();
	    int b = scn.nextInt();
	    int c = scn.nextInt();
	    
	    int max = a;
	    boolean flag = false;
	    
	    if(b >= max){
	        max = b;
	    }
	    
	    if(c >= max){
	        max = c;
	    }
	    
	    if( max ==a ){
	         flag = (b*b + c*c) == (a*a);
	    }
	    
	    else if( max ==b ){
	         flag = (a*a + c*c) == (b*b);
	    }
	    
	    else if( max ==c ){
	         flag = (b*b + a*a) == (c*c);
	    }
	    
	    System.out.println(flag);
	   }
}
