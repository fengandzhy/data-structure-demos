package org.zhouhy.datastructure.linkedlist.singledirection;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyStackByLinkedListTest {
	
	private MyStackByLinkedList myStackByLinkedList;
	
	@Before
	public void init(){
		System.out.println("ø™ º≤‚ ‘");
	}
	
	@Test
	public void testPush() {
		myStackByLinkedList = new MyStackByLinkedList();
		myStackByLinkedList.push(1);
		assertTrue(myStackByLinkedList.peek() == 1);
		myStackByLinkedList.push(3);
		assertTrue(myStackByLinkedList.peek() == 3 && myStackByLinkedList.size() == 2);
	}
	
	@Test
	public void testpop() {
		myStackByLinkedList = new MyStackByLinkedList();
		myStackByLinkedList.push(1);		
		myStackByLinkedList.push(3);
		myStackByLinkedList.push(5);
		myStackByLinkedList.push(7);
		myStackByLinkedList.push(9);
		
		int number = myStackByLinkedList.pop();
		assertTrue(myStackByLinkedList.peek() == 7 && number == 9);
	}
	
	@Test
	public void testisEmpty() {
		myStackByLinkedList = new MyStackByLinkedList();
		assertTrue(myStackByLinkedList.isEmpty());
		myStackByLinkedList.push(1);		
		myStackByLinkedList.push(3);
		assertTrue(!myStackByLinkedList.isEmpty());
		
		myStackByLinkedList.pop();
		myStackByLinkedList.pop();
		assertTrue(myStackByLinkedList.isEmpty());		
	}
	
	
	
	@After
	public void destroy(){
		System.out.println("≤‚ ‘Ω· ¯");
	}

}
