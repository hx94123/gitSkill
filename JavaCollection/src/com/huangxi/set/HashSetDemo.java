package com.huangxi.set;

import java.util.HashSet;
import java.util.Set;

/*һ���������ظ�Ԫ�ص� collection������ʽ��˵��set ���������� 
 *e1.equals(e2)��Ԫ�ض� e1 �� e2������������һ�� null Ԫ��
 * 
 * HashSet() 
      ����һ���µĿ� set����ײ� HashMapʵ����Ĭ�ϳ�ʼ������ 16������������ 0.75
   ��ײ�Ҳ��һ�����飬��Ϊ���ṩ��ѯ�ٶȣ������ٶ�Ҳ�ȽϿ죬�����������������ݵĲ������
   
  ע���ж��Ƿ�Ϊͬһ������ hashcode��equals
  ����HashSet����������µĶ����ʱ���Ȼ��жϸö���ͼ��϶����е�hashCodeֵ��
  ��1�����ȣ�ֱ�ӰѸ��µĶ���洢��hashCodeָ����λ��
  ��2����ȣ��ж�equals
  			1��true������Ϊ��ͬһ�������򲻱����ڹ�ϣ����
  			2��false���ǳ��鷳���洢��֮ǰ����ͬ��λ�������ϣ��ܾ��������Ƚ��鷳��
 */

public class HashSetDemo {
public static void main(String[] args) {
	Set<String> set=new HashSet<>();
	set.add("A");
	set.add("B");
	set.add("C");
	set.add("D");
	//����hashcode->hash�㷨->����λ��
	System.out.println(set);//[D, A, B, C] ����
	set.add("C");
	System.out.println(set);//[D, A, B, C] ����
	
	Set<String> set2=new HashSet<>();
	set2.add("1");
	set2.add("2");
	//set.add(set2);���Ͳ��� ����
	set.addAll(set2);
	System.out.println(set);//[D, 2, 1, A, B, C]
	System.out.println(set.contains("2"));//true
	
	for (String ele : set) {
		System.out.println(ele);
		
	}
	//��ͬʱ����ʱ����ʹ��Collection�е�remove����������ʱ����ʹ��foreach
	set.remove("2");

	
}
}
