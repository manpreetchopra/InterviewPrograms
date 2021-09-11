package pepcoding.dsa1.basics.patterns;

import java.util.Scanner;

/**
 * Table in format : 

3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
3 * 4 = 12
3 * 5 = 15
3 * 6 = 18
3 * 7 = 21
3 * 8 = 24
3 * 9 = 27
3 * 10 = 30

 * @author macho
 *
 */
public class _14_Pattern14 {
	
	public static void main(String[] args) {
		pattern14();
	}

	private static void pattern14() {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        for(int i = 1; i<=10; i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }

    }

}
