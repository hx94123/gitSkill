package com.huangxi.set;

import java.util.TreeSet;
/*TreeSet���ϵײ���ú�����㷨����Դ洢��Ԫ��Ĭ��ʹ����Ȼ���򣨴�С����
 * ��Χ��ѯ��
 * ע�⣺���뱣֤TreeSet�е�Ԫ����������ͬ��
 * */
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		set.add("A");
		//set.add(1);�ڶ���ʱ����û�м����ͣ��������б��쳣����ΪTreeSet�ὫԪ�ؽ������򣬲���ͬ���Ͳ�������
		System.out.println(set);
		
		TreeSet<String> set2=new TreeSet();
		set2.add("A");
		set2.add("D");
		set2.add("B");
		set2.add("A");
		set2.add("2"); 
		set2.add("1");
		System.out.println(set2);//[1, 2, A, B, D]���������
		//ע�⣡�����������ʣ�����������Set�������� �����ǵģ�������ν��Set������ָ����¼Ԫ�ص����˳�򣡣���
		
		//SortedTree�ӿ��еķ���
		System.out.println(set2.first());//1
		System.out.println(set2.last());//D
		System.out.println(set2.tailSet("B"));//[B, D]
		
		//NavigableSet�ӿ��еķ���
		System.out.println(set2.headSet("B"));//[1, 2, A] �ϸ�С��B
		
		
		
	
	}
	
}
