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
	
	public void sort(int[] array,int beginIndex,int center,int endIndex) {
		
		int[] leftArray = new int[center-beginIndex];
		int[] rightArray = new int[endIndex-center-1];
		
		
	}
}
