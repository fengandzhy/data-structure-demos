package org.zhouhy.datastructure.array.sort;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InsertionSortTest {
	private InsertionSort insertionSort;
	
	@Before
	public void init(){
		System.out.println("²âÊÔ¿ªÊ¼");
		this.insertionSort = new InsertionSort();
	}
	
	@Test
	public void test1() {
		int array[] = {2,3,1,4,7,5,8,6,9};
		insertionSort.insertionSort1(array);
		for(int i =0;i<array.length;i++){
			System.out.print(array[i]+",");
		}
		System.out.println();
	}
	
	@After
	public void destroy(){
		System.out.println("²âÊÔ½áÊø");		
	}

}
