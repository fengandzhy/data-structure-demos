package org.zhouhy.datastructure.stack;


public class StringStack {
	
	private String[] datas;
	private int topIndex=-1;
	
	public StringStack(int length){
		datas = new String[length];
		
	}
	
	public void push(String data){
		topIndex++;
		datas[topIndex] = data;
	}
	
	public String pop(){
		String data = datas[topIndex];
		topIndex--;
		return data;
	}
	
	public String peek(){
		return datas[topIndex];
	}
	
	public boolean isEmpty(){
		return topIndex==-1;
	}
	
	public boolean isFull(){
		return topIndex == datas.length-1;
	}
	
	public int getTopIndex(){
		return this.topIndex;
	}
}
