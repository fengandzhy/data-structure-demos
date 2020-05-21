package org.zhouhy.recursion.hanoitower;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TowerDemo2Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		TowerDemo2 demo2 = new TowerDemo2();
		demo2.move(3, "A", "C", "B");
	}

}
