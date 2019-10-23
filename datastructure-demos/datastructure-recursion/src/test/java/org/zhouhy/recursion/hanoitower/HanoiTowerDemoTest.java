package org.zhouhy.recursion.hanoitower;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HanoiTowerDemoTest {

	private HanoiTowerDemo hanoiTowerDemo;
	
	@Before
	public void init(){
		System.out.println("≤‚ ‘ø™ º");		
	}
	
	@Test
	public void test() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		hanoiTowerDemo = new HanoiTowerDemo();
		hanoiTowerDemo.move(6, "A", "B", "C");
		String str = outContent.toString();		
		String[] strs = str.split("\n");		
		assertTrue(strs.length == Math.pow(2,6)-1);
	}
	
	@After
	public void destory(){
		System.out.println("≤‚ ‘Ω· ¯");		
	}

}
