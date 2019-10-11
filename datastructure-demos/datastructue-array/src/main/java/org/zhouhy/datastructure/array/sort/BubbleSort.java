package org.zhouhy.datastructure.array.sort;

/**
 * 总之，冒泡法排序有两个循环i,j，
 * 外层的i循环控制元素的比较范围(循环次数,这个循环次数始终都应该比数组长度少1)，
 * 内层的j循环负责具体的比较，升序还是降序。
 * */
public class BubbleSort {
	
	/**
	 * 这是一个把元素沉下去的比较方法,就是第一次循环会把其中一个最小的元素沉入数组最末尾
	 * 所以i的起始值就是第一个元素沉下去的位置，以此类推，i始终都是本次循环这个元素的沉入的位置
	 * */
	public void bubbleSort1(int array[]){
		int length = array.length;
		for(int i = length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(array[j]<array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	/**
	 * 这就是一种浮上来的冒泡排序，思路跟上面这个差不多
	 * */
	public void bubbleSort2(int array[]){
		int length = array.length;
		for(int i = 0;i<length-1;i++){
			for(int j=length-1;j>i;j--){
				if(array[j]<array[j-1]){
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
	}
	
	/**
	 * 这也是一种沉下去的排序方法，跟上两种不同的是i不再是元素沉下去的位置。
	 * 
	 * */
	public void bubbleSort3(int array[]){
		int length = array.length;
		for(int i = 1;i<length;i++){
			for(int j=0;j<length-i;j++){
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	/**
	 * 外层的某个元素跟整个内层比
	 * */
	public void bubbleSort4(int array[]){
		int length = array.length;
		for(int i = length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(array[i]<array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
}
