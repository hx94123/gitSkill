package com.huangxi.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//Iterator������ע��ListIterator��˫��ģ���hasPrevious()��previous()������ǰ����
public class IteratorDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		// ��ʽ1��forѭ��
		for (int i = 0; i < list.size(); i++) {
			Object ele = list.get(i);
			System.out.println(ele);
		}
		// ��ʽ2��for-each
		for (Object ele : list) {
			System.out.println(ele);
		}
		// ��ʽ3����������ѭ������it��Ȼ����
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// ��ʽ4��ʹ��forѭ�����������������ܸ��ã���������ͷ���Դ����������������������
		for (Iterator it2 = list.iterator(); it2.hasNext();) {
			System.out.println(it2.next());
		}
	}
}
