package org.zhouhy.datastructure.linkedlist.singledirection;

import static org.junit.Assert.*;

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
	
	
	
	@After
	public void destroy(){
		System.out.println("≤‚ ‘Ω· ¯");
	}

}
