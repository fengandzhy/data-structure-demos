package org.zhouhy.datastructure.linkedlist.ordered;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.zhouhy.datastructure.linkedlist.node.LinkedListNode;


public class OrderedLinkListTest {
	
	private OrderedLinkList orderedLinkList;
	
	@Before
	public void init(){
		System.out.println("≤‚ ‘ø™ º");
	}
	
	@Test
	public void testInsert() {
		orderedLinkList = new OrderedLinkList();
		orderedLinkList.insertNode(2);
		orderedLinkList.insertNode(1);
		orderedLinkList.insertNode(8);
		
		orderedLinkList.insertNode(4);
		orderedLinkList.insertNode(3);
		orderedLinkList.insertNode(6);
		
		orderedLinkList.insertNode(7);
		orderedLinkList.insertNode(9);
		orderedLinkList.insertNode(5);
		
		int size = orderedLinkList.size();
		
		int first = orderedLinkList.getFirstNode().getId();
		
		int a = orderedLinkList.indexOf(5);
		
		assertTrue(size == 9 && first == 1 && a ==4);
	}
	
	@Test
	public void testRemove() {
		orderedLinkList = new OrderedLinkList();
		orderedLinkList.insertNode(1);
		orderedLinkList.insertNode(2);
		orderedLinkList.insertNode(3);
		
		LinkedListNode node = orderedLinkList.removeOne();
		int size = orderedLinkList.size();
		assertTrue(size == 2 && node.getId()==1);
	}
	
	
	@Test
	public void testFindById() {
		orderedLinkList = new OrderedLinkList();
		orderedLinkList.insertNode(3);
		orderedLinkList.insertNode(2);
		orderedLinkList.insertNode(3);
		orderedLinkList.insertNode(1);
		orderedLinkList.insertNode(2);
		
		List<LinkedListNode> list = orderedLinkList.findById(3);		
		assertTrue(list.size()==2);
	}
	
	@Test
	public void testRemoveById() {
		orderedLinkList = new OrderedLinkList();
		orderedLinkList.insertNode(3);
		orderedLinkList.insertNode(2);
		orderedLinkList.insertNode(3);
		orderedLinkList.insertNode(1);
		orderedLinkList.insertNode(2);
		
		orderedLinkList.removeById(3);
		int size = orderedLinkList.size();
		
		LinkedListNode firstNode = orderedLinkList.getFirstNode();
		assertTrue(size==3 && firstNode.getId()==1);
	}
	
	@After
	public void destroy(){
		System.out.println("≤‚ ‘Ω· ¯");
	}
}
