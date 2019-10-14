package org.zhouhy.datastructure.linkedlist.singledirection;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.zhouhy.datastructure.linkedlist.node.LinkedListNode;

public class SingleDLinkedListTest {

	private SingleDLinkedList singleDLinkedList;
	
	@Before
	public void init(){
		System.out.println("≤‚ ‘ø™ º");
	}
	
	@Test
	public void testInsert() {
		singleDLinkedList = new SingleDLinkedList();
		singleDLinkedList.insertNode(1);
		singleDLinkedList.insertNode(2);
		singleDLinkedList.insertNode(3);
		int size = singleDLinkedList.size();
		assertTrue(size == 3);
	}
	
	@Test
	public void testRemove() {
		singleDLinkedList = new SingleDLinkedList();
		singleDLinkedList.insertNode(1);
		singleDLinkedList.insertNode(2);
		singleDLinkedList.insertNode(3);
		
		LinkedListNode node = singleDLinkedList.removeOne();
		int size = singleDLinkedList.size();
		assertTrue(size == 2 && node.getId()==3);
	}
	
	
	@Test
	public void testFindById() {
		singleDLinkedList = new SingleDLinkedList();
		singleDLinkedList.insertNode(3);
		singleDLinkedList.insertNode(2);
		singleDLinkedList.insertNode(3);
		singleDLinkedList.insertNode(1);
		singleDLinkedList.insertNode(2);
		
		List<LinkedListNode> list = singleDLinkedList.findById(3);		
		assertTrue(list.size()==2);
	}
	
	@Test
	public void testRemoveById() {
		singleDLinkedList = new SingleDLinkedList();
		singleDLinkedList.insertNode(3);
		singleDLinkedList.insertNode(2);
		singleDLinkedList.insertNode(3);
		singleDLinkedList.insertNode(1);
		singleDLinkedList.insertNode(2);
		
		singleDLinkedList.removeById(3);
		int size = singleDLinkedList.size();
		
		LinkedListNode firstNode = singleDLinkedList.getFirstNode();
		assertTrue(size==3 && firstNode.getId()==2);
	}
	
	@After
	public void destroy(){
		System.out.println("≤‚ ‘Ω· ¯");
	}
	

}
