package org.zhouhy.recursion.fibonacci;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciArrayTest {
	
	private FibonacciArray fibonacciArray;
	
	@Before
	public void init(){
		System.out.println("测试开始");		
	}
	
	@Test
	public void testGetValueFromIndex1(){
		fibonacciArray = new FibonacciArray();
		int value0 = fibonacciArray.getValueFromIndex(0);
		int value1 = fibonacciArray.getValueFromIndex(1);		
		assertTrue(value0==0 && value1 == 1);
		
		int value2 = fibonacciArray.getValueFromIndex(2);
		int value3 = fibonacciArray.getValueFromIndex(3);
		assertTrue(value2==1 && value3 == 2);
	}
	
	@Test
	public void testCaculateBeforeIndex(){
		fibonacciArray = new FibonacciArray();
		int value0 = fibonacciArray.caculateBeforeIndex(0);
		int value1 = fibonacciArray.caculateBeforeIndex(1);		
		assertTrue(value0==0 && value1 == 1);
		
		int value2 = fibonacciArray.caculateBeforeIndex(2);
		int value3 = fibonacciArray.caculateBeforeIndex(5);
		assertTrue(value2==2 && value3 == 12);
	}
	
	@After
	public void destory(){
		System.out.println("测试开始");		
	}
}
