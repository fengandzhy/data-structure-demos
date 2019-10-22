package org.zhouhy.recursion.bags;

import java.util.ArrayList;
import java.util.List;

/**
 * ±³°üÎÊÌâ
 * */
public class BagsDemo {
	
	public void bag(int[] targetArray,int targetWeight,int currentIndex, List<List<Integer>> results,List<Integer> result){
		
				
		if(currentIndex>targetArray.length-1){
			return;
		}
		
		if(targetArray[currentIndex]<targetWeight){
			result.add(targetArray[currentIndex]);
			bag(targetArray,targetWeight-targetArray[currentIndex],++currentIndex,results,result);
		}else if(targetArray[currentIndex]==targetWeight){
			result.add(targetArray[currentIndex]);
			results.add(result);
		}else {
			bag(targetArray,targetWeight,++currentIndex,results,result);
		}			
	}
	
	public void bag1(int[] targetArray,int targetWeight,int currentIndex, List<List<Integer>> results,List<Integer> result){		
		if(currentIndex>targetArray.length-1){
			return;
		}		
		if(targetArray[currentIndex]<targetWeight){
			result.add(targetArray[currentIndex]);
			bag(targetArray,targetWeight-targetArray[currentIndex],++currentIndex,results,result);
			return;
		}
		if(targetArray[currentIndex]==targetWeight){
			result.add(targetArray[currentIndex]);
			results.add(result);
			return;
		}
		if(targetArray[currentIndex]>targetWeight){
			bag(targetArray,targetWeight,++currentIndex,results,result);
			return;
		}			
	}	
	
	public void runBag(int[] targetArray,int targetWeight,List<List<Integer>> results){
		for(int i=0;i<targetArray.length;i++){			
			List<Integer> result = new ArrayList<>();
			this.bag(targetArray,targetWeight,i,results,result);			
		}
	}
	
	public void runBag1(int[] targetArray,int targetWeight,List<List<Integer>> results){
		for(int i=0;i<targetArray.length;i++){			
			List<Integer> result = new ArrayList<>();
			this.bag1(targetArray,targetWeight,i,results,result);			
		}
	}
}
