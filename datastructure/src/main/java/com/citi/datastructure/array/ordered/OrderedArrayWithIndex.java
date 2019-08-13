package com.citi.datastructure.array.ordered;

public class OrderedArrayWithIndex {
	private int[] datas = null;
	private int currentIndex = 0;
	
	public OrderedArrayWithIndex(int length) {
		super();
		this.datas=new int[length];
	}
	
	public int insert(int data){
		int index =0;
		for(int i=0;i<currentIndex;i++){
			if(datas[i]>data){
				break;
			}
		}
		return index;
	}
}
