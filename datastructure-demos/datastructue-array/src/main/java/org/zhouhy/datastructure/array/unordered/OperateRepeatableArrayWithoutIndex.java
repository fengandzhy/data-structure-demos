package org.zhouhy.datastructure.array.unordered;

import java.util.ArrayList;
import java.util.List;

public class OperateRepeatableArrayWithoutIndex {
	
	private int[] datas;
	private int currentIndex;
	
	public OperateRepeatableArrayWithoutIndex(int length){
		this.datas = new int[length];		
	}
	
	public int insert(int data){
		datas[currentIndex] = data;
		currentIndex++;
		return currentIndex;
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
