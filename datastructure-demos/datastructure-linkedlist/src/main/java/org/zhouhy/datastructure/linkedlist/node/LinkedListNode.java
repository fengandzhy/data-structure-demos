package org.zhouhy.datastructure.linkedlist.node;

public class LinkedListNode {
	private int id;
	private LinkedListNode next;	
	public LinkedListNode(int id) {
		super();
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	public LinkedListNode getNext() {
		return next;
	}
	public void setNext(LinkedListNode next) {
		this.next = next;
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("{ id=");
		sb.append(id);
		sb.append(",");
		if(this.getNext()!=null){
			sb.append("next="+next.getId());
		}
		sb.append("}");
		return sb.toString();
	}	
}
