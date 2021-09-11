package pepcoding.dsa1.basics.patterns;

import java.util.Scanner;

/**

1						1	
1	2				2	1	
1	2	3		3	2	1	
1	2	3	4	3	2	1

 * @author macho
 *
 */
public class _16_Pattern16 {
	
	public static void main(String[] args) {
		//pattern16();
		pattern16ValBetter();
	}

	private static void pattern16ValBetter() {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int st = 1;
		int sp = 2*n-3;
		
		for(int i = 1;  i<=n; i++) {
			int val = 1;
			for(int j = 1; j<=st; j++) {
				System.out.print(val+"\t");
				val++;
			}
			
			for(int j = 1; j<=sp; j++) {
				System.out.print("\t");
			}
			
			if(i == n) {
				st --;
				val--;
			}
			for(int j = 1; j<=st; j++) {
				val--;
				System.out.print(val+"\t");
			}
			
			st++;
			sp = sp-2;
			System.out.println();
		}
	}

	private static void pattern16() {
	    Scanner scn = new Scanner(System.in);

	     // write ur code here
	     
	     int n = scn.nextInt();
	     
	     int st = 1;
	     int sp = 2*n-3;
	     
	     for(int i =1; i <=n; i++){
	         
	         for(int j = 1; j<=st; j++){
	             System.out.print(j+"\t");
	         }
	         
	         for(int j =1; j<=sp; j++){
	             System.out.print("\t");
	         }
	         
	         if(i==n){
	             st--;
	         }
	         for(int j = st; j>=1; j--){
	             System.out.print(j+"\t");
	         }
	         
	         st++;
	         sp = sp-2;
	         System.out.println();
	     }

	 }

}
