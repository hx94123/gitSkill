package com.huangxi.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*for(���� ���� : ��������Iterable��ʵ��) 
 * foreach�������飬�ײ���Ȼʹ��forѭ������������ȡԪ��
 * foreach����Iterable��ʵ�����ײ�ʹ�õ���forѭ����Iterator������
 * ע��Map���̳�Iterable���ʲ��ܷ���for-eachѭ����
 * Iterable��ʾ�ɵ����ģ���һ��������Iterator��ʾ����������һ������
 * 
 * �ʣ�ֱ��ʹ��foreach��������ͼ���Ԫ�ؼ��ɣ���
 * */
public class ForeachDemo {
	public static void main(String[] args) {
		//foreach��������
		int[] a = { 1, 2, 3 };
		for (int i : a) {
			System.out.println(i);
		}
		/*�ײ�ʵ��
		 * int ai[] = {};
		int k = (ai = a).length;
		for (int j = 0; j < k; j++) {
			int i = ai[j];
			System.out.println(i);
		}*/
		
		//foreach����Iterable��ʵ��
		List list=new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		for (Object ele : list) {
			System.out.println(ele);
		}
		/*�ײ�ʵ��
		 * Object ele;
		for (Iterator iterator = list.iterator(); iterator.hasNext();System.out.println(ele)) {
			ele=iterator.next();
		}*/
		
		//����Ҫ�ߵ�������Ԫ�أ���ɾ��ָ����Ԫ��ʱ����ʱֻ��ʹ�� ������ʵ�֣������� foreach
		/*for (Object ele : list) {
			//ɾ�������е�B
			if("B".equals(ele)){
				list.remove(ele);
			}
		�쳣��java.util.ConcurrentModificationException�������޸��쳣
		��ʹ�õ�������ʱ�򣬻��ڵ�ǰ�߳�A�е�������һ���µ��߳�B
		A�̸߳������������B�̸߳���ȥɾ��
		B�߳�ÿ�ζ���ȥ����A�߳��е�Ԫ���Ƿ������ͬ��������ǣ��������쳣
		��ν������Ҫʹ�ü��϶����ɾ����������Collection�ӿ��д���ɾ��ָ��Ԫ�صķ���boolean remove(Objece ele)
		�÷���ֻ�ܴӼ�����ɾ��Ԫ�أ����ܰѵ�������ָ����Ԫ�ص�Ҳɾ�����õ������Լ���ɾ����������������
		}*/
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object ele=iterator.next();
			if("B".equals(ele)){
				//list.remove(ele);���󣡣���������
				iterator.remove();
			}
		}
		System.out.println(list);//[A, C, D]
	}
}
