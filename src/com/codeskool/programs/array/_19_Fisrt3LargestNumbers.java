package com.codeskool.programs.array;

import java.util.Arrays;

/**
 * Find the largest three distinct elements in an array
 * @author macho
 *
 */
public class _19_Fisrt3LargestNumbers {

	public static void main(String[] args) {
		//int arr[] = {10, 4, 3, 50, 23, 90,50};

		int arr[] = {1,2,3,4,5,6,8,7,8};

		usingThreeVars(arr);

		usingSort(arr);
	}

	/*
	 * Using Sort
	 */
	private static void usingSort(int[] arr) {

		//Sort array
		Arrays.sort(arr);
		int count = 0;
		int num = arr[arr.length-1];

		//Need to print non-dup values
		//last elem has to be printed for sure
		//keep last in num,
		//loop from end-1 , and keep checking with num
		//if both are same, do nothing
		//else print num and update num to the array elm
		for(int i = arr.length-2 ; i>0; i--) {

			if(count<3) {
				if(arr[i]!=num) {
					System.out.println(num);
					num = arr[i];
					count++;
				}

			}else {
				break;
			}
		}

	}

	private static void usingThreeVars(int[] arr) {
		int first = 0 ;
		int second = 0;
		int third = 0;

		for(int num:arr) {
			if(num>first) {
				third = second;
				second= first;
				first = num;
			}else if(num>second && num!=first) {
				third = second;
				second = num;
			}else if(num>third && num!=second && num!=first) {
				third = num;
			}
		}

		System.out.println(first+"  "+second+"  "+third);
	}
}
