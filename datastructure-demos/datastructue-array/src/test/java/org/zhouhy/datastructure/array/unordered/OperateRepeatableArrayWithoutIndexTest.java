package org.zhouhy.datastructure.array.unordered;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperateRepeatableArrayWithoutIndexTest {

	private OperateRepeatableArrayWithoutIndex operateRepeatableArrayWithoutIndex;
	
	@Before
	public void init(){
		System.out.println("≤‚ ‘ø™ º");
		operateRepeatableArrayWithoutIndex = new OperateRepeatableArrayWithoutIndex(100);
	}
	
	@Test
	public void testInsert() {
		operateRepeatableArrayWithoutIndex.insert(5);
		int currentIndex = operateRepeatableArrayWithoutIndex.getCurrentIndex();
		assertTrue (currentIndex == 1);
	}
	
	@Test
	public void testRemove1() {
		operateRepeatableArrayWithoutIndex.insert(5);
		operateRepeatableArrayWithoutIndex.insert(5);
		operateRepeatableArrayWithoutIndex.insert(3);
		operateRepeatableArrayWithoutIndex.insert(6);
		operateRepeatableArrayWithoutIndex.insert(5);
		
		operateRepeatableArrayWithoutIndex.remove(5);
		
		int currentIndex = operateRepeatableArrayWithoutIndex.getCurrentIndex();
		int[] datas = operateRepeatableArrayWithoutIndex.getDatas();
		assertTrue (currentIndex == 2 && datas[0]==3 && datas[1] ==6);
	}
	
	@Test
	public void testRemove2() {
		operateRepeatableArrayWithoutIndex.insert(5);
		operateRepeatableArrayWithoutIndex.insert(5);
		operateRepeatableArrayWithoutIndex.insert(3);
		operateRepeatableArrayWithoutIndex.insert(6);
		operateRepeatableArrayWithoutIndex.insert(5);
		
		operateRepeatableArrayWithoutIndex.remove(7);
		
		int currentIndex = operateRepeatableArrayWithoutIndex.getCurrentIndex();
		
		assertTrue (currentIndex == 5);
	}
	
	@Test
	public void testSearchData1() {
		operateRepeatableArrayWithoutIndex.insert(5);
		operateRepeatableArrayWithoutIndex.insert(5);
		operateRepeatableArrayWithoutIndex.insert(3);
		operateRepeatableArrayWithoutIndex.insert(6);
		operateRepeatableArrayWithoutIndex.insert(5);
		
		List<Integer> result = operateRepeatableArrayWithoutIndex.searchData(5);		
		assertTrue (result.size()==3);
	}
	
	
	@After
	public void destory() {
		System.out.println("≤‚ ‘Ω· ¯");
	}
}
