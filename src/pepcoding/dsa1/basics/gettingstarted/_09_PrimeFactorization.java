package pepcoding.dsa1.basics.gettingstarted;

import java.util.Scanner;

/**
 * 1. You are required to display the prime factorization of a number.
    2. Take as input a number n.
    3. Print all its prime factors from smallest to largest.
 * @author macho
 *
 */
public class _09_PrimeFactorization {

	public static void main(String[] args) {
		primeFactors();
	}

	private static void primeFactors() {
		  // write your code here  
		  
		  Scanner scn = new Scanner(System.in);
		  int n = scn.nextInt();
		  
		  for(int div = 2; div*div <=n; div++){
		      while(n % div == 0 ){
		          System.out.print(div +" ");
		          n = n/div;
		      }
		  }
		  
		  if(n!=1){
		      System.out.print(n);
		  }
		 }
}
