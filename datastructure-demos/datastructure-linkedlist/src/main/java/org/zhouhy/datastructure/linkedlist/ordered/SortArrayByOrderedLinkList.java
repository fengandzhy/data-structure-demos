package org.zhouhy.datastructure.linkedlist.ordered;

public class SortArrayByOrderedLinkList {
	
	private OrderedLinkList orderedLinkList = new OrderedLinkList();
	
	public void sort(int array[]){
		for(int i=0;i<array.length;i++){
			orderedLinkList.insertNode(array[i]);
		}
		
		for(int i=0;i<array.length;i++){
			array[i] = orderedLinkList.removeOne().getId();
		}
	}
}
