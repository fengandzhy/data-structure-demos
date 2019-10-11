package org.zhouhy.datastructure.array.sort;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.zhouhy.datastructure.array.ordered.BinarySearch;

public class BubbleSortTest {
	
	private BubbleSort bubbleSort;
	
	@Before
	public void init(){
		System.out.println("²âÊÔ¿ªÊ¼");
		this.bubbleSort = new BubbleSort();
	}
	
	@Test
	public void test1() {
		int array[] = {2,3,1,4,7,5,8,6,9};
		bubbleSort.bubbleSort1(array);
		for(int i =0;i<array.length;i++){
			System.out.print(array[i]+",");
		}
		assertTrue (array[0] == 9 && array[array.length-1] ==1);
	}
	
	@Test
	public void test2() {
		int array[] = {2,3,1,4,7,5,8,6,9};
		bubbleSort.bubbleSort2(array);
		for(int i =0;i<array.length;i++){
			System.out.print(array[i]+",");
		}
		assertTrue (array[0] == 1 && array[array.length-1] ==9);
	}
	
	
	@Test
	public void test3() {
		int array[] = {2,3,1,4,7,5,8,6,9};
		bubbleSort.bubbleSort3(array);
		for(int i =0;i<array.length;i++){
			System.out.print(array[i]+",");
		}
		assertTrue (array[0] == 1 && array[array.length-1] ==9);
	}
	
	@After
	public void destroy(){
		System.out.println("²âÊÔ½áÊø");		
	}

}
