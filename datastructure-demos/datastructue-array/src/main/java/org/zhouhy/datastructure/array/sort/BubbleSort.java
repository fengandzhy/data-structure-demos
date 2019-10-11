package org.zhouhy.datastructure.array.sort;

/**
 * ��֮��ð�ݷ�����������ѭ��i,j��
 * ����iѭ������Ԫ�صıȽϷ�Χ���ڲ��jѭ������Ԫ�ص���ʼ�Ƚ�λ�á�
 * */
public class BubbleSort {
	
	/**
	 * ����һ����Ԫ�س���ȥ�ıȽϷ���,���ǵ�һ��ѭ���������һ����С��Ԫ�س���������ĩβ
	 * ����i����ʼֵ���ǵ�һ��Ԫ�س���ȥ��λ�ã��Դ����ƣ�iʼ�ն��Ǳ���ѭ�����Ԫ�صĳ����λ��
	 * */
	public void bubbleSort1(int array[]){
		int length = array.length;
		for(int i = length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(array[j]<array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	/**
	 * �����һ�ָ�������ð������˼·������������
	 * */
	public void bubbleSort2(int array[]){
		int length = array.length;
		for(int i = 0;i<length-1;i++){
			for(int j=length-1;j>i;j--){
				if(array[j]<array[j-1]){
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
	}
	
	/**
	 * ��Ҳ��һ�ֳ���ȥ�����򷽷����������ֲ�ͬ����i������Ԫ�س���ȥ��λ�á�
	 * 
	 * */
	public void bubbleSort3(int array[]){
		int length = array.length;
		for(int i = 1;i<length;i++){
			for(int j=0;j<length-i;j++){
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
}
