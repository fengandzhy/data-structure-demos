package com.citi.datastructure.array.unordered;

import org.apache.log4j.Logger;

public class OperateWithIndex {
	private static Logger logger = Logger.getLogger(OperateWithIndex.class);
	private int[] datas =null;
	private int currentIndex =0;
	
	
	public OperateWithIndex(int length){
		datas = new int[length];
	}
	
	public int insert(int data){
		datas[currentIndex] = data;
		currentIndex++;
		return currentIndex;
	}
	
	public void remove(int index){
		for(int i=index;i<currentIndex;i++){
			datas[i] = datas[i+1];
		}
		currentIndex--;
	}
	
	public int searchOne(int index){
		return datas[index];
	}
	
	public void printDatas(){
		StringBuffer sb = new StringBuffer();
		for(int data:datas){
			sb.append(data);
			sb.append(",");			
		}
		logger.info(sb.toString());		
	}
	
	public static void main(String[] args) {
		OperateWithIndex o = new OperateWithIndex(20);
		o.insert(3);
		o.insert(6);
		o.insert(1);
		o.insert(2);
		
		o.printDatas();
		o.remove(1);
		o.printDatas();
		
		int ret = o.searchOne(1);
		logger.info("ret="+ret);
	}

}
