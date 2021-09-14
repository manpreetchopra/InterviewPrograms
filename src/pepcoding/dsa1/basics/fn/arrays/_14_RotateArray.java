package pepcoding.dsa1.basics.fn.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14_RotateArray {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }
	    int k = Integer.parseInt(br.readLine());

	    rotate(a, k);
	    display(a);
	 
	}
	
	public static void rotate(int[] a, int k){
	    // write your code here
	    // a = {1 2 3 4 5}
	    // {5 1 2 3 4}
	    //{2 3 4 5 1}
	    
	    k = k%a.length;
	    if(k<0){
	        k = k+a.length;
	    }
	    
	    /*
	    for(int i =1; i<=k; i++){
	        if(k>0){
	        int temp = a[a.length-1];
	       // System.out.println("temp : "+temp);
	        for(int j = a.length-2; j>=0; j--){
	            a[j+1] = a[j];
	        }
	        a[0] = temp;
	        }
	        // else if(k<0){
	        //  //   System.out.println("less than 0");
	        // int temp = a[0];
	        // //System.out.println("temp : "+temp);
	        // for(int j = 1; j<a.length; j++){
	        //     a[j-1] = a[j];
	        // }
	        // a[a.length-1] = temp;
	            
	        // }
	    }
	    */
	    
	    int st1 = 0;
	    int e1 = a.length-1-k;
	    
	    int st2 = a.length-k;
	    int e2 = a.length-1;
	    
	    reverse(a,st1,e1);
	    reverse(a,st2,e2);
	    reverse(a,st1,e2);
	    
	  }
	
	 public static void reverse(int[] a, int st, int end){
	     
	     while(st<end){
	        int temp = a[st];
	        a[st] = a[end];
	        a[end] = temp;
	        
	        st++;
	        end--;
	    } 
	  }
	
	 public static void display(int[] a){
		    StringBuilder sb = new StringBuilder();

		    for(int val: a){
		      sb.append(val + " ");
		    }
		    System.out.println(sb);
		  }

}
