package org.zhouhy.datastructure.array.ordered;

import java.util.ArrayList;
import java.util.List;

public class OperateOrderedRepeatedArrayWithoutIndex {
	private int[] datas;
	private int currentIndex;
	
	public OperateOrderedRepeatedArrayWithoutIndex(int length){
		datas = new int[length];
	}
	
	public void insert(int data){
		int index = 0;
		for(index=0;index<currentIndex;index++){			
			if(datas[index]>data){
				break;
			}			
		}
		currentIndex++;		
		for(int i =currentIndex-1;i>index;i--){
			datas[i]=datas[i-1];
		}
		
		datas[index] = data;
		
	}
	
	public void remove(int data){
		int index = getIndex(0,data);
		while(index!=-1){
			if(index<currentIndex-1){
				for(int i=index;i<currentIndex-1;i++){
					datas[i]=datas[i+1];
				}
			}
			
			if(index<=currentIndex-1){
				currentIndex--;
			}
			
			index = getIndex(index,data);
		}
	}
	
	public List<Integer> searchData(int data){
		List<Integer> result = new ArrayList<>();
		int index = getIndex(0,data);
		while(index!=-1){
			result.add(datas[index]);
			index = getIndex(index+1,data);
		}
		return result;
	}
	
	
	private int getIndex(int begin,int data){
		int index =-1;
		if(begin>=datas.length){
			return index;
		}
		for(int i=begin;i<currentIndex;i++){
			if(datas[i]==data){
				index = i;
				break;
			}
		}
		return index;
	}
	
	
	public int[] getDatas() {
		return datas;
	}

	public int getCurrentIndex() {
		return currentIndex;
	}
}
