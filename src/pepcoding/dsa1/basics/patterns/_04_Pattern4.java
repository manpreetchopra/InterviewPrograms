package pepcoding.dsa1.basics.patterns;

import java.util.Scanner;

public class _04_Pattern4 {

	public static void main(String[] args) {
		pattern4();
	}

	private static void pattern4() {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        int st = n;
        int sp = 0;
        
        for(int i =1; i<=n; i++){
            
            for(int j = 1; j<=sp; j++){
                System.out.print("\t");
            }
            
            for(int j = 1; j<=st; j++){
                System.out.print("*\t");
            }
            
            st--;
            sp++;
            System.out.println();
        }
    }
}
