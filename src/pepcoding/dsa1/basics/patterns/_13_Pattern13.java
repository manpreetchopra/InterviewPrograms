package pepcoding.dsa1.basics.patterns;

import java.util.Scanner;

/**

1	
1	1	
1	2	1	
1	3	3	1	
1	4	6	4	1	

 * @author macho
 *
 */
public class _13_Pattern13 {

	public static void main(String[] args) {
		pattern13();
	}

	private static void pattern13() {
        Scanner scn = new Scanner(System.in);

        //write your code here
        int n = scn.nextInt();
        
        for(int i = 0; i<n; i++){
            int icj = 1;
            for(int j = 0; j<=i; j++){
                System.out.print(icj+"\t");
                int icj1 = icj * (i-j)/(j+1);
                icj = icj1;
            }
            System.out.println();
        }

    }
}
