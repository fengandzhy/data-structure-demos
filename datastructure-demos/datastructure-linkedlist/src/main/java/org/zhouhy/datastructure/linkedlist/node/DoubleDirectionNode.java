package org.zhouhy.datastructure.linkedlist.node;

public class DoubleDirectionNode {	
	private int id;
	private DoubleDirectionNode next;
	private DoubleDirectionNode previous;	
	
	public DoubleDirectionNode(int id) {
		super();
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public DoubleDirectionNode getNext() {
		return next;
	}
	public void setNext(DoubleDirectionNode next) {
		this.next = next;
	}
	public DoubleDirectionNode getPrevious() {
		return previous;
	}
	public void setPrevious(DoubleDirectionNode previous) {
		this.previous = previous;
	}	
}
