package org.zhouhy.datastructure.linkedlist.singledirection;

import org.zhouhy.datastructure.linkedlist.node.LinkedListNode;

public class DoubleEndLinkedList {
	
	private LinkedListNode firstNode;	
	private LinkedListNode lastNode;
	
	public void insertNodeFromHead(int id){
		LinkedListNode node = new LinkedListNode(id);
		node.setNext(firstNode);
		if(firstNode == null) {			
			lastNode = node;
		}
		firstNode = node;
	}
	
	public int size(){
		int size = 0;
		LinkedListNode node = firstNode;
		while(node!=null){
			size++;
			node = node.getNext();
		}
		return size;
	}
	
	public LinkedListNode getFirstNode() {
		return firstNode;
	}
	public LinkedListNode getLastNode() {
		return lastNode;
	}	
}
