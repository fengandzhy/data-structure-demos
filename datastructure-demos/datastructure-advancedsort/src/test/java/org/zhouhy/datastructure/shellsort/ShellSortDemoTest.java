package org.zhouhy.datastructure.shellsort;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShellSortDemoTest {

	private ShellSortDemo shellSortDemo;
	
	@Before
	public void init(){
		System.out.println("ø™ º≤‚ ‘");
	}
	
	@Test
	public void test() {
		shellSortDemo = new ShellSortDemo();
		int[] as = new int[]{3,5,4,8,7,90,80,88};
		shellSortDemo.shellsort(as);
	}
	
	@After
	public void destroy(){
		System.out.println("≤‚ ‘Ω· ¯");
	}

}
