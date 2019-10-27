package org.zhouhy.datastructure.shellsort;

public class ShellSortDemo1 {
	
	public void shellsort(int[] array){
		int length = array.length;
		int increment = length/2;
		
		while(increment>0){
			for(int i=increment;i<length;i++){
				int index = i;
				int temp = array[i];
				for(int j=i;j>0;j=j-increment){
					
				}
			}
		}
	}
	
}
