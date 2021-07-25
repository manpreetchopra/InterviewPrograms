package edu.ace.coding.ds.stack_quee.challenges;

public class _02_TwoStacksMain {
	
	public static void main(String[] args) {
		_02_TwoStacks<Integer> tS = new _02_TwoStacks<Integer>(5);
        tS.push1(11);
        tS.push1(3);
        tS.push1(7);
        tS.push2(1);
        tS.push2(9);
        
        System.out.println(tS.pop1());
        System.out.println(tS.pop2());
        System.out.println(tS.pop2());
        System.out.println(tS.pop2());
        System.out.println(tS.pop1());
	}

}
