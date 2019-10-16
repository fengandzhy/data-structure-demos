package org.zhouhy.datastructure.linkedlist.ordered;

import java.util.ArrayList;
import java.util.List;

import org.zhouhy.datastructure.linkedlist.node.LinkedListNode;

public class OrderedLinkList {
private LinkedListNode firstNode;
	
	public void insertNode(int id){
		LinkedListNode node = new LinkedListNode(id);
		LinkedListNode currentNode = firstNode;
		LinkedListNode previousNode = null;
		
		while(currentNode!=null){
			if(currentNode.getId()<id){
				previousNode = currentNode;
				currentNode = currentNode.getNext();
			}else{				
				break;
			}
		}
		
		if(previousNode == null){
			LinkedListNode tempNode = firstNode;
			firstNode = node;
			node.setNext(tempNode);
			return;
		}
		
		previousNode.setNext(node);
		node.setNext(currentNode);
	}
	
	public LinkedListNode removeOne(){
		LinkedListNode tempNode =  firstNode;
		firstNode = tempNode.getNext();
		return tempNode;
	}
	
	public int indexOf(int id){
		int index = -1;		
		LinkedListNode tempNode =  firstNode;
		while(tempNode!=null){
			if(tempNode.getId() != id){
				tempNode = tempNode.getNext();
			}else{
				index++;
				break;
			}
			index++;
		}
		
		return index;
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
