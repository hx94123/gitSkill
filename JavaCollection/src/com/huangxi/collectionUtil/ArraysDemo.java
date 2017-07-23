package com.huangxi.collectionUtil;


import java.util.Arrays;
import java.util.List;

/*��Collection�ӿ�����һ����������toArray�Ѽ���ת��ΪObject����
 * �Ѽ���ת��Ϊ���飺Object[] arr=���϶���.toAarray();
 * 
 * ����Ҳ����ת��Ϊ���ϣ�ֻ����List���ϣ�:Arrays������һ��asList����
 * */
public class ArraysDemo {
public static void main(String[] args) {
	//������ת��ΪList����
	List<String> list=Arrays.asList("A","B","C","D");
	System.out.println(list);//[A, B, C, D]
	//list.remove(0);  ���쳣��java.lang.UnsupportedOperationException
	//ԭ��Aarrays��asList�������ص��ǹ̶���С���б��������ӣ�Ҳ���ܼ��٣������޸ģ���������
	list.set(0, "E");
	//asList�������صĶ�����java.util.ArrayList����Arrays�����ڲ������
	
	//�����Զ�װ��
	List<Integer> list2=Arrays.asList(1,2,3,4,5);
	//������int���͵�����
	int[] arr={1,2,3,4,5};
	//ֱ�Ӱ����鵱�ɶ���,List���Ͳ�����Integer
	List<int[]> list3=Arrays.asList(arr);
}
}
