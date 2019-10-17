package org.zhouhy.recursion.factorial;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FactorialDemoTest {

	private FactorialDemo factorialDemo;
	
	@Before
	public void init(){
		System.out.println("测试开始");		
	}
	
	@Test
	public void testFactorialInt() {
		factorialDemo = new FactorialDemo();
		int n = factorialDemo.factorialInt(5);
		assertTrue(n == 120);
	}
	
	@Test
	public void testFactorialBigInteger() {
		factorialDemo = new FactorialDemo();
		BigInteger n = factorialDemo.factorialBigInteger(new BigInteger("100"));
		System.out.println(n);
	}
	
	@After
	public void destory(){
		System.out.println("测试开始");		
	}

}
