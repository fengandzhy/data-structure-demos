package org.zhouhy.datastructure.stack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BracketCheckerTest {

	private BracketChecker bracketChecker;
	
	@Before
	public void init(){
		System.out.println("²âÊÔ¿ªÊ¼");
		this.bracketChecker = new BracketChecker();
	}
	
	@Test
	public void test1() {
		String str = "aa(aa[{}]asse)";
		boolean b = bracketChecker.checkBracket(str);
		assertTrue(b);
	}
	
	@Test
	public void test2() {
		String str = "aa(aa[{]}asse)";
		boolean b = bracketChecker.checkBracket(str);
		assertTrue(!b);
	}
	
	@Test
	public void test3() {
		String str = "aa(aa[{}]asse";
		boolean b = bracketChecker.checkBracket(str);
		assertTrue(!b);
	}
	
	@Test
	public void test4() {
		String str = "aabb";
		boolean b = bracketChecker.checkBracket(str);
		assertTrue(b);
	}
	
	@After
	public void destory() {
		System.out.println("²âÊÔ½áÊø");
	}

}
