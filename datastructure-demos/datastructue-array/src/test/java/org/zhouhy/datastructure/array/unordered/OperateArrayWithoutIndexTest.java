package org.zhouhy.datastructure.array.unordered;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperateArrayWithoutIndexTest {

	private OperateArrayWithoutIndex operateArrayWithoutIndex;
	
	@Before
	public void init(){
		System.out.println("≤‚ ‘ø™ º");
		operateArrayWithoutIndex = new OperateArrayWithoutIndex(100);
	}
	
	@Test
	public void testInsert() {
		operateArrayWithoutIndex.insert(5);
		int currentIndex = operateArrayWithoutIndex.getCurrentIndex();
		assertTrue (currentIndex == 1);
	}
	
	@Test
	public void testRemove1() {
		operateArrayWithoutIndex.insert(5);
		operateArrayWithoutIndex.remove(2);
		int currentIndex = operateArrayWithoutIndex.getCurrentIndex();
		int[] datas = operateArrayWithoutIndex.getDatas();
		assertTrue (currentIndex == 1 && datas[0]==5);
	}
	
	@Test
	public void testRemove2() {
		operateArrayWithoutIndex.insert(5);
		operateArrayWithoutIndex.insert(2);
		operateArrayWithoutIndex.insert(3);
		
		operateArrayWithoutIndex.remove(2);
		int currentIndex = operateArrayWithoutIndex.getCurrentIndex();
		int[] datas = operateArrayWithoutIndex.getDatas();
		assertTrue (currentIndex == 2 && datas[0]==5 && datas[1]==3);
	}
	
	@Test
	public void testSearch() {
		operateArrayWithoutIndex.insert(5);
		operateArrayWithoutIndex.insert(2);
		operateArrayWithoutIndex.insert(3);
		
		Integer resutlt1 = operateArrayWithoutIndex.searchOne(2);
		Integer resutlt2 = operateArrayWithoutIndex.searchOne(4);
		
		assertTrue (resutlt1 == 2 && resutlt2 == null);
	}
	
	@After
	public void destory() {
		System.out.println("≤‚ ‘Ω· ¯");
	}

}
