package org.zhouhy.datastructure.linkedlist.singledirection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyQueueByLinkedListTest {
	private MyQueueByLinkedList myQueueByLinkedList;
	
	@Before
	public void init(){
		System.out.println("ø™ º≤‚ ‘");
	}
	
	@Test
	public void testInsert(){
		myQueueByLinkedList = new MyQueueByLinkedList();
		myQueueByLinkedList.insert(1);
		assertTrue(myQueueByLinkedList.size() ==1);
	}
	
	@Test
	public void testRemove(){
		myQueueByLinkedList = new MyQueueByLinkedList();
		myQueueByLinkedList.insert(1);
		myQueueByLinkedList.insert(3);
		myQueueByLinkedList.insert(5);
		myQueueByLinkedList.insert(7);
		myQueueByLinkedList.insert(9);
		
		myQueueByLinkedList.remove();
		int size = myQueueByLinkedList.size();
		assertTrue(myQueueByLinkedList.size() ==4 && myQueueByLinkedList.getLast()==3);
	}
	
	@After
	public void destroy(){
		System.out.println("≤‚ ‘Ω· ¯");
	}
}
