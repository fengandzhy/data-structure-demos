package org.zhouhy.datastructure.linkedlist.singledirection;

import java.util.ArrayList;
import java.util.List;

import org.zhouhy.datastructure.linkedlist.node.LinkedListNode;

public class SingleDLinkedList {
	
	private LinkedListNode firstNode;
	
	public void insertNode(int id){
		LinkedListNode node = new LinkedListNode(id);
		node.setNext(firstNode);
		firstNode = node;
	}
	
	public LinkedListNode removeOne(){
		LinkedListNode tempNode =  firstNode;
		firstNode = tempNode.getNext();
		return tempNode;
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
}
