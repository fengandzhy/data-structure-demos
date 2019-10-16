package org.zhouhy.datastructure.linkedlist.singledirection;

import org.zhouhy.datastructure.linkedlist.node.LinkedListNode;

public class MyQueueByLinkedList {
	
	private DoubleEndLinkedList doubleEndLinkedList = new DoubleEndLinkedList();
	
	public void insert(int data){
		doubleEndLinkedList.insertNodeFromHead(data);
	}
	
	public Integer remove(){
		LinkedListNode  node = doubleEndLinkedList.getLastNode();
		if(node == null){
			return null;
		}
		doubleEndLinkedList.removeEnd();
		int size = doubleEndLinkedList.size();
		return node.getId();
	}
	
	public Integer getFirst(){
		LinkedListNode  node = doubleEndLinkedList.getFirstNode();
		if(node == null){
			return null;
		}
		return node.getId();
	}
	
	public Integer getLast(){
		LinkedListNode  node = doubleEndLinkedList.getLastNode();
		if(node == null){
			return null;
		}
		return node.getId();
	}
	
	public int size(){
		return doubleEndLinkedList.size();
	}
}
