package org.zhouhy.datastructure.array.ordered;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {

	private BinarySearch binarySearch;
	
	@Before
	public void init(){
		System.out.println("²âÊÔ¿ªÊ¼");
		this.binarySearch = new BinarySearch(100);
	}
	
	@Test
	public void testBinarySearch1() {
		binarySearch.insert(3);
		binarySearch.insert(5);
		binarySearch.insert(2);
		binarySearch.insert(4);
		binarySearch.insert(7);
		
		int index = binarySearch.binarySearch(4);
		
		assertTrue (index == 2);
	}
	
	@Test
	public void testBinarySearch2() {
		binarySearch.insert(3);
		binarySearch.insert(5);
		binarySearch.insert(2);
		binarySearch.insert(4);
		binarySearch.insert(7);
		
		int index = binarySearch.binarySearch(2);
		
		assertTrue (index == 0);
	}
	
	@Test
	public void testBinarySearch3() {
		binarySearch.insert(3);
		binarySearch.insert(5);
		binarySearch.insert(2);
		binarySearch.insert(4);
		binarySearch.insert(7);
		
		int index = binarySearch.binarySearch(5);
		
		assertTrue (index == 3);
	}
	
	@Test
	public void testBinarySearch4() {
		binarySearch.insert(3);
		binarySearch.insert(5);
		binarySearch.insert(2);
		binarySearch.insert(4);
		binarySearch.insert(7);
		
		int index = binarySearch.binarySearch(6);
		
		assertTrue (index == -1);
	}
	
	@Test
	public void testBinarySearch5() {
		binarySearch.insert(0);
		binarySearch.insert(1);
		binarySearch.insert(2);
		
		
		int index = binarySearch.binarySearch(2);
		
		assertTrue (index == 2);
	}
	
	@After
	public void destory() {
		System.out.println("²âÊÔ½áÊø");
	}

}
