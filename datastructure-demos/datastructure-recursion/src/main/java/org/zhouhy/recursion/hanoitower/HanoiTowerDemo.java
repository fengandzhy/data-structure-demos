package org.zhouhy.recursion.hanoitower;

public class HanoiTowerDemo {
	
	/**
	 * 第一步把前n-1层由A移动到B
	 * 第二步把第n层由A移动到C
	 * 第三步把前n-1层由B移动到C
	 * */
	public void move(int layer,String source,String middle,String target) {
		if(layer <= 0) {
			return;			
		}		
		move(layer-1,source,target,middle);
		System.out.println("Move the number "+ layer+" to the "+target);
		move(layer-1,middle,source,target);
	}
}
