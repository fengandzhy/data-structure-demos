package org.zhouhy.datastructure.linkedlist.singledirection;

import java.util.ArrayList;
import java.util.List;

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
	
	public void insertNodeFromEnd(int id){
		LinkedListNode node = new LinkedListNode(id);		
		if(lastNode == null) {			
			firstNode = node;
		}else{
			lastNode.setNext(node);
		}		
		lastNode = node;
	}
	
	public List<LinkedListNode> findById(int id){
		List<LinkedListNode> list = new ArrayList<>();
		LinkedListNode node = firstNode;
		while(node!=null){
			if(id == node.getId()){
				list.add(node);
			}
			node = node.getNext();
		}
		return list;
	}
	
	public void removeEnd(){
		LinkedListNode currentNode = firstNode;	
		LinkedListNode previousNode = null;
		if(currentNode!=null){
			while(currentNode.getNext()!=null){
				previousNode = currentNode;
				currentNode = currentNode.getNext();
			}
			previousNode.setNext(null);
			lastNode = previousNode;
		}		
	}
	
	public void removeById(int id){
		LinkedListNode currentNode = firstNode;		
		LinkedListNode previousNode = null;
		while(currentNode!=null){
			LinkedListNode nextNode = currentNode.getNext();
			if(currentNode.getId() == id){				
				if(previousNode!=null){
					previousNode.setNext(nextNode);
				}else{
					firstNode = nextNode;
				}				
				if(nextNode == null){
					lastNode = previousNode;
				}				
			}else{
				previousNode = currentNode;				
			}
			currentNode = nextNode;
		}		
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
