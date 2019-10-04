package org.zhouhy.datastructure.array.unordered;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;




public class OperateArrayWithIndexTest {

	private OperateArrayWithIndex operateArrayWithIndex;
	
	@Before
	public void init(){
		System.out.println("≤‚ ‘ø™ º");
		operateArrayWithIndex = new OperateArrayWithIndex(100);
	}
	
	@Test
	public void testInsert() {
		int currentIndex = operateArrayWithIndex.insert(5);
		assertTrue (currentIndex == 1);
	}
	
	@Test
	public void testRemove1() {
		operateArrayWithIndex.insert(5);
		Integer currentIndex = operateArrayWithIndex.remove(2);
		assertTrue (currentIndex == 1);
	}
	
	@Test
	public void testRemove2() {		
		Integer currentIndex = operateArrayWithIndex.remove(2);
		assertTrue (currentIndex == 0);
	}
	
	@Test
	public void testRemove3() {	
		operateArrayWithIndex.insert(5);
		operateArrayWithIndex.insert(6);
		Integer currentIndex = operateArrayWithIndex.remove(2);
		assertTrue (currentIndex == 2);
	}
	
	@Test
	public void testRemove4() {	
		operateArrayWithIndex.insert(5);
		operateArrayWithIndex.insert(6);
		operateArrayWithIndex.insert(7);
		operateArrayWithIndex.insert(8);
		Integer currentIndex = operateArrayWithIndex.remove(2);
		int[] datas = operateArrayWithIndex.getDatas();
		assertTrue (currentIndex == 3&&datas[0]==5&&datas[2]==8);
	}
	
	@Test
	public void testSearchOne1() {	
		operateArrayWithIndex.insert(5);		
		Integer data = operateArrayWithIndex.searchOne(1);		
		assertTrue (data == -1);
	}
	
	@Test
	public void testSearchOne2() {	
		operateArrayWithIndex.insert(5);		
		Integer data = operateArrayWithIndex.searchOne(0);		
		assertTrue (data == 5);
	}
	
	@After
	public void destory() {
		System.out.println("≤‚ ‘Ω· ¯");
	}

}
