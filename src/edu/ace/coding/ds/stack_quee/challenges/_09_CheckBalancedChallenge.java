package edu.ace.coding.ds.stack_quee.challenges;

import edu.ace.coding.ds.stack_quee._00_Stack;

public class _09_CheckBalancedChallenge {

	public static boolean isBalanced(String exp) {
      
		_00_Stack<Character> stack = new _00_Stack<>(exp.length());
        
		for(int i = 0; i<exp.length(); i++){
            char ch = exp.charAt(i);
           
            if(!stack.isEmpty() && (ch == ')' || ch == '}' || ch ==']')){
                if(ch ==')' && stack.pop() != '('){
                    return false;
                }
                 if(ch =='}' && stack.pop() != '{'){
                    return false;
                }

                  if(ch ==']' && stack.pop() != '['){
                    return false;
                }
            }
            else{
                stack.push(ch);
            }
        }

        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
	
	  public static void main(String args[]) {

	        System.out.println(isBalanced("{[()]}"));
	        System.out.println(isBalanced("[{(}]"));

	    }
}
