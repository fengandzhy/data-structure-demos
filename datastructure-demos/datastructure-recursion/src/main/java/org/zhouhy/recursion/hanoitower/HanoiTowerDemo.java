package org.zhouhy.recursion.hanoitower;

public class HanoiTowerDemo {
	
	/**
	 * ��һ����ǰn-1����A�ƶ���B
	 * �ڶ����ѵ�n����A�ƶ���C
	 * ��������ǰn-1����B�ƶ���C
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
