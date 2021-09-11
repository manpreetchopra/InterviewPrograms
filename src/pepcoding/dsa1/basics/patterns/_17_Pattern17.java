package pepcoding.dsa1.basics.patterns;

import java.util.Scanner;

/**
 * Arrow : 

		*	
		*	*	
*	*	*	*	*	
		*	*	
		*	

 * @author macho
 *
 */
public class _17_Pattern17 {

	public static void main(String[] args) {
		
		pattern17();
	}

	private static void pattern17() {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int n = scn.nextInt();
        
        int sp = n/2;
        int st = 1;
        for(int i = 1; i<=n ; i++){
            
            for(int j = 1; j<=sp; j++){
                if(i == n/2+1){
                    System.out.print("*\t");
                }else{
                System.out.print("\t");
                }
            }
            
            for(int j =1; j<=st; j++){
                System.out.print("*\t");
            }
            
            if(i <= n/2){
                st++;
            }else{
                st--;    
            }
            System.out.println();
            
        }

    }
}
