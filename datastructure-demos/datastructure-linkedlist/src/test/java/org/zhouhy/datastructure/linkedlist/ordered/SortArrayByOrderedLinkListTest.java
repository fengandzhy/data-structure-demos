package org.zhouhy.datastructure.linkedlist.ordered;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class SortArrayByOrderedLinkListTest {
	
	private SortArrayByOrderedLinkList sortArrayByOrderedLinkList;
	
	@Before
	public void init(){
		System.out.println("²âÊÔ¿ªÊ¼");
	}
	
	@Test
	public void testSort(){
		sortArrayByOrderedLinkList = new SortArrayByOrderedLinkList();
		int[] array = {3,2,4,1,5,7,6,9,8};
		sortArrayByOrderedLinkList.sort(array);
		assertTrue(array[0]==1 && array[8]==9);	
	}
	
	@After
	public void destroy(){
		System.out.println("²âÊÔ½áÊø");
	}
}
