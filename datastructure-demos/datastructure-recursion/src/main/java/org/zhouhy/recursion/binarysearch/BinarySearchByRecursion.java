package org.zhouhy.recursion.binarysearch;

public class BinarySearchByRecursion {
	private int[] datas;
	private int currentIndex;
	
	public BinarySearchByRecursion(int length){
		this.datas = new int[length];
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
	
	public int binarySearch(int data, int begin,int end){
		int index = -1;
		if(begin>end){
			return index;
		}		
		index = (begin + end)/2;
		if(data == datas[index]){
			return index;
		}		
		if(data<datas[index]){
			end = index-1;
		}else{
			begin = index +1;
		}		
		index = binarySearch(data,begin,end);		
		return index;
	}
	
	public int[] getDatas() {
		return datas;
	}

	public int getCurrentIndex() {
		return currentIndex;
	}
}
