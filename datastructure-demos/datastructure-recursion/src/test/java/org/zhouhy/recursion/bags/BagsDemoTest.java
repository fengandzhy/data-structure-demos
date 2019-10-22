package org.zhouhy.recursion.bags;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BagsDemoTest {

	private BagsDemo demo;
	
	@Before
	public void init(){
		System.out.println("≤‚ ‘ø™ º");
	}
	
	@Test
	public void test1() {
		demo = new BagsDemo();
		int[] as = new int[]{12,8,7,5};		
		List<List<Integer>> results = new ArrayList<>();
		demo.runBag(as, 20, results);
		for(List<Integer> result:results){
			for(Integer i:result){
				System.out.print(i+",");
			}
			System.out.println();
		}
	}
	
	@Test
	public void test2() {
		demo = new BagsDemo();
		int[] as = new int[]{12,8,7,5};		
		List<List<Integer>> results = new ArrayList<>();
		demo.runBag1(as, 20, results);
		for(List<Integer> result:results){
			for(Integer i:result){
				System.out.print(i+",");
			}
			System.out.println();
		}
	}
	
	@After
	public void destory(){
		System.out.println("≤‚ ‘Ω· ¯");
	}

}
