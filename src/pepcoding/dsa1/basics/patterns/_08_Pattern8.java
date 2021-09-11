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
public class _08_Pattern8 {
	public static void main(String[] args) {
		pattern8();
		pattern8IandJ();
	}

	private static void pattern8IandJ() {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int i = 1; i <=n ; i++) {
			for(int j = 1; j<=n; j++) {
				if(i+j == n+1){//formula
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

	private static void pattern8() {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int n = scn.nextInt();
        
        for(int i = 1; i<=n ; i++){
            for(int j = n ; j>=1; j--){
                if(i == j){
                    System.out.print("*");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }

}
