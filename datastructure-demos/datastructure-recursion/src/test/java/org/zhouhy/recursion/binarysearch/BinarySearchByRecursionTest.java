package org.zhouhy.recursion.binarysearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchByRecursionTest {

	private BinarySearchByRecursion binarySearchByRecursion;
	
	@Test
	public void testBinarySeach() {
		binarySearchByRecursion = new BinarySearchByRecursion(10);
		binarySearchByRecursion.insert(1);
		binarySearchByRecursion.insert(5);
		binarySearchByRecursion.insert(2);
		binarySearchByRecursion.insert(3);
		
		int currentIndex = binarySearchByRecursion.getCurrentIndex();
		
		int index = binarySearchByRecursion.binarySearch(2, 0, currentIndex-1);
		assertTrue(index == 1);
		
		index = binarySearchByRecursion.binarySearch(8, 0, currentIndex-1);
		assertTrue(index == -1);
	}

}
