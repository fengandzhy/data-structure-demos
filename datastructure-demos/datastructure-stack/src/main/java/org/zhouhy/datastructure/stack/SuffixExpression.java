package org.zhouhy.datastructure.stack;

public class SuffixExpression {
	
	public String doTransfer(String expression){
		StringBuffer buffer = new StringBuffer();
		char[] charArray = expression.toCharArray();
		
		MyStack myStack = new MyStack(expression.length());
		
		for(int i=0;i<charArray.length;i++){
			char c = charArray[i];
			
			
		}
		return buffer.toString();
	}
	/**
	 * 处理操作符
	 * */
	private void doOperation(char c, int level,MyStack myStack,StringBuffer buffer){
		while(!myStack.isEmpty()){
			char topC = (char)myStack.peek();
			if(topC=='('){
				break;
			}
		}
	}
	
	/**
	 * 处理右括号
	 * */
	private void doRightBracket(char c){
		
	}
}
