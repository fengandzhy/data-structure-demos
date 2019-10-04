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
			index++;
		}		
		for(int i=currentIndex;i>index;i--){
			datas[i] = datas[i-1];			
		}		
		datas[index] = data;
		currentIndex++;
		return index;
	}
	
	public void remove(int data){
		int index = -1;
		for(int i=0;i<currentIndex;i++){
			if(datas[i] == data){
				index =i;
				break;
			}
		}
		for(int i=index;i<currentIndex;i++){
			datas[i] = datas[i+1];
		}		
		currentIndex--;
	}
	
	public void printData(){
//		for(int i=0;i<currentIndex; i++){
//			System.out.println(datas[i]);
//		}
		for(int data:datas){
			System.out.println(data);
		}
		System.out.println("==========================================");
	}
	
	public static void main(String args[]){
		OrderedArrayWithIndex orderedArrayWithIndex = new OrderedArrayWithIndex(10);
		orderedArrayWithIndex.insert(2);
		orderedArrayWithIndex.insert(1);
		orderedArrayWithIndex.insert(8);
		orderedArrayWithIndex.insert(3);
		
		orderedArrayWithIndex.printData();
		
		orderedArrayWithIndex.remove(3);
		
		orderedArrayWithIndex.printData();
	}
}
