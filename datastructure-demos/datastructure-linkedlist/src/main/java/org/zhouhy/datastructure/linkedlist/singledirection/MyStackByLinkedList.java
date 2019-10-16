package org.zhouhy.datastructure.linkedlist.singledirection;

import org.zhouhy.datastructure.linkedlist.node.LinkedListNode;

public class MyStackByLinkedList {
	
	private SingleDLinkedList singleDLinkedList = new SingleDLinkedList();
	
	public void push(int data){		
		singleDLinkedList.insertNode(data);
	}
	
	public Integer pop(){
		LinkedListNode node = singleDLinkedList.removeOne();
		if(node!=null){
			return node.getId();
		}
		return null;
	}
	
	public Integer peek(){
		LinkedListNode firstNode = singleDLinkedList.getFirstNode();
		if(firstNode!=null){
			return firstNode.getId();
		}
		return null;
	}
	
	public boolean isEmpty(){
		return singleDLinkedList.getFirstNode()==null;
	}
	
	public int size(){
		return singleDLinkedList.size();
	}
//	
//	public int getTopIndex(){
//		return this.topIndex;
//	}
}
