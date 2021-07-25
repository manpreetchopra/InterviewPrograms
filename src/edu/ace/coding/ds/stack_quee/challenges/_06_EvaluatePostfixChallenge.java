package edu.ace.coding.ds.stack_quee.challenges;

import edu.ace.coding.ds.stack_quee._00_Stack;

public class _06_EvaluatePostfixChallenge {
	public static void main(String[] args) {
		System.out.println(evaluatePostFix("921*-8-4+"));
	}

	private static int evaluatePostFix(String string) {
		
		_00_Stack<Integer> stack= new _00_Stack<Integer>(string.length());
		
		for(int i = 0; i<string.length(); i++) {
			char ch = string.charAt(i);
			if(Character.isDigit(ch)) {
				stack.push(Character.getNumericValue(ch));
			}else {

				Integer i1 = stack.pop();
				Integer i2 = stack.pop();
				
				if(ch == '+') {
					stack.push(i2 + i1);
				}else if(ch =='-') {
					stack.push(i2 - i1);
				}else if(ch == '*') {
					stack.push(i2 * i1);
				}else if(ch == '/') {
					stack.push(i2 / i1);
				
				}
			}
		}
		return stack.pop();
		
	}

}
