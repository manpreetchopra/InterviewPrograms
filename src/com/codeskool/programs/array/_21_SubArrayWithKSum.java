package com.codeskool.programs.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Bonus Question
 * 
 * Same as SubArray with 0 sum,
 * instead fo 0, some k value to be matched
 * @author macho
 *
 */
public class _21_SubArrayWithKSum {

	public static void main(String[] args) {
		int[] arr = {4, 2, -3, 1, 6};
		int k = 11;
		System.out.println("Using Sets : ---");
		System.out.println(usingSet(arr,k));
		
		
	}

	private static boolean usingSet(int[] arr, int k) {
		Set<Integer> set = new HashSet<>();
		int sum =0;
		
		for(int num:arr) {
			set.add(sum);
			sum+=num;
			
			if(set.contains(sum-k)) {
				return true;
			}
		}
		
		return false;
		
	}
	
	
}
