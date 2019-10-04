package org.zhouhy.datastructure.array.unordered;

public class OperateArrayWithIndex {

	private int[] datas;
	private int currentIndex;
	
	public OperateArrayWithIndex(int length){
		this.datas = new int[length];
	}
	
	public int insert(int data){
		datas[currentIndex] = data;
		currentIndex++;
		return currentIndex;
	}
	
	public int remove(int index){
		if(currentIndex<=0){
			return 0;
		}
		if(index<currentIndex-1){
			for(int i=index;i<currentIndex-1;i++){
				datas[i] = datas[i+1];
			}			
		}		
		if(index<=currentIndex-1){
			currentIndex--;
		}		
		return currentIndex;
	}
	
	public int searchOne(int index){
		if(index<currentIndex){
			return datas[index];
		}
		return -1;
	}

	public int[] getDatas() {
		return datas;
	}	
}
