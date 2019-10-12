package org.zhouhy.datastructure.queue;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyQueueTest {
	private MyQueue myQueue;
	
	@Before
	public void init(){
		System.out.println("≤‚ ‘ø™ º");
		this.myQueue = new MyQueue(5);
	}
	
	@Test
	public void test1() {
		myQueue.insert(1);
		myQueue.insert(2);
		int size = myQueue.getSize();
		assertTrue(size==2);
	}
	
	@Test
	public void test2() {
		myQueue.insert(1);
		myQueue.insert(2);
		myQueue.insert(3);
		myQueue.insert(4);
		myQueue.insert(5);
		myQueue.insert(6);
		int size = myQueue.getSize();
		assertTrue(size==5);
	}
	
	@Test
	public void test3() {
		myQueue.insert(1);
		myQueue.insert(2);
		myQueue.insert(3);
		myQueue.insert(4);
		myQueue.insert(5);
		int data = myQueue.remove();
		myQueue.insert(6);
		int size = myQueue.getSize();
		assertTrue(size==5 && data == 1);
	}
	
	@Test
	public void test4() {
		myQueue.insert(1);
		myQueue.insert(2);
		myQueue.insert(3);
		myQueue.insert(4);
		myQueue.insert(5);
		int data = myQueue.remove();
		myQueue.insert(6);
		myQueue.insert(7);
		int size = myQueue.getSize();
		assertTrue(size==5 && data == 1);
	}
	
	@Test
	public void test5() {
		myQueue.insert(1);
		myQueue.insert(2);
		
		Integer data1 = myQueue.remove();
		Integer data2 = myQueue.remove();
		Integer data3 = myQueue.remove();
		
		int size = myQueue.getSize();
		assertTrue(data1==1 && data2 == 2 && size == 0 && data3 == null);
	}
	
	@After
	public void destory() {
		System.out.println("≤‚ ‘Ω· ¯");
	}

}
