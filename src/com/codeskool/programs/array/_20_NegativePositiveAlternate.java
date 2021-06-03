package com.codeskool.programs.array;

import java.util.Arrays;

/**
 * Rearrange array in alternating positive & negative items
 *  with O(1) extra space | Set 1
 * 
 * Input:  arr[] = {1, 2, 3, -4, -1, 4}
	Output: arr[] = {-4, 1, -1, 2, 3, 4}
 * @author macho
 *
 */
public class _20_NegativePositiveAlternate {

	public static void main(String[] args) {
		int  arr[] = { -5, -2, 5, 2, 4,
                7, 1, 8, 0, -8 };
		
		System.out.println("BruteForcing----");
		int[] arr1 = Arrays.copyOf(arr, arr.length);
		bruteForceWithOnSpace(arr1);
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("sorting 2 pointers-----");
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		bySortingUsing2Ponters(arr2); // wont maintain order
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("sorting pivot ----");
		int[] arr3 = Arrays.copyOf(arr, arr.length);
		bySortingUsingPivot(arr3); //wont maintain order
		System.out.println(Arrays.toString(arr3));
	
		System.out.println(" rotating-------");
		int[] arr4 = Arrays.copyOf(arr, arr.length);
		byRotatingArray(arr4); //maintain the order
		System.out.println(Arrays.toString(arr4));
	}

	private static void byRotatingArray(int[] arr) {
		
		int wrongIndex = -1;
		
		for(int i=0;i<arr.length;i++) {
			if(wrongIndex!=-1) {
				if( (arr[wrongIndex]>=0 && arr[i]<0) 
						|| (arr[wrongIndex]<0 && arr[i]>=0)) {
					rotateArr(arr,wrongIndex,i);
					
					/*
					if(i-wrongIndex>=2) {
						wrongIndex+=2;
					}else {
					wrongIndex = -1;
					}
					*/
					wrongIndex = -1;
				}
			}else {
				if( (i%2==0 && arr[i]>=0)||
					(i%2==1 && arr[i]<0) ){
						wrongIndex = i;
					}
				}
			}
			
		}
		
	private static void rotateArr(int[] arr, int from, int to) {
		 int temp = arr[to];
		 for(int i=to; i>from; i--) {
			 arr[i] = arr[i-1];
		 }
		 arr[from]  = temp;
		
	}

	private static void bySortingUsingPivot(int[] arr) {

		int current = 0;
		int swapped = 0;
		
		while(current<arr.length) {
			if(arr[current]>=0) {
				int temp = arr[current];
				arr[current] = arr[swapped];
				arr[swapped] = temp;
				
				current++;
				swapped++;
			}else {
				current++;
			}
		}
		
		System.out.println("current :"+current);
		System.out.println("swapped :"+swapped);
		int neg = swapped;
		int pos= 0;
		while(pos<neg && pos<arr.length && neg<arr.length) {
			int temp = arr[pos];
			arr[pos] = arr[neg];
			arr[neg] = temp;
			pos+=2;
			neg+=1;
		}
		
	}

	private static void bySortingUsing2Ponters(int[] arr) {
		
		int i = 0;
		int j = arr.length-1;
		
		while(i<=j) {
			if(arr[i]>=0 && arr[j]<0) {
				i++;
				j--;
			}else if(arr[i]>=0 && arr[j]>0) {
				i++;
			}else if(arr[i]<0 && arr[j]<0) {
				j--;
			}else if(arr[i]<0 && arr[j]>=0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				i++;
				j--;
			}
		}
		
	int neg = i;
	int pos= 0;
	while(pos<neg && pos<arr.length && neg<arr.length) {
		int temp = arr[pos];
		arr[pos] = arr[neg];
		arr[neg] = temp;
		pos+=2;
		neg+=1;
	}
		
	}

	private static void bruteForceWithOnSpace(int[] arr) {
		int pos = 0;
		int neg = 0;
		for(int num:arr) {
			if(num<0) {
				neg++;
			}else {
				pos++;
			}
		}
		int[] posArr = new int[pos];
		int[] negArr = new int[neg];
		
		int posIdx= 0 ;
		int negIdx = 0;
		for(int num:arr) {
			if(num<0) {
				negArr[negIdx++] = num;
			}else {
				posArr[posIdx++] = num;
			}
		}
		
		posIdx = 0;
		negIdx = 0;
		
		int arrIdx = 0;
		while(posIdx<posArr.length && negIdx<negArr.length) {
			arr[arrIdx++]  = negArr[negIdx++];
			arr[arrIdx++] = posArr[posIdx++];
		}
		
		while(posIdx<posArr.length) {
			arr[arrIdx++] = posArr[posIdx++];
		}
		
		while(negIdx < negArr.length) {
			arr[arrIdx++] = negArr[negIdx++];
		}
	}
}
