package org.zhouhy.datastructure.stack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringReverseTest {
	
	private StringReverse strReverse;
	
	@Before
	public void init(){
		System.out.println("²âÊÔ¿ªÊ¼");
		this.strReverse = new StringReverse();
	}
	
	@Test
	public void test() {
		String str = strReverse.reverse("Hello!");
		assertTrue(str.equals("!olleH"));
	}
	
	@After
	public void destory() {
		System.out.println("²âÊÔ½áÊø");
	}

}
