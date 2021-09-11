package pepcoding.dsa1.basics.patterns;

import java.util.Scanner;

/**
 * 

*	*	*	*	*	
*	*	*	*	
*	*	*	
*	*	
*	

 * @author macho
 *
 */
public class _02_Pattern2 {

	public static void main(String[] args) {
		pattern2();
	}

	private static void pattern2() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = n; i>=1 ; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        // write ur code here

    }
}
