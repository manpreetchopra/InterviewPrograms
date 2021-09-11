package pepcoding.dsa1.basics.patterns;

import java.util.Scanner;

/**

0	
1	1	
2	3	5	
8	13	21	34	

 * @author macho
 *
 */
public class _12_Pattern12 {

	public static void main(String[] args) {
		pattern12();
	}

	private static void pattern12() {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int n = scn.nextInt();
        
        int current = 0;
        int next = 1;
        
        for(int i =1; i<=n; i++){
            
            for(int j = 1; j<=i; j++){
                System.out.print(current +"\t");
                
               int sum = current + next;
                current = next;
                next = sum;
            }
            
                System.out.println();
        }

    }
}
