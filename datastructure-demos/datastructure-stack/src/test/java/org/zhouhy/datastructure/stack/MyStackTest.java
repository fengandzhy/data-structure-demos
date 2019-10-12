package org.zhouhy.datastructure.stack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyStackTest {

	private MyStack myStack;
	
	@Before
	public void init(){
		System.out.println("≤‚ ‘ø™ º");
		this.myStack = new MyStack(10);
	}
	
	@Test
	public void test1() {
		myStack.push(2);
		assertTrue(myStack.getTopIndex()==0);		
	}
	
	@Test
	public void test2() {
		myStack.push(2);
		myStack.push(4);
		myStack.push(6);
		myStack.push(8);		
		int data1 = myStack.pop();
		int data2 = myStack.pop();
		assertTrue(myStack.getTopIndex()==1 && data1==8 && data2==6);		
	}
	
	@After
	public void destory() {
		System.out.println("≤‚ ‘Ω· ¯");
	}

}
