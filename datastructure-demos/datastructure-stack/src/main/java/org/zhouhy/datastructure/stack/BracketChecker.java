package org.zhouhy.datastructure.stack;

public class BracketChecker {
	
	public boolean checkBracket(String str){
		MyStack stack = new MyStack(str.length());
		char[] charArray = str.toCharArray();
		for(char c:charArray){
			if(c=='{'||c=='['||c=='('){
				stack.push(c);
			}
			
			if(c=='}'||c==']'||c==')'){
				char mc = (char)stack.pop();
				if((mc=='{'&&c!='}') || (mc=='['&&c!=']') || (mc=='('&&c!=')')){
					return false;
				}
			}
			
		}
		
		if(!stack.isEmpty()){
			return false;
		}
		
		return true;
	}
}
