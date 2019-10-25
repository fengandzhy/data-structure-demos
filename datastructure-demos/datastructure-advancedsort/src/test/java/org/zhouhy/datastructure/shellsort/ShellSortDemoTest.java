package org.zhouhy.datastructure.shellsort;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShellSortDemoTest {

	private ShellSortDemo shellSortDemo;
	
	@Before
	public void init(){
		System.out.println("¿ªÊ¼²âÊÔ");
	}
	
	@Test
	public void test() {
		shellSortDemo = new ShellSortDemo();
		int[] as = new int[]{3,5,4,8,7,90,80,88};
		shellSortDemo.shellsort(as);
		for(int i=0;i<as.length;i++){
			System.out.println(as[i]);
		}
	}
	
	@After
	public void destroy(){
		System.out.println("²âÊÔ½áÊø");
	}

}
