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
				System.out.println("队列已满不能再加!");
				endIndex = -1;
				return;
			}
			endIndex =0;
		}else{
			if(endIndex == beginIndex-1 && endCircle > beginCircle){
				System.out.println("队列已满不能再加!");
				return;
			}
			endIndex++;
		}
		
		queue[endIndex] = data;
	}
	
	public Integer remove(){
		
		if(beginIndex>endIndex && beginCircle == endCircle){
			System.out.println("队列已空无法再移!");
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
	
	public boolean isFull(){
		int addItem = endCircle*queue.length+endIndex+1;
		int removeItem = beginCircle*queue.length+beginIndex;
		if(addItem-removeItem ==5){
			return true;
		}else{
			return false;
		}
	}
	
	public int getSize(){
		int addItem = endCircle*queue.length+endIndex+1;
		int removeItem = beginCircle*queue.length+beginIndex;
		return addItem-removeItem;
	}

	public int getBeginIndex() {
		return beginIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}	
}
