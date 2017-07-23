package com.huangxi.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*���󣺲�����Ԫ���ظ���������Ҫ��֤�Ⱥ���ӵ�˳��
 * LinkedHashSet:�ײ�ʹ�ù�ϣ��������㷨
 * 				��ϣ����֤Ψһ��
 * 				��������¼Ԫ�ص��Ⱥ����˳��
 * */
public class LinkedHashSetDemo {
public static void main(String[] args) {
	Set<String> set =new HashSet<>();
	set.add("A");
	set.add("B");
	set.add("C");
	set.add("D");
	System.out.println(set);//[D, A, B, C]
	
	Set<String> set1 =new LinkedHashSet<>();
	set1.add("A");
	set1.add("B");
	set1.add("C");
	set1.add("D");
	System.out.println(set1);//[A, B, C, D]
}
}
