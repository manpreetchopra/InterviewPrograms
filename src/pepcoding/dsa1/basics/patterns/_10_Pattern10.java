package pepcoding.dsa1.basics.patterns;

import java.util.Scanner;

/**

 		*		
	*		*	
*				*
	*		*	
		*	
 
 * @author macho
 *
 */
public class _10_Pattern10 {
	
	public static void main(String[] args) {
		//pattern10Basic();
		pattern10Modified();
	}

	private static void pattern10Modified() {
		Scanner scn = new Scanner(System.in);
		int  n = scn.nextInt();
		
		int os = n/2;
		int is = -1;
		
		for(int i = 1; i <=n; i++) {
			
			for(int j = 1; j<=os; j++) {
				System.out.print("\t");
			}
			
			System.out.print("*\t");
			
			for(int j = 1; j<=is; j++) {
				System.out.print("\t");
			}
			
			if(i >1 && i <n) {
				System.out.print("*");
			}
			
			if(i <= n/2) {
				os--;
				is = is + 2;
			}else {
				os++;
				is = is - 2;
			}
			
			System.out.println();
		}
	}

	private static void pattern10Basic() {
		Scanner scn = new Scanner(System.in);

		// write ur code here
		int n = scn.nextInt();

		int outerSp = n / 2;
		int innerSp = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= outerSp; j++) {
				System.out.print("\t");
			}

			if (i == 1 || i == n) {
				System.out.print("*");
			} else {
				System.out.print("*\t");

				for (int j = 1; j <= innerSp; j++) {
					System.out.print("\t");
				}

				System.out.print("*");
				if (i <= n / 2) {
					innerSp = innerSp + 2;
				} else {
					innerSp = innerSp - 2;
				}

			}

			for (int j = 1; j <= outerSp; j++) {
				System.out.print("\t");
			}

			if (i <= n / 2) {
				outerSp--;
			} else {
				outerSp++;
			}
			System.out.println();

		}

	}

}
