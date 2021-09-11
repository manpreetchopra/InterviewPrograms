package pepcoding.dsa1.basics.gettingstarted;

import java.util.Scanner;

/**
 * 
 	1. You've to check whether a given number is prime or not.
	2. Take a number "t" as input representing count of input numbers to be tested.
	3. Take a number "n" as input "t" number of times.
	4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
 * @author macho
 *
 */
public class _01_IsPrime {
	public static void main(String[] args) {
		
		//isPrimeUsingBoolean();
		//isPrimeUsingCount();
		//isPrimeOptimizedUsingSqrt();
		isPrimeMostOptimizedUsingSqrtAndBreak();
	}

	private static void isPrimeMostOptimizedUsingSqrtAndBreak() {

		System.out.println("-------------------------------------------");
		System.out.println("------------ isPrimeMostOptimizedUsingSqrtAndBreak ----------");
		System.out.println("-------------------------------------------");
	
		System.out.println("Enter number of values : ");
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 1; i<=t; i++) {
			System.out.println("Enter value "+i);
			int n = sc.nextInt();
			
			int count = 0;
			for(int div = 2; div*div <= n; div++) {
				if(n%div ==0) {
					count++;
					break;
				}
			}
			
			if(count == 0) {
				System.out.println("prime");
			}else {
				System.out.println("not prime");
			}
		}
		
	
		
	}

	private static void isPrimeOptimizedUsingSqrt() {
		System.out.println("-------------------------------------------");
		System.out.println("------------ isPrimeOptimizedUsingSqrt ----------");
		System.out.println("-------------------------------------------");
	
		System.out.println("Enter number of values : ");
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 1; i<=t; i++) {
			System.out.println("Enter value "+i);
			int n = sc.nextInt();
			
			int count = 0;
			for(int div = 2; div*div <= n; div++) {
				if(n%div ==0) {
					count++;
				}
			}
			
			if(count == 0) {
				System.out.println("prime");
			}else {
				System.out.println("not prime");
			}
		}
		
	}

	private static void isPrimeUsingCount() {
		System.out.println("-------------------------------------------");
		System.out.println("------------ isPrimeUsingBoolean ----------");
		System.out.println("-------------------------------------------");
	
		System.out.println("Enter number of values : ");
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 1; i<=t; i++) {
			System.out.println("Enter value "+i);
			int n = sc.nextInt();
			
			int count = 0;
			for(int div = 1; div <=n; div++) {
				if(n%div == 0) {
					count++;
				}
			}
			
			if(count == 2) {
				System.out.println("prime");
			}else {
				System.out.println("not prime");
			}
		}
	}

	private static void isPrimeUsingBoolean() {
		System.out.println("-------------------------------------------");
		System.out.println("------------ isPrimeUsingBoolean ----------");
		System.out.println("-------------------------------------------");
		
		System.out.println("Enter number of values : ");
		Scanner scn = new Scanner(System.in);

		// write ur code here
		int t = scn.nextInt();
		for(int i = 1; i<=t; i++){
			System.out.println("Enter value "+i);
			int n = scn.nextInt();
			boolean isPrime = true;
			for(int j = 2; j<n; j++){
				if(n%j ==0){
					isPrime= false;
				}
			}
			if(isPrime){
				System.out.println("prime");
			}else{
				System.out.println("not prime");
			}
		}
	}
		
}
