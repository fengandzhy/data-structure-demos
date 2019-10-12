package org.zhouhy.datastructure.stack;

public class ArithmeticExpression {
	
	public void transfer(String str){
		StringStack strStack = new StringStack(str.length());
		MyStack myStack = new MyStack(str.length());
		char[] charArray = str.toCharArray();
		for(char c:charArray){
			myStack.push(c);
		}
		
		
		
	}
}
