package pepcoding.dsa1.basics.patterns;

import java.util.Scanner;

/**
 * 

				*	
			*	*	
		*	*	*	
	*	*	*	*	
*	*	*	*	*	

 * @author macho
 *
 */
public class _03_Pattern3 {

	public static void main(String[] args) {
		pattern3();
		pattern3WithVars();
	}

	private static void pattern3WithVars() {
		System.out.println("----------------pattern3WithVars----------------");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int sp = n-1;
		int st = 1;
		
		for(int i = 1; i<=n; i++) {
			
			for(int j =1; j<=sp; j++) {
				System.out.print("\t");
			}
			
			for(int j =1; j<=st; j++) {
				System.out.print("*\t");
			}
			
			System.out.println();
			
			sp--;
			st++;
		}

		
	}

	private static void pattern3() {
		System.out.println("----------------pattern3-----------------");
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        for(int i = 1; i<=n; i++){
            
            for(int j =1; j<=n-i; j++){
                System.out.print("\t");
            }
            
            for(int j =1; j<=i; j++){
                System.out.print("*\t");
            }
            
            System.out.println();
        }

    }
}
