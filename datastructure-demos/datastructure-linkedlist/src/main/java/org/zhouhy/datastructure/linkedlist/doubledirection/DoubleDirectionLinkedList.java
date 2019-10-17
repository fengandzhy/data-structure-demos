package org.zhouhy.datastructure.linkedlist.doubledirection;

import org.zhouhy.datastructure.linkedlist.node.DoubleDirectionNode;

/**
 * Ë«¶ËµÄË«ÏòÁ´±í
 */
public class DoubleDirectionLinkedList {

	private DoubleDirectionNode firstNode;
	private DoubleDirectionNode lastNode;

	public void insertFromFirst(int id) {
		DoubleDirectionNode node = new DoubleDirectionNode(id);
		DoubleDirectionNode tempNode = firstNode;
		if (tempNode != null) {
			tempNode.setPrevious(node);
			node.setNext(tempNode);
		} else {
			lastNode = node;
		}
		firstNode = node;
	}

	public void insertFromLast(int id) {
		DoubleDirectionNode node = new DoubleDirectionNode(id);
		DoubleDirectionNode tempNode = lastNode;
		if (tempNode != null) {
			tempNode.setNext(node);
			node.setPrevious(tempNode);
		} else {
			firstNode = node;
		}
		lastNode = node;
	}	
	
	public void insertAfterId(int id,int data) {
		DoubleDirectionNode node = new DoubleDirectionNode(data);
		DoubleDirectionNode tempNode = firstNode;
		while(tempNode!=null) {
			if(tempNode.getId()== id) {
				break;
			}
			tempNode = tempNode.getNext();
		}		
		if(tempNode.getNext()==null) {
			lastNode = node;			
		}else {
			DoubleDirectionNode tempNext = tempNode.getNext();
			node.setNext(tempNext);
			tempNext.setPrevious(node);
		}
		node.setPrevious(tempNode);
		tempNode.setNext(node);
	}
	
	public DoubleDirectionNode removeOneFromFirst() {
		DoubleDirectionNode tempNode = firstNode;
		if(tempNode!=null) {
			firstNode = tempNode.getNext();
			tempNode.setNext(null);
			firstNode.setPrevious(null);
		}
		return tempNode;
	}
	
	public DoubleDirectionNode removeOneFromLast() {
		DoubleDirectionNode tempNode = lastNode;
		if(tempNode!=null) {
			lastNode = tempNode.getPrevious();
			tempNode.setPrevious(null);
			lastNode.setNext(null);
		}
		return tempNode;
	}

	public int size() {
		int index = 0;
		DoubleDirectionNode tempNode = firstNode;
		while (firstNode != null) {
			index++;
			if (tempNode == lastNode) {
				break;
			}
			tempNode = tempNode.getNext();
		}
		return index;
	}

	public DoubleDirectionNode getFirstNode() {
		return firstNode;
	}

	public DoubleDirectionNode getLastNode() {
		return lastNode;
	}	
}
