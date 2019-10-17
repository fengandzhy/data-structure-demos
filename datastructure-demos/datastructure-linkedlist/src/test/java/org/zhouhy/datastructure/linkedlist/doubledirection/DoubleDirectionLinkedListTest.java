package org.zhouhy.datastructure.linkedlist.doubledirection;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.zhouhy.datastructure.linkedlist.node.DoubleDirectionNode;

public class DoubleDirectionLinkedListTest {
	
	private DoubleDirectionLinkedList doubleDirectionLinkedList;
	
	@Before
	public void init(){
		System.out.println("≤‚ ‘ø™ º");
	}
	
	@Test
	public void testInsertFromFirst() {
		doubleDirectionLinkedList = new DoubleDirectionLinkedList();		
		doubleDirectionLinkedList.insertFromFirst(1);
		DoubleDirectionNode firstNode = doubleDirectionLinkedList.getFirstNode();
		DoubleDirectionNode lastNode = doubleDirectionLinkedList.getLastNode();
		assertTrue(firstNode == lastNode);
		
		doubleDirectionLinkedList.insertFromFirst(2);
		firstNode = doubleDirectionLinkedList.getFirstNode();
		lastNode = doubleDirectionLinkedList.getLastNode();		
		assertTrue(firstNode.getId() == 2 && lastNode.getId() == 1);		
	}
	
	@Test
	public void testInsertFromLast() {
		doubleDirectionLinkedList = new DoubleDirectionLinkedList();		
		doubleDirectionLinkedList.insertFromLast(1);
		DoubleDirectionNode firstNode = doubleDirectionLinkedList.getFirstNode();
		DoubleDirectionNode lastNode = doubleDirectionLinkedList.getLastNode();
		assertTrue(firstNode == lastNode);
		
		doubleDirectionLinkedList.insertFromLast(2);
		firstNode = doubleDirectionLinkedList.getFirstNode();
		lastNode = doubleDirectionLinkedList.getLastNode();		
		assertTrue(firstNode.getId() == 1 && lastNode.getId() == 2 && doubleDirectionLinkedList.size()==2);		
	}
	
	
	
	@Test
	public void testInsertAfterId() {
		doubleDirectionLinkedList = new DoubleDirectionLinkedList();		
		doubleDirectionLinkedList.insertFromFirst(1);		
		doubleDirectionLinkedList.insertFromFirst(2);
		doubleDirectionLinkedList.insertFromFirst(3);
		
		doubleDirectionLinkedList.insertAfterId(3, 5);
		DoubleDirectionNode firstNode = doubleDirectionLinkedList.getFirstNode();
		DoubleDirectionNode lastNode = doubleDirectionLinkedList.getLastNode();		
		assertTrue(firstNode.getId() == 3 && lastNode.getId() == 1 && firstNode.getNext().getId() ==5);		
	}
	
	@Test
	public void testRemoveOndFromFirst() {
		doubleDirectionLinkedList = new DoubleDirectionLinkedList();		
		doubleDirectionLinkedList.insertFromFirst(1);		
		doubleDirectionLinkedList.insertFromFirst(2);
		doubleDirectionLinkedList.insertFromFirst(3);
		
		doubleDirectionLinkedList.insertAfterId(3, 5);
		DoubleDirectionNode node = doubleDirectionLinkedList.removeOneFromFirst();
		DoubleDirectionNode firstNode = doubleDirectionLinkedList.getFirstNode();
		
		assertTrue(doubleDirectionLinkedList.size() == 3 && firstNode.getId() == 5 && firstNode.getNext().getId() ==2);		
	}
	
	@After
	public void destroy(){
		System.out.println("≤‚ ‘Ω· ¯");
	}

}
