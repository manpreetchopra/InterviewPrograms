package com.codeskool.programs.array;

/**
 * Union and Intersection of two sorted arrays
 * @author macho
 *
 */
public class _10_UnioinAndIntersection {

	public static void main(String[] args) {
		int arr1[] = {1, 3, 4,4, 5, 6,8,8};
        int arr2[] = {2, 3,3,3, 5, 7,10};
        
        System.out.println("Union : ");
        union(arr1,arr2);
        System.out.println();
        System.out.println("intersection");
        intersection(arr1,arr2);
        
        System.out.println("-------------with dups-----------");
        System.out.println("union");
        unionWithDups(arr1, arr2);
        System.out.println();
        System.out.println("intersection");
        intersectionWithDups(arr1, arr2);
	}

	/*
	 * Method to find union of 2 arrays without duplicates
	 */
	private static void union(int[] arr1, int[] arr2) {
		int i=0;
		int j=0;
		
		int m = arr1.length;
		int n = arr2.length;
		
		//loop till any 1 array finishes
		//print the smaller number and inc the smaller number array's index
		//if both same, print any, and inc both array index
		while(i<m && j<n) {
			if(arr1[i] < arr2[j]) {
				System.out.print(arr1[i]+"  ");
				i++;
			}else if(arr2[j]<arr1[i]) {
				System.out.print(arr2[j]+"  ");
				j++;
			}else if(arr1[i] == arr2[j]) {
				System.out.print(arr1[i]+"  ");
				i++;
				j++;
			}
		}
		
		//left over elements in arr1,,assuming arr1 > arr2
		while(i<m) {
			System.out.print(arr1[i]+ "  ");
			i++;
		}
		
		//left over elements from arr2, assuming arr2 > arr1
		while(j<n) {
			System.out.print(arr2[j]+"  ");
			j++;
		}
		
	}
	
	
	/*
	 * Method tofind intersection of 2 sorted arrays without duplicates
	 */
	private static void intersection(int[] arr1, int[] arr2) {

		int i = 0;
		int j = 0;
		
		int m = arr1.length;
		int n = arr2.length;
		
		while(i<m && j<n) {
			if(arr1[i] < arr2[j]) {
				i++;
			}else if(arr2[j] < arr1[i]) {
				j++;
			}else if(arr1[i] == arr2[j]) {
				System.out.print(arr1[i]+"  ");
				i++;
				j++;
			}
		}
		
	}
	
	public static void unionWithDups(int[]arr1,int[]arr2) {
		int i = 0;
		int j = 0;
		
		int m = arr1.length;
		int n = arr2.length;
		
		while(i<m && j<n) {
			while(i<m-1 && arr1[i] == arr1[i+1]) {
				i++;
			}
			
			while(j<n-1 && arr2[j] == arr2[j+1]) {
				j++;
				
			}
			
			if(arr1[i]<arr2[j]) {
				System.out.print(arr1[i]);
				i++;
			}else if(arr1[i]>arr2[j]) {
				System.out.print(arr2[j]);
				j++;
			}else if(arr1[i] == arr2[j]) {
				System.out.print(arr1[i]);
				i++;
				j++;
			}
		}
		
		while(i<m) {
			while(i<m-1 && arr1[i] == arr1[i+1]) {
				i++;
			}
			System.out.print(arr1[i]);
			i++;
		}
		
		while(j<n) {
			while(j<n-1 && arr2[j] == arr2[j+1]) {
				j++;
			}
			System.out.print(arr2[j]);
			j++;
		}
		
	}
	
	public static void intersectionWithDups(int[]arr1,int[]arr2) {
		int i = 0;
		int j = 0;
		
		int m = arr1.length;
		int n = arr2.length;
         
		while(i<m && j<n) {
			while(i<m-1 && arr1[i] == arr1[i+1]) {
				i++;
			}
			
			while(j<n-1 && arr2[j] == arr2[j+1]) {
				j++;
				
			}
			
			if(arr1[i]<arr2[j]) {
				i++;
			}else if(arr1[i]>arr2[j]) {
				j++;
			}else if(arr1[i] == arr2[j]) {
				System.out.print(arr1[i]);
				i++;
				j++;
			}
		}
	}
}
