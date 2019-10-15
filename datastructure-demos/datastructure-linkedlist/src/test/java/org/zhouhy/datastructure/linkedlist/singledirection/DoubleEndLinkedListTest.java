package org.zhouhy.datastructure.linkedlist.singledirection;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.zhouhy.datastructure.linkedlist.node.LinkedListNode;

public class DoubleEndLinkedListTest {

	private DoubleEndLinkedList doubleEndLinkedList;
	
	@Before
	public void init() {
		System.out.println("≤‚ ‘ø™ º");
	}
	
	@Test
	public void testInsertNodeFromHead() {
		doubleEndLinkedList = new DoubleEndLinkedList();
		doubleEndLinkedList.insertNodeFromHead(1);
		doubleEndLinkedList.insertNodeFromHead(3);
		doubleEndLinkedList.insertNodeFromHead(5);
		doubleEndLinkedList.insertNodeFromHead(2);
		
		LinkedListNode lastNode = doubleEndLinkedList.getLastNode();
		LinkedListNode firstNode = doubleEndLinkedList.getFirstNode();
		int size = doubleEndLinkedList.size();
		
		assertTrue(size ==4 && lastNode.getId()==1 && firstNode.getId()==2);
		
	}
	
	@Test
	public void testInsertNodeFromEnd() {
		doubleEndLinkedList = new DoubleEndLinkedList();
		doubleEndLinkedList.insertNodeFromEnd(1);
		doubleEndLinkedList.insertNodeFromEnd(3);
		doubleEndLinkedList.insertNodeFromEnd(2);
		doubleEndLinkedList.insertNodeFromEnd(5);
		doubleEndLinkedList.insertNodeFromEnd(5);
		
		LinkedListNode lastNode = doubleEndLinkedList.getLastNode();
		LinkedListNode firstNode = doubleEndLinkedList.getFirstNode();
		int size = doubleEndLinkedList.size();
		
		assertTrue(size ==5 && lastNode.getId()==5 && firstNode.getId()==1);
		
	}
	
	@Test
	public void testRemoveById1() {
		doubleEndLinkedList = new DoubleEndLinkedList();		
		doubleEndLinkedList.insertNodeFromEnd(1);		
		doubleEndLinkedList.removeById(1);		
		LinkedListNode lastNode = doubleEndLinkedList.getLastNode();
		LinkedListNode firstNode = doubleEndLinkedList.getFirstNode();
		int size = doubleEndLinkedList.size();		
		assertTrue(size ==0 && lastNode==null && firstNode==null);		
	}
	
	@Test
	public void testRemoveById2() {
		doubleEndLinkedList = new DoubleEndLinkedList();		
		
		doubleEndLinkedList.insertNodeFromEnd(1);
		doubleEndLinkedList.insertNodeFromHead(3);
		doubleEndLinkedList.insertNodeFromHead(5);
		doubleEndLinkedList.insertNodeFromEnd(5);
		doubleEndLinkedList.insertNodeFromHead(2);
		doubleEndLinkedList.insertNodeFromEnd(5);
		
		doubleEndLinkedList.removeById(5);		
		LinkedListNode lastNode = doubleEndLinkedList.getLastNode();
		LinkedListNode firstNode = doubleEndLinkedList.getFirstNode();
		int size = doubleEndLinkedList.size();		
		assertTrue(size ==3 && firstNode.getId()==2 && lastNode.getId()==1);		
	}
	
	@Test
	public void testFindById() {
		doubleEndLinkedList = new DoubleEndLinkedList();		
		
		doubleEndLinkedList.insertNodeFromEnd(1);
		doubleEndLinkedList.insertNodeFromHead(3);
		doubleEndLinkedList.insertNodeFromHead(5);
		doubleEndLinkedList.insertNodeFromEnd(5);
		doubleEndLinkedList.insertNodeFromHead(2);
		doubleEndLinkedList.insertNodeFromEnd(5);
		
		List<LinkedListNode> nodes = doubleEndLinkedList.findById(5);
		
		int size = nodes.size();		
		assertTrue(size ==3);		
	}
	
	
	
	
	@After
	public void destroy(){
		System.out.println("≤‚ ‘Ω· ¯");
	}

}
