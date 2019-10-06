package org.zhouhy.datastructure.array.ordered;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperateOrderedArrayWithoutIndexTest {
	private OperateOrderedArrayWithoutIndex operateOrderedArrayWithoutIndex;
	
	@Before
	public void init(){
		System.out.println("²âÊÔ¿ªÊ¼");
		this.operateOrderedArrayWithoutIndex = new OperateOrderedArrayWithoutIndex(100);
	}
	
	@Test
	public void testInsert1() {
		operateOrderedArrayWithoutIndex.insert(5);
		int currentIndex = operateOrderedArrayWithoutIndex.getCurrentIndex();
		assertTrue (currentIndex == 1);
	}
	
	@Test
	public void testInsert2() {
		operateOrderedArrayWithoutIndex.insert(2);
		operateOrderedArrayWithoutIndex.insert(1);
		operateOrderedArrayWithoutIndex.insert(3);
		int currentIndex = operateOrderedArrayWithoutIndex.getCurrentIndex();
		int[] datas = operateOrderedArrayWithoutIndex.getDatas();
		assertTrue (currentIndex == 3 && datas[1]==2 && datas[0] == 1);
	}
	
	@After
	public void destory() {
		System.out.println("²âÊÔ½áÊø");
	}
}
