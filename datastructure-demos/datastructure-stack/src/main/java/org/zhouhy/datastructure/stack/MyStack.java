package org.zhouhy.datastructure.stack;

public class MyStack {
	private int[] datas;
	private int topIndex=-1;
	
	public MyStack(int length){
		datas = new int[length];
	}
	
	public void push(int data){
		topIndex++;
		datas[topIndex] = data;
	}
	
	public int pop(){
		int data = datas[topIndex];
		topIndex--;
		return data;
	}
	
	public int peek(){
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
