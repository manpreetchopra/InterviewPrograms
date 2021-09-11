package pepcoding.dsa1.basics.patterns;

import java.util.Scanner;

/**

*				*	
	*		*		
		*			
	*		*		
*				*	

 * @author macho
 *
 */
public class _09_Pattern9 {

	public static void main(String[] args) {
		patterns9();
	}

	private static void patterns9() {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        for(int i = 1; i <=n ; i++){
            for(int j=1; j<=n ; j++){
                
                //
                //|| 
                if( (i == j) || (i+j == n+1)){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
                
            }
            System.out.println();
        }

    }
}
