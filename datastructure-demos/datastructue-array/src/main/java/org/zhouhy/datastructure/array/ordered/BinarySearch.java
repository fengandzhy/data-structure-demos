package org.zhouhy.datastructure.array.ordered;

public class BinarySearch {
	private int[] datas;
	private int currentIndex;
	
	public BinarySearch(int length){
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
	
	public int binarySearch(int data){
		int index =-1;
		
		int lowIndex =0;
		int highIndex = currentIndex-1;
		
		while(true){
			
			if(lowIndex>highIndex){
				index =-1;
				break;
			}
			
			index = (lowIndex + highIndex)/2;
			if(data == datas[index]){
				break;
			}
			
			if(data<datas[index]){
				highIndex = index-1;
			}else{
				lowIndex = index +1;
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
