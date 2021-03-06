package org.zhouhy.datastructure.array.ordered;

public class OperateOrderedArrayWithoutIndex {
	private int[] datas;
	private int currentIndex;
	
	public OperateOrderedArrayWithoutIndex(int length){
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
	
	public void remove(int data){
		int index = getIndex(data);
		if(index!=-1){
			if(index<currentIndex-1){
				for(int i=index;i<currentIndex-1;i++){
					datas[i]=datas[i+1];
				}
			}
			if(index<=currentIndex-1){
				currentIndex--;
			}
		}
	}
	
	public Integer searchOne(int data){
		int index = getIndex(data);
		if(index!=-1){
			return datas[index];
		}else{
			return null;
		}
	}
	
	private int getIndex(int data){
		int index =-1;
		for(int i=0;i<currentIndex;i++){
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
