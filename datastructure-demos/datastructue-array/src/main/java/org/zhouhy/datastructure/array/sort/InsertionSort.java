package org.zhouhy.datastructure.array.sort;

/**
 * ���뷨����
 * ����˼·���ǣ�������ĵ�n��Ԫ��ȥ������֮ǰ��n-1��Ԫ�رȣ�ʹ��n����Ԫ���ҵ�һ�����ʵ�λ�ã��Ӷ�ʵ�������������
 * ��һ��ѭ����ȡ��n��Ԫ��.
 * �ڶ���ѭ��������ǰ��
 * */
public class InsertionSort {
	
	public void insertionSort1(int array[]){
		int length = array.length;
		for(int i=1;i<length;i++){
			int index = i;
			int temp = array[i];
			for(int j=i;j>0;j--){
				if(temp<array[j-1]){
					array[j] = array[j-1];
					index = j-1;
				}else{
					break;
				}
			}
			array[index]=temp;
		}
	}
}
