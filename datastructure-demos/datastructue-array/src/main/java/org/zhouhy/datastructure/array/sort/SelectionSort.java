package org.zhouhy.datastructure.array.sort;

/**
 * 与冒泡法排序相比，选择法排序有助于减少交换次数
 * */
public class SelectionSort {
	
	public void selectionSort1(int array[]){
		int length = array.length;
		for(int i=0;i<length-1;i++){
			int minIndex = i;
			for(int j=i+1;j<length;j++){
				if(array[minIndex]<array[j]){
					minIndex = j;
				}
			}
			if(minIndex!=i){
				swap(array,minIndex,i);
			}			
		}
	}
	
	
	public void selectionSort2(int array[]){
		int length = array.length;
		for(int i=length-1;i>0;i--){
			int minIndex = i;
			for(int j=0;j<i;j++){
				if(array[minIndex]<array[j]){
					minIndex = j;
				}
			}
			if(minIndex!=i){
				swap(array,minIndex,i);
			}			
		}
	}
	
	private void swap(int[] array,int i,int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
