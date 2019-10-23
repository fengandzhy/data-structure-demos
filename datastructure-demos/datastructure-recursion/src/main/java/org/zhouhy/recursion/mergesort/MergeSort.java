package org.zhouhy.recursion.mergesort;

public class MergeSort {
	
	public void merge(int[] array,int beginIndex,int endIndex) {
		if(beginIndex>=endIndex) {
			return;
		}		
		int mid = (beginIndex+endIndex)/2;
		merge(array,beginIndex,mid);
		merge(array,mid+1,endIndex);
		sort(array,beginIndex,mid,endIndex);		
	}
	
	public void sort(int[] array,int beginIndex,int mid,int endIndex) {
		int tempArray[] = new int[array.length];
		int secondIndex = mid+1;
		int tempIndex=beginIndex;
		int tempIndex1 = beginIndex;
		while(beginIndex<=mid && secondIndex<=endIndex){
			if(array[beginIndex]>=array[secondIndex]){
				tempArray[tempIndex] = array[secondIndex];
				tempIndex++;
				secondIndex++;
			}else{
				tempArray[tempIndex] = array[beginIndex];
				tempIndex++;
				beginIndex++;
			}
		}
		while(beginIndex<=mid){
			tempArray[tempIndex] = array[beginIndex];
			tempIndex++;
			beginIndex++;
		}
		
		while(secondIndex<=endIndex){
			tempArray[tempIndex] = array[secondIndex];
			tempIndex++;
			secondIndex++;
		}
		
		for(int i=tempIndex1;i<=endIndex;i++){
			array[i] = tempArray[i];
 		}		
	}
}
