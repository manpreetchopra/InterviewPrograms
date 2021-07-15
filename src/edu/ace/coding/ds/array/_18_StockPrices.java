package edu.ace.coding.ds.array;

import java.util.Arrays;

/**
 * Given a list of stock prices for n days, find the maximum profit with a
 * single buy or sell activity.
 * 
 * @author macho
 *
 */
public class _18_StockPrices {
	
	public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 3, 2, 1, 2, 5};
//        
//        int[] result = findBuySellStockPrices(array);
//       System.out.println(Arrays.toString(result)); 
//        
       int[] array2 = {10,6,4,3,0};
        int[] result2 = findBuySellStockPrices(array2);
        System.out.println(Arrays.toString(result2));
       
    }

	private static int[] findBuySellStockPrices(int[] arr) {
	
		int[] result = new int[2];
		
		int current_buy = arr[0];
		int global_sell = arr[1];
		int global_profit = Integer.MIN_VALUE;
		int current_profit = Integer.MIN_VALUE;
		
		for(int i = 1; i<arr.length; i++) {
			
			
			current_profit = arr[i] - current_buy;
			if(current_profit > global_profit) {
				global_profit = current_profit;
				global_sell = arr[i];
			}
			
			if(arr[i]<current_buy) {
				current_buy = arr[i];
			}
			
			
		}
		
		result[0] = global_sell-global_profit;
		result[1] = global_sell;
		return result;
	}

}
