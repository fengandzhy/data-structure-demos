package org.zhouhy.datastructure.array.ordered;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperateOrderedRepeatedArrayWithoutIndexTest {
	private OperateOrderedRepeatedArrayWithoutIndex operateOrderedRepeatedArrayWithoutIndex;
	
	@Before
	public void init(){
		System.out.println("≤‚ ‘ø™ º");
		this.operateOrderedRepeatedArrayWithoutIndex = new OperateOrderedRepeatedArrayWithoutIndex(100);
	}	
	
	@Test
	public void testInsert1() {
		operateOrderedRepeatedArrayWithoutIndex.insert(2);
		operateOrderedRepeatedArrayWithoutIndex.insert(1);
		operateOrderedRepeatedArrayWithoutIndex.insert(3);
		int currentIndex = operateOrderedRepeatedArrayWithoutIndex.getCurrentIndex();
		int[] datas = operateOrderedRepeatedArrayWithoutIndex.getDatas();
		assertTrue (currentIndex == 3 && datas[1]==2 && datas[0] == 1);
	}
	
	@Test
	public void testRemove1() {
		operateOrderedRepeatedArrayWithoutIndex.insert(5);
		operateOrderedRepeatedArrayWithoutIndex.insert(5);
		operateOrderedRepeatedArrayWithoutIndex.insert(3);
		operateOrderedRepeatedArrayWithoutIndex.insert(6);
		operateOrderedRepeatedArrayWithoutIndex.insert(5);
		
		operateOrderedRepeatedArrayWithoutIndex.remove(5);
		
		int currentIndex = operateOrderedRepeatedArrayWithoutIndex.getCurrentIndex();
		int[] datas = operateOrderedRepeatedArrayWithoutIndex.getDatas();
		assertTrue (currentIndex == 2 && datas[0]==3 && datas[1] ==6);
	}
	
	@Test
	public void testRemove2() {
		operateOrderedRepeatedArrayWithoutIndex.insert(5);
		operateOrderedRepeatedArrayWithoutIndex.insert(5);
		operateOrderedRepeatedArrayWithoutIndex.insert(3);
		operateOrderedRepeatedArrayWithoutIndex.insert(6);
		operateOrderedRepeatedArrayWithoutIndex.insert(5);
		
		operateOrderedRepeatedArrayWithoutIndex.remove(7);
		
		int currentIndex = operateOrderedRepeatedArrayWithoutIndex.getCurrentIndex();
		
		assertTrue (currentIndex == 5);
	}
	
	@Test
	public void testSearchData1() {
		operateOrderedRepeatedArrayWithoutIndex.insert(5);
		operateOrderedRepeatedArrayWithoutIndex.insert(5);
		operateOrderedRepeatedArrayWithoutIndex.insert(3);
		operateOrderedRepeatedArrayWithoutIndex.insert(6);
		operateOrderedRepeatedArrayWithoutIndex.insert(5);
		
		List<Integer> result = operateOrderedRepeatedArrayWithoutIndex.searchData(5);		
		assertTrue (result.size()==3);
	}
	
	
	@After
	public void destory() {
		System.out.println("≤‚ ‘Ω· ¯");
	}

}
