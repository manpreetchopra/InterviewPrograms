package pepcoding.dsa1.basics.patterns;

import java.util.Scanner;

/**
 
 *
	*
		*
			*
				*
 
 * @author macho
 *
 */
public class _07_Pattern7 {
	public static void main(String[] args) {
		pattern7();
		pattern7WithEqual();
	}

	private static void pattern7WithEqual() {
		System.out.println("---------------pattern7WithEqual------------");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j <=n; j++) {
				if(i==j) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
				
				
			}
			System.out.println();
		}
	}

	private static void pattern7() {
		System.out.println("--------------pattern7----------------");
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        for(int i =1; i<=n ; i++){
            for(int j = 1; j<i; j++){
                System.out.print("\t");
            }
            System.out.println("*");
        }

    }

}
