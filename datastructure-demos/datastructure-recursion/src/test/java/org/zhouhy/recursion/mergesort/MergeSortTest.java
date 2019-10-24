package org.zhouhy.recursion.mergesort;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MergeSortTest {
	
	private MergeSort mergeSort;
	
	@Before
	public void init(){
		System.out.println("¿ªÊ¼²âÊÔ");
	}
	
	@Test
	public void test() {
		mergeSort = new MergeSort();
		int[] array = {2,5,1,3,8,7};
		mergeSort.merge(array, 0, array.length-1);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	
	@After
	public void destroy(){
		System.out.println("²âÊÔ½áÊø");
	}

}
