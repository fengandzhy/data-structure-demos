package org.zhouhy.datastructure.stack;

public class StringReverse {
	
	public String reverse(String str){
		StringBuffer buffer = new StringBuffer();
		MyStack stack = new MyStack(str.length());
		char[] charArray = str.toCharArray();
		for(char c:charArray){
			stack.push(c);
		}
		while(!stack.isEmpty()){
			char c = (char)stack.pop();
			buffer.append(c);
		}
		return buffer.toString();
	}
}
