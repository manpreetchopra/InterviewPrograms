package pepcoding.dsa1.basics.fn.arrays;

import java.util.Scanner;

public class _11_SumOf2Arrays {
	
	public static void main(String[] args) {
		sumOfArraysMultiLoop();
		sumOfArraysSingleLoop();
	}

	private static void sumOfArraysSingleLoop() {
		
		Scanner scn = new Scanner(System.in);
		
		int n1 = scn.nextInt();
		int[] a1 = new int[n1];
		for(int i = 0; i<a1.length; i++) {
			a1[i] = scn.nextInt();
		}
		
		
		int n2 = scn.nextInt();
		int[] a2 = new int[n2];
		for(int i = 0; i<a2.length; i++) {
			a2[i] = scn.nextInt();
		}
		
		int res[] = new int[n1>n2?n1:n2];
		
		int i = a1.length-1;
		int j = a2.length-1;
		int k = res.length-1;
		
		int c =0;
		while(k>=0) {
			int d = c;
			
			if(i>=0) {
				d = d+a1[i];
			}
			
			if(j>=0) {
				d=d+a2[j];
			}
			
			c=d/10;
			d=d%10;
			
			res[k] = d;
			i--;
			j--;
			k--;
		}
		if(c>0) {
			System.out.println(c);
		}
		
		for(int r : res) {
			System.out.println(r);
		}
		
	
	}

	private static void sumOfArraysMultiLoop() {

	    // write your code here
	    Scanner scn = new Scanner(System.in);
	    
	    int n1 = scn.nextInt();
	    
	    int[] a1 = new int[n1];
	    for(int i =0; i<a1.length; i++){
	        a1[i] = scn.nextInt();
	    }
	    
	    
	    int n2 = scn.nextInt();
	    
	    int[] a2 = new int[n2];
	    for(int i =0; i<a2.length; i++){
	        a2[i] = scn.nextInt();
	    }
	    
	    
	    int l1 = a1.length;
	    int l2 = a2.length;
	    
	    int l = l1;
	    if(l2>l1){
	        l = l2;
	    }
	    
	    int[] res = new int[l];
	    
	    int i = a1.length-1;
	    int j = a2.length-1;
	    int k = res.length -1;
	    
	    int c  = 0;
	    while(i >= 0 && j>=0){
	        
	        int d = a1[i]+a2[j]+c;
	        
	        c= d/10;
	        d = d%10;
	        
	        res[k] = d;
	        k--;
	        i--;
	        j--;
	    }
	    
	    while(i>=0){
	        int d = a1[i]+c;
	        c = d/10;
	        d = d%10;
	        res[k]= d;
	        k--;
	        i--;
	    }
	    
	    
	    while(j>=0){
	        int d = a2[j]+c;
	        c = d/10;
	        d = d%10;
	        
	        res[k] = d;
	        j--;
	        k--;
	        
	    }
	    if(c>0){
	        System.out.println(c);
	    }
	    for(int r=0; r<res.length;r++){
	        System.out.println(res[r]);
	    }
	    
	    
	 
	}

}
