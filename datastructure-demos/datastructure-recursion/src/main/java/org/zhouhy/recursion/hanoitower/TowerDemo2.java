package org.zhouhy.recursion.hanoitower;

public class TowerDemo2 {
	
	public void move(int layer,String source,String target,String middle){
		if(layer<=0){
			return;
		}
		move(layer-1,source,middle,target);
		System.out.println("move "+layer+" from "+source+" to "+target);
		move(layer-1,middle,target,source);		
	}
	
}
