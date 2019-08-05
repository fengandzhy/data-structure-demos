package com.citi.datastructure.array.unordered;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class OperateNoIndexRepeatable {
	private static Logger logger = Logger.getLogger(OperateNoIndexRepeatable.class);
	private int[] datas =null;
	private int currentIndex =0;
	
	public OperateNoIndexRepeatable(int length){
		this.datas = new int[length];
	}
	
	public int insert(int data){
		datas[currentIndex] = data;
		currentIndex++;
		return currentIndex;
	}
	
	public void remove(int data){
		int index =0;
		do{
			index = getIndex(0,data);
			if(index>=0){
				for(int i=index;i<currentIndex;i++){
					datas[i] = datas[i+1];
				}
				currentIndex--;
				index = getIndex(index,data);
			}
			
		}while(index>=0);		
	}
	
	public List<Integer> search(int data){
		List<Integer> retList = new ArrayList<>();
		int index = getIndex(0,data);
		while(index>=0){
			retList.add(datas[index]);
			index = getIndex(index+1,data);
		}
		return retList;
	}
	
	public void printDatas(){
		StringBuffer sb = new StringBuffer();
		for(int data:datas){
			sb.append(data);
			sb.append(",");			
		}
		logger.info(sb.toString());		
	}
	
	private int getIndex(int begin,int data){
		int index =-1;
		for(int i=begin;i<currentIndex;i++){
			if(datas[i]==data){
				index = i;
				break;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		OperateNoIndexRepeatable o = new OperateNoIndexRepeatable(20);
		
		o.insert(3);
		o.insert(6);
		o.insert(6);
		o.insert(2);
		o.insert(2);
		o.insert(3);
		
		o.printDatas();
		o.remove(2);
		o.printDatas();
		
		List<Integer> ret = o.search(6);
		logger.info("ret="+ret);
		
	}

}
