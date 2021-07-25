package edu.ace.coding.ds.stack_quee.challenges;

import edu.ace.coding.ds.stack_quee._00_Stack;

public class _08_FindCelebChallenge {

	public static void main(String[] args) {
		 int [][] party1 = {
		          {0,1,1,0},
		          {1,0,1,1},
		          {0,0,0,0},
		          {0,1,1,0},   
		        };

		        int [][] party2 = {
		          {0,1,1,0},
		          {1,0,1,1},
		          {0,0,0,1},
		          {0,1,1,0},   
		        };

		        int [][] party3 = {
		          {0,0,0,0},
		          {1,0,0,1},
		          {1,0,0,1},
		          {1,1,1,0},   
		        };
		        
		System.out.println(findCelebrity(party1));
		System.out.println(findCelebrity(party2));
		System.out.println(findCelebrity(party3));
	}

	private static int findCelebrity(int[][] party) {
		
		_00_Stack<Integer> stack = new _00_Stack<Integer>(party.length);
		int potCeleb =-1;
		for(int i = 0 ; i<party.length; i++) {
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			int x = stack.pop();
			
			if(stack.isEmpty()) {
				potCeleb = x;
				break;
			}
			
			int y = stack.pop();
			
			if(party[x][y] == 1) {
				//x knows y
				stack.push(y);
			}else {
				stack.push(x);
			}
		}
		
		for(int j = 0; j<party.length; j++) {
			if(j != potCeleb && (party[j][potCeleb]!=1 || party[potCeleb][j] ==1)) {
				return -1;
			}
		}
		return potCeleb;
	}
}
