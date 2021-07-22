package edu.ace.coding.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of numbers that might contain duplicates, find all of its
 * distinct subsets.
 * 
 * Input: [1, 3, 3]
 * Output: [], [1], [3], [1,3], [3,3], [1,3,3]
 * @author macho
 *
 */
public class _25_SubsetWithDuplicates {

	public static void main(String[] args) {
		
	
		int[]arr  = {1, 2, 3};
		//[],[1],[2],[3],[1,2],[1,3],[2,3],[1,2,3]
		List<List<Integer>> subSets = findSubSets(arr);
		System.out.println(subSets);
		
		int[]arr2  = {4, 5, 6};
		List<List<Integer>> ansList = new ArrayList<>();
		findSubSets(arr2, 0, ansList, new ArrayList<>());
		System.out.println(ansList);
	}

	private static List<List<Integer>> findSubSets(int[] arr) {
		Arrays.sort(arr);
		List<List<Integer>> ansList = new ArrayList<>();
		findSubSets(0, arr, new ArrayList<>(), ansList);
		return ansList;
	}

	private static void findSubSets(int start, int[] arr, List<Integer> ds, List<List<Integer>> ansList) {
	
		ansList.add(new ArrayList<>(ds));
		for(int i = start; i<arr.length; i++) {
			if(i!=start && arr[i] == arr[i-1]) {
				continue;
			}
			ds.add(arr[i]);
			findSubSets(i+1, arr, ds, ansList);
			ds.remove(ds.size()-1);
			//ds= new ArrayList();
		}
		
	}
	
	//2
	public static void findSubSets(int[]arr , int vIdx,List<List<Integer>> ansList, List<Integer> ans) {
		if(arr.length == vIdx) {
			ansList.add(new ArrayList<>(ans));
			return;
		}
		findSubSets(arr, vIdx+1, ansList, ans);
		/*
		List ans1 = new ArrayList<>(ans);
		ans1.add(arr[vIdx]);
		*/
		ans.add(arr[vIdx]);
		findSubSets(arr, vIdx+1, ansList,ans);
		ans.remove(ans.size()-1);
	}
}
