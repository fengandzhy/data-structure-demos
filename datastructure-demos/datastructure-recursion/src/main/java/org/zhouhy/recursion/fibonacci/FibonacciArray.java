package org.zhouhy.recursion.fibonacci;

public class FibonacciArray {
	
	public int getValueFromIndex(int index){
		if(index == 0){
			return 0;
		}
		if(index == 1){
			return 1;
		}
		return getValueFromIndex(index-1)+getValueFromIndex(index-2);
	}
	
	public int caculateBeforeIndex(int index){
		if(index == 0){
			return 0;
		}
		if(index == 1){
			return 1;
		}
		return caculateBeforeIndex(index-1)+this.getValueFromIndex(index);
	}
}
