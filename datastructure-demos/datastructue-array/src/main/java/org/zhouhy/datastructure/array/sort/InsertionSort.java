package org.zhouhy.datastructure.array.sort;

/**
 * 插入法排序
 * 基本思路就是，拿数组的第n个元素去和在它之前的n-1个元素比，使得n整个元素找到一个合适的位置，从而实现了数组的排序
 * 第一个循环是取第n个元素.
 * 第二个循环是逐步往前比
 * */
public class InsertionSort {
	
	public void insertionSort1(int array[]){
		int length = array.length;
		for(int i=1;i<length;i++){
			int index = i;
			int temp = array[i];
			for(int j=i;j>0;j--){
				if(temp<array[j-1]){
					array[j] = array[j-1];
					index = j-1;
				}else{
					break;
				}
			}
			array[index]=temp;
		}
	}
}
