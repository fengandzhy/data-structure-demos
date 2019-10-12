package org.zhouhy.datastructure.queue;

public class MyQueue {
	private int[] queue;
	private int beginIndex =0;
	private int beginCircle=0;
	private int endIndex = -1;
	private int endCircle=0;
	
	
	public MyQueue(int length){
		queue = new int[length];
	}
	
	public void insert(int data){
		if(endIndex == queue.length-1){
			endCircle++;
			if(beginIndex ==0){
				System.out.println("�������������ټ�!");
				return;
			}
			endIndex =-1;
		}
		endIndex++;
		queue[endIndex] = data;
	}
	
	public Integer remove(){
		
		if(beginIndex>endIndex && beginCircle == endCircle){
			System.out.println("�����ѿ��޷�����!");
			return null;
		}
		
		int data = queue[beginIndex];
		
		if(beginIndex == queue.length-1){
			beginCircle++;
			beginIndex =0;
		}else{
			beginIndex ++;
		}
		
		
		return data;
	}
	
}
