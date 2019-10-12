package org.zhouhy.datastructure.queue;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyQueueTest {
	private MyQueue myQueue;
	
	@Before
	public void init(){
		System.out.println("²âÊÔ¿ªÊ¼");
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
	
	@Test
	public void test6() {
		myQueue.insert(1);
		myQueue.insert(2);
		myQueue.insert(3);
		myQueue.insert(4);
		
		Integer data1 = myQueue.remove();
		Integer data2 = myQueue.remove();
		Integer data3 = myQueue.remove();
		
		myQueue.insert(1);
		myQueue.insert(2);
		myQueue.insert(3);
		myQueue.insert(4);
		
		myQueue.insert(5);
		myQueue.insert(6);
		myQueue.insert(7);
		myQueue.insert(8);
		
		Integer data4 = myQueue.remove();
		Integer data5 = myQueue.remove();
		Integer data6 = myQueue.remove();
		
		Integer data7 = myQueue.remove();
		Integer data8 = myQueue.remove();
		Integer data9 = myQueue.remove();
		
		int size = myQueue.getSize();
		assertTrue(data1==1 && data2 == 2 && size == 0 && data3 == 3);
		
		assertTrue(data4==4 && data5 == 1 && data6 == 2 && data7 == 3);
		
		assertTrue(data8==4 && data9 == null);
	}
	
	@After
	public void destory() {
		System.out.println("²âÊÔ½áÊø");
	}

}
